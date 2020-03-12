package objectOriented;

public class RectangleTwo {
    private double witdh;
    private double height;

    public RectangleTwo(double witdh,double height){
        this.witdh = witdh;
        this.height = height;
    }

    public double calRec(){
        return witdh*height;
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
