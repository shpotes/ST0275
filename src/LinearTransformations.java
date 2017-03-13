import Math.*;

public class LinearTransformations {
    public static Point Trans(Point p,double dx,double dy){
    	double[][] foo = {{1,0,dx},{0,1,dy},{0,0,1}};
    	Matrix m = new Matrix(foo);
    	Vector3 v = new Vector3(p.getX(),p.getY(),1);
    	Vector3 tmp = m.times(v);
    	return (new Point(tmp.a,tmp.b));	
    }
    public static Point Rot(Point p,double theta){
    	double[][] foo = {{Math.cos(theta),Math.sin(theta),0},{Math.sin(theta),Math.cos(theta),0},{0,0,0}};
    	Matrix m = new Matrix(foo);
    	Vector3 v = new Vector3(p.getX(),p.getY(),1);
    	Vector3 tmp = m.times(v);
    	return (new Point(tmp.a,tmp.b));
    }
    
    public static Point Esc(Point p,double sx, double sy){
    	double[][] foo = {{sx,0,0},{0,sy,0},{0,0,1}};
    	Matrix m = new Matrix(foo);
    	Vector3 v = new Vector3(p.getX(),p.getY(),1);
    	Vector3 tmp = m.times(v);
    	return (new Point(tmp.a,tmp.b));
	}
}
