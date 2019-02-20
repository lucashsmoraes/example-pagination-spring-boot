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

        ItemMenu itemMenu = new ItemMenu("NomeMenu", "PR", 'S');
        ItemMenu itemMenu1 = new ItemMenu("NomeMenu_1", "PU", 'N');
        ItemMenu itemMenu2 = new ItemMenu("NomeMenu_2", "PR", 'S');
        ItemMenu itemMenu3 = new ItemMenu("NomeMenu_3", "PR", 'S');
        ItemMenu itemMenu4 = new ItemMenu("NomeMenu_4", "PU", 'N');
        ItemMenu itemMenu5 = new ItemMenu("NomeMenu_5", "PR", 'S');
        ItemMenu itemMenu6 = new ItemMenu("NomeMenu_6", "PR", 'S');
        ItemMenu itemMenu7 = new ItemMenu("NomeMenu_7", "PU", 'N');
        ItemMenu itemMenu8 = new ItemMenu("NomeMenu_8", "PR", 'S');
        ItemMenu itemMenu9 = new ItemMenu("NomeMenu_9", "PU", 'N');
        ItemMenu itemMenu10 = new ItemMenu("NomeMenu_10", "PU", 'N');
        ItemMenu itemMenu11 = new ItemMenu("NomeMenu_11", "PR", 'S');

        itemMenuRepository.save(Arrays.asList(
                itemMenu, itemMenu1, itemMenu3,
                itemMenu4, itemMenu5, itemMenu6,
                itemMenu7, itemMenu8, itemMenu9,
                itemMenu10, itemMenu11, itemMenu2)
        );

    }
}
