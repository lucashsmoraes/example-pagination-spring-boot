package com.example.demo;

import com.example.demo.domain.ItemMenu;
import com.example.demo.repositories.ItemMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ItemMenuRepository itemMenuRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        ItemMenu itemMenu = new ItemMenu("NomeMenu", "PR", "S", 1, 1);
        ItemMenu itemMenu1 = new ItemMenu("NomeMenu_1", "PU", "S", 2, 2);
        ItemMenu itemMenu2 = new ItemMenu("NomeMenu_2", "PR", "S", 3, 3);
        ItemMenu itemMenu3 = new ItemMenu("NomeMenu_3", "PR", "S", 3, 4);
        ItemMenu itemMenu4 = new ItemMenu("NomeMenu_4", "PU", "N", 4, 5);
        ItemMenu itemMenu5 = new ItemMenu("NomeMenu_5", "PR", "S", 5, 6);
        ItemMenu itemMenu6 = new ItemMenu("NomeMenu_6", "PR", "N", 6, 7);
        ItemMenu itemMenu7 = new ItemMenu("NomeMenu_7", "PU", "S", 7, 8);
        ItemMenu itemMenu8 = new ItemMenu("NomeMenu_8", "PR", "S", 8, 9);
        ItemMenu itemMenu9 = new ItemMenu("NomeMenu_9", "PU", "S", 9, 10);
        ItemMenu itemMenu10 = new ItemMenu("NomeMenu_10", "PU", "N", 10, 11);
        ItemMenu itemMenu11 = new ItemMenu("NomeMenu_11", "PR", "N", 11, 12);

        itemMenuRepository.save(Arrays.asList(
                itemMenu, itemMenu1, itemMenu3,
                itemMenu4, itemMenu5, itemMenu6,
                itemMenu7, itemMenu8, itemMenu9,
                itemMenu10, itemMenu11, itemMenu2)
        );

    }
}
