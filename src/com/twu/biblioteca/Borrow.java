package com.twu.biblioteca;

import java.util.Scanner;

public class Borrow {

    public static Book book = new Book();

    public void showBook() {
        System.out.println("Our library have  " + (book.booknames.length) + " books");
        int a = bookinfo();
        if (a == 0) {
            // 展示所有图书信息
            showAll();
        } else if (a > 0 && a <= book.booknames.length) {
            // 展示相关图书信息
            showPart(a);
        } else {
            System.out.println("Input is invalid!");
            showBook();
        }
    }

    // 展示所有图书信息
    public void showAll() {
        for (int i = 0; i < book.booknames.length; i++) {
            if (book.booknames[i] != null) {
                System.out.println("---------------------------------------编号" + (i + 1)
                        + "--------------------------------------------------------------");
                System.out.println("Book ID" + (i + 1) + "'s information detail：");
                System.out.print("Book Name：" + book.booknames[i] + " ");
                System.out.print("Author：" + book.authors[i] + " ");
                System.out.print("Published Date：" + book.pubdates[i] + " ");
                System.out.print("Total pages：" + book.sumpaginations[i] + " ");
            }
        }
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");
    }
    // 展示相关图书信息
    public void showPart(int a) {
        int i = a;
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("Book ID" + (i) + " detail：");
        System.out.print("Book Name：" + book.booknames[i - 1] + " ");
        System.out.println("Author：" + book.authors[i - 1] + " ");
        System.out.print("Year Published：" + book.pubdates[i - 1] + " ");
        System.out.println(
                "---------------------------------------------------------------分界线---------------------------------------------------");
    }
    //根据编号判断要全局展示还是部分展示
    public int bookinfo() {
        for (int i = 0; i < book.booknames.length; i++) {
            if (book.booknames[i] != null) {
                System.out.println("Book ID" + (i + 1) + "：" + book.booknames[i] + " ");
            }
        }
        System.out.print(" Type the number for book detail, type 0 for all books information ：");//输入相应编号即可查看相应书籍的详细信息(输入0则查看所有信息)
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

}
