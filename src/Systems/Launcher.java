package Systems;

import Systems.Game;

public class Launcher
	{

		public static void main(String[] args)
			{
				Game game = new Game("The Basic RPG!", 1000, 1000);
				game.start();
			}

	}
