package Map;

import java.io.Serializable;
import java.util.ArrayList;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import Player.Player;

public class World implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1240449199258534855L;

	boolean paused;
	
	int mapX;
	int mapY;
	
	ArrayList<Map> world;
	
	Player player;
	
	public World(Player player)
	{
		paused = false;
		
		try {
			world = Converter.convertMap(MapReader.readTileMap(new Image("res/World.png")), MapList.getMaps());
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
		mapX = (world.size() % 20) / 2;
		mapY = (world.size() / 20) / 2;
		
		for(Map map: world)
		{
			map.reset();
		}
		
		this.player = player;
		player.setMap(world.get(mapX + mapY * 20));
	}
	
	public void update()
	{
		if(!paused)
		{
			player.setMap(world.get(mapX + mapY * 20));
			world.get(mapX + mapY * 20).update();
		}
	}
	
	public void render(Graphics g) throws SlickException
	{
		world.get(mapX + mapY * 20).render(g);
	}
	
	public void move(int xa, int ya)
	{
		mapX += xa;
		mapY += ya;
	}
	
	public void pause()
	{
		paused = true;
	}
	
	public void unpause()
	{
		paused = false;
	}
}
