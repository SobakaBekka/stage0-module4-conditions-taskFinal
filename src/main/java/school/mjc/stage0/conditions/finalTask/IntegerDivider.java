package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        double dividend_1 = (double)dividend;
        double divider_1 = (double)divider;
        double result = dividend_1 / divider_1;
        if(divider == 0) {
            System.out.println("division by zero");
        }else
            if (result * divider_1 == dividend_1) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }



    }
}
