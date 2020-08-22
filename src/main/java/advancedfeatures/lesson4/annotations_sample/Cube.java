package advancedfeatures.lesson4.annotations_sample;

import java.util.ArrayList;
import java.util.List;

public class Cube {

    int width;

    Cube(int width) {
        this.width = width;
    }

    /**
     * this method is not used any more
     * please use {@link #calculateVolume()} instead
     *
     * @return volume
     */
    @Deprecated
    // reiskia kad pasenes :D "many years" intelliJ pasiulymuose tokiom anotacijom metodus perbraukia, nors leidzia naudoti ir veikia kaip veikia
    public int getVolume() {
        int a = width;
        int s = a * a;
        int v = s * a;
        return 0;
    }


    public int calculateVolume() {
        return width * width * width;
    }

//    @SuppressWarnings("all")        // nuima warningus, galima pasirinkti kokius warninus nuimti.
    public void manager() {
        List list = new ArrayList();
        list.add(new Cube(3));
    }


}
