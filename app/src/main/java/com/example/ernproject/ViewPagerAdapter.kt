package com.example.ernproject

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity,private val tabCount :Int ):FragmentStateAdapter(activity)

{
    override fun getItemCount(): Int = tabCount

    override fun createFragment(position: Int): Fragment {

        Log.d("calgrdddgg", "createFragment: "+position)
        return  when (position)
        {
            0 -> HomeFragment()
            1 -> OfferFragment()
            2 -> BrandsFragment()
            3 -> CouponsFragment()
            else -> HomeFragment()
        }
    }

}