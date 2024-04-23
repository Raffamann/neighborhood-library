package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut , String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
    public Book() {
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getisbn() {
        return isbn;
    }
    public void setisbn(String isbn) {
        this.isbn = isbn;
    }
    public String gettitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public boolean getisCheckedOut() {
        return isCheckedOut;
    }
    public void setisCheckOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }
    public String getcheckedOutTo() {
        return checkedOutTo;
    }
    public void setcheckedOutTo(String checkedOutTo) {
        this.checkedOutTo= checkedOutTo;
    }
    public void checkOut() {
        this.checkedOutTo = "";
        this.isCheckedOut = true;
    }
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }


}
