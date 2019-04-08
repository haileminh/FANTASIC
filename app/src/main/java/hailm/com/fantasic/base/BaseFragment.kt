package hailm.com.fantasic.base

import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {
    fun swapFragment(fragment: BaseFragment, id: Int) {
        fragmentManager?.beginTransaction()
            ?.replace(id, fragment)
            ?.addToBackStack(null)
            ?.commit()
    }
}