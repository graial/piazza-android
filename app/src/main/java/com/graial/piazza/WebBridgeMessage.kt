package com.graial.piazza

import org.json.JSONObject

data class WebBridgeMessage(val type: String, val data: JSONObject)