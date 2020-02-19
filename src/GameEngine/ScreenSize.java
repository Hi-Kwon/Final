package GameEngine;

import java.awt.SplashScreen;

import org.ietf.jgss.GSSName;

public class ScreenSize
	{
		private GSSName game;
		private SplashScreen screen;
		public ScreenSize(GSSName game)
		{
			this.game = game;
		}
		public void showScreen(SplashScreen screen)
		{
			this.screen = screen;
			this.screen.onCreate();-
		}
		public void getCurrentScreen()
		{
			return screen;
		}
	}
