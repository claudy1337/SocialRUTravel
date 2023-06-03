package com.autonture.socialrutravel.PartUI.Authorization

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.databinding.FragmentForgetPasswordBinding
import com.autonture.socialrutravel.databinding.FragmentSignInBinding


class ForgetPasswordFragment : Fragment() {

    lateinit var binding: FragmentForgetPasswordBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtAuth.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_forgetPasswordFragment_to_signInFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForgetPasswordBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = ForgetPasswordFragment()
    }
}