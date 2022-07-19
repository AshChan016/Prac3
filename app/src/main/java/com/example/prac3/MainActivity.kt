package com.example.prac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.prac3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var student = Student("Ali", "RSD")
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding.btnSetData.setOnClickListener(){


            binding.myStudent = student
            //binding.tvName.text = "Ali"
            //binding.tvProgramme.text = "RSD"
        }

        binding.btnChange.setOnClickListener(){
            student.programme = "RIT"
            binding.invalidateAll()
        }
    }
}