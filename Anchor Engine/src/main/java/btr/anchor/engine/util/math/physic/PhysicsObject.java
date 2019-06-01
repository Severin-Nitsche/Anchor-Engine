package btr.anchor.engine.util.math.physic;

import btr.anchor.engine.util.math.vector.Vector;

public interface PhysicsObject {

    public Vector mass = new Vector(1);
    public Vector acceleration = new Vector(0, 0);
    public Vector velocity = new Vector(0, 0);
    public Vector position = new Vector(0, 0);
    public boolean isStatic = false;
    public Shape shape = new Square();


}