package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vv = findViewById<VideoView>(R.id.videoView)
        val mediaController= MediaController(this)
//        mediaController.setAnchorView(vv)
//        mediaController.setMediaPlayer(vv)
        val offlineuri = Uri.parse("android.resource://$packageName/${R.raw.motivational}")
       val onlineuri = Uri.parse("https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1")

        vv.apply {
            setMediaController(mediaController)
            setVideoURI(offlineuri)

            requestFocus()
            start()

        }
        mediaController.apply {
            mediaController.setAnchorView(vv)
            mediaController.setMediaPlayer(vv)
        }
    }
}