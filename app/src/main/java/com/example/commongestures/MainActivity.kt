package com.example.commongestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import com.example.commongestures.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {
    private lateinit var binding: ActivityMainBinding
    var gDetector:GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gDetector = GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        binding.gestureStatusTest.text = "onDown event!"
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        binding.gestureStatusTest.text = "onShowPress event!"
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        binding.gestureStatusTest.text = "onSingleTapUp event!"
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        binding.gestureStatusTest.text = "onScroll event! distanceX: " +
                "$distanceX distanceY: $distanceY"
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        binding.gestureStatusTest.text = "onLongPress event!"
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        binding.gestureStatusTest.text = "onFling event! velocitX: " +
                "$velocityX distanceY: $velocityY"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        binding.gestureStatusTest.text = "onSingleTapConfirmed event!"
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        binding.gestureStatusTest.text = "onDoubleTap event!"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        binding.gestureStatusTest.text = "onDoubleTapEvent event!"
        return true
    }
}