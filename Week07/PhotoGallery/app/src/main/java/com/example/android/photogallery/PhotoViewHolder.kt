package com.example.android.photogallery

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.android.photogallery.databinding.ListItemGalleryBinding

class PhotoViewHolder(
    private val binding: ListItemGalleryBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(galleryItem: GalleryItem) {
        // TODO
        binding.itemImageView.load(galleryItem.url)

    }
}