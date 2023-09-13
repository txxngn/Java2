package Enum;
public class EnumExample1_v2 {
       enum e {// based on this defination we can not access it outside this class with public or without public
        SMALL,
        LARGE,
        MEDIUM
    }

    public static void main(String[] args) {
        e s1 = e.SMALL;
        System.out.println(s1);
    }
}


