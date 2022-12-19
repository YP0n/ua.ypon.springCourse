package ua.ypon.springCourse;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }


//    private List<String> stringListRockMusic = new ArrayList<>(
//            List.of("Wind cries Mary", "Wind of change", "Evening cofee"));
//
//    @Override
//    public List<String> getSong() {
//            return stringListRockMusic;
//    }
}
