package org.academiadecodigo.finder.exceptions;

public class NotEnoughPermissionsException extends FileException {

    public NotEnoughPermissionsException() {
        super("Not enough permissions!");
    }
}
