public class Main {

/*    private static int milesPerGallon = 20;
    private static double gallonOfGas = 10;
    private static int odometer = 0;*/

    private static int[] milesPerGallon = {20, 25, 15};
    private static double[] gallonOfGas = {10, 8, 12};
    private static int[] odometer = {0, 10000, 20000};

    public static void main(String[] args) {
        System.out.println("In vehicles Main.");
        System.out.println("Second Line");


        drive(100);


        drive(60);

    }

    private static void drive(int milesDriven) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Odometer " + odometer[i] + " Gallons of Gas " + gallonOfGas[i]);
            gallonOfGas[i] = gallonOfGas[i] - (milesDriven / milesPerGallon[0]);
            odometer[i] += milesDriven;
            System.out.println("Odometer " + odometer[i] + " Gallons of Gas " + gallonOfGas[i]);

        }
    }
}
