package com.example.lab8

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var textViewRight: TextView
    private lateinit var textViewWrong: TextView
    private var countOfCorrect = 0
    private var countOfIncorrect = 0
    private var taskNumber: Int = Random.nextInt(39)
    private val items = mutableListOf(
        (Item(R.drawable.food01, true)),
        (Item(R.drawable.food02, true)),
        (Item(R.drawable.food03, true)),
        (Item(R.drawable.food04, true)),
        (Item(R.drawable.food05, true)),
        (Item(R.drawable.food06, true)),
        (Item(R.drawable.food07, true)),
        (Item(R.drawable.food08, true)),
        (Item(R.drawable.food09, true)),
        (Item(R.drawable.food10, true)),
        (Item(R.drawable.food11, true)),
        (Item(R.drawable.food12, true)),
        (Item(R.drawable.food13, true)),
        (Item(R.drawable.food14, true)),
        (Item(R.drawable.food15, true)),
        (Item(R.drawable.food16, true)),
        (Item(R.drawable.food17, true)),
        (Item(R.drawable.food18, true)),
        (Item(R.drawable.food19, true)),
        (Item(R.drawable.food20, true)),
        (Item(R.drawable.sport01, false)),
        (Item(R.drawable.sport02, false)),
        (Item(R.drawable.sport03, false)),
        (Item(R.drawable.sport04, false)),
        (Item(R.drawable.sport05, false)),
        (Item(R.drawable.sport06, false)),
        (Item(R.drawable.sport07, false)),
        (Item(R.drawable.sport08, false)),
        (Item(R.drawable.sport09, false)),
        (Item(R.drawable.sport10, false)),
        (Item(R.drawable.sport11, false)),
        (Item(R.drawable.sport12, false)),
        (Item(R.drawable.sport13, false)),
        (Item(R.drawable.sport14, false)),
        (Item(R.drawable.sport15, false)),
        (Item(R.drawable.sport16, false)),
        (Item(R.drawable.sport17, false)),
        (Item(R.drawable.sport18, false)),
        (Item(R.drawable.sport19, false)),
        (Item(R.drawable.sport20, false)))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewRight = findViewById(R.id.textViewRight)
        textViewWrong = findViewById(R.id.textViewWrong)
        imageView = findViewById(R.id.imageViewItem)
        val drawable = getDrawable(items[taskNumber].resId)
        imageView.setImageDrawable(drawable)
        textViewRight.text = getString(R.string.right)+"$countOfCorrect"
        textViewWrong.text = getString(R.string.wrong)+"$countOfIncorrect"
        }

    fun onClickInedible(view: View) {
        if (!items[taskNumber].food) {
            countOfCorrect++
            textViewRight.text = getString(R.string.right) + "$countOfCorrect"
        } else {
            countOfIncorrect++
            textViewWrong.text = getString(R.string.wrong) + "$countOfIncorrect"
        }
        taskNumber = Random.nextInt(39)
        val drawable = getDrawable(items[taskNumber].resId)
        imageView.setImageDrawable(drawable)
    }
    fun onClickEdible(view: View) {
        if (items[taskNumber].food) {
            countOfCorrect++
            textViewRight.text = getString(R.string.right) + "$countOfCorrect"
        } else {
            countOfIncorrect++
            textViewWrong.text = getString(R.string.wrong) + "$countOfIncorrect"
        }
        taskNumber = Random.nextInt(39)
        val drawable = getDrawable(items[taskNumber].resId)
        imageView.setImageDrawable(drawable)
    }


}
