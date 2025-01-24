package pers.seeker32.designpattern.creativemode.factorymethod;

public class RectangleFactory implements ShapeFactory{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }

}
