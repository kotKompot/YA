package com.k.maksim.fisher.presentation

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.k.maksim.fisher.R
import com.k.maksim.fisher.presentation.fresh_ads.FreshAdsFragment
import com.k.maksim.fisher.presentation.old_ads.OldAdsFragment
import com.k.maksim.fisher.presentation.watcher.WatcherFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val watcherFragment : WatcherFragment = WatcherFragment()
    private val oldAdsFragment : OldAdsFragment = OldAdsFragment()
    private val freshFragment : FreshAdsFragment = FreshAdsFragment()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_watcher -> {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, watcherFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_old -> {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, oldAdsFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_fresh -> {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, freshFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        when (navigation.selectedItemId) {
            R.id.navigation_watcher -> {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, watcherFragment).commit()
            }
            R.id.navigation_old -> {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, oldAdsFragment).commit()
            }
            R.id.navigation_fresh -> {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, freshFragment).commit()
            }
        }
    }
}