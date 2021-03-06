package GUI;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import Main.Config;
import Map.World;
import Menus.PauseMenu;
import Player.Player;
import Render.AnimationSet;
import Util.Button;

public class GUI 
{
	PauseMenu Pause;
	Button pause;
	
	public GUI()
	{
		pause = new Button("", Config.WIDTH - 16, 16, 0).setDimensions(32, 32).
				setImage(new AnimationSet("res/Buttons/GUI/Pause/Idle", 100), 
						new AnimationSet("res/Buttons/GUI/Pause/Select", 100));
		
		Pause = new PauseMenu();
	}
	
	public void update(StateBasedGame sbg, World world, Player player)
	{
		Pause.update(sbg, world, player);
		
		
		pause.update();
		
		if(pause.clicked)
		{
			Pause.pause(world, player);
		}
	}
	
	public void render(Graphics g, Player player) throws SlickException
	{
		Pause.render(g, player);
		
		pause.render(g);
	}
}
