package com.twu.biblioteca;

public class Menu {

    public static void main (String[] args){

        Menu ui = new Menu();
        ui.welcome();// 欢迎界面
    }

    // 欢迎界面
    public void welcome() {
        System.out.println("*********************************");
        System.out.println("********Welcome to Biblioteca！********");
        System.out.println("*********************************");

    }
}
