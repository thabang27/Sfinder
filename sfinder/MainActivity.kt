package com.thabang.sfinder

import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSearch = findViewById(R.id.searchActivityBtn)as Button
        btnSearch.setOnClickListener {
            val intent = Intent(this,Search::class.java)
            startActivity(intent)
        }
        val btnCall = findViewById(R.id.callActivityBtn)as Button
        btnCall.setOnClickListener {
            val intent1 = Intent(this,Call::class.java)
            startActivity(intent1)
        }
        val btnRate = findViewById(R.id.rateActivityBtn)as Button
        btnRate.setOnClickListener{
            val intent2 = Intent(this,Rate::class.java)
            startActivity(intent2)
        }

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerlayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle  = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



       // navView.setNavigationItemSelectedListener {

          //  when(it.itemId){
          //      R.id.nav_home -> Toast.makeText(applicationContext, text: "Clicked Home", Toast.LENGTH_SHORT).show()
         //       R.id.nav_message -> Toast.makeText(applicationContext, text: "Clicked message", Toast.LENGTH_SHORT).show()
         //       R.id.nav_sync -> Toast.makeText(applicationContext, text: "Clicked Sync", Toast.LENGTH_SHORT).show()
        //        R.id.nav_trash -> Toast.makeText(applicationContext, text: "Clicked Trash", Toast.LENGTH_SHORT).show()
        //        R.id.nav_login -> Toast.makeText(applicationContext, text: "Clicked Login", Toast.LENGTH_SHORT).show()
          //      R.id.nav_settings -> Toast.makeText(applicationContext, text: "Clicked Settings", Toast.LENGTH_SHORT).show()
        //        R.id.nav_share -> Toast.makeText(applicationContext, text: "Clicked Share", Toast.LENGTH_SHORT).show()
       //         R.id.nav_rate_us -> Toast.makeText(applicationContext, text: "Clicked Rate Us", Toast.LENGTH_SHORT).show()
        //    }
         //   true
       // }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
