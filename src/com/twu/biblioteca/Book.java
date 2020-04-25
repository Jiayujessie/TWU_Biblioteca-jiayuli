package com.twu.biblioteca;

public class Book {
    public String[] bookName = new String[10];
    public String[] authors = new String[10];
    public String[] pubDates = new String[10];
    public String[] borrowReaders = new String[10];

    public Book() {
        {
            int i = 0;
            while (i < bookName.length) {

                i++;
            }
        }
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    bookName[i] = "Book 1";
                    authors[i] = "Authors 1";
                    pubDates[i] = "2020-01-01";
                    break;
                case 1:
                    bookName[i] = "Book 2";
                    authors[i] = "Authors 2";
                    pubDates[i] = "2020-02-02";
                    break;
                case 2:
                    bookName[i] = "Book 3";
                    authors[i] = "Author 3";
                    pubDates[i] = "2020-03-03";
                    break;
                case 3:
                    bookName[i] = "Book 4 ";
                    authors[i] = "Author 4";
                    pubDates[i] = "2020-04-04";
                    break;
                case 4:
                    bookName[i] = "Book 5";
                    authors[i] = "Author 5";
                    pubDates[i] = "2020-05-05";
                    break;
            }
        }

    }
}


