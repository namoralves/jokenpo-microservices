package br.com.namoralves.jokenpogameserver.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnknownSelectedPlayException extends RuntimeException {

    private List<String> params = new ArrayList<>();

    public UnknownSelectedPlayException(String... parameters) {
        super();
        List<String> listParams = Arrays.asList(parameters);
        listParams.forEach(p -> this.params.add(p));
    }

    public String[] getParams() {
        return this.params.toArray(new String[params.size()]);
    }
}
