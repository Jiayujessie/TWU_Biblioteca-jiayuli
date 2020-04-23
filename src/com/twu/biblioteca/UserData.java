package com.twu.biblioteca;

public class UserData {
    private String username="1";//用户名
    private String password="1";//密码
    private String email = "1234567@88.com";
    private String brrowedBook = "Book111";
    private String brrowedMovie = "Movie 111";


    public String getUser() {
        return username;
    }
    public String getPassword() {

        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getBrrowedBook() {
        return brrowedBook;
    }

    public String getBrrowedMovie() {
        return brrowedMovie;
    }

    public static void userAccount(){
        System.out.println( "username, email, brrowedBook, brrowedMovie");

    }


}
