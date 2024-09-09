import javax.swing.JFrame;
import javax.swing.JPanel;

public class LMain {
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	
	private void initialize() {
		this.mainFrame = new JFrame();
		this.mainPanel = new JPanel();
		
		this.mainFrame.add(mainPanel);
		this.mainFrame.setSize(800,800);
		
		this.mainFrame.setVisible(true);
		
		this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public LMain() {
		
	}

	public static void main(String[] args) {
		LMain main = new LMain();
		//프로그램이 시작되는 위치
		main.initialize();
		
	}

	

}