package Systems;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Display.Display;

public class Game implements Runnable
	{
		private Display display;
		public int width, height;
		public String title;
		
		private Thread thread;//mimics the function of processing two things at once
		private boolean running = false;
		
		private BufferStrategy bs;
		private Graphics g;
		
		public Game(String title, int width, int height)
		{
			this.width = width;
			this.height = height;
			this.title = title;
		}
		private void init()
		{
			display = new Display(title, width, height);
			//graphics
		}
		private void tick()
		{
			
		}
		private void render()
		{
			bs = display.getCanvas().getBufferStrategy();//Buffer is like a hidden computer screen which ones the image drawn to the real scrren (prevent flickering)
		}
		public void run()
		{
			init();
			
			while(running)
				{
					tick();
					render();
				}
			stop();
		}
		public synchronized void start()
		{
			if(running)
				{
					return;
				}
			running = true;
			thread = new Thread(this);
			thread.start();
		}
		public synchronized void stop()
		{
			if (running)
				{
					return;
				}
			running = false;
			try
				{
					thread.join();
				} catch (InterruptedException e)//interupts the thread stopping the program
				{
					e.printStackTrace();
				}
		}
	}
