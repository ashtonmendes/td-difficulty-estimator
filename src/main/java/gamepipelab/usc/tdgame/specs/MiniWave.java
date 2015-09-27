package gamepipelab.usc.tdgame.specs;

import gamepipelab.usc.tdgame.entities.Monster;

public class MiniWave
{
	private int startTime;
	private int amount;
	private Monster monster;
	
	public MiniWave(int startTime, int amount, Monster monster)
	{
		super();
		this.startTime = startTime;
		this.amount = amount;
		this.monster = monster;
	}

	public int getStartTime()
	{
		return startTime;
	}

	public void setStartTime(int startTime)
	{
		this.startTime = startTime;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public Monster getMonster()
	{
		return monster;
	}

	public void setMonster(Monster monster)
	{
		this.monster = monster;
	}	
}
