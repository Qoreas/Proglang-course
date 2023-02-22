package L1_10.L7.Operators;

public class Ternary_operator {
    public static void main(String[] args) {
        int a, b;
        a = 20;
        //          true : false
        b = (a < 30) ? 5 : 10;
        System.out.println(b);

        b = (a == 20) ? 14 : 1;
        System.out.println(b);
    }
}
