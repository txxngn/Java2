package ArrayTest;

public class ArrayPractice {
    public static void main (String [] args){
/*WAP that records temperatures of 5 cities.
* Record the city names in an array, the low temperatures in an array, and the high temp in an array.
* After recording all data, display:
* the average high,
* the average low,
* a list of cities with high temperatures above the average high,
* a list of cities with low temp below the average low.
* use a method calcAverage() to calculate and return the average of an array of doubles.*/
        String cities [] = {"HCM","NY","BD"};
        double hightemp[] = {50.4,45.7,55.9};
        double lowtemp[] = {1.4,1.8,1.9};
        double sumHigh=0 , sumLow = 0;

        for (int i = 0; i<hightemp.length; i++){
            sumHigh += hightemp[i];
        }
        double avrHigh = sumHigh/hightemp.length;
        for (int i = 0; i<lowtemp.length; i++){
            sumLow += hightemp[i];
        }
        double avrLow = sumHigh/hightemp.length;



        double [] array = calcAverage(hightemp, lowtemp);

        for (int i = 0; i<array.length; i++){
            if (array[i] >= avrHigh){
                
            } else if (array[i] <= avrLow) {
                
            }
        }

    }
    public static double [] calcAverage(double temp1[],double temp2[]){
        double [] avr = new double[temp1.length];
        for (int i = 0; i < temp1.length; i++){
            avr[i] = (temp1[i] + temp2[i])/2;
        }
        return avr;
    }
}
