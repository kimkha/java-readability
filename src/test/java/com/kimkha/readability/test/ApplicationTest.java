package com.kimkha.readability.test;

import com.kimkha.readability.PageReadException;
import com.kimkha.readability.Readability;

import java.util.List;

/**
 * Created by kimkha on 12/13/15.
 */
public class ApplicationTest {
    public static void main(String... args) throws PageReadException {

        Readability readability = new Readability();
        readability.setPageReader(new OkHttpReader());
//        readability.setReadAllPages(true);
        readability.setDetectNextLink(true);
        readability.processDocument("http://www.kimkha.com/");

        List<String> list = readability.getXmlImages();
        if (list != null && !list.isEmpty()) {
            for (String xml : list) {
                System.out.println("---------");
                System.out.println(xml);
            }
        }
        System.out.println("---------");
        System.out.println(readability.getNextPageLink());

    }
}
