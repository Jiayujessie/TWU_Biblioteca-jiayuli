package com.twu.biblioteca;

import java.util.Scanner;

public class Borrow {

    public static Book book = new Book();
    UserData user = new UserData();

    // 登录验证
    public int login(String username, String password) {
        if (username.equals(user.getUser())) {
            if (password.equals(user.getPassword())) {
                return 1;// username and password is right
            } else {
                return 0;// username and password is wrong
            }
        } else {
            return -1;// no exist user account
        }
    }


    public void showBook() {
        System.out.println("Our library have  " + (book.bookName.length) + " books");
        int a = bookInfo();
        if (a == 0) {
            // show all of book list
            showAll();
        } else if (a > 0 && a <= book.bookName.length) {
            // show book info about the one
            showPart(a);
        } else {
            System.out.println("Input is invalid!");
            showBook();
        }
    }

    // show all book info
    public void showAll() {
        for (int i = 0; i < book.bookName.length; i++)
            if (book.bookName[i] != null) {
                System.out.println("Book ID" + (i + 1) + "'s information detail：");
                System.out.print("Book Name：" + book.bookName[i] + " ");
                System.out.print("Author：" + book.authors[i] + " ");
                System.out.print("Published Date：" + book.pubDates[i] + " ");
            }

    }
    // 展示相关图书信息
    public void showPart(int a) {
        System.out.println("Book ID" + (a) + " detail：");
        System.out.print("Book Name：" + book.bookName[a - 1] + " ");
        System.out.println("Author：" + book.authors[a - 1] + " ");
        System.out.print("Year Published：" + book.pubDates[a - 1] + " ");

    }
    //根据编号判断要全局展示还是部分展示
    public int bookInfo() {
        for (int i = 0; i < book.bookName.length; i++) {
            if (book.bookName[i] != null) {
                System.out.println("Book ID" + (i + 1) + "：" + book.bookName[i] + " ");
            }
        }
        System.out.print(" Type the number for book detail, type 0 for all books information ：");//输入相应编号即可查看相应书籍的详细信息(输入0则查看所有信息)
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // 根据书名查找索引，有此书返其索引，无返-1
    public int selectIndex(String bookname) {
        int flag = -1;
        for (int i = 0; i < book.bookName.length; i++) {
            if (bookname.equals(book.bookName[i])) {
                flag = i;
            }
        }
        return flag;// 找不到此书
    }

    // 检查书是否存在馆里和是否已借出
    public int testBook(String bookName) {

        // 馆里有此书，查找此书的索引，有此书a>=0，无返-1
        int a = selectIndex(bookName);
        // 馆里有此书
        if (a >= 0) {
            if ((book.borrowReaders[a].equals("无") || book.borrowReaders[a].equals("")))// 无人借此书，""为扫描器的直接回车值
                return 0;//未借
            else
                return 1;//已借
        } else {
            return -1;// 馆里没有此书
        }

    }
    //将借阅者设置为无或者为空
    public void setBorrowReader(String bookName){
        int a = selectIndex(bookName);
        book.borrowReaders[a]="无";
    }
    //查询指定书的借阅者
    public String getBorrowReader(String bookName){
        int a = selectIndex(bookName);
        return book.borrowReaders[a];
    }




}
