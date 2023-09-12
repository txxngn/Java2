package ArrayTest;

public class ParallelArray {
    public static void main (String [] args){
        double[] price = new double[5];
        double[] quantity = new double[5];
        for (int i = 0; i < 5; i++) {// initializing the arrays with dummy data
            price[i] = i + 0.5;
            quantity[i] = i + 10.5;
        }
        System.out.println("Price[]\n");
        for (double j : price) {
            System.out.println(j);
        }
        System.out.println("quantity[]\n");
        for (double k : quantity) {
            System.out.println(k);
        }


        double[] temp = calcRevenue(price, quantity);//Invoking the method
        System.out.println("revenue[]\n");
        for (double L : temp) {
            System.out.println(L);
        }
    }

    public static double[] calcRevenue(double[] P, double[] Q) {//has to be static because: Non-static method can not be referenced from a static method
        double[] Rev = new double[5];
        for (int i = 0; i < 5; i++) {
            Rev[i] = P[i] * Q[i];
        }
        return Rev;




    }


}


