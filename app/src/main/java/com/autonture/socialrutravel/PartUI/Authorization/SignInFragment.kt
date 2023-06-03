package com.autonture.socialrutravel.PartUI.Authorization

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.MainActivity
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.ActivityAuthorizationBinding
import com.autonture.socialrutravel.databinding.FragmentSignInBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding


class SignInFragment : Fragment() {

    lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtRegistration.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_signInFragment_to_registrationFragment)
        }
        binding.txtForgetPass.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_signInFragment_to_forgetPasswordFragment)
        }
        binding.button2.setOnClickListener {
            //AUTHMain.navController.navigate(R.id.action_signInFragment_to_mainActivity2)
            val intent = Intent (getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(intent)
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = SignInFragment()
    }
}