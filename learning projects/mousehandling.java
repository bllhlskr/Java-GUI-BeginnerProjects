package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class mousehandling extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public mousehandling () {
	super("my title");
	
	
	mousepanel = new JPanel();
	mousepanel.setBackground(Color.WHITE);
	add(mousepanel, BorderLayout.CENTER);
	
	statusbar = new JLabel("default");
	add(statusbar,BorderLayout.SOUTH);
	
	Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
		
		
	}
	private class Handlerclass implements MouseListener,MouseMotionListener{

		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d,%d",event.getX(),event.getY()));
			
		}public void mousePressed(MouseEvent event) {
			statusbar.setText("you pressed down the mouse");
			
			
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("you released down the button");
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("you entered the area");
			mousepanel.setBackground(Color.RED);
			
		}public void mouseExited(MouseEvent event) {
			statusbar.setText("the mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("you are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("you move the mouse");
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mousehandling window = new mousehandling();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(300,300);
window.setVisible(true);
	}
	

}
