package com.kimkha.readability;

/**
 * Interface to reading HTML pages.
 */
public interface PageReader {
    /**
     * Read the content of a page. Return null and log if
     * there's some problem or another. This is responsible
     * for dealing with charset.
     * @param url
     * @return
     */
    String readPage(String url) throws PageReadException;

}
