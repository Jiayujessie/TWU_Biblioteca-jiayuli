package com.twu.biblioteca;

public class Book {

    public Book() {
        {
            String noreaders= "无";
            for (int i = 0; i < booknames.length; i++) {

            }
            for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0:
                        booknames[i]="Book A";
                        authors[i]="Authors 1";
                        pubdates[i]="2020-01-01";
                        sumpaginations[i]="111";
                        break;
                    case 1:
                        booknames[i]="Book B";
                        authors[i]="Authors 2";
                        pubdates[i]="2020-02-02";
                        sumpaginations[i]="222";
                        break;
                    case 2:
                        booknames[i]="Book 3";
                        authors[i]="Author 3";
                        pubdates[i]="2020-03-03";
                        sumpaginations[i]="333";
                        break;
                    case 3:
                        booknames[i]="Book 4 ";
                        authors[i]="Author 4";
                        pubdates[i]="2020-04-04";
                        sumpaginations[i]="444";
                        break;
                    case 4:
                        booknames[i]="Book 5";
                        authors[i]="Author 5";
                        pubdates[i]="2020-05-05";
                        sumpaginations[i]="555";
                        break;
                }
            }

        }
    }

    public String[] booknames = new String[10];// 书名
    public String[] authors = new String[10];// 作者
    public String[] pubdates = new String[10];// 出版日期
    public String[] sumpaginations = new String[10];// 总页数
    public String[] borrowreaders = new String[10];// 借阅人


}
