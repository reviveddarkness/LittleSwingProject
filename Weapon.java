public class Weapon 
{
	int typeAttack;
	int WpHit;
	int WpCrit;
	int WpStr;
	int WpWt;
	
	public static final Weapon LightningTome = new Weapon(1, 95, 5, 4, 6);
	
	public static final Weapon FireTome = new Weapon(1, 90, 0, 5, 4);
	public static final Weapon ThunderTome = new Weapon(1, 80, 5, 8, 6);
	
	public static final Weapon NosferatuTome = new Weapon(1, 70, 0, 10, 14);
	
	public static final Weapon IronBow = new Weapon(0, 85, 0, 6, 5);
	public static final Weapon KillerBow = new Weapon(0, 75, 30, 9, 7);
	
	public static final Weapon IronSword = new Weapon(0, 90, 0, 5, 5);
	
	public static final Weapon IronLance = new Weapon(0, 80, 0, 7, 8);
	public static final Weapon SilverLance = new Weapon(0, 75, 0, 14, 10);
	
	public static final Weapon IronAxe = new Weapon(0, 75, 0, 8, 10);
	public static final Weapon SteelAxe = new Weapon(0, 65, 0, 11, 15);
	
	public static final Weapon Error = new Weapon(10000, 10000, 10000, 10000, 10000);
	
	public Weapon(int type, int hit, int crit, int str, int wt)
	{
		typeAttack = type;
		WpHit = hit;
		WpCrit = crit;
		WpStr = str;
		WpWt = wt;
	}
	
	public static Weapon getMemWeapon(String item)
	{
		if(item.equals("LightningTome"))
		{
			return LightningTome;
		}
		else if(item.equals("FireTome"))
		{
			return FireTome;
		}
		else if(item.equals("ThunderTome"))
		{
			return ThunderTome;
		}
		else if(item.equals("NosferatuTome"))
		{
			return NosferatuTome;
		}
		else if(item.equals("IronBow"))
		{
			return IronBow;
		}
		else if(item.equals("KillerBow"))
		{
			return KillerBow;
		}
		else if(item.equals("IronSword"))
		{
			return IronSword;
		}
		else if(item.equals("IronLance"))
		{
			return IronLance;
		}
		else if(item.equals("SilverLance"))
		{
			return SilverLance;
		}
		else if(item.equals("IronAxe"))
		{
			return IronAxe;
		}
		else if(item.equals("SteelAxe"))
		{
			return SteelAxe;
		}
		else
		{
			System.out.println("Item not found.");
			return Error;
		}
	}
}
