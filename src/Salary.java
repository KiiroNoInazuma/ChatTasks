public class Salary {
    public static void main(String[] args) {
        int age = 25;
        double salary = 80000;
        double interValue;

        interValue = age >= 23 ? salary * 3 : salary * 2;

        if (salary >= 50000 && salary < 80000) {
            interValue *= 1.2;
        } else if (salary >= 80000) {
            interValue *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + interValue + " рублей");
    }
}


