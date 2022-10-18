package app.test.glide

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPopulate = findViewById<Button>(R.id.buttonPopulate)
        val imageView = findViewById<ImageView>(R.id.imageView)

        buttonPopulate.setOnClickListener {
            Glide.with(this)
                .load("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
                .into(imageView)
        }

    }
}