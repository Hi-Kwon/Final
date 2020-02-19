package GameEngine;

import java.awt.Graphics2D;

public abstract class GameScreen
	{
		public GameScreen()
		{
			
		}
		public abstract void onCreate();
		
		public abstract void onUpdate();
		
		public abstract void onDraw(Graphics2D g2d);
	}
