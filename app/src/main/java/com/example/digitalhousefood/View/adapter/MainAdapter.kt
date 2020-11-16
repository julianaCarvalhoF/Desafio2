package com.example.digitalhousefood.View.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousefood.Model.CardMold
import com.example.digitalhousefood.R
import kotlinx.android.synthetic.main.model_card.view.*

class MainAdapter(
    private val cardMold : List<CardMold>,
    private val onItemClicked: (Int) -> Unit
): RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.model_card, parent, false)
        return ViewHolder(view)
    }

    // PEGA A QUANTIDADE DE ITENS DA LISTA

    override fun getItemCount(): Int {
        return cardMold.size
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {

        holder.bind(cardMold[position], onItemClicked)

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(card: CardMold, onItemClicked: (Int) -> Unit) = with(itemView) {
            //todo carregar imagem
            Glide.with(itemView.context).load(card.cardImage).into(iv_image)

            // PODEMOS CHAMAR OS VIEWS E PASSAR OS DADOS AQUI

            tv_name.text = card.cardName
            tv_description.text = card.cardDescription
            tv_status.text = card.cardStatus

            cardview.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }


        }
    }
}