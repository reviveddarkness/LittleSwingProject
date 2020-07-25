public class Character 
{
	int typeAttack; //1 for mag, 0 for str
	
	int Hp;
	int Str;
	int Mag;
	int Def;
	int Res;
	int Skl;
	int Spd;
	int Con;

	Weapon items[];
	String itemNames[];
	int quantity;
	
	public Character()
	{
		Hp = 0;
		Str = 0;
		Mag = 0;
		Def = 0;
		Res = 0;
		Skl = 0;
		Spd = 0;
		Con = 0;
		
		items = new Weapon[5];
		itemNames = new String[5];
		quantity = 0;
	}
	
	public Character(int H, int S, int M, int D, int R, int Sk, int Sp, int C)
	{
		Hp = H;
		Str = S;
		Mag = M;
		Def = D;
		Res = R;
		Skl = Sk;
		Spd = Sp;
		Con = C;
		
		items = new Weapon[5];
		itemNames = new String[5];
		quantity = 0;
	}
	
	public void addWeapon(String name)
	{
		if(quantity >= 5)
		{
			System.out.println("Too many items");
		}
		else
		{
			items[quantity] = Weapon.getMemWeapon(name);
			itemNames[quantity] = name;
			quantity++;
		}
	}
	
	public void Equip(String name)
	{
		for(int i = 0; i < quantity; i++)
		{
			if(itemNames[i].equals(name))
			{
				String temp1 = itemNames[0];
				Weapon temp2 = items[0];
				itemNames[0] = itemNames[i];
				items[0] = items[i];
				itemNames[i] = temp1;
				items[i] = temp2;
			}
		}
	}
	
	public int calcHitPercentage(Character enemy)
	{
		if((Skl*2 + items[0].WpHit) - (enemy.Spd * 2) > 100)
		{
			return 100;
		}
		else if((Skl*2 + items[0].WpHit) - (enemy.Spd * 2) < 0)
		{
			return 0;
		}
		else
		{
			return (Skl*2 + items[0].WpHit) - (enemy.Spd * 2);
		}
	}
	
	public int calcDamage(Character enemy)
	{
		int temp;
		if(typeAttack == 0)
		{
			temp = (Str + items[0].WpStr) - enemy.Def;
		}
		else if(typeAttack == 1)
		{
			temp = (Mag + items[0].WpStr) - enemy.Res;
		}
		else
		{
			temp = 0;
		}
		
		if(temp < 0)
		{
			return 0;
		}
		else
		{
			return temp;
		}
	}
	
	public int calcCrit(Character enemy)
	{
		if(Skl/2 + items[0].WpCrit > 100)
		{
			return 100;
		}
		else if(Skl/2 + items[0].WpCrit < 0)
		{
			return 0;
		}
		else
		{
			return Skl/2 + items[0].WpCrit;
		}
	}
	
	public String calcDouble(Character enemy)
	{
		int temp = 0;
		if(items[0].WpWt - Con < 0)
		{
			temp = 0;
		}
		else
		{
			temp = items[0].WpWt - Con;
		}
		if(Spd - temp < 4)
		{
			return "No";
		}
		else
		{
			return "Yes";
		}
		
	}
}
