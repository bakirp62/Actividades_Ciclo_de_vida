package com.mazo.activitis_clico_vida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("clicloVida", "ingresa a onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.i("clicloVida", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("clicloVida", "Ingresa a onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("clicloVida", "Ingresa a onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("clicloVida", "Ingresa a onStop(")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("clicloVida", "Ingresa a onRestart()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("clicloVida","Ingresa a onDestroy()")
    }
}
