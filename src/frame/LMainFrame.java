package frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import valueObject.VUser;

public class LMainFrame {

	private JFrame mainFrame;
	private JPanel mainPanel;
	public LMainFrame() {
		
		
	}

	public void initialize(VUser vUser) {

		this.mainFrame = new JFrame();
		this.mainPanel = new JPanel();
		
		this.mainFrame.add(mainPanel);
		this.mainFrame.setSize(800,800);
		
		this.mainFrame.setVisible(true);
		
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
