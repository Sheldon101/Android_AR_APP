package com.example.ar_app

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.example.ar_app.databinding.ActivityMainBinding
import com.example.ar_app.ui.theme.AR_APPTheme
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.bottom_home-> replaceFragment(Home())
                R.id.bottom_directions-> replaceFragment(Directions())
                R.id.bottom_camera -> replaceFragment(Camera())
                R.id.bottom_events -> replaceFragment(Events())
                R.id.bottom_settings -> replaceFragment(Settings())

                else->{

                }
            }
            true
        }

    }
 private fun replaceFragment(fragment:Fragment){
     val fragmentManager = supportFragmentManager
     val fragmentTransaction = fragmentManager.beginTransaction()
     fragmentTransaction.replace(R.id.frame_layout,fragment)
     fragmentTransaction.commit()

 }



}

