package com.example.ernproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import android.view.View
import android.widget.Adapter
import android.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class NavigationActivity : AppCompatActivity() {


    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout

   private  lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        /*navController= Navigation.findNavController(this,R.id.hostFragment)
        drawerLayout= findViewById(R.id.drawer)

        NavigationUI.setupWithNavController(navigation_view,navController)
        appBarConfiguration= AppBarConfiguration(navController.graph,drawerLayout)
        setupActionBarWithNavController(navController,appBarConfiguration)*/


        setUpBar()



    }

   /* override fun onSupportNavigateUp(): Boolean {
        val navController= findNavController(R.id.hostFragment)


        return navController.navigateUp()||super.onSupportNavigateUp()
    }*/
    private fun setUpBar() {
        val tabLayout = findViewById<TabLayout>(R.id.TabLayout)
        val adapter = ViewPagerAdapter(this, tabLayout.tabCount)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                Log.d("positonssss", "onPageSelected: " + position)
                tabLayout.selectTab(tabLayout.getTabAt(position))

            }
        })
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })
    }


}
