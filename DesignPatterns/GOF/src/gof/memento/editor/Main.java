package gof.memento.editor;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(15, 15, 15, Color.BLUE),

                new CompoundShape(
                        new Circle(120, 120, 60, Color.RED),
                        new Dot(170, 170, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(260, 260, 120, 120, Color.GREEN),
                        new Dot(250, 250, Color.GREEN),
                        new Dot(250, 380, Color.GREEN),
                        new Dot(380, 380, Color.GREEN),
                        new Dot(380, 250, Color.GREEN)
                ),
                new CompoundShape(
                        new Oval(480, 480, 100, 60, Color.ORANGE),
                        new Dot(520, 505, Color.ORANGE)
                )
        );
    }
}
