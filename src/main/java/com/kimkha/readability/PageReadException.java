package com.kimkha.readability;

/**
 *
 */
public class PageReadException extends Exception {

    public PageReadException() {
        super();
    }

    public PageReadException(String message) {
        super(message);
    }

    public PageReadException(String message, Throwable cause) {
        super(message, cause);
    }

    public PageReadException(Exception e) {
        super(e);
    }
}
