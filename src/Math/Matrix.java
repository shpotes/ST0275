package Math;

public class Matrix {
    public double[][] data;
    //public final length = 3;
    
    public Matrix(double[][] data) {
        this.data = data;
    }

    public Matrix times(Matrix n){
        double[][] b = n.data;
        double[][] a = this.data;
        double[][] mult = new double[3][3];
        for(int i = 0; i < 3; ++i)
        for(int j = 0; j < 3; ++j)
            for(int k = 0; k < 3; ++k){
                mult[i][j] += a[i][k] * b[k][j];
            }
	return new Matrix(mult);
    }
    public Vector3 times(Vector3 n){
        return new Vector3(this.data[0][0]*n.a+this.data[0][1]*n.b+this.data[0][2]*n.b,
			   this.data[1][0]*n.a+this.data[1][1]*n.b+this.data[1][2]*n.b,
			   this.data[2][0]*n.a+this.data[2][1]*n.b+this.data[2][2]*n.b);
    }
    
    
    @Override
    public String toString() {
        String s = "";
	for(int i = 0; i< 3; ++i){
	    	for(int j = 0; i< 3; ++i){
		    s+=(this.data[i][j]+"");
		    s+=" ";
		}
		s+="\n";
	}
	return s;
    }/*
    Public static void main(String[] args){
	int[][] p = new int[3][3];
	Matrix r = new Matrix(p);
	r.change(0,0,2);
	System.out.print(r.get(0,0));
    }*/
}
