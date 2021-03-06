package com.twu.biblioteca;

import java.util.Scanner;

public class CheckoutMovie {

    public static Movie movie = new Movie();

    public static void showMovie() {

        int a = movieInfo();
        if (a == 0) {
            showPart(a);
        } else {
            System.out.println("Input is invalid!");
            showMovie();
        }
    }

    // 展示相关电影信息
    public void showAll() {
        for (int i = 0; i < movie.movieName.length; i++) {
            if (movie.movieName[i] != null) {
                System.out.println("Movie name" + (i + 1) + "'s information detail：");
                System.out.print("Director：" + movie.movieName[i] + " ");
                System.out.print("Author：" + movie.director[i] + " ");
                System.out.print("Release Date：" + movie.releaseDate[i] + " ");
                System.out.print("Rate：" + movie.rate[i] + " ");
            }
        }
    }

    // 展示相关电影信息
    public static void showPart(int a) {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------");
        System.out.println("Movie name" + (a) + " detail：");
        System.out.print("Director：" + movie.movieName[a - 1] + " ");
        System.out.println("Release date：" + movie.releaseDate[a - 1] + " ");
        System.out.print("Rate ：" + movie.rate[a - 1] + " ");

    }

    // 根据书名查找索引，有此书返其索引，无返-1
    public int selectIndex(String bookName) {
        int flag = -1;
        for (int i = 0; i < movie.movieName.length; i++) {
            if (bookName.equals(movie.movieName[i])) {
                flag = i;
            }
        }
        return flag;// 找不到此书
    }

    //根据编号判断要全局展示还是部分展示
    public static int movieInfo() {
        for (int i = 0; i < movie.movieName.length; i++) {
            if (movie.movieName[i] != null) {
                System.out.println("Movie ID" + (i + 1) + "：" + movie.movieName[i] + " ");
            }
        }
        System.out.print(" Type the number for book detail, type 0 for all Movie information ：");//输入相应编号即可查看相的详细信息(输入0则查看所有信息)
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}


