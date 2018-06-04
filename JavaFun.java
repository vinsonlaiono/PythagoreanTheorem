public class JavaFun {
    public static void main (String[] args) {
        Pythagorean pythagorean = new Pythagorean();
        double answer = pythagorean.calculateHypotenuse(10, 10);
        System.out.println(answer);
    }
}