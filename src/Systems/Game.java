package Systems;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import Display.gfx.ImageLoader;

public class Game implements Runnable
	{
		private Display display;
		public int width, height;
		public String title;
		
		private Thread thread;//mimics the function of processing two things at once
		private boolean running = false;
		
		private BufferStrategy bs;
		private Graphics g;
		
		private BufferedImage townImage;
		
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
			townImage = ImageLoader.loadImage("/Textures/download.jpg");
		}
		private void tick()
		{
			
		}
		private void render()
		{
			bs = display.getCanvas().getBufferStrategy();//Buffer is like a hidden computer screen which ones the image drawn to the real screen (prevent flickering)
			if (bs == null)//If no buffer is found it will create new buffer
			{
				display.getCanvas().createBufferStrategy(3);
				return;
			}
			g = bs.getDrawGraphics();//Basically paint brush
			//Clear
			g.clearRect(0, 0, width, height);//clear screen
			//Draw
			
			g.drawImage(townImage, 100, 100, null);
		
			//End drawing
			bs.show();//Tells java to end drawing and display said drawing on screen through the buffers
			g.dispose();
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
				} catch (InterruptedException e)//Interrupts the thread stopping the program
				{
					e.printStackTrace();
				}
		}
	}
