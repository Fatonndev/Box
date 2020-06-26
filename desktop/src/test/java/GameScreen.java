import org.joml.Vector2f;
import org.lwjgl.opengl.GL20;
import ru.obvilion.box.Screen;
import ru.obvilion.box.graphics.components.Sprite;
import ru.obvilion.box.graphics.components.Spritesheet;
import ru.obvilion.box.graphics.components.Camera;
import ru.obvilion.box.util.AssetPool;

public class GameScreen implements Screen {

    private Spritesheet sprites;

    public Camera camera;
    public Sprite sprite;
    public Sprite sprite1;

    @Override
    public void show() {

    }

    @Override
    public void load() {
        loadResources();

        this.camera = new Camera(new Vector2f(-250, 0));

        sprites = AssetPool.getSpritesheet("assets/images/spritesheet.png");

        sprite = new Sprite(sprites.getSprite(1));
        sprite.setPoint1(-100,0);
        sprite.setPoint2(100,100);

        sprite1 = new Sprite(sprites.getSprite(3));
        sprite1.setPoint1(0,0);
        sprite1.setPoint2(200,200);

        Launcher.window.setIcon("assets/images/blendImage2.png", "assets/images/blendImage2.png");
    }

    private void loadResources() {
        AssetPool.addSpritesheet("assets/images/spritesheet.png",
                new Spritesheet(AssetPool.getTexture("assets/images/spritesheet.png"),
                        8, 8, 16, 0));
    }

    @Override
    public void draw(float deltaTime) {
        GL20.glClearColor(0, 0, 0, 0f);
        GL20.glClear(GL20.GL_COLOR_BUFFER_BIT);

        sprite.draw();
        sprite1.draw();
        camera.position.x -= 20f * deltaTime;
    }

    @Override
    public void update() {

    }

    @Override
    public void resize(int x, int y) {

    }

    @Override
    public void dispose() {

    }
}
