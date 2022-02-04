public class ColorableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square1 = new Square();
        Square square2 = new ColorableSquare();

        Shape[] shapes = new Shape[] {circle, rectangle, square1, square2};

        for (Shape shape : shapes) {
            System.out.println(shape);
//            if (shape instanceof Colorable) {
//                ((Colorable) shape).howToColor();

//           dùng instaneof để tránh trường hợp lỗi

            if (shape instanceof ColorableSquare) {
                ((ColorableSquare) shape).howToColor();
            }
        }
    }
}
