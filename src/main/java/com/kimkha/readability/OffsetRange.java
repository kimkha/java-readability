package com.kimkha.readability;

import org.jsoup.nodes.TextNode;

/**
 * Object to relate a range of PC-data to a text node in an XOM tree.
 */
public class OffsetRange {
    private int start;
    private int end;
    private TextNode text;

    OffsetRange(int start, int end, TextNode text) {
        this.start = start;
        this.end = end;
        this.text = text;

        assert this.text == null || this.text.text().length() == this.end - this.start;
    }

    public String toString() {
        return super.toString() + "[" + this.start + "-" + this.end + " " + this.text.text() + "]";
    }

    public TextNode getText() {
        return text;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setText(TextNode text) {
        this.text = text;
    }

    public boolean offsetInRange(int offset) {
        return offset >= start && offset < end;
    }
}
