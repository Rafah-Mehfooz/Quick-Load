package pk.spectre.admin.quickload.Demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Home : AppCompatActivity() {

    val networkProvider : Array<String> = arrayOf("Jazz", "Warid", "Ufone", "Zong")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        
    }
}

