import javax.swing.JFrame;

public class ST0275 {
	public static void main(String[] arg){
    	JFrame frame = new JFrame("Santiago");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Homework3 House = new Homework3("res/house.dat");
    	frame.add(House);
    	frame.setSize(1000, 1000);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
            
    }
}
