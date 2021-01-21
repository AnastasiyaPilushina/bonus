public class Main {
    public static void main(String[] args) {
        boolean introduced = true;
        int bonus;
        if (introduced) {
            bonus = 100;
        } else {
            bonus = 0;
        }
        int balance = 500;
        int refill = 2000;
        int total =( balance + refill) / bonus;
        int limit = 1000;
        if (refill > limit) {
            refill = limit;
        }

        System.out.println(total);
    }


}
