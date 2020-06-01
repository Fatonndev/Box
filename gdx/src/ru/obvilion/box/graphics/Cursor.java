
package ru.obvilion.box.graphics;

import ru.obvilion.box.Graphics;
import ru.obvilion.box.utils.Disposable;

/** <p>
 * Represents a mouse cursor. Create a cursor via
 * {@link Graphics#newCursor(Pixmap, int, int)}. To
 * set the cursor use {@link Graphics#setCursor(Cursor)}.
 * To use one of the system cursors, call Graphics#setSystemCursor
 * </p> **/
public interface Cursor extends Disposable {
	
	public static enum SystemCursor {
		Arrow,
		Ibeam,
		Crosshair,
		Hand,
		HorizontalResize,
		VerticalResize
	}
}
