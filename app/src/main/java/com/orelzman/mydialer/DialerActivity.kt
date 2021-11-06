package com.orelzman.mydialer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.orelzman.mydialer.ui.theme.MyDialerTheme
import dagger.hilt.EntryPoint
import dagger.hilt.android.HiltAndroidApp
import androidx.core.app.ActivityCompat.startActivityForResult

import android.app.role.RoleManager

import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi



class DialerActivity : ComponentActivity() {

    private val REQUEST_ID = 1

    @RequiresApi(Build.VERSION_CODES.Q)
    fun requestRole() {
        val roleManager = getSystemService(ROLE_SERVICE) as RoleManager
        val intent = roleManager.createRequestRoleIntent(RoleManager.ROLE_CALL_SCREENING)
        startActivityForResult(intent, REQUEST_ID)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_ID) {
            if (resultCode == RESULT_OK) {
                // Your app is now the call screening app
            } else {
                // Your app is not the call screening app
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestRole()
        setContent {
            MyDialerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyDialerTheme {
        Greeting("Android")
    }
}