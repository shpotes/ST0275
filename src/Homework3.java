import Math.Point;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Homework3 extends JPanel{
	boolean[][] edge;
    Point[] vertexArray;
    int numVertices;
    int numEdges;
    
    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g;
	for(int i = 0; i<numVertices;++i)
	    for(int j = 0; j<numVertices;++j)
	    	if(edge[i][j])
	    		g2d.drawLine((int) vertexArray[i].getX(),
	    					 (int) vertexArray[i].getY(),
	    					 (int) vertexArray[j].getX(),
	    					 (int) vertexArray[j].getY());
    }
    
    public Homework3(String fileName) {
        Scanner in; 
    	try {
    	    in = new Scanner(new File(fileName));
    	    numVertices = in.nextInt();
            vertexArray = new Point[numVertices];
            // Read the vertices
            for (int i = 0; i < numVertices; i++) {
                // Read a vertex
                int x = in.nextInt();
                int y = in.nextInt();
                vertexArray[i] = new Point(x, y);
            }
            // Read the number of edges
            numEdges = in.nextInt();
            edge = new boolean[numVertices][numVertices];
            for(int i = 0; i<numVertices;++i)
            	for(int j= 0; j<numVertices;++j)
            		edge[i][j] = false;
            for (int i = 0; i < numEdges; i++) {
                int start = in.nextInt();
                int end = in.nextInt();
                edge[start][end] = true;
            }
        }catch (FileNotFoundException e) {
        	System.out.println("fuuuuu");
        	System.exit(1);
        }
    }
}
