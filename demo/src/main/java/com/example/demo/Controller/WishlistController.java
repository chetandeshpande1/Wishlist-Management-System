package com.example.demo.Controller;

import com.example.demo.Entity.WishlistItem;
import com.example.demo.Service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {
    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<WishlistItem> getAllItems() {
        return wishlistService.getAllItems();
    }

    @PostMapping
    public WishlistItem addItem(@RequestBody WishlistItem item) {
        return wishlistService.addItem(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable Long id) {
        wishlistService.deleteItem(id);
        return ResponseEntity.ok().build();
    }
}

