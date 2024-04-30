package lesson3.noa.sharabi;

import java.util.Objects;

public class Circle extends Shape{
    private float radius;

    public Circle(float radius){
        this.radius=radius;
    }

    public Circle(){

    }
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float calcPerimeter() {
        return (float) (radius*2*Math.PI);
    }

    @Override
    public float calcArea() {
        return (float) (radius*radius*Math.PI);
    }

    @Override
    public String toString() {
        return "Radius: "+radius+" hekef: "+calcPerimeter()+" area: "+calcArea();
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (obj==null||obj.getClass()!=this.getClass()||radius!=((Circle) obj).radius)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
