package GameEngine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import org.ietf.jgss.GSSName;

public class GameThread extends JPanel implements Runnable
	{
		
		private final GSSName game;
		
		public GameThread(GSSName game)
			{
				this.game=game;
				setFocusable(true);
			}
	@Override
	public void run()
		{
			while(true)
				{
					try
						{
							
						}
							catch (Exception e)
								{
									e.printStackTrace();
								}
				}
								
					
		}			
					
		public void paint(Graphics g)
			{
				super.paint(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				
				repaint();
			}
		
	}
