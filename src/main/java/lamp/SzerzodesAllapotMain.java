package lamp;

public class SzerzodesAllapotMain {

    public static void main(String[] args) {
        var allapot = SzerzodesAllapot.valueOf("JOVAHAGYOTT");

        System.out.println(allapot.uppercase());

        var ujAllapot = SzerzodesAllapot.of("j");
        System.out.println(ujAllapot);
        var command = ujAllapot.createCommand();

    }
}
