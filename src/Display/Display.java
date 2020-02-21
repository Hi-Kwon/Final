package Display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display
	{
		private JFrame display;
		private Canvas canvas;
		
		private String title;
		private int width, height;
		
		public Display(String title, int width, int height)
		{
			this.title = title;
			this.width = width;
			this.height = height;
		}
		private void createDisplay()
		{
			display = new JFrame(title);
			display.setSize(width, height);
			display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//lets opaeration be closed with (X) icon
			display.setResizable(false);//Does not let change in size on screen
			display.setLocationRelativeTo(null);//window will appear in center of screen
			display.setVisible(true);//Jframe is visible
			
			
			canvas = new Canvas();
			canvas.setPreferredSize(new Dimension(width, height));
			canvas.setMaximumSize(new Dimension(width, height));
			canvas.setMinimumSize(new Dimension(width, height));
			
			display.add(canvas);
			display.pack();
		}
		public Canvas getCanvas()
		{
			return canvas;
		}
		
		
	}
