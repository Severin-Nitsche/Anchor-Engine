package btr.anchor.engine.util.math.vector;

public class Vector2D implements IVector, Cloneable {

    public double x;
    public double y;

    public double[] dimension;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
        dimension = new double[2];
        dimension[0] = x;
        dimension[1] = y;
    }

    public double getX() {
        return dimension[0];
    }

    public double getY() {
        return dimension[1];
    }

    public static Vector2D zeroVector() {
        return new Vector2D(0, 0);
    }

    @Override
    public int[] getDimentions() {
        return new int[0];
    }
}
