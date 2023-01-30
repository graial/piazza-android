package com.graial.piazza

import com.graial.piazza.BuildConfig

class Api {
    companion object {
        private val baseUrl = if(BuildConfig.DEBUG)
            "http://192.168.18.2:3000"
        else
            "https://piazza-web-00hg.onrender.com"
        val rootUrl = "$baseUrl/"
        val loginUrl = "$baseUrl/login"

    }
}