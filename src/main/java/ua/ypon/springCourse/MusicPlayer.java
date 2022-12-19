package ua.ypon.springCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> listGenre;

    public MusicPlayer(List<Music> listGenre) {
        this.listGenre = listGenre;
    }

    public String playMusic() {
        Random random = new Random();
        int numberRandom = random.nextInt(3);
        return listGenre.get(numberRandom).getSong();
    }

//    public void playMusic(Genre genre) {
//        Random random = new Random();
//        int inputRandom = random.nextInt(3);
//        if(genre == Genre.ROCK) {
//            System.out.println(music1.getSong().get(inputRandom));
//        } else {
//            System.out.println("Playing: " + music2.getSong().get(inputRandom));
//        }
//    }

    //private List<Music> musicList = new ArrayList<>();

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public void playMusicList() {
//        for(Music music: musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }

}