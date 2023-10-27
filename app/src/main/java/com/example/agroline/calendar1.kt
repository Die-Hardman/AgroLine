package com.example.agroline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.TextView

class calendar1 : AppCompatActivity() {
    var year1: Int = 0
    var month1: Int = 0
    var day1: Int = 0

    var year2: Int = 0
    var month2: Int = 0
    var day2: Int = 0

    var total1 : Int = 0
    var total2 : Int = 0
    lateinit var textView1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar1)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        val calendarView2 = findViewById<CalendarView>(R.id.calendarView2)
        textView1 = findViewById<TextView>(R.id.textView1)

        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            year1 = year
            month1 = month + 1
            day1 = dayOfMonth
        }
        calendarView2.setOnDateChangeListener { view, year, month, dayOfMonth ->
            year2 = year
            month2 = month + 1
            day2 = dayOfMonth
        }
    }

    fun calculate(view: View) {
        total1 = (year1 * 360) + (month1 * 30) + day1
        total2 = (year2 * 360) + (month2 * 30) + day2


        textView1.text = "${total2 - total1} days"
    }
}