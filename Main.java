public class Main {
    public static void main(String[] args) {
        Gauss gausser = (int s, int e) -> ((e*e+e)-(s*s-s))/2;

        /*

        0
        00
        000
        0000
        11111   start
        111111
        1111111
        11111111
        111111111   end

         */

        System.out.println(gausser.gauss(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}