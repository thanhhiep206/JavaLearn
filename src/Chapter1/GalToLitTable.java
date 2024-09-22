package Chapter1;

public class GalToLitTable {
    public static void main(String [] args) {
        double gallons = 0;
        double liters;
        int count = 0;
        for(int i= 1; i <= 100; i++) {
            gallons ++;
            if(count % 10 == 0) System.out.println();
            count ++;

            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
        }

    }
}
