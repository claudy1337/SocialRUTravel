package com.autonture.socialrutravel.PartUI.MainMenu

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.autonture.socialrutravel.PartUI.MainMenu.ProfileTabLayout.SaveUserPostFragment
import com.autonture.socialrutravel.PartUI.MainMenu.ProfileTabLayout.UserPostFragment
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.Utilis.TABProfile
import com.autonture.socialrutravel.WorkApi.ApiService
import com.autonture.socialrutravel.WorkApi.ThreadUtil.runOnUiThread
import com.autonture.socialrutravel.databinding.FragmentProfileBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    private val fragList = listOf(
        UserPostFragment.newInstance(),
        SaveUserPostFragment.newInstance()
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    fun connection():ApiService {
        val interceptor = HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) }
        val client = OkHttpClient.Builder().addInterceptor(interceptor)
        val retrofit = Retrofit.Builder()
            .baseUrl("http://impervm-001-site1.atempurl.com/api/")
            .client(client.build())
            .addConverterFactory(GsonConverterFactory.create()).build()
        val apiService  = retrofit.create(ApiService::class.java)
        return apiService
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = connection().getUser(1)

                if (response.isSuccessful) {
                    val user = response.body()
                    user?.let {
                        runOnUiThread {
                            binding.textView.setText("${user.name} ${user.surname}")
                            binding.textView2.setText("${user.email}")
                            binding.countTravel.setText("${user.countOfTravels}")
                            binding.rating.setText("${user.rating}")

                        }
                    }
                } else {
                    runOnUiThread {
                        // Handle error
                    }
                }
            } catch (e: Exception) {
                runOnUiThread {
                    // Handle exception
                }
            }
        }
            binding.tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    // binding.tablayout.selectTab(binding.tablayout.getTabAt(tab?.position!!));

                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                    //update повторное нажатие на вкладку
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    //update потом запуск первой страницы
                }
            })
            binding.buttonProfile.setOnClickListener {
                val intent = Intent(getActivity(), CreatePostActivity::class.java)
                getActivity()?.startActivity(intent)
            }

            binding.swipeRefresh.setOnRefreshListener {
                Handler().postDelayed(Runnable {
                    binding.swipeRefresh.isRefreshing = false
                }, 2000)
            }
        }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}