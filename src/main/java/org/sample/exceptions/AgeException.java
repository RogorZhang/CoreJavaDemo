package org.sample.exceptions;

public class AgeException extends Exception {

    static final long serialVersionUID = 7818375828146090155L; // serialization use

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
