package com.twu.biblioteca;

public class UserData {
    private String username="1";
    private String password="1";
    private String email = "1234567@88.com";


    public String getUser() {
        return username;
    }
    public String getPassword() {

        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getBorrowedBook() {
        return "Book111";
    }

    public String getBorrowedMovie() {
        return "Movie 111";
    }

    public static void userAccount(){
        System.out.println( "username, email, borrowedBook, borrowedMovie");

    }


}
