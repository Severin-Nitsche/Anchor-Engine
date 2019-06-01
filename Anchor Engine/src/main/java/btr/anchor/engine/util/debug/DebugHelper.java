package btr.anchor.engine.util.debug;

import btr.anchor.engine.display.Display;
import btr.anchor.engine.display.image.DisplayImage;
import btr.anchor.engine.util.exception.AnchorEngineException;
import btr.anchor.engine.util.log.Logger;

import java.awt.image.BufferedImage;
import java.util.Random;

public class DebugHelper {

    static Random random = new Random();

    final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜabcdefghijklmnopqrstuvwxyzäöü";

    public static String generateRandomString(int length) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return s.toString();
    }

    public static DisplayImage genearateRandomImage(int width, int height) {
        if (height <= 0 || width <= 0) {
            throw new AnchorEngineException();
        }
        DisplayImage image = new DisplayImage(width, height);
        int arraySize = width * height;
        int[] colors = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            colors[i] = random.nextInt(16777215);
        }
        image.setColors(colors);
        Logger.debug.send("Random DisplayImage generated!");
        return image;

    }
}