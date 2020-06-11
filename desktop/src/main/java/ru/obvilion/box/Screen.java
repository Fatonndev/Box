package ru.obvilion.box;

public interface Screen {

    public void show();

    public void load();

    public void draw(float deltaTime);

    public void update();

    public void resize(int x, int y);

    public void dispose();
}
