package com.pluralsight;

import java.util.Scanner;
public class Library {
    static Scanner scanner = new Scanner(System.in);
    static Book[] bookLibrary = new Book[20];


    public static void main(String[] args) {

        bookLibrary[0] = new Book(1, "11", "The Hunger Games ", false, "");
        bookLibrary[1] = new Book(2, "22", "Harry Potter ", false, "");
        bookLibrary[2] = new Book(3, "33", "Pride and Prejudice ", false, "");
        bookLibrary[3] = new Book(4, "44", "To Kill a Mockingbird ", false, "");
        bookLibrary[4] = new Book(5, "55", "The Book Thief ", false, "");
        bookLibrary[5] = new Book(6, "66", "Twilight ", false, "");
        bookLibrary[6] = new Book(7, "77", "Animal Farm ", false, "");
        bookLibrary[7] = new Book(8, "88", "The Chronicles pf Narnia ", false, "");
        bookLibrary[8] = new Book(9, "99", "The Fault in Our Stars ", false, "");
        bookLibrary[9] = new Book(10, "100", "The Picture of Dorian Gray ", false, "");
        bookLibrary[10] = new Book(11, "110", "The Giving Tree ", false, "");
        bookLibrary[11] = new Book(12, "120", "Gone with the Wind ", false, "");
        bookLibrary[12] = new Book(13, "130", "Wuthering Heights ", false, "");
        bookLibrary[13] = new Book(14, "140", "The Perk of Being a Wallflower ", false, "");
        bookLibrary[14] = new Book(15, "150", "Jane Eyre", false, "");
        bookLibrary[15] = new Book(16, "160", "The Lightning Thief ", false, "");
        bookLibrary[16] = new Book(17, "170", "The Great Gasby ", false, "");
        bookLibrary[17] = new Book(18, "180", "The Little Prince ", false, "");
        bookLibrary[18] = new Book(19, "190", "The Da Vinci Code ", false, "");
        bookLibrary[19] = new Book(20, "200", "Divergent", false, "");


        System.out.println("Home Screen:\n\t 1) Show Available Books:\n\t 2) Show Checked Out Books:\n\t 3) Exit - closes out of the application");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                showAvailableBooks();
                break;
            case 2:
                showCheckedOutBooks();
                break;
            case 3:
                System.exit(0);
                return;
        }
        System.out.println("Enter your option: ");
        option = scanner.nextInt();
    }
        private static void showAvailableBooks() {
            for (Book book : bookLibrary) {
                if (!book.getisCheckedOut()) {
                    System.out.println(book);
            }
            }
        }
        private static void showCheckedOutBooks() {
                    System.out.println("Enter the id of book that you want to check out: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    for (Book book : bookLibrary) {
                        book.checkOut(name);
                        System.out.println(book.gettitle()+"Was checked out by"+ name);
                    }
            System.out.println("what would you like to do:\n\t Check out a book (C)\n\t Exit to main menu (X)");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("c")) {
                for (Book book : bookLibrary) {
                    if (book.getid()==id);
                    book.checkIn();
                    System.out.println(book.gettitle());
                }
            }




            }
        }






