package br.com.namoralves.jokenpogameserver.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlankValueException extends RuntimeException {

    private List<String> params = new ArrayList<>();

    public BlankValueException(String... parameters) {
        super();
        List<String> listParams = Arrays.asList(parameters);
        listParams.forEach((p) -> this.params.add(p));
    }

    public String[] getParams() {
        return this.params.toArray(new String[params.size()]);
    }

}
