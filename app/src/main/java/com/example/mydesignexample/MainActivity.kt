package com.example.mydesignexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydesignexample.motionlayout.MotionLayoutActivity
import com.example.mydesignexample.recyclerviewexpandable.RecyclerViewExpandableActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRecyclerViewExpandable.setOnClickListener {
            startActivity(Intent(this, RecyclerViewExpandableActivity::class.java))
        }

        btnMotionLayout.setOnClickListener {
            startActivity(Intent(this, MotionLayoutActivity::class.java))
        }
    }
}
