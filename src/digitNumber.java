public class digitNumber {
    public static void main(String[] args) {
        double a = 100+(Math.random()*900);
        int b = (int)a%100/10;
        System.out.println((int)a); //Для проверки значения
        System.out.println(b);
    }
}
