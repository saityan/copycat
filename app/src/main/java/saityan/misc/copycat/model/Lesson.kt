package saityan.misc.copycat.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "classes_table")
data class Lesson(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val name: String,
)
