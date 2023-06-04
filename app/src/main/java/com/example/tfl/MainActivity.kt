package com.example.tfl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ExperimentalGetImage

@ExperimentalGetImage
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val buttonScanOpenCVRealTime = findViewById<Button>(R.id.button_scan_opencv_real_time)
        val buttonScanCameraXRealTime = findViewById<Button>(R.id.button_scan_camerax_real_time)

        buttonScanOpenCVRealTime.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    CameraOpenCVRealTimeActivity::class.java
                ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            )
        }

        buttonScanCameraXRealTime.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    CameraCameraXRealTimeActivity::class.java
                ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            )
        }
    }
}