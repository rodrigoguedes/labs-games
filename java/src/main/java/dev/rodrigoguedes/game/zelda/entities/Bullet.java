package dev.rodrigoguedes.game.zelda.entities;

import dev.rodrigoguedes.game.zelda.world.Camera;
import dev.rodrigoguedes.game.zelda.world.World;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Bullet extends Entity {

    private int directionX;
    private int directionY;
    private int speed = 2;

    public Bullet(int x, int y, int width, int height, BufferedImage sprite, Camera camera, World world, int dx, int dy) {
        super(x, y, width, height, sprite, camera, world);
//        this.directionX = dx;
//        this.directionY = dy;
    }

    @Override
    public void tick() {
        setX(getX() + (directionX * speed));
        setY(getY() + (directionY * speed));
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(this.getX() - this.getCamera().getX(), this.getY() - this.getCamera().getY(), this.getWidth(), this.getHeight());
    }

}
