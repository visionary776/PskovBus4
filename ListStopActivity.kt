package es.esy.pskovbus.pskovbus

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.content.SharedPreferences
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


class ListStopActivity : AppCompatActivity(), AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {


    var stopnames: MutableList<String> = mutableListOf()
    var stoplistView: ListView? = null
    var stopId: Int = 0
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
        setContentView(R.layout.activity_list_stop)


        stopnames=getStopNameArr()
        stoplistView =  findViewById(R.id.stoplistView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stopnames)
        stoplistView!!.adapter = adapter
        stoplistView!!.onItemClickListener = this
        stoplistView!!.onItemLongClickListener = this
        loadFavorite()
        if(savefav1==0){
            var toast: Toast =Toast.makeText(applicationContext, "Долгое нажатие на пункт \n добавляет в Мои остановки", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,0,100)
            toast.show()
        }

    }

    fun getStopNameArr(): MutableList<String> {
        val stopdata = StopData()
        return stopdata.getStopNameArray()
    }

    fun getStopId(position: Int): Int {
        val stopdata = StopData()
        return stopdata.getId(position)
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        val intent = Intent()
        stopnames = getStopNameArr()

        stopId = getStopId(position)
        intent.putExtra("stopId", stopId)

        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    override fun onItemLongClick(parent: AdapterView<*>, view: View, position: Int, id: Long): Boolean {
        val stopdata = StopData()
        val stopId = stopdata.getId(position)
        saveFavorite(stopId)
        return true


    }

    private fun saveFavorite(stopId: Int) {

        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE)
        val ed = fav1!!.edit()
        loadFavorite()


        if (savefav1 == 0) {
            ed.putInt(FAVORITE1, stopId)
            ed.apply()
            val toast = Toast.makeText(this@ListStopActivity, "Сохранено!", Toast.LENGTH_SHORT)
            toast.show()

        } else if (savefav2 == 0) {
            ed.putInt(FAVORITE2, stopId)
            ed.apply()
            val toast = Toast.makeText(this@ListStopActivity, "Сохранено!", Toast.LENGTH_SHORT)
            toast.show()

        } else if (savefav3 == 0) {
            ed.putInt(FAVORITE3, stopId)
            ed.apply()
            val toast = Toast.makeText(this@ListStopActivity, "Сохранено!", Toast.LENGTH_SHORT)
            toast.show()

        } else {
            ed.putInt(FAVORITE1, stopId)
            ed.apply()
            val toast = Toast.makeText(this@ListStopActivity, "Перезапись", Toast.LENGTH_SHORT)
            toast.show()

        }
    }

    private fun loadFavorite() {
        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE)
        savefav1 = fav1!!.getInt(FAVORITE1, 0)
        savefav2 = fav1!!.getInt(FAVORITE2, 0)
        savefav3 = fav1!!.getInt(FAVORITE3, 0)


    }
    }

