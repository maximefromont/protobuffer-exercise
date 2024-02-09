package org.example;

import org.example.java_out.*;

import java.util.ArrayList;

public class TestJavaOut {

    //Main
    public static void main(String[] args) {

        //Zelda VideoGame
        VideoGame zelda = VideoGame.newBuilder()
                .setName("The Legend of Zelda: Breath of the Wild")
                .setType(VideoGame.GameType.ADVENTURE)
                .setReleaseDate(Date.newBuilder()
                        .setYear(2017)
                        .setMonth(3)
                        .setDay(3)
                        .build())
                .build();

        VideoGameLibrary videoGameLibrary = VideoGameLibrary.newBuilder().addGame(zelda).build();
    }

}
