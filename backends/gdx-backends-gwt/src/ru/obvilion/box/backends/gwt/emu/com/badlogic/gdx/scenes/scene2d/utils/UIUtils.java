
package ru.obvilion.box.scene2d.utils;

import ru.obvilion.box.Box;
import ru.obvilion.box.constructors.Input.Buttons;
import ru.obvilion.box.constructors.Input.Keys;
import com.google.gwt.user.client.Window.Navigator;

public class UIUtils {
	static public boolean isAndroid = Navigator.getPlatform().contains("Android");
	static public boolean isMac = Navigator.getPlatform().contains("Mac");
	static public boolean isWindows = Navigator.getPlatform().contains("Win");
	static public boolean isLinux = Navigator.getPlatform().contains("Linux");
	static public boolean isIos = Navigator.getPlatform().contains("iPhone")
			|| Navigator.getPlatform().contains("iPod")
			|| Navigator.getPlatform().contains("iPad");

	static public boolean left () {
		return Box.input.isButtonPressed(Buttons.LEFT);
	}

	static public boolean left (int button) {
		return button == Buttons.LEFT;
	}

	static public boolean right () {
		return Box.input.isButtonPressed(Buttons.RIGHT);
	}

	static public boolean right (int button) {
		return button == Buttons.RIGHT;
	}

	static public boolean middle () {
		return Box.input.isButtonPressed(Buttons.MIDDLE);
	}

	static public boolean middle (int button) {
		return button == Buttons.MIDDLE;
	}

	static public boolean shift () {
		return Box.input.isKeyPressed(Keys.SHIFT_LEFT) || Box.input.isKeyPressed(Keys.SHIFT_RIGHT);
	}

	static public boolean shift (int keycode) {
		return keycode == Keys.SHIFT_LEFT || keycode == Keys.SHIFT_RIGHT;
	}

	static public boolean ctrl () {
		if (isMac)
			return Box.input.isKeyPressed(Keys.SYM);
		else
			return Box.input.isKeyPressed(Keys.CONTROL_LEFT) || Box.input.isKeyPressed(Keys.CONTROL_RIGHT);
	}

	static public boolean ctrl (int keycode) {
		if (isMac)
			return keycode == Keys.SYM;
		else
			return keycode == Keys.CONTROL_LEFT || keycode == Keys.CONTROL_RIGHT;
	}

	static public boolean alt () {
		return Box.input.isKeyPressed(Keys.ALT_LEFT) || Box.input.isKeyPressed(Keys.ALT_RIGHT);
	}

	static public boolean alt (int keycode) {
		return keycode == Keys.ALT_LEFT || keycode == Keys.ALT_RIGHT;
	}
}
