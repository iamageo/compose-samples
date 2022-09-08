package com.iamageo.jetlinkedin.data.model

import java.util.*

data class LinkedinPost(
    val user: User,
    val description: String,
    val image: Int?,
    var likes: Int,
    val comments: Int,
    val sharings: Int,
    val timestamp: Long
) {

    fun timeAgo(): String {
        val currentTime = Date().time;
        val timeDiff = currentTime - timestamp;
        if (timeDiff >= (1000 * 60 * 60 * 24)) {
            return "${timeDiff / (1000 * 60 * 60 * 24)}d";
        } else if (timeDiff >= (1000 * 60 * 60)) {
            return "${timeDiff / (1000 * 60 * 60)}h";
        } else if (timeDiff >= (1000 * 60)) {
            return "${timeDiff / (1000 * 60)}m";
        } else if (timeDiff >= 1000) {
            return "${timeDiff / 1000}s";
        }
        return "0s";
    }
}
