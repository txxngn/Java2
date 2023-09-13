package Enum;

public class EnumExample5 {

    enum Color {
        RED(100, "This is the top color"),
        WHITE(200, "This is the Middle  color"),
        GREEN(300, "Thi is the bottom color");
        private double value;
        private String displayName;

        public double getValue() {
            return value;
        }

        public String getDisplayName() {
            return displayName;

        }

        private Color(double value, String name) {
            this.value = value;
            displayName = name;
        }

    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        System.out.println(c1.ordinal());
        System.out.println(c1.name());
        System.out.println(c1.getDisplayName());
        System.out.println(c1.getValue());
        System.out.println(Color.valueOf("WHITE"));
    }
}


