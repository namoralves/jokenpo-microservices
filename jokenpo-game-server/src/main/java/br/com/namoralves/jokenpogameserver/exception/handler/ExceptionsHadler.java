package br.com.namoralves.jokenpogameserver.exception.handler;

import br.com.namoralves.jokenpogameserver.exception.BlankValueException;
import br.com.namoralves.jokenpogameserver.exception.UnknownSelectedPlayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class ExceptionsHadler {

    private MessageSource messageI18n;

    @ExceptionHandler(UnknownSelectedPlayException.class)
    public ResponseEntity<?> handlerUnknownSelectedPlayException(UnknownSelectedPlayException ex) {
        String message = getMessageI18n("error.unknown.selected.played", ex.getParams());

        return ResponseEntity.badRequest().body(message);
    }

    @ExceptionHandler(BlankValueException.class)
    public ResponseEntity<?> handlerBlankValueException(BlankValueException ex) {
        String message = getMessageI18n("error.blank.value", ex.getParams());

        return ResponseEntity.badRequest().body(message);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> handlerNotFoundException() {
        String message = getMessageI18n("error.not.found.exception");

        return ResponseEntity.badRequest().body(message);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handlerGenericException() {
        String message = getMessageI18n("error.generic.exception");

        return ResponseEntity.badRequest().body(message);
    }

    private String getMessageI18n(String key, String... params) {
        return messageI18n.getMessage(key, params, null);
    }

    @Autowired
    public void setMessageI18n(MessageSource messageSource) {
        this.messageI18n = messageSource;
    }

}
