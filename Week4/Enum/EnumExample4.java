package Enum;

public class EnumExample4 {

    enum Color {
        RED("This is the top color"),
        WHITE("This is the Middle  color"),
        GREEN("This is the bottom color");

        private String displayName;  //displayName is a built-in function (have purple color)

        public String getDisplayName() {
            return displayName;
        }

        private Color(String name) {
            displayName = name;
        }

    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        System.out.println(c1.ordinal());
        System.out.println(c1.name());
        System.out.println(c1.getDisplayName());   //-> "This is the top color"
        System.out.println(Color.valueOf("RED"));
        
    }
}

