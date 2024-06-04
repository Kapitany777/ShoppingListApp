package eu.braincluster.shoppinglistapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import eu.braincluster.shoppinglistapp.adapter.ShoppingListAdapter
import eu.braincluster.shoppinglistapp.data.ShoppingItem
import eu.braincluster.shoppinglistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.getRoot())

        binding.recyclerViewShoppingList.itemAnimator = DefaultItemAnimator()
        // binding.recyclerViewShoppingList.addItemDecoration(DividerItemDecoration(MainActivity.this))

        var itemList = mutableListOf(
            ShoppingItem("Podva"),
            ShoppingItem("Redva")
        )

        var adapter = ShoppingListAdapter(this, itemList)
        binding.recyclerViewShoppingList.adapter = adapter
    }
}