public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();

        System.out.println("Результат вычисления суммы: " + intsCalc.sum(2, 5));
        System.out.println("Результат вычисления произведения: " + intsCalc.mult(2, 5));
        System.out.println("Результат вычисления возведения в степень: " + intsCalc.pow(2, 5));
    }
}
