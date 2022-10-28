public class Salary {
    public static void main(String[] args) {
        int age = 23;
        double salary = 40000;

        if (salary >= 50000 && salary < 80000) {
            salary *= 1.2;
        } else if (salary >= 80000) {
            salary *= 1.5;
        } else {
            salary = age >= 23 ? salary * 3 : salary * 2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " реблей");
    }
}


