package lesson3.noa.sharabi;

import java.util.Objects;

public class Square extends Shape{
    private float side;

    public Square(float side){
        this.side=side;
    }

    public Square(){

    }
    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float calcPerimeter() {
        return this.side*4;
    }

    @Override
    public float calcArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Side: "+side+" hekef: "+calcPerimeter()+" area: "+calcArea();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass() || side != ((Square) obj).side)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
