package me.tomfletcher.raycasting;

public class World {
	
	private Map map;
	private Player player;
	
	public World() {
		map = new Map();
		player = new Player(2, 10, 0);
	}
	
	public Map getMap() {
		return map;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void update() {
		player.update();
	}
}