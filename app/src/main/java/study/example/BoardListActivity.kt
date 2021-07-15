package study.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BoardListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_list)

        val writeBtn = findViewById<Button>(R.id.writeBtn)
        writeBtn.setOnClickListener {
            val intent = Intent(this, BoardWriteActivity::class.java)
            startActivity(intent)
        }
    }
}