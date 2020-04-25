package com.twu.biblioteca;

public class Movie {

    public Movie() {
        {
            int i = 0;
            while (i < 100) {

                i++;
            }
        }
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    movieName[i] = "movie 1";
                    director[i] = "director 1";
                    releaseDate[i] = "2020-01-01";
                    rate[i] = "111";
                    break;
                case 1:
                    movieName[i] = "movie 2";
                    director[i] = "director 2";
                    releaseDate[i] = "2020-02-02";
                    rate[i] = "222";
                    break;
                case 2:
                    movieName[i] = "movie 3";
                    director[i] = "director 3";
                    releaseDate[i] = "2020-03-03";
                    rate[i] = "333";
                    break;
                case 3:
                    movieName[i] = "movie 4 ";
                    director[i] = "director 4";
                    releaseDate[i] = "2020-04-04";
                    rate[i] = "444";
                    break;
                case 4:
                    movieName[i] = "movie 5";
                    director[i] = "director 5";
                    releaseDate[i] = "2020-05-05";
                    rate[i] = "555";
                    break;
            }
        }

    }

    public String[] movieName = new String[10];
    public String[] director = new String[10];
    public String[] releaseDate = new String[10];
    public String[] rate = new String[10];


}


