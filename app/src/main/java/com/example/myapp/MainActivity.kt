package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: UserListRecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycleView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        listAdapter.submitList(data)
    }
    private fun initRecycleView(){
        recycler_view.apply {
            recycler_view.layoutManager= LinearLayoutManager(this@MainActivity)
            val topSpacingItemsDecoration= TopSpacingItemsDecoration(20)
            addItemDecoration(topSpacingItemsDecoration)
            listAdapter = UserListRecycle()
            adapter = listAdapter
        }
    }



}
