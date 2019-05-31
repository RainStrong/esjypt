package com.esjypt.model;

import java.io.Serializable;

public class TbBooks implements Serializable {
    private String bookId;

    private String bookName;

    private String bookPress;

    private Integer bookInventory;

    private String bookAuthor;

    private Integer currentInventory;

    private static final long serialVersionUID = 1L;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress == null ? null : bookPress.trim();
    }

    public Integer getBookInventory() {
        return bookInventory;
    }

    public void setBookInventory(Integer bookInventory) {
        this.bookInventory = bookInventory;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public Integer getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(Integer currentInventory) {
        this.currentInventory = currentInventory;
    }
}