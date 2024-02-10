package com.example.list_users

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.custom_listview_kotlin.UserActivity
import com.example.list_users.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val imageId = intArrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
        )


        val name = arrayOf(
            "  Abdullah",
            "  Avi",
            "  Jobayer"
        )


        val lastMessage = arrayOf(
            "    What about you",
            "    I am doing well",
            "    I'm gonna rock"
        )


        val lastMsgTime = arrayOf(
            "1:00 pm",
            "2:00 pm",
            "3:00 pm",
        )


        val phoneNo = arrayOf(
            "01712345678",
            "01787995437",
            "01712345678",
        )

        val country = arrayOf(
            "Russia",
            "Bangladesh",
            "Thailand",
        )

        userArrayList = ArrayList()

        for (i in name.indices) {


            val user =
                User(name[i], lastMessage[i], lastMsgTime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)


        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]


            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("phone", phone)
            i.putExtra("country", country)
            i.putExtra("imageId", imageId)

            startActivity(i)


        }


    }
}