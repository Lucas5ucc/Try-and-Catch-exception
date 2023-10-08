package org.academiadecodigo.finder.exceptions;


public class FileNotFoundException extends FileException {

    public FileNotFoundException() {
        super("File not found!");
    }
}
