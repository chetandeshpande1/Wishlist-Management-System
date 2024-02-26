package com.example.demo.Service;

import com.example.demo.Entity.WishlistItem;
import com.example.demo.Repositories.WishlistItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {
    @Autowired
    private WishlistItemRepository wishlistItemRepository;

    public List<WishlistItem> getAllItems() {
        return wishlistItemRepository.findAll();
    }

    public WishlistItem addItem(WishlistItem item) {
        return wishlistItemRepository.save(item);
    }

    public void deleteItem(Long id) {
        wishlistItemRepository.deleteById(id);
    }
}