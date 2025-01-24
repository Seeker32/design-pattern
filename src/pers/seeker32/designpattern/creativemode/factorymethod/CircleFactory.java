package pers.seeker32.designpattern.creativemode.factorymethod;

public class CircleFactory implements ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }

}
