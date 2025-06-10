public class App {
    public static void main(String[] args) {
        
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        System.out.println(first);
        System.out.println(second);

        int result = Calculator.add(first, second);
        System.out.println((result));
    }
}
