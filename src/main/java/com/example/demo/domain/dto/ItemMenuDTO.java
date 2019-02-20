package com.example.demo.domain.dto;

public class ItemMenuDTO {

    private Integer idMenu;
    private String nameMenu;
    private String flPublica;
    private String tpAcesso;

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

}
