package es.esy.pskovbus.pskovbus

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking


class MainActivity : AppCompatActivity(), View.OnClickListener {


    var stopId = 0
    var finaldestId = 0
    var timetableList: String?=null
    var buttonColor = -0x5e28fe
    var buttonClicked = -0x8a5400
    var geopoints = ArrayList<String>()

    var startDestButton: Button? = null
    var finalDestButton: Button? = null

    var openMapButton: Button? = null
    var favouriteButton: ImageButton? = null
    var startDestLabel:TextView?=null
    var finalStopLabel:TextView?=null
    var timeTableLabel:TextView?=null
    var transitResultLabel:TextView?=null

    var fav1: SharedPreferences? = null
    var savefav1: Int = 0
    var savefav2:Int = 0
    var savefav3:Int = 0
    val FAVORITE1 = "Favorite1"
    val FAVORITE2 = "Favorite2"
    val FAVORITE3 = "Favorite3"
    val FAVORITE_PREF = "Favorites"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startDestButton = findViewById(R.id.startDestination)
        finalDestButton = findViewById(R.id.finalDestination)
        openMapButton = findViewById(R.id.openMap)
        favouriteButton = findViewById(R.id.favourite)

        startDestLabel=findViewById(R.id.startDestinationLabel)
        finalStopLabel=findViewById(R.id.finalStopName)
        timeTableLabel=findViewById(R.id.timeTable)
        transitResultLabel=findViewById(R.id.transitResult)

        startDestButton!!.setOnClickListener(this)
        finalDestButton!!.setOnClickListener(this)
        openMapButton!!.setOnClickListener(this)
        favouriteButton!!.setOnClickListener(this)

        }

   override fun onClick(v: View) {
        when (v.id) {
            R.id.startDestination -> {
                startDestination.setBackgroundColor(buttonClicked)
                val intent1 = Intent(this, ListStopActivity::class.java)
                startActivityForResult(intent1, 1)
            }
            R.id.finalDestination -> {
                finalDestination.setBackgroundColor(buttonClicked)
                val intent2 = Intent(this, ListStopActivity::class.java)
                startActivityForResult(intent2, 2)
            }

            R.id.openMap -> {
                openMap.setBackgroundColor(buttonClicked)
                val intent3 = Intent(this, MapsActivity::class.java)
                intent3.putExtra("geopoints", geopoints)
                openMap.setBackgroundColor(buttonColor)
                startActivity(intent3)
            }
            R.id.favourite -> {
                favourite.setBackgroundColor(buttonClicked)
                showPopupMenu(v)
            }


            else -> {
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        startDestButton!!.setBackgroundColor(buttonColor)
        finalDestButton!!.setBackgroundColor(buttonColor)



        if (data == null) {
            return
        }
        if (requestCode == 1) {
            stopId = data.getIntExtra("stopId", 0)
            setResults(stopId)
            if (finaldestId != 0) {
                setTransitresult(stopId, finaldestId)
            }
        }
        if (requestCode == 2) {
            finaldestId = data.getIntExtra("stopId", 0)
            setTransitresult(stopId, finaldestId)
        }
    }

    protected fun setTransitresult(stopId: Int, finaldestId: Int) {
        val dataarrays = DataArrays()
        val stopdata = StopData()
        if (geopoints.size> 0) {
            geopoints.clear()
        }
        addGeoPoint(stopId)
        addGeoPoint(finaldestId)


        val transitWay: Array<Array<String>?>
        val startPoint = stopdata.getStopById(stopId)
        val finalPoint = stopdata.getStopById(finaldestId)
        val finalDestName = stopdata.getStopNameById(finaldestId)
        finalStopLabel!!.text = finalDestName
        if ((stopId != 0) and (finaldestId != 0)) {
            transitWay = dataarrays.getTransitWay(startPoint, finalPoint)


            var resultTransitText:String?
            Log.d("MyLogs","transitway[0]: ${transitWay[0]}")
            resultTransitText = transitWay[0]?.get(0) + "\n"
            Log.d("MyLogs","resultTransitText: ${resultTransitText.toString()}")
            if (transitWay[1] != null) {
                for (l in 0 until transitWay[1]!!.size) {
                    for (id in transitWay[2]!!) {
                        var id1=0
                       if (id!=="") {
                            id1 =  id.toInt()
                        }
                        if (id1 != 0) {
                            addGeoPoint(id1)
                        }
                    }
                    if (transitWay[1]?.get(l) != null) {
                        resultTransitText += transitWay[1]!![l] + "\n"
                    }
                }
            }
            transitResultLabel!!.text = resultTransitText
        }

    }

 fun setResults(stopId: Int) {

        val stopdata = StopData()
        val stopName = stopdata.getStopNameById(stopId)
        val siteId=stopdata.getSiteId(stopId)
        startDestinationLabel.text=stopName
        if (geopoints.size > 0) {
            geopoints.clear()
        }
        addGeoPoint(stopId)


         timetableList =getFromParser(siteId)


Log.d("MyLogs","timetablelist: $timetableList" +
        " \n stopId:    $stopId ," +
        " siteId:    $siteId ," +
        " Остановка:   $stopName ,"

)
        var resultToText:String? = null
        timeTable.text = resultToText



     if(timetableList!!.length >1) {
         resultToText = transitToTable(timetableList!!)

     }else{resultToText=" \n   \n.....Нет данных.." }

        Log.d("MyLogs","resultToText: $resultToText  ")
       resultToText.let{ timeTableLabel!!.append(resultToText)}

    }

private fun getFromParser(siteId:Int)= runBlocking {
    val jsoup=JsoupParser()
    val one =async{ jsoup.getParseResult(siteId)}

   one.await()
}


   private fun transitToTable(a:String): String {

        val stringArr=a.split(" ").toTypedArray()

        var resultArr=""


       var goodSpace ="  .......  "


       if(stringArr.size>2) {


        for (i in 0..stringArr.size - 2 step 4) {


            var goodSpace2 ="  .......  "


               if (stringArr[i].length == 1) goodSpace = "  .........  "



            var add=""
                if (i<stringArr.size-4 ) {

                    if (stringArr[i+2].length == 1) goodSpace2 = "  .........  "
                    add = "              " + stringArr[i + 2] + goodSpace2 + stringArr[i + 3]

                }

               resultArr += stringArr[i] + goodSpace + stringArr[i + 1] +add  + "\n"

                             }

                 }else {
           resultArr=stringArr[0] + goodSpace + stringArr[1]
                 }

        return resultArr
        }






    private fun saveFavClick() {
        loadFavorite()

        if (stopId != 0) {
            setResults(stopId)
        } else {
            val intent1 = Intent(this, ListStopActivity::class.java)
            startActivityForResult(intent1, 1)
        }
        if (finaldestId != 0) {
            setTransitresult(stopId, finaldestId)
        }
    }

    private fun clearClick() {
        loadFavorite()
        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE)
        val ed = fav1!!.edit()

        ed.clear()
        ed.apply()



    }

    private fun addGeoPoint(id: Int) {

        val stopdata = StopData()
        val label = stopdata.getStopNameById(id)
        val coords = stopdata.getGeoCoord(id)
        val pointX = coords[0].toString()
        val pointY = coords[1].toString()
        geopoints.add(label)
        geopoints.add(pointX)
        geopoints.add(pointY)


    }

    private fun loadFavorite() {
        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE)
        savefav1 = fav1!!.getInt(FAVORITE1, 0)
        savefav2 = fav1!!.getInt(FAVORITE2, 0)
        savefav3 = fav1!!.getInt(FAVORITE3, 0)


    }

    private fun showPopupMenu(v: View) {
        val popupMenu = PopupMenu(this, v)
        val menu = popupMenu.getMenu()
        loadFavorite()
        val stopdata = StopData()
        if (savefav1 != 0) {
            val stopname = stopdata.getStopNameById(savefav1)
            menu.add(0, 1, 0, stopname)
        } else {
            menu.add(0, 1, 0, "Добавьте остановку...")
        }

        if (savefav2 != 0) {
            val stopname = stopdata.getStopNameById(savefav2)
            menu.add(0, 2, 0, stopname)
        }
        if (savefav3 != 0) {
            val stopname = stopdata.getStopNameById(savefav3)
            menu.add(0, 3, 0, stopname)

            menu.add(0, 4, 0, "Очистить")
        }
        favouriteButton!!.setBackgroundColor(buttonColor)
        popupMenu.show()





        popupMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {


            override fun onMenuItemClick(item: MenuItem): Boolean {


                when (item.getItemId()) {
                    1 -> {

                        stopId = savefav1
                        saveFavClick()
                    }
                    2 -> {
                        stopId = savefav2
                        saveFavClick()
                    }
                    3 -> {
                        stopId = savefav3
                        saveFavClick()
                    }
                    4 -> clearClick()
                }


                return false
            }
        })

    }


    }

