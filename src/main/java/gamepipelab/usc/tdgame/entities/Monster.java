package gamepipelab.usc.tdgame.entities;

public class Monster
{
	private String name;
	private int damage;
	private int HP;
	private int armor;
	private int range;
	private float rateOfFire;
	private int gain;
	private int speed;
	private int mana;
	private String reference;
	private boolean isAirUnit;
	
	public Monster(String name, int damage, int HP, int armor, int range,
			float rateOfFire, int gain, int speed, int mana, String reference,
			boolean isAirUnit)
	{
		super();
		this.name = name;
		this.damage = damage;
		this.HP = HP;
		this.armor = armor;
		this.range = range;
		this.rateOfFire = rateOfFire;
		this.gain = gain;
		this.speed = speed;
		this.mana = mana;
		this.reference = reference;
		this.isAirUnit = isAirUnit;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getDamage()
	{
		return damage;
	}

	public void setDamage(int damage)
	{
		this.damage = damage;
	}

	public int getHP()
	{
		return HP;
	}

	public void setHP(int hP)
	{
		HP = hP;
	}

	public int getArmor()
	{
		return armor;
	}

	public void setArmor(int armor)
	{
		this.armor = armor;
	}

	public int getRange()
	{
		return range;
	}

	public void setRange(int range)
	{
		this.range = range;
	}

	public float getRateOfFire()
	{
		return rateOfFire;
	}

	public void setRateOfFire(float rateOfFire)
	{
		this.rateOfFire = rateOfFire;
	}

	public int getGain()
	{
		return gain;
	}

	public void setGain(int gain)
	{
		this.gain = gain;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public int getMana()
	{
		return mana;
	}

	public void setMana(int mana)
	{
		this.mana = mana;
	}

	public String getReference()
	{
		return reference;
	}

	public void setReference(String reference)
	{
		this.reference = reference;
	}

	public boolean isAirUnit()
	{
		return isAirUnit;
	}

	public void setAirUnit(boolean isAirUnit)
	{
		this.isAirUnit = isAirUnit;
	}
}
