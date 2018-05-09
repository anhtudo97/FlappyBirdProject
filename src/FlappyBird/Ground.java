package FlappyBird;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ground {

    private BufferedImage goundImage;

    public Ground() {
        try {
            this.goundImage = ImageIO.read(new File("Assets/ground.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
