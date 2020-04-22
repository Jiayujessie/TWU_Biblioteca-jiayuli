package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Menu ui = new Menu();
        ui.welcome();// 欢迎界面
        ui.showMenu();

    }

    // 欢迎界面
    public void welcome() {
        System.out.println("*********************************");
        System.out.println("********Welcome to Biblioteca！********");
        System.out.println("*********************************");

    }

}

    public void showMenu() {
        System.out.println("Please type the number：");//输入功能编号进入相应的功能
        System.out.println("Number：1 -- Book list");
        System.out.println("Number：2 -- Borrow a book");
        System.out.println("Number：3 -- Return a book");
        System.out.println("Number：4 -- Exit the system");//(1.6) Quit the application
        System.out.print("please type the function number：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//
        switch (a) {
            case 1:// 图书信息
                showBook();
                returnMethod();// 返回主菜单
                break;
            case 2:// 借阅
                borrowBook();
                break;
            case 3:// 还书
                returnBook();
                break;
            case 4://Exit the system
                welcome();
                scanner.close();
                break;
        }
    }

    // 返回主菜单功能
    public void returnMethod() {
        System.out.print("Push ENTER to return main menu：");//返回主界面
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        showMenu();
    }

    // 图书信息展示功能
    public void showBook() {
        borrow.showBook();
    }


    // 书籍借阅功能
    public void borrowBook() {
        System.out.print("Please put the book's name：");//请输入要借的书名
        Scanner scanner = new Scanner(System.in);
        String bookname = scanner.nextLine();
        int flag = borrow.testBook(bookname);
        switch (flag) {
            case 1://不存在此书的情况
                System.out.println("借书失败，" + bookname + "不存在该图书馆中。");
                System.out.print("输入0回车返回至主菜单，输入1回车则继续借书：");
                int a1 = scanner.nextInt();
                switch (a1) {
                    case 0:
                        showMenu();
                        break;

                    case 1:
                        borrowBook();
                        break;

                }
        }
    }
}

