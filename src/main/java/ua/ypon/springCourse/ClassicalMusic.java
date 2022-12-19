package ua.ypon.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


//    private List<String> musicListClassicalMusic = new ArrayList<>(
//            List.of("Hungarian Rhapsody", "9 simphony", "Moon sonata"));
//
//    @Override
//    public List<String> getSong() {
//        return musicListClassicalMusic;
//    }

    //private ClassicalMusic() {}//конструктор(приватный) для запрета создания объектов

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }

//    public void doMiInit() {
//        System.out.println("Do my initialization");//init method (при scope prototype) вызывается столько раз сколько будет вызовов
//    }

//    public void doMyDestriy() {
//        System.out.println("Do my destrot");
//    }

}
