package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers.SearchCityAdapter
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.ConstantsTour
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.WorkApi.ApiService
import com.autonture.socialrutravel.WorkApi.ThreadUtil
import com.autonture.socialrutravel.WorkApi.ThreadUtil.runOnUiThread
import com.autonture.socialrutravel.databinding.FragmentSearchPlaceListBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SearchPlaceListFragment : Fragment() {

    private lateinit var binding: FragmentSearchPlaceListBinding
    private lateinit var adapterSearchCity: SearchCityAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterSearchCity = SearchCityAdapter()
        binding.apply {
            searchCity.layoutManager = LinearLayoutManager(context)
            searchCity.adapter = adapterSearchCity
        }
        val interceptor = HttpLoggingInterceptor().apply { setLevel(HttpLoggingInterceptor.Level.BODY) }
        val client = OkHttpClient.Builder().addInterceptor(interceptor)
        val retrofit = Retrofit.Builder()
            .baseUrl("http://impervm-001-site1.atempurl.com/api/")
            .client(client.build())
            .addConverterFactory(GsonConverterFactory.create()).build()
        val apiService  = retrofit.create(ApiService::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val list = apiService.getTowns()
            runOnUiThread {
                binding.apply {
                    adapterSearchCity.submitList(list)
                }
            }
        }
        adapterSearchCity.onItemClick = {
            val result = it.name
            setFragmentResult("requestTourKey", bundleOf("bundleTourKey" to result))
            MAIN.navController.navigate(R.id.action_searchPlaceListFragment2_to_mainTour)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchPlaceListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = SearchPlaceListFragment()
    }
}