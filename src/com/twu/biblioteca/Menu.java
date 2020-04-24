package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    Borrow borrow = new Borrow();

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
        loginBoundary();// 登录界面

    }

    // 管理员登录界面
    public void loginBoundary() {
        System.out.print("Please type your library number(Try 1)：");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("Please type your password (Try 1)：");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();
        int flag = borrow.login(username, password);// 登录验证
        switch (flag) {
            case 0:// 密码错误
                System.out.println("Wrong password, please type again:");
                loginBoundary();
                break;

            case 1:// 验证通过
                System.out.println("success login");
                showMenu();// 登录成功后跳转至菜单功能管理
                break;
            case -1:// 账户不存在
                System.out.println("Your library number is not exist!");
                loginBoundary();
                break;
        }
    }

    // 菜单功能展示列表
    public void showUserMenu() {
        System.out.println("Please type the number：");
        System.out.println("Number：1 -- Book list");
        System.out.println("Number：2 -- Borrow a book");
        System.out.println("Number：3 -- Return a book");
        System.out.println("Number：4 -- Exit the system");
        System.out.print("please type the function number：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//
        switch (a) {
            case 1:// 图书信息
                showBook();
                returnMethod();// 返回主菜单
                break;
            case 2:// 还书
                returnBook();
                break;
            case 3:// 借阅
                borrowBook();
                break;
            case 4:// 退出登录
                welcome();
                scanner.close();
                break;
        }
    }


    public void showMenu() {
        System.out.println("Please type the number：");//输入功能编号进入相应的功能
        System.out.println("Number：1 -- Book list");
        System.out.println("Number：2 -- Borrow a book");
        System.out.println("Number：3 -- Return a book");
        System.out.println("Number：4 -- Exit the system");//(1.6) Quit the application
        System.out.println("Number：5 -- Movie list");// 2.1 / View a list of available movies
        System.out.println("Number：6 -- Checkout a movie");// 2.2 / Checkout a movie
        System.out.println("Number：7 -- Veiw account information");//Veiw account information
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
            case 5://Movie list
                showMovie();
                scanner.close();
                break;
            case 6://Checkout a movie
                movieCheckout();
                scanner.close();
                break;

            case 7://Veiw account information
                userAccount();
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

    // 还书功能
    public void returnBook() {
        System.out.print("Please type the name of book you want to return：");//输入要还的书籍名称
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int flag = borrow.testBook(bookName);
        if (flag == 0) {
            System.out.println(bookName + " not be borrowed.");
            System.out.print("type 0 and enter to return main menu, type others to continue return books.");//输入0回车返回至主菜单，输入其他键则继续还书
            String a = scanner.nextLine();
            if (a.equals("0")) {
                showMenu();
            } else {
                returnBook();
            }
        } else if (flag == -1) {
            System.out.println(bookName + " did not exist in library!");
            System.out.print("type 0 and enter to return main menu, type others to continue return books.");
            String a = scanner.nextLine();
            if (a.equals("0")) {
                showMenu();
            } else {
                returnBook();
            }
        } else if (flag == 1) {

            System.out.println(borrow.getBorrowReader(bookName) + " success to return the book！");//成功还书
            borrow.setBorrowReader(bookName);
            System.out.print("type 0 and enter to return main menu, type others to continue return books.");
            String a = scanner.nextLine();
            if (a.equals("0")) {
                showMenu();
            } else {
                returnBook();
            }
        }
    }


    // 书籍借阅功能
    public void borrowBook() {
        System.out.print("Please put the book's name：");//请输入要借的书名
        Scanner scanner = new Scanner(System.in);
        String bookname = scanner.nextLine();
        int flag = borrow.testBook(bookname);
        if (flag == 1) {//不存在此书的情况
            System.out.println("Failed!" + bookname + "is not exist in library");
            System.out.print("type 0 and enter to return main menu, type others to continue：");
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


    // 电影信息展示功能

    public void showMovie() {
        CheckoutMovie.showMovie();
    }

    // 电影借阅功能
    public void movieCheckout() {
        System.out.print("Please put the movie's name：");//请输入电影名
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        //不存在此书的情况
        System.out.println("Failed，" + movieName + "is not exist in library!");
        System.out.print("type 0 to return main menu, or type 1 to continue ：");
        int a1 = scanner.nextInt();
        switch (a1) {
            case 0:
                showMovie();
                break;

            case 1:
                new CheckoutMovie();
                break;

        }
    }

    public void userAccount (){
        System.out.print ("UserData.userAccount()");



    }



}

