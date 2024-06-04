package eu.braincluster.shoppinglistapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import eu.braincluster.shoppinglistapp.R
import eu.braincluster.shoppinglistapp.data.ShoppingItem
import eu.braincluster.shoppinglistapp.databinding.ListItemShoppingBinding

class ShoppingListAdapter : RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>
{
    private var context: Context
    private var itemList = mutableListOf<ShoppingItem>()

    constructor(context: Context, itemList: List<ShoppingItem>)
    {
        this.context = context
        this.itemList.addAll(itemList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val shoppingItemBinding = ListItemShoppingBinding.inflate(LayoutInflater.from(context), parent, false)

        return ShoppingListAdapter.ViewHolder(shoppingItemBinding)
    }

    override fun getItemCount(): Int
    {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        var item = itemList[position]

        holder.bind(item)
    }

    class ViewHolder(val shoppingBinding: ListItemShoppingBinding) : RecyclerView.ViewHolder(shoppingBinding.root)
    {
        fun bind(item : ShoppingItem)
        {
            shoppingBinding.textViewName.text = item.name
        }
    }
}