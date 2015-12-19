package com.kimkha.readability;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by kimkha on 12/12/15.
 */
public class Log {
    public static int e(String tag, String message) {
        return println(tag, message);
    }

    public static int e(String tag, String message, Throwable tr) {
        return println(tag, message + "\n" + getStackTraceString(tr));
    }

    public static int w(String tag, String message) {
        return println(tag, message);
    }

    public static int i(String tag, String message) {
        return println(tag, message);
    }

    public static int d(String tag, String message) {
        return println(tag, message);
    }

    public static int d(String tag, String message, Throwable tr) {
        return println(tag, message + "\n" + getStackTraceString(tr));
    }

    private static String getStackTraceString(Throwable tr) {
        if (tr == null) {
            return "";
        }

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        tr.printStackTrace(pw);
        pw.flush();
        return sw.toString();

    }

    private static int println(String tag, String message) {
        String m = String.format("[%s] %s", tag, message);
        //System.out.println(m);
        return 0;
    }
}
