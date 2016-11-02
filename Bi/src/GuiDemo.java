import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author US
 *
 */
public class GuiDemo extends JFrame {

	/**
	 * @param args
	 */
	public GuiDemo(){
		setTitle("Demo");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setLayout(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiDemo wMain = new GuiDemo();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

}
