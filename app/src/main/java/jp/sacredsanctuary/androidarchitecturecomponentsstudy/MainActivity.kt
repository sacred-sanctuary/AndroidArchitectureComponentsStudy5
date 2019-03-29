package jp.sacredsanctuary.androidarchitecturecomponentsstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /**
     * {@inheritDoc}
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onStart() {
        super.onStart()

        println("onStart : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onRestart() {
        super.onRestart();

        println("onRestart : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onResume() {
        super.onResume()

        println("onResume : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        println("onNewIntent : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        println("onSaveInstanceState : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onPause() {
        super.onPause()

        println("onPause : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onStop() {
        super.onStop()

        println("onStop : ${lifecycle.currentState.name}")
    }

    /**
     * {@inheritDoc}
     */
    override fun onDestroy() {
        super.onDestroy()

        println("onDestroy : ${lifecycle.currentState.name}")
    }
}
