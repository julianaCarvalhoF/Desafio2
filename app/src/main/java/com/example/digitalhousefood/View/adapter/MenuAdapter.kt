package com.example.digitalhousefood.View.adapter
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousefood.Model.GridLayoutMold
import com.example.digitalhousefood.R
import com.example.digitalhousefood.View.activity.GridActivity

class MenuAdapter(
    private val restaurantDishes : List<GridLayoutMold>
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)

        return MenuAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantDishes[position])
        Glide.with(holder.itemView.context).load(restaurantDishes[position].imgGrid).into(holder.imageView)
        holder.dishName.text = restaurantDishes[position].imgGrid

        holder.itemView.setOnClickListener {

            val intent = Intent(holder.itemView.context, GridActivity::class.java)
            intent.putExtra("dishData", restaurantDishes[position])

            it.context.startActivity(
                intent
            )
        }
    }

    override fun getItemCount(): Int {
        return restaurantDishes.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivMenuItem)
        val dishName: TextView = itemView.findViewById(R.id.tvMenuItem)
        fun bind( grid : GridLayoutMold) = with(itemView){
        }
    }

}