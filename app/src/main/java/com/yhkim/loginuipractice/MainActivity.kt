package com.yhkim.loginuipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.text = "Log in"

        var num1 = 10 //var 변경가능
        var num2:Int = 20

        val PI = 3.14 // 변경불가 , 타입인퍼
    }
}
