import greenfoot.*;
import java.util.Random;

public class MyWorld extends World {
    private Random random = new Random();

    public MyWorld() {
        super(800, 600, 1);
        // ...
    }

    public void act() {
        if (random.nextInt(230) < 1) { // Munculkan "burung" dengan probabilitas 5%
            int randomX = random.nextInt(getWidth()); // Koordinat X acak
            int randomY = random.nextInt(getHeight()); // Koordinat Y acak
            addObject(new burung(), randomX, randomY); // Tambahkan objek "orang" secara acak
        }
    }
}

