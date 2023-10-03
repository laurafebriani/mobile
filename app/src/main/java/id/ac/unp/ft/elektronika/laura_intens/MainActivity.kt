package id.ac.unp.ft.elektronika.laura_intens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
        private lateinit var btn_switch: Button
        private lateinit var btn_data: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            btn_switch = findViewById(R.id.btn_swicth)
            btn_data= findViewById(R.id.btn_data)
            btn_switch.setOnClickListener(this)
            btn_data.setOnClickListener(this)


        }

        override fun onClick(v: View?) {
            when (v?.id){
                R.id.btn_swicth->{
                    val moveIn = Intent(this@MainActivity, activity_move::class.java)
                    startActivity(moveIn)
                }
                R.id.btn_data->{
                    val intentData = Intent(this@MainActivity, activity_move_data::class.java)
                    intentData.putExtra(activity_move_data.EXTRA_NAME, "laura")
                    intentData.putExtra(activity_move_data.EXTRA_AGE, 20)

                    startActivity(intentData)
                }
            }
        }

    }