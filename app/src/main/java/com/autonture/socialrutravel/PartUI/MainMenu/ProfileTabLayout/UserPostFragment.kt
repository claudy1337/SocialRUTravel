package com.autonture.socialrutravel.PartUI.MainMenu.ProfileTabLayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.asLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.ApartmentAdapter
import com.autonture.socialrutravel.Utilis.ConstantsApartment
import com.autonture.socialrutravel.Utilis.ConstantsPost
import com.autonture.socialrutravel.Utilis.PostAdapter
import com.autonture.socialrutravel.databinding.FragmentUserPostBinding


class UserPostFragment : Fragment() {

    private lateinit var binding:FragmentUserPostBinding
    private val adapter = PostAdapter(ConstantsPost.getPostData())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserPostBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    private fun init() {
        binding.apply {
            recyclerPost.layoutManager = LinearLayoutManager(context)
            recyclerPost.adapter = adapter
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        //val entrieslist= ConstantsPost.getPostData() //данные из бд
      //  val itemAdapter=PostAdapter(entrieslist)
      //val recyclerView: RecyclerView =view.findViewById(R.id.recycler_post)
        // val btn: Button = view.findViewById(R.id.button3)
       // recyclerView.layoutManager = LinearLayoutManager(context)
       // recyclerView.adapter = itemAdapter
       // recyclerView.adapter = adapter val db = MainDB.getDB(requireContext())
        //init()


        //db.getPost().getAllCurrentUserPost().asLiveData().observe(viewLifecycleOwner){
          //  adapter.setListData(ArrayList(it))
           // adapter.notifyDataSetChanged()
       // }


      //  adapter.onItemClick = {
        //    val intent = Intent (getActivity(), DetailPostActivity::class.java)
          //  intent.putExtra("entries", it)
            //getActivity()?.startActivity(intent)
       // }

        // btn.setOnClickListener {
        //      val entries = PostClass()
        //    adapter.addEntries(entries)
        //  }
        val entrieslist= ConstantsPost.getPostData() //данные из бд
        val itemAdapter=PostAdapter(entrieslist)
        val recyclerView: RecyclerView =view.findViewById(R.id.recycler_post)
        // val btn: Button = view.findViewById(R.id.button3)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = itemAdapter
        recyclerView.adapter = adapter


    }

    companion object {
        @JvmStatic
        fun newInstance() = UserPostFragment()
    }
}