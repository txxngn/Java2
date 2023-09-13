package Enum;

public class EnumExample2 {

    public static void main(String[] args) {
        Size s = Size.MEDIUM;

        switch (s) {
            case LARGE:
                System.out.println("Large Size");
                break;
            case MEDIUM:
                System.out.println("Medium Size");
                break;
            case SMALL:
                System.out.println("Small Size");
                break;
            default:
                System.out.println("Not accepted Size");
        }
    }
}
