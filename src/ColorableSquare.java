public class ColorableSquare extends Square implements Colorable{
    public ColorableSquare() {
    }

    public ColorableSquare(double side) {
        super(side);
    }

    public ColorableSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
