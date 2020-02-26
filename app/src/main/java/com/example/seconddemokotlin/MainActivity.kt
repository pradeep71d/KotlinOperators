package com.example.seconddemokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num = 99;
        println("outwill be s=" + num)
        val num1 = 101.99
        val num2 = 100.50
        var op: Double// declaring a double operator
        op = num1 + num2;
        println("output of sum of both the numbers will be=" + op)
        op = num1 - num2
        println("substraction of numbers will be=" + op)
        op = num1 * num2;
        println("multiplication of numbers will be=" + op)
        op = num1 / num2;
        println("Divison of numbers will be=" + op)
        val s1="hello"
        val s2="hi"
        val s3="Bye"
        val s4="$s1$s2$s3"
        println("final String value will be="+s4)
    }
}
