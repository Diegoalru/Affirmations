package com.darssolutions.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.darssolutions.affirmations.R
import com.darssolutions.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 * @param context The context of the application
 * @param dataset A list of [Affirmation] objects to display in the [RecyclerView]
 * @return An instance of ItemAdapter
 */
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemHolder>() {

    /**
     * Provides a reference to the views for each data item.
     * Complex data items may need more than one view per item, and
     * you provide access to all the views for a data item in a view holder.
     * @param view The view that contains the item
     * @return An instance of ItemHolder
     */
    class ItemHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Creates new views.
     * @param parent The view group into which the new view will be added after it is bound to an adapter position
     * @param viewType The view type of the new view
     * @return An instance of ItemHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        // Create a new view, which defines the UI of the list item
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemHolder(adapterLayout)
    }

    /**
     * Returns the size of the dataset.
     * @return The size of the dataset.
     */
    override fun getItemCount(): Int {
        return dataset.size
    }

    /**
     * Replaces the content of an existing view with new data.
     * @param holder The view holder whose contents should be replaced
     * @param position The index in the dataset of the item whose view holder should be replaced
     */
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
}
