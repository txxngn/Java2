package ArrayTest;

public class CitiesTemp {
    public static void main(String[] args) {
        /*WAP that records temperatures of 5 cities.
         * Record the city names in an array, the low temperatures in an array, and the high temp in an array.
         * After recording all data, display:
         * the average high,
         * the average low,
         * a list of cities with high temperatures above the average high,
         * a list of cities with low temp below the average low.
         * use a method calcAverage() to calculate and return the average of an array of doubles.*/

        String[] city = {"Toronto", "Cairo", "Baghdad", "Paris", "Rome"};
        double[] high_Temp = {30.5, 40.0, 48.0, 28.0, 25.0};
        double[] low_Temp = {-20, 0, 0, -2, -10.0};

        System.out.println("city \t\t high_Temp \t low_Temp");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < city.length; i++) {
            System.out.println(city[i] + "\t\t" + high_Temp[i] + "\t\t" + low_Temp[i]);
        }

        double average_high = calcAverage(high_Temp);
        double average_low = calcAverage(low_Temp);

        System.out.println("\n\naverage_high = " + average_high + " average_low = " + average_low + "\n");
        System.out.println("\nlist of cities with high temperatures above the average high\n");

        for (int i = 0; i < 5; i++) {
            if (high_Temp[i] > average_high) {
                System.out.println(city[i]);
            }
        }

        System.out.println("\n list of cities with low temperatures below the average low\n");

        for (int i = 0; i < 5; i++) {
            if (low_Temp[i] < average_low) {
                System.out.println(city[i]);
            }
        }
    }


    public static double calcAverage(double[] arr) {//has to be static because: Non-static method can not be referenced from a static method
        double temp = 0, avg;
        for (int i = 0; i < 5; i++) {
            temp = temp + arr[i];
        }
        avg = temp / arr.length;
        return avg;
    }

}

