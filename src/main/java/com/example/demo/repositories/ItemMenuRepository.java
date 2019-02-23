package com.example.demo.repositories;

import com.example.demo.domain.ItemMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMenuRepository extends JpaRepository<ItemMenu, Integer> {

    Page<ItemMenu> findAllByNameMenuOrFlPublicaOrTpAcessoIgnoreCaseContaining(String name, String flPublica, String tpAcesso, Pageable pageable);
    Page<ItemMenu> findByNameMenu(String nomeMenu, Pageable pageable);
    List<ItemMenu> findByFlPublica(String flPublica, Pageable pageable);
    List<ItemMenu> findByTpAcesso(String tpAcesso, Pageable pageable);
}
