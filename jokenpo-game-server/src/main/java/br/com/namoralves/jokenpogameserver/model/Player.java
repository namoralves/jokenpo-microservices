package br.com.namoralves.jokenpogameserver.model;

import br.com.namoralves.jokenpogameserver.model.enums.SelectedPlayEnum;

import java.io.Serializable;

public class Player implements Serializable {

    private String name;
    private SelectedPlayEnum selectedPlayEnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SelectedPlayEnum getSelectedPlayEnum() {
        return selectedPlayEnum;
    }

    public void setSelectedPlayEnum(SelectedPlayEnum selectedPlayEnum) {
        this.selectedPlayEnum = selectedPlayEnum;
    }
}
