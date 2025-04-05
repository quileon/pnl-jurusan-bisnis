package me.quileon.pnljurusanbisnis

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TentangJurusanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tentang_jurusan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tentang)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, v.paddingBottom)
            insets
        }

        val backBtn = findViewById<ImageButton>(R.id.back_button)
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}