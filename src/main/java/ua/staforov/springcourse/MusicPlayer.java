package ua.staforov.springcourse;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> listMusic;

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;

    }
    public String playMusic( ) {
        Random random = new Random();

        return "Playing: " + listMusic.get(random.nextInt(listMusic.size())).getSong()
                + " with volume " + this.volume;
    }
    //   @Value("${musicPlayer.name}")
//    private String name;
//   @Value("${musicPlayer.volume}")
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    private Music music1;
//    private Music music2;
//
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }


}
