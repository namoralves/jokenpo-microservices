package br.com.namoralves.jokenpogameserver.model.enums;

import br.com.namoralves.jokenpogameserver.exception.UnknownSelectedPlayException;

public enum SelectedPlayEnum {

    STONE(1),
    PAPER(2),
    SCISSORS(3);

    private Integer playCode;

    SelectedPlayEnum(Integer playCode) {
        this.playCode = playCode;
    }

    public Integer getPlayCode() {
        return playCode;
    }

    public static SelectedPlayEnum getEnumByString(String played) {
        try {
            SelectedPlayEnum selectedPlayEnum = valueOf(played);
            return selectedPlayEnum;
        } catch (Exception e) {
            throw new UnknownSelectedPlayException(played);
        }
    }
}