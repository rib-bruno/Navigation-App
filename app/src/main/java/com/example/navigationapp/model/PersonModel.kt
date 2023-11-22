package com.example.navigationapp.model

import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonModel(
    val name: String = "",
    val age: Int = 0,
    val street: String = "",
    val number: Int = 0
) : Parcelable {
    @IgnoredOnParcel
    val person = "$name, $age anos."

    @IgnoredOnParcel
    val address = "$street, $number"
}
