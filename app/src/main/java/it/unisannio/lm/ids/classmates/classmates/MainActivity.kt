package it.unisannio.lm.ids.classmates.classmates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import it.unisannio.lm.ids.classmates.commons.Library

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Library()
        setContentView(R.layout.activity_main)
    }
}
