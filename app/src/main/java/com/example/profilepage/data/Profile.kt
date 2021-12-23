package com.example.profilepage.data

import androidx.room.Entity

@Entity
data class Profile (
    val name: String,
    val dob: Int,
    val address: String,
    val city:String,
    val state:String,
    val pin:Int
        )