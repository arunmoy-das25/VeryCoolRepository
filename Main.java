public class Main {
    public static void main(String[] args) {
        Gauss gausser = (int s, int e) -> ((e*e+e)/2-(s*s-s)/2);
        System.out.println(gausser.gauss(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}