public class ColorableTest {
    public static void main(String[] args) {

        Square square = new Square("black", true, 5.8);
        System.out.println(square.getArea());
        square.howToColor();

    }
}
