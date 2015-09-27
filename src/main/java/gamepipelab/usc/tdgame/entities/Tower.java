package gamepipelab.usc.tdgame.entities;

public class Tower
{
	private String name;
	private int damage;
	private int HP;
	private int armor;
	private int range;
	private float rateOfFire;
	private int cost;
	private int armorPenetration;
	private int rebootTime;
	private boolean isAirUnit;
	
	public Tower(String name, int damage, int HP, int armor, int range,
			float rateOfFire, int cost, int armorPenetration, int rebootTime,
			boolean isAirUnit)
	{
		this.name = name;
		this.damage = damage;
		this.HP = HP;
		this.armor = armor;
		this.range = range;
		this.rateOfFire = rateOfFire;
		this.cost = cost;
		this.armorPenetration = armorPenetration;
		this.rebootTime = rebootTime;
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

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public int getArmorPenetration()
	{
		return armorPenetration;
	}

	public void setArmorPenetration(int armorPenetration)
	{
		this.armorPenetration = armorPenetration;
	}

	public int getRebootTime()
	{
		return rebootTime;
	}

	public void setRebootTime(int rebootTime)
	{
		this.rebootTime = rebootTime;
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
