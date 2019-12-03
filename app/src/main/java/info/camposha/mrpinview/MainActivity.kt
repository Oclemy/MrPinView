package info.camposha.mrpinview

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import com.goodiebag.pinview.Pinview

class MainActivity : AppCompatActivity() {
    private fun initializeWidgets() {
        val pinview1 = findViewById<Pinview>(R.id.pinview1)
        pinview1.setPinViewEventListener { pinview, fromUser ->
            Toast.makeText(
                this@MainActivity,
                pinview.value,
                Toast.LENGTH_SHORT
            ).show()
        }


        // pinView Customize
        val pinview5 = findViewById<Pinview>(R.id.pinview5)
        pinview5.setCursorShape(R.drawable.example_cursor)
        pinview5.setTextSize(12)
        pinview5.setTextColor(Color.BLACK)
        pinview5.showCursor(true)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeWidgets()

    }
}
//end
