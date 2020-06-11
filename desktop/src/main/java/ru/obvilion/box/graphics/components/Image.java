package ru.obvilion.box.graphics.components;

import org.joml.Vector2f;

public class Image {

    private Texture texture;
    private Vector2f[] texCoords;

    public Image(Texture texture) {
        this.texture = texture;
        Vector2f[] texCoords = {
                new Vector2f(1, 1),
                new Vector2f(1, 0),
                new Vector2f(0, 0),
                new Vector2f(0, 1)
        };
        this.texCoords = texCoords;
    }

    public Image(Texture texture, Vector2f[] texCoords) {
        this.texture = texture;
        this.texCoords = texCoords;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public Vector2f[] getTexCoords() {
        return this.texCoords;
    }
}
