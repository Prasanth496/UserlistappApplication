package com.example.userlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.model.User
import com.example.userlist.MyAdapter.MyAdapter
import org.json.JSONArray
import java.io.InputStream
import java.lang.Exception

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var listView : ListView? = null
         var myAdapter : MyAdapter? = null
         var arrayList : ArrayList<User>? = null

         fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            listView = findViewById(R.id.card_view_list_view)
            arrayList = ArrayList()
            myAdapter = MyAdapter(applicationContext,arrayList!!)
            listView?.adapter = myAdapter
            listView?.onItemClickListener = this

            fun setDataJson() : ArrayList<User>{

                var json : String? = null

                try {
                    val inputStream : InputStream = assets.open("users.json")
                    json = inputStream.bufferedReader().use{it.readText()}

                    var jsonarray = JSONArray(json)

                    for(i in 0..jsonarray.length()-1)
                    {
                        var jsonobject = jsonarray.getJSONObject(i)
                        name.add(jsonobject.getString("name"))
                        mobilenumber.add(jsonobject.getString("MobileNumber"))
                        email.add(jsonobject.getString("email"))

                    }

                    var adapt= ArrayAdapter(this,android.R.layout.simple_list_item_1,name)
                    json_list.adapter = adapt
                }
                catch (e : Exception)
                {

                }

         fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            var items : User = arrayList?.get(position)!!
            Toast.makeText(applicationContext, items.mobileNumber, Toast.LENGTH_LONG).show()

        }
    }

}
