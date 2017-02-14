import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Tetris extends JFrame{
	public static void main(String[] args) throws IOException {
		new Tetris();
	}
	
	Tetris() throws IOException{ 
		super("Tetris");
		setIgnoreRepaint(true);
		addWindowListener(new WindowAdapter()
		{public void windowClosing(WindowEvent e){System.exit(0);}});
		setSize (600, 600);
		myPanel pan= new myPanel();
		add(pan);
		show();	
	}
}
