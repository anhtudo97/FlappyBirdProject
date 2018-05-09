package FlappyBird;

import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FlappyBird extends GameScreen {

    private BufferedImage birds;
    private Animation bird_anim;

    public static float g = 0.1f;

    private Bird bird;

    public FlappyBird() {
        super(800, 600);

        try {
            birds = ImageIO.read(new File("Assets/bird_sprite.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        bird_anim = new Animation(100);
        AFrameOnImage f;
        f = new AFrameOnImage(0, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(120, 0, 60, 60);
        bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        bird_anim.AddFrame(f);

        bird = new Bird(250, 50, 50, 50);

        BeginGame();
    }

    @Override
    public void GAME_UPDATE(long deltaTime) {
        bird_anim.Update_Me(deltaTime);
        bird.update(deltaTime);
    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {
        if (bird.getIsFlying())
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, -1);
        else {
            bird_anim.PaintAnims((int) bird.getPosX(), (int) bird.getPosY(), birds, g2, 0, 0);
        }
    }

    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {
        if (Event == KEY_PRESSED) {
            bird.fly();
        }
    }

    public static void main(String[] args) {
        new FlappyBird();
    }
}
