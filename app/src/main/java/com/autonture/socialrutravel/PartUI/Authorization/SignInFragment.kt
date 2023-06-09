package com.autonture.socialrutravel.PartUI.Authorization

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import com.autonture.socialrutravel.MainActivity
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.WorkApi.ApiService
import com.autonture.socialrutravel.databinding.FragmentSignInBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SignInFragment : Fragment() {

    lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://impervm-001-site1.atempurl.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        binding.txtRegistration.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_signInFragment_to_registrationFragment)
        }
        binding.txtForgetPass.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_signInFragment_to_forgetPasswordFragment)
        }
        binding.button2.setOnClickListener {

            val intent = Intent(getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(intent)
            //AUTHMain.navController.navigate(R.id.action_signInFragment_to_mainActivity2)
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