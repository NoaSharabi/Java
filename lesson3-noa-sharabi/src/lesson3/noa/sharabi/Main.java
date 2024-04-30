package lesson3.noa.sharabi;

public class Main {
    static Shape[] shapes;
    static void initShapes(){
        shapes=new Shape[]{new Circle(9.7f), new Square(5.2f),new Square(7.9f),new Circle(8.5f)};
    }
    static void printShapesDetails()
    {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
    static boolean isShapeExist(Shape shape)
    {
        for (int i = 0; i < shapes.length; i++) {
            if(shape.equals(shapes[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Shape s=new Circle(3.45f);
        initShapes();
        printShapesDetails();
        System.out.println(isShapeExist(s));

    }
}
