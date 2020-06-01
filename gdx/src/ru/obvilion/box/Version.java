package ru.obvilion.box;

import ru.obvilion.box.utils.GdxRuntimeException;

public class Version {

	/** The current version of BoxLib **/
	public static final String VERSION = "1.9.11";

	/** The current major version of BoxLib **/
	public static final int MAJOR;

	/** The current minor version of BoxLib **/
	public static final int MINOR;

	/** The current revision version of BoxLib **/
	public static final int REVISION;

	static {
		try {
			String[] v = VERSION.split("\\.");
			MAJOR = v.length < 1 ? 0 : Integer.valueOf(v[0]);
			MINOR = v.length < 2 ? 0 : Integer.valueOf(v[1]);
			REVISION = v.length < 3 ? 0 : Integer.valueOf(v[2]);
		}
		catch (Throwable t) {
			// Should never happen
			throw new GdxRuntimeException("Invalid version "+VERSION, t);
		}
	}

	public static boolean isHigher (int major, int minor, int revision) {
		return isHigherEqual(major, minor, revision+1);
	}

	public static boolean isHigherEqual (int major, int minor, int revision) {
		if (MAJOR != major)
			return MAJOR > major;
		if (MINOR != minor)
			return MINOR > minor;
		return REVISION >= revision;
	}

	public static boolean isLower (int major, int minor, int revision) {
		return isLowerEqual(major, minor, revision-1);
	}

	public static boolean isLowerEqual (int major, int minor, int revision) {
		if (MAJOR != major)
			return MAJOR < major;
		if (MINOR != minor)
			return MINOR < minor;
		return REVISION <= revision;
	}

}
