import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author US
 *
 */
public class GuiDemo extends JFrame {
	JButton bntnhap = new JButton("Nhap");
	/**
	 * @param args
	 */
	public GuiDemo(){
		setTitle("Demo");
		setSize(500, 500);
		setLocationRelativeTo(null);
		//setLayout(null);
		add(bntnhap);
		bntnhap.setBounds(50,50, 100, 30);
		setLayout( new FlowLayout());
		for(int i=1;i<=20;i++){
			add(new JButton(String.valueOf(i)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiDemo wMain = new GuiDemo();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

}
