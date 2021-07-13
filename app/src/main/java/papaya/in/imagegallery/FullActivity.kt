package papaya.`in`.imagegallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class FullActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full)
        val imageView = findViewById<ImageView>(R.id.imageView)
        Glide.with(this).load(intent.getStringExtra("img")).into(imageView)

    }
}