package com.example.demo.controllers;

import com.example.demo.domain.ItemMenu;
import com.example.demo.services.ItemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/itens-menu")
public class ItemMenuController {

    private final ItemMenuService itemMenuService;

    @Autowired
    public ItemMenuController(ItemMenuService itemMenuService) {
        this.itemMenuService = itemMenuService;
    }

    @GetMapping(value = "/consulta")
    public ResponseEntity<Page<ItemMenu>> getPagination(Pageable page){
        return ResponseEntity.ok().body(itemMenuService.getPagination(page));
    }
}
