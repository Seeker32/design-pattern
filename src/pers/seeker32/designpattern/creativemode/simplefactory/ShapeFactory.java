package pers.seeker32.designpattern.creativemode.simplefactory;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if (shapeType == null) return null;
        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }

}
