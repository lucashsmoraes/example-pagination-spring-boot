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


    // filtrando por Nome or flPublica ou TpAcesso
    public Page<ItemMenu> getPaginationFilter(String nameMenu, String flPublica, String tpAcesso, Pageable pageable) {
        return itemMenuRepository.findAllByNameMenuOrFlPublicaOrTpAcessoIgnoreCaseContaining(nameMenu, flPublica, tpAcesso, pageable);
    }

    // Nome estiver vazi
    public Page<ItemMenu> findByNameMenu(String name, Pageable pageable) {

        if (name.equals("")) {
            return itemMenuRepository.findAll(pageable);
        }else {
            return itemMenuRepository.findByNameMenu(name, pageable);
        }
    }
}
