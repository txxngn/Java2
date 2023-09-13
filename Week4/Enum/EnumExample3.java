package Enum;

public class EnumExample3 {

      enum Size {
        SMALL,
        LARGE,
        MEDIUM
    }

    public static void main(String[] args) {
        Size s1 = Size.SMALL;
        System.out.println(s1);
        System.out.println(s1.ordinal());// starts with 0
        System.out.println(s1.name());
        System.out.println(s1.toString());
        System.out.println(Size.valueOf("SMALL"));
    }
}
