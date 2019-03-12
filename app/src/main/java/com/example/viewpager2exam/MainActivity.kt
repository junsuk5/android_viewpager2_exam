package com.example.viewpager2exam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_sample.view.*

class MainActivity : AppCompatActivity() {

    private val _items = arrayListOf(
            "Test1",
            "Test2",
            "Test3",
            "Test4",
            "Test5",
            "Test6"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2.adapter = SampleAdapter(_items)
    }
}

class SampleAdapter(private val items: List<String>) : RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        return SampleViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_sample, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.itemView.textView.text = items[position]
    }

    class SampleViewHolder(view: View) : RecyclerView.ViewHolder(view)
}