package ru.obvilion.box.graphics.components;

import org.joml.Vector2f;
import ru.obvilion.box.io.Object;
import ru.obvilion.box.io.Transform;
import ru.obvilion.box.graphics.renderer.RenderBatch;
import ru.obvilion.box.graphics.renderer.SpriteRenderer;

public class Sprite {
    private final int MAX_BATCH_SIZE = 1000;
    private RenderBatch renderBatch;
    public Object object;

    public Sprite(Image image) {
        object = new Object("obj", new Transform(new Vector2f(400, 100), new Vector2f(256, 256)), 3);
        object.addComponent(new SpriteRenderer(image));
        object.start();
        setBath(object);
    }

    public void setBath(Object go) {
        SpriteRenderer spr = go.getComponent(SpriteRenderer.class);
        if (spr != null) {
            setBath(spr);
        }
    }

    private void setBath(SpriteRenderer sprite) {
        renderBatch = new RenderBatch(MAX_BATCH_SIZE, sprite.gameObject.zIndex());
        renderBatch.start();
        renderBatch.addSprite(sprite);
    }

    public void draw() {
        renderBatch.render();
    }

    public void setPoint1(int x, int y) {
        object.transform.position = new Vector2f(x, y);
    }

    public void setPoint2(int x, int y) {
        object.transform.scale = new Vector2f(x, y);
    }

    public void setZIndex(int z) {
        object.zIndex = z;
    }

    public void setImage(Image image) {
        object.addComponent(new SpriteRenderer(image));
    }
}
