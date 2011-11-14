import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class SimpleWindow extends JFrame {
	public SimpleWindow() {
		super("Test window");
		this.setLayout(new FlowLayout());
		this.add(new JButton("test"));
		this.add(new JCheckBox("test"));
		this.add(new JRadioButton("test"));
		this.add(new JProgressBar(0, 100));

		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				SimpleWindow w = new SimpleWindow();
				w.setVisible(true);
			}
		});
	}

}
