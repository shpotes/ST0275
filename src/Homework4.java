import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Math.Point;

public class Homework4 extends JPanel implements KeyListener {
	boolean[][] edge;
    Point[] vertexArray;
    int numVertices;
    int numEdges;
    
    public Homework4(Homework3 House) {
    	this.edge = House.edge;
    	this.vertexArray = House.vertexArray;
    	this.numEdges = House.numEdges;
    	this.numVertices = House.numVertices;
        addKeyListener(this);
    }
    
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
    
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    @Override
    public void keyTyped(KeyEvent e) {
    	char key = e.getKeyChar();
        System.out.println(key);
        if(key == 'a'){
        	for(int i=0 ; i < numVertices; ++i)
        		vertexArray[i] = LinearTransformations.Trans(vertexArray[i],10,0);
        }
        repaint();
    }
}
