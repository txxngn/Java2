package EnumPractice;

public class Main {
    public static void main (String [] args){
        //Create an enum called Months that contains constants for the
        //12 months of the year.
        //- Create a new main class where you use: ordinal(), name(),
        //valueOf() and values() methods to print the corresponding
        //constants information of the defined enum.
        Months j = Months.JAN;
        Months f = Months.FEB;
        Months o = Months.OCT;
        Months a = Months.APR;
        Months m = Months.MAY;
        System.out.println(j);
        System.out.println(a.ordinal());
        System.out.println(f.name());
        System.out.println(Months.valueOf("SEP"));
        System.out.println(m.getValue());


    }
}
