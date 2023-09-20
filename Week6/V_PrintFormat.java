public class V_PrintFormat {
    public static void main(String[] args)  {

        int m1=90;
        int m2=80;

        String s1="Alex";
        String s2="Mark";

        double avg1=(m1+m2)/2;
        double avg2=(m1+m2)/2;
        Boolean intr1=true;
        Boolean intr2=false;

        System.out.printf("The first  student is %s and his mark is %d the average is %f %n",s1,m1,avg1);
        System.out.printf("The second student is %s and his mark is %d the average is %f %n",s2,m2,avg2);
        System.out.println();
        System.out.printf("The first  student is %10s and his mark is %5d the average is %3.2f %n",s1,m1,avg1);
        System.out.printf("The second student is %-10s and his mark is %05d the average is %06.1f %n",s2,m2,avg2);
        System.out.printf("The first  student  is  International student (%b) %n",intr1);
        System.out.printf("The second student  is  International student (%b)",intr2);

    }
}
