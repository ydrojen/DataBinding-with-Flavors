package es.sdos.android.databindingwithflavours

import java.util.*

data class User(
  val name: String,
  val surname: String,
  val premium: Boolean,
  val suscriptionUntil: Date,
  val viewHistory: List<String>,
  val avatarUrl: String
)