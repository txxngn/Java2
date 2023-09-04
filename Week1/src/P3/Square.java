package P3;



public class Square {

    private double side;

    /**
     *
     * @return
     */
    public double calcArea(){
        double area = side * side;
        return area;
    }

    /**
     *
     * @return
     */
    public double calcPer(){
        double per = side*4;
        return per;
    }

    /**
     * @param Newside
     */
    public void setSide(double Newside){
        this.side = Newside;
    }

    /**
     * @return
     */
    public double getSide(){
        return this.side;
    }

    /**
     * @return
     */
    public String toString(){
        return ("This is a size of " + side + " X square");
    }


}
