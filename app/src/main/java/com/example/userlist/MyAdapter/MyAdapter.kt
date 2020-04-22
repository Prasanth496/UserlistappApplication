package com.example.userlist.MyAdapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.model.User
import com.example.userlist.R

class MyAdapter (var context: Context, var arrayList: ArrayList<User>) : BaseAdapter() {

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View = View.inflate(context,R.layout.activity_card_view,null)
        var name : TextView = view.findViewById(R.id.title_text_view)
        var mobileNumber : TextView = view.findViewById(R.id.title_text_view)
        var email : TextView = view.findViewById(R.id.details_text_view)

        var list : User = arrayList.get(position)
        name.text = list.name
        mobileNumber.text = list.mobileNumber
        email.text = list.email

        return view!!

    }


}
