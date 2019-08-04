package es.esy.pskovbus.pskovbus



import android.os.Bundle
//import android.support.v4.app.FragmentActivity
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng

import com.google.android.gms.maps.model.MarkerOptions

import java.util.ArrayList

class MapsActivity : FragmentActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null
    internal var geopoints = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)

        val intent = intent
        geopoints = intent.getStringArrayListExtra("geopoints")
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        var label:String
        var hue = 0


        var i = 0
        while (i < geopoints.size) {
            val pointX = java.lang.Double.parseDouble(geopoints[i + 1])
            val pointY = java.lang.Double.parseDouble(geopoints[i + 2])
            if (i > 5) {
                hue = 200
            }
            val coord = LatLng(pointX, pointY)
            label = "" + geopoints[i]

            val point = mMap!!.addMarker(
                MarkerOptions()
                    .position(coord)
                    .title(label)
                    .icon(BitmapDescriptorFactory.defaultMarker(hue.toFloat()))
            )

            if (i == 0) {
                point.showInfoWindow()
            }
            i += 3
        }


    }
}