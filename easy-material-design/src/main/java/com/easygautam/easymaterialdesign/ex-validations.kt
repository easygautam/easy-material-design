package com.easygautam.easymaterialdesign

import android.util.Patterns


/**
 * Validate any text for email format
 */
fun String?.isEmailNotValid(): Boolean {
    this?.let { it ->
        return !Patterns.EMAIL_ADDRESS.matcher(it).matches()
    } ?: return true
}

/**
 * This function validate a password and return [true] or [false] on the basis of password text length.
 * It is check whether password length should not be than 4
 */
fun String?.isPasswordNotValid(): Boolean {
    this?.length?.let { it ->
        return it < 5
    } ?: return true
}

/**
 * Validate mobile number and check mobile number should be more than 10 digit.
 */
fun String?.isMobileNotValid(): Boolean {
    this?.length?.let { it ->
        return it < 10
    } ?: return true
}

