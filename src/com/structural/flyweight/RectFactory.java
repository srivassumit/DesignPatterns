package com.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sumit
 *
 */
public class RectFactory {

	private static final Map<Color, MyRect> rectsByColor = new HashMap<Color, MyRect>();

	public static MyRect getRect(Color color) {
		MyRect rect = rectsByColor.get(color);
		if (null == rect) {
			rect = new MyRect(color);
			rectsByColor.put(color, rect);
		}
		return rect;
	}
}
