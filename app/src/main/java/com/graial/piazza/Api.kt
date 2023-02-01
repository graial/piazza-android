package com.graial.piazza

import com.graial.piazza.BuildConfig

class Api {
    companion object {
        private val baseUrl = if(BuildConfig.DEBUG)
            "http://192.168.18.2:3000"
        else
            "https://piazza-web-00hg.onrender.com"
        val rootUrl = "$baseUrl/"
        val profileUrl = "$baseUrl/profile"
        val loginUrl = "$baseUrl/login"
        val myAdsUrl = "$baseUrl/my_listings"
        val savedAdsUrl = "$baseUrl/saved_listings"
    }
}