package com.easygautam.easymaterialdesign

import android.widget.EditText
import androidx.core.widget.doAfterTextChanged

/**
 * This is a extension method that will return a callback on edit text change in edit text
 */
inline fun EditText.onChange(crossinline change: (value: String?) -> Unit) = run {
    doAfterTextChanged {
        change(it?.toString())
    }
}