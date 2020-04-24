package com.twu.biblioteca;

import java.util.Scanner;

public class Borrow {

    public static Book book = new Book();
    UserData user = new UserData();

    // 登录验证
    public int login(String username, String password) {
        if (username.equals(user.getUser())) {
            if (password.equals(user.getPassword())) {
                return 1;// 账号和密码验证通过
            } else {
                return 0;// 密码错误
            }
        } else {
            return -1;// 账号不存在
        }
    }


    public void showBook() {
        System.out.println("Our library have  " + (book.bookName.length) + " books");
        int a = bookinfo();
        if (a == 0) {
            // 展示所有图书信息
            showAll();
        } else if (a > 0 && a <= book.bookName.length) {
            // 展示相关图书信息
            showPart(a);
        } else {
            System.out.println("Input is invalid!");
            showBook();
        }
    }

    // 展示所有图书信息
    public void showAll() {
        for (int i = 0; i < book.bookName.length; i++) {
            if (book.bookName[i] != null) {
                System.out.println("---------------------------------------编号" + (i + 1)
                        + "--------------------------------------------------------------");
                System.out.println("Book ID" + (i + 1) + "'s information detail：");
                System.out.print("Book Name：" + book.bookName[i] + " ");
                System.out.print("Author：" + book.authors[i] + " ");
                System.out.print("Published Date：" + book.pubDates[i] + " ");
            }
        }
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");
    }
    // 展示相关图书信息
    public void showPart(int a) {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("Book ID" + (a) + " detail：");
        System.out.print("Book Name：" + book.bookName[a - 1] + " ");
        System.out.println("Author：" + book.authors[a - 1] + " ");
        System.out.print("Year Published：" + book.pubDates[a - 1] + " ");
        System.out.println(
                "---------------------------------------------------------------分界线---------------------------------------------------");
    }
    //根据编号判断要全局展示还是部分展示
    public int bookinfo() {
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
    // 修改书籍信息 1书名 2作者 3出版日期 4总页数 5借阅者
    public void modinfo(int a, String value, int index) {

        switch (a) {
            case 1:
                book.bookName[index] = value;
                break;

            case 2:
                book.authors[index] = value;
                break;
            case 3:
                book.pubDates[index] = value;
                break;


        }

    }

    // 检查书是否存在馆里和是否已借出
    public int testBook(String bookname) {

        // 馆里有此书，查找此书的索引，有此书a>=0，无返-1
        int a = selectIndex(bookname);
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
    public void setBorrowReader(String bookname){
        int a = selectIndex(bookname);
        book.borrowReaders[a]="无";
    }
    //查询指定书的借阅者
    public String getBorrowReader(String bookname){
        int a = selectIndex(bookname);
        return book.borrowReaders[a];
    }




}
