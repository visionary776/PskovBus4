package es.esy.pskovbus.pskovbus

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

class JsoupParser {
    val baseUrl="http://pskovbus.online/wap/online/?st_id="

    var route=""


  suspend fun getParseResult(id:Int):String{


      val doc:Document?

          try {
              val one= GlobalScope.async {

                  Jsoup.connect(baseUrl + "$id").get()

                      }
                  doc =one.await()

              val elem: Elements? =doc!!.select("td[style] a[href]")
                route= elem?.select(":not([href*=../rasp])")!!.text()
                          Log.d("MyLogs","\n HTML \n" +
                              " : ${elem}")

         }catch (e: Exception){
          route=" Не_удалось_получить_данные..."

                     Log.d("MyLogs","------HTML-exception : $e")
 }

       return route
    }


}