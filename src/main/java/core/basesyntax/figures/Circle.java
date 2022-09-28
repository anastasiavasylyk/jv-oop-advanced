package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Drawing;

public class Circle extends Figure implements Area, Drawing {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units,"
                + " radius: " + this.radius + " units, color: " + getColor());
    }
}