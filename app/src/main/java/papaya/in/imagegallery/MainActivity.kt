package papaya.`in`.imagegallery

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var galleryImageAdapter: GalleryImageAdapter
    private lateinit var GView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        galleryImageAdapter = GalleryImageAdapter(applicationContext)

        GView = findViewById(R.id.gv)
        GView.adapter = galleryImageAdapter

        GView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                openActivity(galleryImageAdapter.imagePaths[position])
            }
        }
    }

    private fun openActivity(s: String) {
        val intent = Intent(this, FullActivity::class.java)
        intent.putExtra("img", s)
        startActivity(intent)
    }

}