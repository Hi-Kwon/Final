package GameEngine;

import javax.swing.JFrame;

public class Main
	{
		private final JFrame window = new JFrame();
		
		public Main (int windowX, int windowY, String title)
		{
			window.setSize(windowX, windowY);
			window.setResizable(false);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setFocusable(true);
			window.setLocationRelativeTo(null);
			window.setTitle(title);
			window.setVisible(true);
		}
		public JFrame getWindow()
		{
			return window;
		}
	}
