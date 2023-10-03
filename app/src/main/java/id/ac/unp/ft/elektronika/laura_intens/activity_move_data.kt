package id.ac.unp.ft.elektronika.laura_intens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_move_data : AppCompatActivity() {
    companion object{
        const val EXTRA_AGE ="extra_age"
        const val EXTRA_NAME ="extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_data)
        val receiveData = findViewById<TextView>(R.id.receive)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "Name: $name, Your age: $age"
        receiveData.text = text
    }
}