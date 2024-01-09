package ct4;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Sphere(5);
        shapeArray[1] = new Cylinder(5, 5);
        shapeArray[2] = new Cone(5, 5);

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println();
        }
    }
}
