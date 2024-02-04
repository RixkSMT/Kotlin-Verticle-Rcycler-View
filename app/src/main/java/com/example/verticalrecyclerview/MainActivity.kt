package com.example.verticalrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.verticalrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    lateinit var stuffList: ArrayList<Stuff>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createStuffList()

        val manager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        binding.mainRecycleView.layoutManager = manager
        binding.mainRecycleView.hasFixedSize()

        var myAdapter = MyAdapter(this,stuffList)
        binding.mainRecycleView.adapter =myAdapter






    }

    private fun createStuffList() {
        stuffList = ArrayList<Stuff>()
        stuffList.add(Stuff("Mrs. Ali Morissette","cheri.russo@example.com",R.drawable.square80profile1))
        stuffList.add(Stuff("Mathew Ankunding","brianna.hopkins@example.com",R.drawable.square80profile2))
        stuffList.add(Stuff("Mitchell Kihn","virginia.sharpe@example.com",R.drawable.square80profile3))
        stuffList.add(Stuff("Debby Hagenes","veronica.dennis@example.com",R.drawable.square80profile4))
        stuffList.add(Stuff("Andrea Hermann","lora.green@example.com",R.drawable.square80profile5))
        stuffList.add(Stuff("Pearline Willms","kathleen.lewis@example.com",R.drawable.square80profile6))
        stuffList.add(Stuff("Francoise Lockman","reed.martin@example.com",R.drawable.square80profile7))
        stuffList.add(Stuff("Devin Mitchell II","lela.fry@example.com",R.drawable.square80profile8))
        stuffList.add(Stuff("Berry Kuhn I","jimmie.herring@example.com",R.drawable.square80profile9))
        stuffList.add(Stuff("Carlee Labadie","tami.newman@example.com",R.drawable.square80profile10))
        stuffList.add(Stuff("Jesus Harris","justin.grimes@example.com",R.drawable.square80profile11))
        stuffList.add(Stuff("Colton Simonis I","desmond.jefferson@example.com",R.drawable.square80profile12))
        stuffList.add(Stuff("Leone Wintheiser","myrtle.sosa@example.com",R.drawable.square80profile13))
        stuffList.add(Stuff("Shavonda Stark Jr.","may.guerrero@example.com",R.drawable.square80profile14))
    }


}