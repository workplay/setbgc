package com.example.setbgc

import android.graphics.Color
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import java.time.Instant
import java.util.*

class MainActivity : AppCompatActivity() {
  private lateinit var layout: ConstraintLayout
  private var color: Boolean = true
  private lateinit var textview: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    layout = findViewById(R.id.layout)
    textview = findViewById(R.id.textview)

    layout.setOnClickListener {
      val startTime = Instant.now().toString();

      val start = System.currentTimeMillis();
      if (color) {
        textview.setTextColor(Color.WHITE);
        it.setBackgroundColor(Color.BLACK);
      } else {
        textview.setTextColor(Color.BLACK);
        it.setBackgroundColor(Color.WHITE);
      }
      val endTime = Instant.now().toString();
      val end = System.currentTimeMillis();
      textview.text = startTime + "\n" +endTime + "\n"+ (end - start).toString() + "\n"
      color = !color;
    }

  }
}