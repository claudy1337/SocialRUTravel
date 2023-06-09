package com.autonture.socialrutravel.PartUI.Authorization

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import com.autonture.socialrutravel.MainActivity
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.FragmentSecurityCodeBinding
import java.util.concurrent.Executor


class SecurityCodeFragment : Fragment() {
    private lateinit var executor: Executor
    private lateinit var biometricPrompt: BiometricPrompt
    private lateinit var promptInfo: BiometricPrompt.PromptInfo

    lateinit var binding: FragmentSecurityCodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButton2.setOnClickListener {
           //AUTHMain.navController.navigate(R.id.action_securityCodeFragment_to_mainActivity)
            val intent = Intent (getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(intent)
        }
        initBio()
        binding.imageButton12.setOnClickListener {
            biometricPrompt.authenticate(promptInfo)
        }
    }
    private fun initBio(){
        executor = ContextCompat.getMainExecutor(requireContext())

        biometricPrompt = BiometricPrompt(this@SecurityCodeFragment, executor, object : BiometricPrompt.AuthenticationCallback(){
            override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                super.onAuthenticationError(errorCode, errString)
                binding.textView7.text = "Ошибка аутентификации: $errString"
                Toast.makeText(requireContext(), "Ошибка аутентификации: $errString", Toast.LENGTH_SHORT).show()
            }

            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                super.onAuthenticationSucceeded(result)

                binding.textView7.text = "Успешно"
                val intent = Intent (getActivity(), MainActivity::class.java)
                getActivity()?.startActivity(intent)

            }

            override fun onAuthenticationFailed() {
                super.onAuthenticationFailed()
                binding.textView7.text = "неверный ключ"
                Toast.makeText(requireContext(), "неверный ключ", Toast.LENGTH_SHORT).show()
            }
        })
        promptInfo = BiometricPrompt.PromptInfo.Builder()
            .setTitle("Биометрическая аутентификация")
            .setNegativeButtonText("Ввести код в ручную")
            .build()

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecurityCodeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = SecurityCodeFragment()
    }
}