package org.academiadecodigo.finder.exceptions;

public class NotEnoughSpaceException extends FileException {

    public NotEnoughSpaceException() {
        super("Not enough space!");
    }
}
