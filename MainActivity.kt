package com.example.cartinder
import android.R.attr.button
import android.graphics.Color
import android.graphics.Color.RED
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener {
    lateinit var gestureDetector: GestureDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        gestureDetector = GestureDetector(this)

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (gestureDetector.onTouchEvent(event)) {
            true
        } else {
            super.onTouchEvent(event)
        }
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        return false
    }

    override fun onShowPress(p0: MotionEvent?) {
        return
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        return false
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        return false
    }

    override fun onLongPress(p0: MotionEvent?) {
        return
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {

        Toast.makeText(applicationContext, "Color Change", Toast.LENGTH_SHORT).show()
        var lay: RelativeLayout = findViewById<RelativeLayout>(R.id.layout)

        var dX = p2
        var dY = p3
        var count = 0
        var motion1 = p0
        var motion2 = p1

                if (dX > 0) {
                    onSwipeLeft()
                    lay.setBackgroundColor(Color.argb(255, 255, 0, 0))

                }
                    else {
                        onSwipeRight()
                        lay.setBackgroundColor(Color.argb(255, 0, 255, 0))


                    if (dX > 0) {

                        onSwipeLeft()
                        lay.setBackgroundColor(Color.argb(255, 0, 0, 255))
                    }
                    }

            return true
        }
    open fun onSwipeRight(): Boolean {

        return true
    }

    open fun onSwipeLeft() : Boolean{

        return true;
    }


    }








