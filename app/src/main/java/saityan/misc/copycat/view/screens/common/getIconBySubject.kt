package saityan.misc.copycat.view.screens.common

import saityan.misc.copycat.R

fun getIconBySubject(subject: String): Int= when(subject) {
    "History" -> R.drawable.ic_history
    else -> 0
}
