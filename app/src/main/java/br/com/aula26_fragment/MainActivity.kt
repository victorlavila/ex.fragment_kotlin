package br.com.aula26_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.container1, Fragment1())
        transaction.add(R.id.container2, Fragment2())
        transaction.commit()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val fragmentManager = supportFragmentManager

            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.container1, Fragment2())
            transaction.replace(R.id.container2, Fragment1())
            transaction.commit()
        }
    }
}