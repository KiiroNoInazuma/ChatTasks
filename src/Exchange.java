public class Exchange {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a * b / a;
        b = a / b - b + a / b;
        b = (b < 0 ? -b : b);  //Можно использовать метод Math.abs(b), вместо логического оператора "?"
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
