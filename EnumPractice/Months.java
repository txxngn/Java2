package EnumPractice;

 enum Months {
     JAN(2),
     FEB(5),
     MAR(15),
     APR(77),
     MAY(20),
     JUN(76),
     JUL(88),
     AUG(68),
     SEP(86),
     OCT(10),
     NOV(11),
     DEC(12);

     private int value;
     public int getValue(){
         return value;
     }
     private Months(int number){
         value = number;
     }
}
