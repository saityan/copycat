package saityan.misc.copycat.view.screens.common

import saityan.misc.copycat.R

fun getIconBySubject(subject: String): Int = when (subject) {
    "History" -> R.drawable.ic_history
    "Literature" -> R.drawable.ic_literature
    "Physical Education" -> R.drawable.ic_physical
    else -> 0
}
