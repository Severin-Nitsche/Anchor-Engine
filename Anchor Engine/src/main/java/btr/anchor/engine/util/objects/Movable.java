package btr.anchor.engine.util.objects;

import btr.anchor.engine.util.math.vector.IVector;

public interface Movable {

    void move(IVector position);

    void moveUp(int amount);

    void moveDown(int amount);

    void moveLeft(int amount);

    void moveRight(int amount);

}