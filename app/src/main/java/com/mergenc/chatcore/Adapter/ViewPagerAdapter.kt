package com.mergenc.chatcore.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(supportFragmentManager) {

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun getCount(): Int {
        // return the num of tabs (2);
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        // return current tab fragment;
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // return tab title;
        return fragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        // add fragment and title to array;
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }
}