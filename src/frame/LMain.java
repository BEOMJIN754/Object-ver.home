package frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import frame.LLoginDialog;
import valueObject.VUser;

public class LMain {
	
	private LLoginDialog lLoginDialog;
	private LMainFrame lMainFrame;
	
	private void initialize() {
	
	}
	

	// LoginDialog "OK" and "Cancel" Button Event Handler
		public class ActionHandler implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				validateUser(event.getSource());
			}
		}
	
	public LMain() {
		this.lLoginDialog = new LLoginDialog(new ActionHandler());
		lLoginDialog.initialize();
	}
	
	private void validateUser(Object source) {
		VUser vUser = this.lLoginDialog.validateUser(source);
		if (vUser != null) {				
			this.lMainFrame = new LMainFrame();
			this.lMainFrame.initialize(vUser);
		}
		this.lLoginDialog.dispose();
	}
	

	public static void main(String[] args) {
		LMain main = new LMain();
		//프로그램이 시작되는 위치
		//main.initialize();
		
	}

	

}