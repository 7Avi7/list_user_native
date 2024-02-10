package com.example.custom_listview_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.list_users.R
import com.example.list_users.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId", R.drawable.a)

        binding.nameProfile.text = name
        binding.phoneProfile.text = phone
        binding.countryProfile.text = country
        binding.profileImage.setImageResource(imageId)


    }
}
//package com.example.list_users
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import com.example.list_users.databinding.ActivityMainBinding
//
//class UserActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//
//        val name = intent.getStringExtra("name")
//        val phone = intent.getStringExtra("phone")
//        val country = intent.getStringExtra("country")
//        val imageId = intent.getIntExtra("imageId", R.drawable.a)
//
//        binding.nameProfile.text = name
//        binding.phoneProfile.text = phone
//        binding.countryProfile.text = country
//        binding.profileImage.setImage.setImageResource(imageId)
//
//
//    }
//}
//
