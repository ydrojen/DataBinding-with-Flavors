package es.sdos.android.databindingwithflavors

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {

  private val userLiveData = MutableLiveData<User>()
  private var userType = 0

  init {
    changeUser()
  }

  fun getUser() = userLiveData as LiveData<User>

  fun changeUser() {
    userType++
    userLiveData.value = if (userType % 2 == 0) {
      getLocalUser()
    } else {
      getRemoteUser()
    }
  }

  private fun getLocalUser(): User {
    return User(
      "Peter",
      "Parker",
      true,
      Date(1577016784000L),
      arrayListOf("Civil War", "Spiderman", "Infinity War"),
      "http://images4.fanpop.com/image/photos/23000000/peter-peter-parker-23094911-496-585.jpg"
    )
  }

  private fun getRemoteUser(): User {
    return User(
      "Bruce",
      "Wayne",
      false,
      Date(1526995072000),
      arrayListOf("El caballero oscuro", "Wonderwoman", "La ligua de la Justicia", "Aquaman"),
      "https://i.pinimg.com/736x/8a/16/14/8a161404807181e9802d2aeddd7ba824.jpg"
    )
  }
}