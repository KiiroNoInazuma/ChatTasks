public class Credit {
    int age;
    double salary;
    double wantedSum;

    void credit(int age, double salary, double wantedSum) {
        this.age = age;
        int creditTerm = 12;
        double baseRate = 10;
        this.salary = salary;
        this.wantedSum = wantedSum;
        double rateSum;
        double creditPayment;
        String result;


        if (salary >= 80000) {
            baseRate -= 0.7;
        } else {
            if (age < 23) {
                baseRate += 1;
            } else if (age < 30) {
                baseRate += 0.5;
            }
        }
        rateSum = wantedSum * baseRate / 100 + wantedSum;
        creditPayment = rateSum / creditTerm;
        result = (creditPayment <= salary / 2) ? "Одобрено" : "Отказано";
        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary / 2 + " рублей. Платеж по кредиту " + creditPayment + " рублей.");
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Credit().credit(25, 60000, 330000);
    }
}


