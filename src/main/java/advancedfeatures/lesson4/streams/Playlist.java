package advancedfeatures.lesson4.streams;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public static void main(String[] args) {

        List<String> genres = new ArrayList<>();

        genres.add("Classic");
        genres.add("Alternative");
        genres.add("Rock");
        genres.add("Rap");
        genres.add("Metal");
        genres.add("Modern");
        genres.add("HipHop");

        // usual way to filter some part of info from list

        for (String genre : genres) {
            if (!genre.equals("Alternative")) {
                System.out.println(genre);
            }

        }

//        "darom toki pati dalyka su STREAMS:"
        System.out.println("+++++STREAM SAMPLE+++++");

        genres.stream()                                         //kuriam stream
                .filter(genre -> !genre.equals("Alternative"))  //filtruojam
                .forEach(genre -> System.out.println(genre));   // foreach suvartoja stream - toliau jau nebus stream
    }
}
