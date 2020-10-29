package com.example.projektas

import android.os.Build
import android.os.Bundle
import android.provider.FontRequest
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.emoji.bundled.BundledEmojiCompatConfig
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig


class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val config = BundledEmojiCompatConfi
        //EmojiCompat.init(config)
    }

}