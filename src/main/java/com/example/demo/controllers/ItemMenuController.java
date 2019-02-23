package com.example.demo.controllers;

import com.example.demo.domain.ItemMenu;
import com.example.demo.domain.dto.ItemMenuDTO;
import com.example.demo.services.ItemMenuService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/itens/menu/pagination")
public class ItemMenuController {

    ModelMapper modelMapper = new ModelMapper();

    private final ItemMenuService itemMenuService;

    @Autowired
    public ItemMenuController(ItemMenuService itemMenuService) {
        this.itemMenuService = itemMenuService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<Page<ItemMenu>> getPagination(Pageable page){
        return ResponseEntity.ok().body(itemMenuService.getPagination(page));
    }

    // filtrando por name or flPublica or TpAcesso usando método do JPA
    @GetMapping(value = "/filter/{nameMenu}/{flPublica}/{tpAcesso}")
    public ResponseEntity<Page<ItemMenuDTO>> getPaginationFilter(
            @PathVariable String nameMenu,
            @PathVariable String flPublica,
            @PathVariable String tpAcesso,
            Pageable pageable){
        Page<ItemMenu> itemMenu = itemMenuService.getPaginationFilter(nameMenu, flPublica, tpAcesso, pageable);
        Page<ItemMenuDTO> itemMenuDTOS = itemMenu.map(i -> modelMapper.map(i, ItemMenuDTO.class));

        return ResponseEntity.ok().body(itemMenuDTOS);
    }

    // filtrando por nome no paramêtro se o nome estiver vazio retorna todos dados paginados
    @GetMapping(value = "/filter/name")
    public ResponseEntity<Page<ItemMenu>> findByNameMenu(
                            @RequestParam("name") String name,
                            Pageable pageable) {
        return ResponseEntity.ok().body(itemMenuService.findByNameMenu(name, pageable));
    }


}
