package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ItemMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idMenu;
    private String nameMenu;
    private String flPublica;
    private String tpAcesso;

    public ItemMenu() {
    }

    public ItemMenu(String nameMenu, String flPublica, String tpAcesso) {
        this.nameMenu = nameMenu;
        this.flPublica = flPublica;
        this.tpAcesso = tpAcesso;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getNameMenu() {
        return nameMenu;
    }

    public void setNameMenu(String nameMenu) {
        this.nameMenu = nameMenu;
    }

    public String getFlPublica() {
        return flPublica;
    }

    public void setFlPublica(String flPublica) {
        this.flPublica = flPublica;
    }

    public String getTpAcesso() {
        return tpAcesso;
    }

    public void setTpAcesso(String tpAcesso) {
        this.tpAcesso = tpAcesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemMenu itemMenu = (ItemMenu) o;
        return flPublica == itemMenu.flPublica &&
                tpAcesso == itemMenu.tpAcesso &&
                Objects.equals(idMenu, itemMenu.idMenu) &&
                Objects.equals(nameMenu, itemMenu.nameMenu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMenu, nameMenu, flPublica, tpAcesso);
    }
}
