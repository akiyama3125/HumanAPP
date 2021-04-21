package jp.techacademy.takashige.akiyama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Nobi = Human("Nobita", 20, "Shizuka")
        val Shizu = Human("Shizuka", 20, "Dekisugi")

        Nobi.say()
        Shizu.think()
    }
}