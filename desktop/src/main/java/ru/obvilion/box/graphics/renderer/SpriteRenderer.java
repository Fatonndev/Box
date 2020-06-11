package ru.obvilion.box.graphics.renderer;

import ru.obvilion.box.graphics.components.Image;
import ru.obvilion.box.io.Component;
import ru.obvilion.box.io.Transform;
import org.joml.Vector2f;
import org.joml.Vector4f;
import ru.obvilion.box.graphics.components.Texture;

public class SpriteRenderer extends Component {

    private Vector4f color;
    private Image sprite;

    private Transform lastTransform;
    private boolean isDirty = false;

    public SpriteRenderer(Vector4f color) {
        this.color = color;
        this.sprite = new Image(null);
        this.isDirty = true;
    }

    public SpriteRenderer(Image sprite) {
        this.sprite = sprite;
        this.color = new Vector4f(1, 1, 1, 1);
        this.isDirty = true;
    }

    @Override
    public void start() {
        this.lastTransform = gameObject.transform.copy();
    }

    @Override
    public void update() {
        this.gameObject.transform.copy(this.lastTransform);
        isDirty = true;
    }

    public Vector4f getColor() {
        return this.color;
    }

    public Texture getTexture() {
        return sprite.getTexture();
    }

    public Vector2f[] getTexCoords() {
        return sprite.getTexCoords();
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
        this.isDirty = true;
    }

    public void setColor(Vector4f color) {
        if (!this.color.equals(color)) {
            this.isDirty = true;
            this.color.set(color);
        }
    }

    public boolean isDirty() {
        return this.isDirty;
    }

    public void setClean() {
        this.isDirty = false;
    }
}
