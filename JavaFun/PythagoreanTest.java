public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean triangle = new Pythagorean();
        double hypotenuse = triangle.calculateHypotenuse(4, 2);
        System.out.println(hypotenuse);
    }
}