package com.example.demo.services;

import com.example.demo.domain.ItemMenu;
import com.example.demo.repositories.ItemMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ItemMenuService {

    private final ItemMenuRepository itemMenuRepository;


    @Autowired
    public ItemMenuService(ItemMenuRepository itemMenuRepository) {
        this.itemMenuRepository = itemMenuRepository;
    }

    // Usando findAll
    public Page<ItemMenu> getPagination(Pageable pageable) {
        return itemMenuRepository.findAll(pageable);
    }
}
