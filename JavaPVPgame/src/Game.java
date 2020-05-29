import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Random;
import java.awt.event.*;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;



public class Game {
	
//	attack = Charactor.Attack;
//	defence = Charactor.Defence;
	Charactor attack;
	Charactor defence;
	Human TheHuman;
	Zombie TheZombie;
	Item AllItem;
	Item2 AllItem2;
	
	

	private final int DELAY = 2000;
	
	
	Item Axe = new Item("Axe", 20, 17);
	Item Canon = new Item("Canon", 15, 13);
	Item Sword = new Item("Sword", 18, 12);
	Item2 Tshirt = new Item2("Tshirt", 15, 17);
	Item2 BulletProof_Jacket = new Item2("BulletProof Jacket", 10, 15);
	Item2 UnderWare = new Item2("UnderWare", 20, 20);
	
	
	private Timer timer = new Timer(DELAY, new ChangeTurn());

	protected int HealthPoint;
	protected String Name;
	protected int Gold;
	protected int WeaponPower;
	protected int ArmorPower;
	protected int WeaponPrice;
	protected int ArmorPrice;
	protected String WeaponName;
	protected String ArmorName;
//	protected int Gold;
	
	private JFrame frame;
	private JTextField txtCharacterScreen;
	private JTextField txtSelectPlayer;
	private JTextField txtChooseZombie;
	private JTextField txtChooseYourWeapon;
	private JTextField txtChooseYourArmor;
	private JTextField txtZombieScreen;
	private JTextField txtEnjoyTheBloody;
	private JTextField txtHuman;
	private JTextField txtZombie;
	private JLabel lblHumanHealthpoint;
	private JLabel lblZombieHealthpoint;
	private JTextArea BattletextArea;
	private JScrollPane scrollPane;

	private ImageIcon[] HumanPicsArray = new ImageIcon[3];//HumanPics
	private ImageIcon[] ZombiePicsArray = new ImageIcon[3];//ZombiePics
	private ImageIcon[] WeaponPicsArray = new ImageIcon[3];//WeaponPics
	private ImageIcon[] ArmorPicsArray = new ImageIcon[3];//ArmorPics
	
	
//	private Desc[] HumanDescArray = new Desc[3];//Human Description
//	private Desc[] = new Desc[3];//Zombie
//	private Desc[] = new Desc[3];//Weapon
//	private Desc[] = new Desc[3];//Armor
	
	
	private JPanel Startpanel;
	private JPanel Actorpanel;
	private JPanel Zombiepanel;
	private JPanel Weaponpanel;
	private JPanel Armorpanel;
	private JPanel Battlepanel;

	private JTextField txtTypeYourName;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game(){
		
		
		initialize();
//		Spindle();
//		Fight(attack, defence);
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		attack = new Human("test", 0, 0);
//		defence = new Zombie("test", 0);
//		
//		attack =new Zombie("test", 0);
//		defence = new Human("test", 0, 0);
		

		
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
//		Startpanel = new JPanel();
//		Startpanel.setBackground(Color.LIGHT_GRAY);
//		frame.getContentPane().add(Startpanel, "name_185777357964800");
//		Startpanel.setLayout(null);
		
//		JButton StartButton = new JButton("Click Me");
//		StartButton.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 21));
//		StartButton.setBounds(191, 205, 334, 67);
//		Startpanel.add(StartButton);
		
		HumanPicsArray[0] = new ImageIcon(getClass().getResource("HumanPng/Bartender.jpg"));
		HumanPicsArray[1] = new ImageIcon(getClass().getResource("HumanPng/priest.jpg"));
		HumanPicsArray[2] = new ImageIcon(getClass().getResource("HumanPng/Moon.jpg"));
		
		ZombiePicsArray[0] = new ImageIcon(getClass().getResource("ZombiePng/hunter.jpg"));
		ZombiePicsArray[1] = new ImageIcon(getClass().getResource("ZombiePng/smoker.png"));
		ZombiePicsArray[2] = new ImageIcon(getClass().getResource("ZombiePng/tank.jpg"));
		
		WeaponPicsArray[0] = new ImageIcon(getClass().getResource("WeaponPng/Axe.png"));
		WeaponPicsArray[1] = new ImageIcon(getClass().getResource("WeaponPng/Sword.png"));
		WeaponPicsArray[2] = new ImageIcon(getClass().getResource("WeaponPng/canon.jpg"));
		
		ArmorPicsArray[0] = new ImageIcon(getClass().getResource("ArmorPng/tshirt.jpg"));
		ArmorPicsArray[1] = new ImageIcon(getClass().getResource("ArmorPng/bulletproof.jpg"));
		ArmorPicsArray[2] = new ImageIcon(getClass().getResource("ArmorPng/underwear.jpg"));
		
//		HumanDescArray[0] = new Desc(getClass().getString("asf"));
//		HumanDescArray[1] = new Desc(getClass().getString("asf"));
//		HumanDescArray[2] = new Desc(getClass().getString("asf"));
		
		
		Startpanel = new JPanel();
		Actorpanel = new JPanel();
		Zombiepanel = new JPanel();
		Weaponpanel = new JPanel();
		Armorpanel = new JPanel();
		Battlepanel = new JPanel();
		
		
		Startpanel = new JPanel();
		Startpanel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Startpanel, "name_185777357964800");
		Startpanel.setLayout(null);
		
		
		JButton StartButton = new JButton("Click Me");
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Startpanel.setVisible(false);
				Actorpanel.setVisible(true);
				Zombiepanel.setVisible(false);
				Weaponpanel.setVisible(false);
				Armorpanel.setVisible(false);
				Battlepanel.setVisible(false);

			}
		});
		StartButton.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 21));
		StartButton.setBounds(212, 203, 334, 67);
		Startpanel.add(StartButton);
		
		JLabel lblBackground1 = new JLabel("New label");
		lblBackground1.setIcon(new ImageIcon(Game.class.getResource("/BackPng/background2.jpg")));
		lblBackground1.setBounds(0, 0, 758, 477);
		Startpanel.add(lblBackground1);
//		StartButton.setBackground(Color.DARK_GRAY);
//		StartButton.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 26));
//		StartButton.setBounds(193, 169, 353, 111);
//		Startpanel.add(StartButton);
		
		Actorpanel = new JPanel();
		Actorpanel.setForeground(Color.WHITE);
		Actorpanel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Actorpanel, "name_35656269831400");
		Actorpanel.setLayout(null);
		
		JLabel lblActorImage = new JLabel("");
		lblActorImage.setIcon(new ImageIcon(Game.class.getResource("/HumanPng/Bartender.jpg")));
		
		lblActorImage.setBackground(Color.RED);
		lblActorImage.setBounds(438, 79, 193, 268);
		Actorpanel.add(lblActorImage);
		
		txtCharacterScreen = new JTextField();
		txtCharacterScreen.setHorizontalAlignment(SwingConstants.CENTER);
		txtCharacterScreen.setBackground(Color.DARK_GRAY);
		txtCharacterScreen.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		txtCharacterScreen.setText("Character Screen");
		txtCharacterScreen.setBounds(412, 43, 243, 24);
		Actorpanel.add(txtCharacterScreen);
		txtCharacterScreen.setColumns(10);
		
		JLabel lblActorDescription = new JLabel("");
		lblActorDescription.setFont(new Font("Gill Sans MT", Font.ITALIC, 17));
		lblActorDescription.setForeground(Color.RED);
		lblActorDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblActorDescription.setBackground(Color.DARK_GRAY);
		lblActorDescription.setBounds(43, 364, 403, 71);
		Actorpanel.add(lblActorDescription);
		
		txtSelectPlayer = new JTextField();
		txtSelectPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtSelectPlayer.setBackground(Color.DARK_GRAY);
		txtSelectPlayer.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		txtSelectPlayer.setText("Select Player");
		txtSelectPlayer.setBounds(43, 43, 193, 24);
		Actorpanel.add(txtSelectPlayer);
		txtSelectPlayer.setColumns(10);
		
		JButton MvZombie = new JButton("Next->");
		MvZombie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startpanel.setVisible(false);
				Actorpanel.setVisible(false);
				Zombiepanel.setVisible(true);
				Weaponpanel.setVisible(false);
				Armorpanel.setVisible(false);
				Battlepanel.setVisible(false);
//				lblHumanbattleimage.setIcon(lblActorImage.getIcon());
			}
		});
		MvZombie.setForeground(Color.DARK_GRAY);
		MvZombie.setBackground(Color.DARK_GRAY);
		MvZombie.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		MvZombie.setBounds(472, 364, 183, 38);
		Actorpanel.add(MvZombie);
		
//		JLabel lblHumanbattleimage = new JLabel("");
//		lblHumanbattleimage.setBorder(new LineBorder(new Color(0, 0, 0)));
//		lblHumanbattleimage.setBounds(40, 200, 116, 184);
//		Battlepanel.add(lblHumanbattleimage);
//		
//		JLabel lblZombiebattleimage = new JLabel("");
//		lblZombiebattleimage.setBorder(new LineBorder(new Color(0, 0, 0)));
//		lblZombiebattleimage.setBounds(591, 200, 116, 184);
//		Battlepanel.add(lblZombiebattleimage);
		
		
		JList HumanList = new JList();
		HumanList.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent arg0) {
				lblActorImage.setIcon(HumanPicsArray[HumanList.getSelectedIndex()]);
//				lblHumanbattleimage.setIcon(lblActorImage.getIcon());
//				lblActorDescription.setText(HumanDescArray[HumanList.getSelectedIndex()]);
				
				
				if (HumanList.getSelectedIndex() == 0){
					TheHuman = new Human("Bartender", 60, 37);
//					lblHumanbattleimage.setIcon(lblActorImage.getIcon());
					lblActorDescription.setText(""+TheHuman.getName()+",s Health Point is "+TheHuman.getHealthPoint()+" Gold is "+TheHuman.getGold()+"");
				}//end if
				
				else if (HumanList.getSelectedIndex() == 1){
					TheHuman = new Human("Priest", 40, 40);
					lblActorDescription.setText(""+TheHuman.getName()+",s Health Point is "+TheHuman.getHealthPoint()+" Gold is "+TheHuman.getGold()+"");
				}//end else if 
				
				else
					TheHuman = new Human("Moon", 70, 35);
					lblActorDescription.setText(""+TheHuman.getName()+",s Health Point is "+TheHuman.getHealthPoint()+" Gold is "+TheHuman.getGold()+"");
				
			}//end valuedChanged
			
		});
		
		
		
		HumanList.setBackground(Color.GRAY);
		HumanList.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
		HumanList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Bartender", "Priest", "Moon"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		HumanList.setBounds(43, 102, 132, 77);
		Actorpanel.add(HumanList);
		
		JLabel lblBackGround2 = new JLabel("");
		lblBackGround2.setIcon(new ImageIcon(Game.class.getResource("/BackPng/background1.jpg")));
		lblBackGround2.setBounds(0, 0, 758, 477);
		Actorpanel.add(lblBackGround2);
		
		Zombiepanel = new JPanel();
		Zombiepanel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Zombiepanel, "name_35717460628100");
		Zombiepanel.setLayout(null);
		
		txtChooseZombie = new JTextField();
		txtChooseZombie.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseZombie.setBackground(Color.DARK_GRAY);
		txtChooseZombie.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		txtChooseZombie.setText("Choose Zombie");
		txtChooseZombie.setBounds(54, 64, 227, 39);
		Zombiepanel.add(txtChooseZombie);
		txtChooseZombie.setColumns(10);
		
		JList Zombielist = new JList();
		JLabel lblZombieImage = new JLabel("Zombie Image");
		lblZombieImage.setIcon(new ImageIcon(getClass().getResource("/ZombiePng/hunter.jpg")));
		lblZombieImage.setBounds(394, 117, 222, 241);
		Zombiepanel.add(lblZombieImage);
		
		JLabel lblZombieDescription = new JLabel("");
		lblZombieDescription.setForeground(Color.RED);
		lblZombieDescription.setFont(new Font("Gill Sans MT", Font.ITALIC, 17));
		lblZombieDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblZombieDescription.setBounds(54, 331, 326, 79);
		Zombiepanel.add(lblZombieDescription);
		
		Zombielist.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent arg0) {
				lblZombieImage.setIcon(ZombiePicsArray[Zombielist.getSelectedIndex()]);
				
				if (Zombielist.getSelectedIndex() == 0){
					TheZombie = new Zombie("Hunter", 70);
					lblZombieDescription.setText(""+TheZombie.getName()+",s Health Point is "+TheZombie.getHealthPoint()+"");
				}//end if
				
				else if (Zombielist.getSelectedIndex() == 1){
					TheZombie = new Zombie("Smoker", 80);
					lblZombieDescription.setText(""+TheZombie.getName()+",s Health Point is "+TheZombie.getHealthPoint()+"");
				}//end else if 
				
				else
					TheZombie = new Zombie("Tank", 50);
					lblZombieDescription.setText(""+TheZombie.getName()+",s Health Point is "+TheZombie.getHealthPoint()+"");
			}
		});
		Zombielist.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
		Zombielist.setModel(new AbstractListModel() {
			String[] values = new String[] {"Hunter", "Smoker", "Tank"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		Zombielist.setBackground(Color.GRAY);
		Zombielist.setBounds(54, 131, 136, 79);
		Zombiepanel.add(Zombielist);
		
//		JLabel lblZombieImage = new JLabel("Zombie Image");
//		lblZombieImage.setIcon(new ImageIcon(Game.class.getResource("/ZombiePng/hunter.jpg")));
//		lblZombieImage.setBounds(394, 117, 222, 241);
//		Zombiepanel.add(lblZombieImage);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startpanel.setVisible(false);
				Actorpanel.setVisible(false);
				Zombiepanel.setVisible(false);
				Weaponpanel.setVisible(true);
				Armorpanel.setVisible(false);
				Battlepanel.setVisible(false);
			}
		});
		btnNext.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnNext.setBounds(520, 392, 173, 39);
		Zombiepanel.add(btnNext);
		
		txtZombieScreen = new JTextField();
		txtZombieScreen.setHorizontalAlignment(SwingConstants.CENTER);
		txtZombieScreen.setBackground(Color.DARK_GRAY);
		txtZombieScreen.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		txtZombieScreen.setText("Zombie Screen");
		txtZombieScreen.setBounds(394, 64, 258, 39);
		Zombiepanel.add(txtZombieScreen);
		txtZombieScreen.setColumns(10);
		
		JLabel lblBackGround3 = new JLabel("");
		lblBackGround3.setIcon(new ImageIcon(Game.class.getResource("/BackPng/background1.jpg")));
		lblBackGround3.setBounds(0, 0, 758, 477);
		Zombiepanel.add(lblBackGround3);
		
//		JLabel lblZombieDescription = new JLabel("");
//		lblZombieDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
//		lblZombieDescription.setBounds(54, 331, 275, 79);
//		Zombiepanel.add(lblZombieDescription);
		
		Weaponpanel = new JPanel();
		Weaponpanel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Weaponpanel, "name_35744201494900");
		Weaponpanel.setLayout(null);
		
		txtChooseYourWeapon = new JTextField();
		txtChooseYourWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseYourWeapon.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		txtChooseYourWeapon.setBackground(Color.DARK_GRAY);
		txtChooseYourWeapon.setText("Choose Your Weapon");
		txtChooseYourWeapon.setBounds(57, 58, 296, 48);
		Weaponpanel.add(txtChooseYourWeapon);
		txtChooseYourWeapon.setColumns(10);
		
		JList WeaponList = new JList();
		
		JLabel WeaponDescription = new JLabel("");
		WeaponDescription.setForeground(Color.RED);
		WeaponDescription.setFont(new Font("Gill Sans MT", Font.ITALIC, 17));
		WeaponDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		WeaponDescription.setBounds(57, 385, 312, 58);
		Weaponpanel.add(WeaponDescription);
		
		JLabel lblWeaponImage = new JLabel("");
		lblWeaponImage.setIcon(new ImageIcon(getClass().getResource("/WeaponPng/Axe.png")));
		lblWeaponImage.setBounds(460, 138, 190, 182);
		Weaponpanel.add(lblWeaponImage);
		
		WeaponList.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent arg0) {
				lblWeaponImage.setIcon(WeaponPicsArray[WeaponList.getSelectedIndex()]);
				
				if (WeaponList.getSelectedIndex() == 0){
					TheHuman.setAllItem(Axe);
					WeaponDescription.setText(""+TheHuman.getAllItem().getWeaponName()+"'s attack power is " +TheHuman.getAllItem().getWeaponPower()+". Price is " +TheHuman.getAllItem().getWeaponPrice()+" Gold.");
				}//end if
				
				else if (WeaponList.getSelectedIndex() == 1){
					TheHuman.setAllItem(Canon);
					WeaponDescription.setText(""+TheHuman.getAllItem().getWeaponName()+"'s attack power is " +TheHuman.getAllItem().getWeaponPower()+". Price is " +TheHuman.getAllItem().getWeaponPrice()+" Gold.");
				}//end else if 
				
				else{
					TheHuman.setAllItem(Sword);
					WeaponDescription.setText(""+TheHuman.getAllItem().getWeaponName()+"'s attack power is " +TheHuman.getAllItem().getWeaponPower()+". Price is " +TheHuman.getAllItem().getWeaponPrice()+" Gold.");
			}}
		});
		WeaponList.setBackground(Color.GRAY);
		WeaponList.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
		WeaponList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Axe", "Sword", "Cannon"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		WeaponList.setBounds(57, 138, 146, 77);
		Weaponpanel.add(WeaponList);
		
//		JLabel lblWeaponimage = new JLabel("WeaponImage");
//		lblWeaponimage.setIcon(new ImageIcon(Game.class.getResource("/WeaponPng/Axe.png")));
//		lblWeaponimage.setBounds(413, 138, 252, 214);
//		Weaponpanel.add(lblWeaponimage);
		
		JButton btnNewButton = new JButton("Next ->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startpanel.setVisible(false);
				Actorpanel.setVisible(false);
				Zombiepanel.setVisible(false);
				Weaponpanel.setVisible(false);
				Armorpanel.setVisible(true);
				Battlepanel.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnNewButton.setBounds(475, 400, 190, 43);
		Weaponpanel.add(btnNewButton);
		
		JLabel lblBackGround4 = new JLabel("");
		lblBackGround4.setIcon(new ImageIcon(Game.class.getResource("/BackPng/background1.jpg")));
		lblBackGround4.setBounds(0, 0, 758, 477);
		Weaponpanel.add(lblBackGround4);
		
//		JLabel WeaponDescription = new JLabel("");
//		WeaponDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
//		WeaponDescription.setBounds(57, 385, 252, 58);
//		Weaponpanel.add(WeaponDescription);
		
		Armorpanel = new JPanel();
		Armorpanel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Armorpanel, "name_35775983946600");
		Armorpanel.setLayout(null);
		
		txtChooseYourArmor = new JTextField();
		txtChooseYourArmor.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseYourArmor.setBackground(Color.DARK_GRAY);
		txtChooseYourArmor.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		txtChooseYourArmor.setText("Choose Your Armor");
		txtChooseYourArmor.setBounds(62, 60, 275, 43);
		Armorpanel.add(txtChooseYourArmor);
		txtChooseYourArmor.setColumns(10);
		
		JList ArmorList = new JList();
		
		JLabel lblArmordescription = new JLabel("");
		lblArmordescription.setFont(new Font("Gill Sans MT", Font.ITALIC, 17));
		lblArmordescription.setForeground(Color.RED);
		lblArmordescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblArmordescription.setBounds(62, 364, 345, 76);
		Armorpanel.add(lblArmordescription);
		
		JLabel lblArmorImage = new JLabel("Armor Image");
		lblArmorImage.setIcon(new ImageIcon(getClass().getResource("/ArmorPng/bulletproof.jpg")));
		lblArmorImage.setBounds(422, 156, 208, 190);
		Armorpanel.add(lblArmorImage);
		ArmorList.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent arg0) {
				lblArmorImage.setIcon(ArmorPicsArray[ArmorList.getSelectedIndex()]);
				
				if (ArmorList.getSelectedIndex() == 0){
					TheHuman.setAllItem2(Tshirt);
					lblArmordescription.setText(""+TheHuman.getAllItem2().getArmorName()+"'s defence power is " +TheHuman.getAllItem2().getArmorPower()+". Price is " +TheHuman.getAllItem2().getArmorPrice()+" Gold.");
				}//end if
				
				else if (ArmorList.getSelectedIndex() == 1){
					TheHuman.setAllItem2(BulletProof_Jacket);
					lblArmordescription.setText(""+TheHuman.getAllItem2().getArmorName()+"'s defence power is " +TheHuman.getAllItem2().getArmorPower()+". Price is " +TheHuman.getAllItem2().getArmorPrice()+" Gold.");
				}//end else if 
				
				else{
					TheHuman.setAllItem2(UnderWare);
					lblArmordescription.setText(""+TheHuman.getAllItem2().getArmorName()+"'s defence power is " +TheHuman.getAllItem2().getArmorPower()+". Price is " +TheHuman.getAllItem2().getArmorPrice()+" Gold.");
			}}
		});
		ArmorList.setBackground(Color.GRAY);
		ArmorList.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
		ArmorList.setModel(new AbstractListModel() {
			String[] values = new String[] {"T-Shirt", "Bulletproof Jacket ", "UnderWear"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		ArmorList.setBounds(62, 132, 208, 84);
		Armorpanel.add(ArmorList);
		
//		JLabel lblArmorImage = new JLabel("Armor Image");
//		lblArmorImage.setIcon(new ImageIcon(Game.class.getResource("/ArmorPng/bulletproof.jpg")));
//		lblArmorImage.setBounds(422, 156, 208, 190);
//		Armorpanel.add(lblArmorImage);
		
		JButton btnNext_1 = new JButton("Next ->");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startpanel.setVisible(false);
				Actorpanel.setVisible(false);
				Zombiepanel.setVisible(false);
				Weaponpanel.setVisible(false);
				Armorpanel.setVisible(false);
				Battlepanel.setVisible(true);			}
		});
		btnNext_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		btnNext_1.setBounds(452, 389, 178, 43);
		Armorpanel.add(btnNext_1);
		
		JLabel lblBackGround5 = new JLabel("");
		lblBackGround5.setIcon(new ImageIcon(Game.class.getResource("/BackPng/background1.jpg")));
		lblBackGround5.setBounds(0, 0, 758, 477);
		Armorpanel.add(lblBackGround5);
		
//		JLabel lblArmordescription = new JLabel("");
//		lblArmordescription.setBorder(new LineBorder(new Color(0, 0, 0)));
//		lblArmordescription.setBounds(95, 383, 259, 57);
//		Armorpanel.add(lblArmordescription);
		
		Battlepanel = new JPanel();
		Battlepanel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Battlepanel, "name_50680493130100");
		Battlepanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(571, 389, -384, -208);
		scrollPane.setViewportView(BattletextArea);
		

		
		txtEnjoyTheBloody = new JTextField();
		txtEnjoyTheBloody.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnjoyTheBloody.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		txtEnjoyTheBloody.setText("Fight");
		txtEnjoyTheBloody.setBackground(Color.DARK_GRAY);
		txtEnjoyTheBloody.setBounds(73, 25, 599, 63);
		Battlepanel.add(txtEnjoyTheBloody);
		txtEnjoyTheBloody.setColumns(10);
		
		txtHuman = new JTextField();
		txtHuman.setBackground(Color.DARK_GRAY);
		txtHuman.setForeground(Color.BLACK);
		txtHuman.setFont(new Font("Goudy Old Style", Font.BOLD, 17));
		txtHuman.setHorizontalAlignment(SwingConstants.CENTER);
		txtHuman.setText("Human");
		txtHuman.setBounds(40, 141, 116, 24);
		Battlepanel.add(txtHuman);
		txtHuman.setColumns(10);
		
		txtZombie = new JTextField();
		txtZombie.setFont(new Font("Goudy Old Style", Font.BOLD, 17));
		txtZombie.setBackground(Color.DARK_GRAY);
		txtZombie.setHorizontalAlignment(SwingConstants.CENTER);
		txtZombie.setText("Zombie");
		txtZombie.setBounds(591, 142, 116, 24);
		Battlepanel.add(txtZombie);
		txtZombie.setColumns(10);
		
	
		
		JButton btnTryAgain = new JButton("Try Again?");
		btnTryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startpanel.setVisible(true);
				Actorpanel.setVisible(false);
				Zombiepanel.setVisible(false);
				Weaponpanel.setVisible(false);
				Armorpanel.setVisible(false);
				Battlepanel.setVisible(false);			}
		});
		
		btnTryAgain.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 10));
		btnTryAgain.setBounds(245, 418, 105, 27);
		Battlepanel.add(btnTryAgain);
		
		JButton btnQuit = new JButton("Quit?");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 10));
		btnQuit.setBounds(395, 418, 105, 27);
		Battlepanel.add(btnQuit);
		
		lblHumanHealthpoint = new JLabel("");
		lblHumanHealthpoint.setForeground(Color.RED);
		lblHumanHealthpoint.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblHumanHealthpoint.setBounds(40, 170, 116, 18);
		Battlepanel.add(lblHumanHealthpoint);
		
		lblZombieHealthpoint = new JLabel("");
		lblZombieHealthpoint.setForeground(Color.RED);
		lblZombieHealthpoint.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblZombieHealthpoint.setBounds(591, 170, 116, 18);
		Battlepanel.add(lblZombieHealthpoint);
		
		JButton btnStartFightButton = new JButton("Start Fight Button"); 
		btnStartFightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Spindle();
				
			}
		});
		btnStartFightButton.setFont(new Font("Goudy Old Style", Font.BOLD, 17));
		btnStartFightButton.setBounds(245, 112, 255, 43);
		Battlepanel.add(btnStartFightButton);
		

		
		JLabel lblBackGround6 = new JLabel("");
		lblBackGround6.setIcon(new ImageIcon(Game.class.getResource("/BackPng/background2.jpg")));
		lblBackGround6.setBounds(0, 0, 758, 477);
		Battlepanel.add(lblBackGround6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(187, 170, 390, 216);
		Battlepanel.add(scrollPane_1);
		//		Battlepanel.add(scrollPane);
				
				BattletextArea = new JTextArea();
				scrollPane_1.setViewportView(BattletextArea);
				BattletextArea.setBorder(new LineBorder(new Color(0, 0, 0)));
				BattletextArea.setBackground(Color.LIGHT_GRAY);
		

		
//		HumanPicsArray[0] = new ImageIcon(Game.class.getResource("HumanPics/bartender.png"));
//		HumanPicsArray[1] = new ImageIcon(Game.class.getResource("HumanPics/priest.png"));
//		HumanPicsArray[2] = new ImageIcon(Game.class.getResource("HumanPics/Moon.png"));
		
//		ZombiePicsArray[0] = new ImageIcon(Game.class.getResource("HumanPics/hunter.png"));
//		ZombiePicsArray[1] = new ImageIcon(Game.class.getResource("HumanPics/smoker.png"));
//		ZombiePicsArray[2] = new ImageIcon(Game.class.getResource("HumanPics/tank.png"));


		
	}//end init
	
	
	
	public void Spindle(){
		
		int Dice1;
		int Dice2;
		
		boolean loop = false;
		
		do{
			 Random TheRandom = new Random();
			 Dice1 = TheRandom.nextInt(6) + 1;
			 BattletextArea.setText("Human got number "+Dice1+".\n");
			 Dice2 = TheRandom.nextInt(6) + 1;
			 BattletextArea.append("Zombie got number "+Dice2+".\n");
			
			if(Dice1 == Dice2){
				BattletextArea.append("The Number is same. Try again.\n");
				loop = true;
				continue;
			}//end if
			
			else if(Dice1 < Dice2)
			{
				attack = TheZombie;
				defence = TheHuman;
				loop = false;
				break;
			}//end else if
			else if(Dice1 > Dice2)
			{

				attack = TheHuman;
				defence = TheZombie;
				loop = false;
				break;
			}//end else if
			
		}while(loop); //end loop
		

		BattletextArea.append(attack.getName()+" got the turn for attack.\n");
		timer.start();
//		Fight(attack, defence);
		
	}//end Spindle
	
	public class ChangeTurn implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent actionEvent)
		{
			Fight(attack, defence);
		}
	}
	
	
	
	public void Fight(Charactor attack, Charactor defence){
		String sayfirstHealthpoint, saysecondHealthpoint;
//		String saysecondHealthpoint;
		
		defence.Defence(attack.Attack());

		BattletextArea.append(attack.getName()+" is attacking\n");
		System.out.println(defence.race);
		System.out.println(attack.race);
		
		sayfirstHealthpoint = Integer.toString(defence.getHealthPoint());
		saysecondHealthpoint = Integer.toString(attack.getHealthPoint());
		
		
		if (defence.race.equals("Human"))
		{
//			System.out.println("1234");
			lblHumanHealthpoint.setText(sayfirstHealthpoint);
//			lblHumanHealthpoint.setText("Hello");
			lblZombieHealthpoint.setText(saysecondHealthpoint);
//			lblZombieHealthpoint.setText("Hello");
		}
		
		else if (defence.race.equals("Zombie"))
		{
			lblHumanHealthpoint.setText(saysecondHealthpoint);
			lblZombieHealthpoint.setText(sayfirstHealthpoint);
		}
		
		if (attack.getHealthPoint() <= 0 || defence.getHealthPoint() <= 0)
		{
			timer.stop(); 
			if (attack.getHealthPoint() <= 0)
			{
				if (attack.race.equals("Human")){
					BattletextArea.append(attack.getName()+" lost.\n This round is done.\n");
					BattletextArea.append(attack.getName()+" lost Gold.\n");
					TheHuman.setGold(TheHuman.getGold() - 5);
				}//end third if
				else if (attack.race.equals("Zombie"))
				{
					BattletextArea.append(attack.getName()+" lost.\n This round is done.\n");
					BattletextArea.append(defence.getName()+" won.\n"+defence.getName()+" got 5 Golds.\n");
					TheHuman.setGold(TheHuman.getGold() + 5);
				}//end else if
			}//end inner if
			else if (defence.getHealthPoint() <= 0)
			{
				if (defence.race.equals("Human")){
					BattletextArea.append(defence.getName()+" lost.\n This round is done.\n");
					BattletextArea.append(defence.getName()+" lost Gold.");
					TheHuman.setGold(TheHuman.getGold() - 5);
				}//end else if if
				else if (defence.race.equals("Zombie"))
				{
					BattletextArea.append(defence.getName()+" lost.\n This round is done.\n");
					BattletextArea.append(attack.getName()+" won.\n"+attack.getName()+" got 5 Golds.\n");
					TheHuman.setGold(TheHuman.getGold() + 5);
				}//end else if if if
			}//end else if
		}//end pipe if
		System.out.println(TheHuman.getGold());
		
		Charactor tempAttacker = attack;
		this.attack = defence;
		this.defence = tempAttacker;
		
	}//end fight
}//end class
