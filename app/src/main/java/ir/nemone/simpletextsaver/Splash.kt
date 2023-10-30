package ir.nemone.simpletextsaver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    lateinit var textTop: TextView
    lateinit var textMidle: TextView
    lateinit var textBottom: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        textTop=findViewById(R.id.Text1)
        textMidle=findViewById(R.id.Text2)
        textBottom=findViewById(R.id.Text3)
        val topanimation = AnimationUtils.loadAnimation(this, R.anim.top_anim)
        //val midleanimation = AnimationUtils.loadAnimation(this, R.anim.midle_animation)
        //val bootomanimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        textTop.startAnimation(topanimation)
        textMidle.startAnimation(topanimation)
        textBottom.startAnimation(topanimation)


        val intent= Intent(this,MainActivity::class.java)


        val SplashScreenTimeOut=8000
        Handler().postDelayed({
            startActivity(intent)
            finish()

        },SplashScreenTimeOut.toLong())
    }
}