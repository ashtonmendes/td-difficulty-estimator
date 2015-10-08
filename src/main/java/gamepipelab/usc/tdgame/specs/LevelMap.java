package gamepipelab.usc.tdgame.specs;

public class LevelMap
{
	private int width;
	private int height;	
	private int[][] map;
	
	public LevelMap(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int[][] getMap()
	{
		return map;
	}

	public void setMap(int[][] map)
	{
		this.map = map;
	}	
}
