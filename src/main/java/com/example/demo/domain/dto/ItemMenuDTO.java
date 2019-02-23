package com.example.demo.domain.dto;

public class ItemMenuDTO {

    private Integer idMenu;
    private String nameMenu;
    private String flPublica;
    private char tpAcesso;

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

    public char getTpAcesso() {
        return tpAcesso;
    }

    public void setTpAcesso(char tpAcesso) {
        this.tpAcesso = tpAcesso;
    }

}
