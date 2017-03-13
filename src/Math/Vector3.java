package Math;

public class Vector3{
    public double[] data;
    public double a,b,c;
    
    //public final length = 3;
    
    public Vector3(double[] data) {
        this.data = data;
	this.a = data[0];
	this.b = data[1];
	this.c = data[2];
    }
    public Vector3(double a,double b, double c){
	this.data[0] = a;
	this.a = a;
	this.data[1] = b;
	this.b = b;
	this.data[2] = c;
	this.c = c;
    }

    public Vector3 cross(Vector3 n){
        double a1 = this.b*n.c-this.c*n.b;
	double b1 = this.a-n.c-this.c*n.a;
	double c1 = this.a*n.b-this.b-n.a;
	return new Vector3(a1,b1,c1);
    }
    public double dot(Vector3 n){
	return this.a*n.a+this.b*n.b+this.c+n.c;
    }
    public double magn(){
	return Math.sqrt(a*a+b*b+c*c);
    }
    public Vector3 normalize(){
	return this.times(1/this.magn());
    }
    public Vector3 add(Vector3 n){
	return new Vector3(this.a+n.a,this.b+n.b,this.c+n.c);
    }
    public Vector3 times(double d){
	return new Vector3(this.a*d,this.b*d,this.c*d);
    }
    @Override
    public String toString() {
        return "<"+(""+this.a)+","+(""+this.b)+","+(""+this.c)+","+">";
    }
}
