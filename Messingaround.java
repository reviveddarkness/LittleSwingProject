import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Messingaround 
{
	Character currentHero;
	Character currentVillain;
	
	Character Shiraz = new Character(10, 10, 1, 10, 4, 5, 7, 13);
	JList shirazinv;
	Character David = new Character(8, 4, 9, 5, 7, 8, 8, 6);
	JList davidinv;
	Character Dorian = new Character(11, 9, 0, 8, 6, 6, 11, 6);
	JList dorianinv;
	Character Zachriel = new Character(8, 4, 11, 5, 5, 8, 8, 6);
	JList zachrielinv;
	
	Character Enemy1;
	Character Enemy2;
	Character Enemy3;
	Character Enemy4;
	Character Enemy5;
	Character Enemy6;
	Character Enemy7;
	Character Enemy8;
	Character Boss;
	
	JLabel HitPercentage = new JLabel("0%");
	JLabel CritPercentage = new JLabel("0%");
	JLabel Damage = new JLabel("0");
	JLabel Double = new JLabel("No");
	JLabel EnemyHp = new JLabel("0");
	
	public static void main(String[] args)
	{
		Messingaround Frame = new Messingaround();
	}
	
	public Messingaround()
	{
		defaultCharWeapons(); //sets up default equipped items.
		
		HitPercentage.setFont(new Font("Monotype Corsiva", 1, 34));
		CritPercentage.setFont(new Font("Monotype Corsiva", 1, 34));
		Damage.setFont(new Font("Monotype Corsiva", 1, 34));
		Double.setFont(new Font("Monotype Corsiva", 1, 34));
		EnemyHp.setFont(new Font("Monotype Corsiva", 1, 34));
		
		defineEnemyStats();
		
		currentHero = Shiraz;
		currentVillain = Enemy1;
		JFrame window = new JFrame();
		window.setSize(300, 300);
		JPanel test = new JPanel(new BorderLayout());
		JPanel test2 = new JPanel(); //heroes
		test2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 6));
		JPanel test3 = new JPanel(); //enemies
		JPanel test4 = new JPanel(); //outputs
		test4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 6));
		JPanel test6 = new JPanel(); //attacking or defending
		
		JPanel subpanel1 = new JPanel(new GridLayout(0,1));
		JPanel subpanel2 = new JPanel(new GridLayout(0,1));
		JPanel subpanel3 = new JPanel(new GridLayout(0,1));
		JPanel subpanel4 = new JPanel(new GridLayout(0,1));
		
		test3.setLayout(new GridLayout(3, 3));
		test2.setLayout(new BoxLayout(test2, BoxLayout.Y_AXIS));
		test4.setLayout(new BoxLayout(test4, BoxLayout.Y_AXIS));
		test6.setLayout(new BoxLayout(test6, BoxLayout.X_AXIS));
		
		JButton Attacking = new JButton("Attacking");
		Attacking Attackinge = new Attacking();
		Attacking.addActionListener(Attackinge);
		JButton Defending = new JButton("Defending");
		Defending Defendinge = new Defending();
		Defending.addActionListener(Defendinge);
		JButton ConfirmAttack = new JButton("Confirm Attack?");
		ConfirmAttack ConfirmAttacke = new ConfirmAttack();
		ConfirmAttack.addActionListener(ConfirmAttacke);
		
		JButton Enemy1 = new JButton("Pirate 1"); //update names accordingly
		JButton Enemy2 = new JButton("Pirate 2");
		JButton Enemy3 = new JButton("Pirate 3");
		JButton Enemy4 = new JButton("Lance Bonewalker");
		JButton Enemy5 = new JButton("Bow Bonewalker");
		JButton Enemy6 = new JButton("Sword Bonewalker");
		JButton Enemy7 = new JButton("Enemy7");
		JButton Enemy8 = new JButton("Enemy8");
		JButton Boss = new JButton("Novala");
		Enemy1 Enemy1e = new Enemy1();
		Enemy1.addActionListener(Enemy1e);
		Enemy2 Enemy2e = new Enemy2();
		Enemy2.addActionListener(Enemy2e);
		Enemy3 Enemy3e = new Enemy3();
		Enemy3.addActionListener(Enemy3e);
		Enemy4 Enemy4e = new Enemy4();
		Enemy4.addActionListener(Enemy4e);
		Enemy5 Enemy5e = new Enemy5();
		Enemy5.addActionListener(Enemy5e);
		Enemy6 Enemy6e = new Enemy6();
		Enemy6.addActionListener(Enemy6e);
		Enemy7 Enemy7e = new Enemy7();
		Enemy7.addActionListener(Enemy7e);
		Enemy8 Enemy8e = new Enemy8();
		Enemy8.addActionListener(Enemy8e);
		Boss Bosse = new Boss();
		Boss.addActionListener(Bosse);
		
		JButton Shi = new JButton("Shiraz");
		shirazinv = new JList(Shiraz.itemNames);
		shirazinv.addListSelectionListener(new shirazListener());
		shirazinv.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
		JButton Dor = new JButton("Dorian");
		dorianinv = new JList(Dorian.itemNames);
		dorianinv.addListSelectionListener(new dorianListener());
		dorianinv.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
		JButton Dav = new JButton("David");
		davidinv = new JList(David.itemNames);
		davidinv.addListSelectionListener(new davidListener());
		davidinv.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
		JButton Zac = new JButton("Zachriel");
		zachrielinv = new JList(Zachriel.itemNames);
		zachrielinv.addListSelectionListener(new zachrielListener());
		zachrielinv.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
		Shiraz Shiraze = new Shiraz();
		Shi.addActionListener(Shiraze);
		Dorian Doriane = new Dorian();
		Dor.addActionListener(Doriane);
		David Davide = new David();
		Dav.addActionListener(Davide);
		Zachriel Zachriele = new Zachriel();
		Zac.addActionListener(Zachriele);
		
		
		
		window.add(test);
		test.add(test2, BorderLayout.WEST);
		test.add(test3, BorderLayout.CENTER);
		test.add(test4, BorderLayout.EAST);
		test.add(test6, BorderLayout.NORTH);
		
		subpanel1.add(Shi);
		subpanel1.add(shirazinv);
		test2.add(subpanel1);
		test2.add(Box.createVerticalGlue());
		subpanel2.add(Dor);
		subpanel2.add(dorianinv);
		test2.add(subpanel2);
		test2.add(Box.createVerticalGlue());
		subpanel3.add(Dav);
		subpanel3.add(davidinv);
		test2.add(subpanel3);
		test2.add(Box.createVerticalGlue());
		subpanel4.add(Zac);
		subpanel4.add(zachrielinv);
		test2.add(subpanel4);
		
		test3.add(Boss);
		test3.add(Enemy1);
		test3.add(Enemy2);
		test3.add(Enemy3);
		test3.add(Enemy4);
		test3.add(Enemy5);
		test3.add(Enemy6);
		test3.add(Enemy7);
		test3.add(Enemy8);
		
		test4.add(Box.createVerticalGlue());
		JLabel one = new JLabel("Hit Percentage");
		one.setFont(new Font("Monotype Corsiva", 1, 20));
		test4.add(one);
		test4.add(HitPercentage);
		test4.add(Box.createVerticalGlue());
		JLabel two = new JLabel("Crit Percentage");
		two.setFont(new Font("Monotype Corsiva", 1, 20));
		test4.add(two);
		test4.add(CritPercentage);
		test4.add(Box.createVerticalGlue());
		JLabel three = new JLabel("Damage");
		three.setFont(new Font("Monotype Corsiva", 1, 20));
		test4.add(three);
		test4.add(Damage);
		test4.add(Box.createVerticalGlue());
		JLabel four = new JLabel("Double?");
		four.setFont(new Font("Monotype Corsiva", 1, 20));
		test4.add(four);
		test4.add(Double);
		test4.add(Box.createVerticalGlue());
		JLabel five = new JLabel("Enemy HP");
		five.setFont(new Font("Monotype Corsiva", 1, 20));
		test4.add(five);
		test4.add(EnemyHp);
		test4.add(Box.createVerticalGlue());
		
		test6.add(Box.createHorizontalGlue());
		test6.add(Attacking);
		test6.add(Box.createHorizontalGlue());
		test6.add(Defending);
		test6.add(Box.createHorizontalGlue());
		test6.add(ConfirmAttack);
		test6.add(Box.createHorizontalGlue());
		
		Boss.setIcon(new ImageIcon("novala.gif"));
		Enemy1.setIcon(new ImageIcon("pirate.gif"));
		Enemy2.setIcon(new ImageIcon("pirate.gif"));
		Enemy3.setIcon(new ImageIcon("pirate.gif"));
		Enemy4.setIcon(new ImageIcon("sllan.gif"));
		Enemy5.setIcon(new ImageIcon("slbow.gif"));
		Enemy6.setIcon(new ImageIcon("slswd.gif"));
		Enemy7.setIcon(new ImageIcon());
		Enemy8.setIcon(new ImageIcon());
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void defaultCharWeapons()
	{
		Zachriel.addWeapon("LightningTome");
		
		David.addWeapon("FireTome");
		David.addWeapon("ThunderTome");
		
		Dorian.addWeapon("IronBow");
		
		Shiraz.addWeapon("IronLance");
	}
	
	public void defineEnemyStats()
	{
		//hp, str, mag, def, res, skl, spd, con
		Enemy1 = new Character(28, 13, 0, 11, 10, 13, 6, 10); //pirate f
		Enemy2 = new Character(30, 11, 0, 11, 11, 10, 5, 10); //pirate f
		Enemy3 = new Character(27, 12, 0, 10, 10, 12, 6, 10); //pirate f
		Enemy4 = new Character(26, 7, 0, 5, 2, 5, 6, 9); //bonewalker f
		Enemy5 = new Character(27, 6, 0, 7, 4, 6, 5, 8); //bow bonewalker f
		Enemy6 = new Character(24, 7, 0, 5, 2, 5, 6, 9); //bonewalker f
		Enemy7 = new Character();
		Enemy8 = new Character();
		Boss = new Character(35, 0, 11, 8, 10, 9, 7, 6); //Novala f
		
		Enemy1.addWeapon("SteelAxe");
		
		Enemy2.addWeapon("IronAxe");
		
		Enemy3.addWeapon("SteelAxe");
		
		Enemy4.addWeapon("SilverLance");
		
		Enemy5.addWeapon("KillerBow");
		
		Enemy6.addWeapon("IronSword");
		
		Boss.addWeapon("NosferatuTome");
	}
	
	public class shirazListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent arg0) 
		{
			if(!arg0.getValueIsAdjusting())
			{
				currentHero = Shiraz;
				Shiraz.Equip(shirazinv.getSelectedValue().toString());
				shirazinv.updateUI();
			}
		}
	}
	
	public class dorianListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent arg0) 
		{
			if(!arg0.getValueIsAdjusting())
			{
				currentHero = Dorian;
				Dorian.Equip(dorianinv.getSelectedValue().toString());
				dorianinv.updateUI();
			}
		}
	}
	
	public class davidListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent arg0) 
		{
			if(!arg0.getValueIsAdjusting())
			{
				currentHero = David;
				David.Equip(davidinv.getSelectedValue().toString());
				davidinv.updateUI();
			}
			
		}
	}
	
	public class zachrielListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent arg0) 
		{
			if(!arg0.getValueIsAdjusting())
			{
				currentHero = Zachriel;
				Zachriel.Equip(zachrielinv.getSelectedValue().toString());
				zachrielinv.updateUI();
			}
		}
	}
	
	public class Shiraz implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentHero = Shiraz;
		}
	}
	
	public class David implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentHero = David;
		}
	}
	
	public class Dorian implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentHero = Dorian;
		}
	}
	
	public class Zachriel implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentHero = Zachriel;
		}
	}
	
	public class Boss implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Boss;
		}
	}
	
	public class Enemy1 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy1;
		}
	}
	
	public class Enemy2 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy2;
		}
	}
	
	public class Enemy3 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy3;
		}
	}
	
	public class Enemy4 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy4;
		}
	}
	
	public class Enemy5 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy5;
		}
	}
	
	public class Enemy6 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy6;
		}
	}
	
	public class Enemy7 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy7;
		}
	}
	
	public class Enemy8 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			currentVillain = Enemy8;
		}
	}
	
	public class Attacking implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			CritPercentage.setText(Integer.toString(currentHero.calcCrit(currentVillain)) + "%");
			HitPercentage.setText(Integer.toString(currentHero.calcHitPercentage(currentVillain)) + "%");
			Damage.setText(Integer.toString(currentHero.calcDamage(currentVillain)));
			Double.setText(currentHero.calcDouble(currentVillain));
			EnemyHp.setText(Integer.toString(currentVillain.Hp));
		}
	}
	
	public class Defending implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			CritPercentage.setText(Integer.toString(currentVillain.calcCrit(currentHero)) + "%");
			HitPercentage.setText(Integer.toString(currentVillain.calcHitPercentage(currentHero)) + "%");
			Damage.setText(Integer.toString(currentVillain.calcDamage(currentHero)));
			Double.setText(currentVillain.calcDouble(currentHero));
			EnemyHp.setText(Integer.toString(currentVillain.Hp));
		}
	}
	
	public class ConfirmAttack implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			if(currentHero.calcDouble(currentVillain).equals("Yes"))
			{
				if(currentVillain.Hp - (2 * currentHero.calcDamage(currentVillain)) < 0)
				{
					currentVillain.Hp = 0;
				}
				else
				{
					currentVillain.Hp -= (2 * currentHero.calcDamage(currentVillain));
				}
			}
			else
			{
				if(currentVillain.Hp - currentHero.calcDamage(currentVillain) < 0)
				{
					currentVillain.Hp = 0;
				}
				else
				{
					currentVillain.Hp -= currentHero.calcDamage(currentVillain);
				}
			}
			EnemyHp.setText(Integer.toString(currentVillain.Hp));
		}
	}
}
