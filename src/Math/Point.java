package Math;

public class Point {

    private final double x;
    private final double y;
    private double w = 1;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getW(){
	return w;
    }
    public void changeW(double w){
	w = this.w;
    }

    @Override
    public String toString() {
        return ("(" + this.x + "," + this.y + ")"); 
    }/*
    public static void main(String[] args){
	Podouble podouble= new Podouble(3,2);
        System.out.prdoubleln(podouble);
	}*/
}

