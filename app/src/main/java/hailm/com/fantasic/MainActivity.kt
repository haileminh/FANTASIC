package hailm.com.fantasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import hailm.com.fantasic.view.Demo1Fragment
import hailm.com.fantasic.view.LoginFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        loadFragment(LoginFragment())
    }

    private val mOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener {

        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            val fragment: Fragment
            when (item.itemId) {
                R.id.nav_login -> {
                    fragment = LoginFragment()
                    loadFragment(fragment)
                    return true
                }

                R.id.nav_fantasic -> {
                    fragment = Demo1Fragment()
                    loadFragment(fragment)
                    return true
                }
            }
            return false
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
