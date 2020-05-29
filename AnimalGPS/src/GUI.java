import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.util.regex.*;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GUI{
	
	Controller control;
	Animal animal;
	Penguins penguins;
	SeaLions sealions;
	Walrus walrus;

	private JFrame frame;
	private JTextField txtPenguin;
	private JTextField txtTypeSpecis;
	private JTextField txtChooseSex;
	private JTextField txtTypeWeight;
	private JTextField PenguinWeight;
	private JTextField txtTypeBloodPressure;
	private JTextField PenguinBlood;
	private JTextField txtSeaLions;
	private JTextField txtTypeSpecies;
	private JTextField txtTypeSex;
	private JTextField txtTypeWeight_1;
	private JTextField txtTypeGps;
	private JTextField PenguinGPS;
	private JTextField txtTtpeGps;
	private JTextField txtTypeNumberOf;
	private JTextField SealionsWeight;
	private JTextField SealionsGPS;
	private JTextField SealionsSpots;
	private JTextField txtWalrus;
	private JTextField txtTypeSpeceis;
	private JTextField txtTypeSex_1;
	private JTextField txtTypeWeight_2;
	private JTextField txtTypeGps_1;
	private JTextField txtChooseDeatalStatus;
	private JTextField WalrusWeight;
	private JTextField WalrusGPS;
	private JTextArea Reporting;
	private JComboBox DentalBox;
	private JButton ToSeaLionbtn;
	private JButton ToWalrusbtn;
	private JButton ToReportbtn;
	private JLabel PenguinInvalidLabel;
	private JLabel SealionInvalidLabel;
	private JLabel WalrusInvalidLabel;
	private JComboBox PenguinSexBox;
	private JComboBox SealionSexBox;
	private JComboBox WalrusSexBox;
	
	private String regDouble = "[+-]?([0-9]*[.])?[0-9]+";
	private String regInt = "^\\d+$";
	private String regGps = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
	
	private JPanel StartPanel;
	private JPanel PenguinesPanel;
	private JPanel SeaLionsPanel;
	private JPanel WalrusPanel;
	private JPanel ReportPanel;
	
	Controller controller = new Controller();

	
	private String PassSpecies;
	private String PassSex;
	private double PassWeight;
	private String PassGPS;
	private double PassBlood;
	private int PassSpots;
	private String PassDental;
//	private JButton SendingPenguin;
//	private JButton SendingSealion;
//	private JButton SendingWalrus;
	private JButton btnReport;
	private JComboBox PenguinSpeciesBox;
	private JComboBox SealionSpeciesBox;
	private JComboBox WalrusSpeciesBox;
	
//	private String intreg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		StartPanel = new JPanel();
		frame.getContentPane().add(StartPanel, "name_32186460733700");
		StartPanel.setLayout(null);
		
		JButton btnGpsStart = new JButton("GPS START");
		btnGpsStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StartPanel.setVisible(false);
				PenguinesPanel.setVisible(true);
				SeaLionsPanel.setVisible(false);
				WalrusPanel.setVisible(false);
				ReportPanel.setVisible(false);
			}
		});
		btnGpsStart.setBounds(180, 169, 372, 88);
		StartPanel.add(btnGpsStart);
		
		PenguinesPanel = new JPanel();
		frame.getContentPane().add(PenguinesPanel, "name_31337912870000");
		PenguinesPanel.setLayout(null);
		
		txtPenguin = new JTextField();
		txtPenguin.setText("Penguin");
		txtPenguin.setBounds(37, 31, 136, 43);
		txtPenguin.setColumns(10);
		PenguinesPanel.add(txtPenguin);
		
//		SendingPenguin = new JButton("Sending");
//		SendingPenguin.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				if(PenguinWeight.getText().matches(regDouble) && PenguinBlood.getText().matches(regDouble) && PenguinGPS.getText().matches(regGps))
//				{
//					control.Object(PassSex, PassWeight, PassBlood, PassGPS, PassSpecies);
//					control.doWrite(control.animal.toString());
//					ToSeaLionbtn.setEnabled(true);
//				}//end if
//				else
//				{
//					ToSeaLionbtn.setEnabled(false);
//				}//end else
//			}//end action
//		});
//		SendingPenguin.setBounds(494, 322, 105, 27);
//		PenguinesPanel.add(SendingPenguin);
		


		
		txtTypeSpecis = new JTextField();
		txtTypeSpecis.setText("Type Species");
		txtTypeSpecis.setBounds(68, 119, 116, 24);
		PenguinesPanel.add(txtTypeSpecis);
		txtTypeSpecis.setColumns(10);
		
		PenguinSpeciesBox = new JComboBox();
		PenguinSpeciesBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {

		    PassSpecies = PenguinSpeciesBox.getSelectedItem().toString();
		}
	});
		PenguinSpeciesBox.setModel(new DefaultComboBoxModel(new String[] {"Macaroni Penguin", "Gentoo Penguin"}));
		PenguinSpeciesBox.setBounds(218, 119, 165, 24);
		PenguinesPanel.add(PenguinSpeciesBox);
		
		txtChooseSex = new JTextField();
		txtChooseSex.setText("Type Sex");
		txtChooseSex.setBounds(68, 173, 116, 24);
		PenguinesPanel.add(txtChooseSex);
		txtChooseSex.setColumns(10);
		
		PenguinSexBox = new JComboBox();
		PenguinSexBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

			    PassSex = PenguinSexBox.getSelectedItem().toString();
			}
		});
		PenguinSexBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		PenguinSexBox.setBounds(218, 173, 116, 24);
		PenguinesPanel.add(PenguinSexBox);
		
		txtTypeWeight = new JTextField();
		txtTypeWeight.setText("Type Weight");
		txtTypeWeight.setBounds(68, 227, 116, 24);
		PenguinesPanel.add(txtTypeWeight);
		txtTypeWeight.setColumns(10);
		
		PenguinWeight = new JTextField();
		PenguinWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
			    PassWeight = Double.parseDouble(PenguinWeight.getText());
			}
		});
		PenguinWeight.setBounds(218, 227, 116, 24);
		PenguinWeight.setColumns(10);
		PenguinesPanel.add(PenguinWeight);
		
		txtTypeBloodPressure = new JTextField();
		txtTypeBloodPressure.setText("Type Blood Pressure");
		txtTypeBloodPressure.setBounds(37, 339, 147, 24);
		PenguinesPanel.add(txtTypeBloodPressure);
		txtTypeBloodPressure.setColumns(10);
		
		PenguinBlood = new JTextField();
		PenguinBlood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				PassBlood = Double.parseDouble(PenguinBlood.getText()); 
			}
		});
		PenguinBlood.setBounds(218, 339, 116, 24);
		PenguinesPanel.add(PenguinBlood);
		PenguinBlood.setColumns(10);
		
		txtTypeGps = new JTextField();
		txtTypeGps.setText("Type GPS");
		txtTypeGps.setBounds(68, 281, 116, 24);
		PenguinesPanel.add(txtTypeGps);
		txtTypeGps.setColumns(10);
		
		PenguinGPS = new JTextField();
		PenguinGPS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
//				PassSex = PenguinSex.getText();
			    PassGPS = PenguinGPS.getText();
			}
		});
		PenguinGPS.setBounds(218, 281, 116, 24);
		PenguinesPanel.add(PenguinGPS);
		PenguinGPS.setColumns(10);
		
		PenguinInvalidLabel = new JLabel("");
		PenguinInvalidLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		PenguinInvalidLabel.setBounds(434, 122, 165, 50);
		PenguinesPanel.add(PenguinInvalidLabel);
		
		ToSeaLionbtn = new JButton("Next ->");
		ToSeaLionbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				PassSpecies = PenguinSexBox.getSelectedItem().toString();
//				PassWeight = Double.parseDouble(PenguinWeight.getText());
//				PassBlood = Double.parseDouble(PenguinBlood.getText()); 
//				PassSex = PenguinSexBox.getSelectedItem().toString();
//			    PassGPS = PenguinGPS.getText();

//				System.out.println(PenguinWeight.getText().matches(regDouble));
//				System.out.println(PenguinBlood.getText().matches(regDouble));
//				System.out.println(PenguinGPS.getText().matches(regGps));
				if(PenguinWeight.getText().matches(regDouble) && PenguinBlood.getText().matches(regDouble) && PenguinGPS.getText().matches(regGps))
				{
					
					PassSpecies = PenguinSpeciesBox.getSelectedItem().toString();
					PassWeight = Double.parseDouble(PenguinWeight.getText());
					PassBlood = Double.parseDouble(PenguinBlood.getText()); 
					PassSex = PenguinSexBox.getSelectedItem().toString();
				    PassGPS = PenguinGPS.getText();
					
					
					StartPanel.setVisible(false);
					PenguinesPanel.setVisible(false);
					SeaLionsPanel.setVisible(true);
					WalrusPanel.setVisible(false);
					ReportPanel.setVisible(false);	
					
					
					controller.Object(PassSpecies, PassSex, PassWeight, PassBlood, PassGPS);
					controller.doWrite(controller.animal.toString());
					

				    

				}//end if
				else
				{
					PenguinInvalidLabel.setText("Invaild!! Type again.");
	
				}//end else
			}

		});
		ToSeaLionbtn.setBounds(494, 361, 105, 27);
		PenguinesPanel.add(ToSeaLionbtn);
		

		

		
		SeaLionsPanel = new JPanel();
		frame.getContentPane().add(SeaLionsPanel, "name_31337939451800");
		SeaLionsPanel.setLayout(null);
		
		txtSeaLions = new JTextField();
		txtSeaLions.setText("Sea Lions");
		txtSeaLions.setBounds(51, 53, 116, 24);
		SeaLionsPanel.add(txtSeaLions);
		txtSeaLions.setColumns(10);
		
//		SendingSealion = new JButton("Sending");
//		SendingSealion.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				if(SealionsWeight.getText().matches(regDouble) && SealionsSpots.getText().matches(regInt) && SealionsGPS.getText().matches(regGps))
//				{
//					control.Object(PassSex, PassWeight, PassSpots, PassGPS, PassSpecies);
//					control.doWrite(control.animal.toString());
//					ToWalrusbtn.setEnabled(true);
//				}//end if
//				else
//				{
//					ToWalrusbtn.setEnabled(false);
//				}//end else
//			}//end action1
//		});
//		SendingSealion.setBounds(522, 314, 105, 27);
//		SeaLionsPanel.add(SendingSealion);
		


		
		txtTypeSpecies = new JTextField();
		txtTypeSpecies.setText("Type Species");
		txtTypeSpecies.setBounds(77, 125, 116, 24);
		SeaLionsPanel.add(txtTypeSpecies);
		txtTypeSpecies.setColumns(10);
		
		SealionSpeciesBox = new JComboBox();
		SealionSpeciesBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {

		    PassSpecies = SealionSpeciesBox.getSelectedItem().toString();
		}
	});
		SealionSpeciesBox.setModel(new DefaultComboBoxModel(new String[] {"Steller Sealion", "California Sealion"}));
		SealionSpeciesBox.setBounds(217, 125, 177, 24);
		SeaLionsPanel.add(SealionSpeciesBox);
		
		txtTypeSex = new JTextField();
		txtTypeSex.setText("Type Sex");
		txtTypeSex.setBounds(77, 182, 116, 24);
		SeaLionsPanel.add(txtTypeSex);
		txtTypeSex.setColumns(10);
		
		SealionSexBox = new JComboBox();
		SealionSexBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

			    PassSex = SealionSexBox.getSelectedItem().toString();
			}
		});
		SealionSexBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		SealionSexBox.setBounds(217, 182, 116, 24);
		SeaLionsPanel.add(SealionSexBox);
		
		txtTypeWeight_1 = new JTextField();
		txtTypeWeight_1.setText("Type Weight");
		txtTypeWeight_1.setBounds(77, 239, 116, 24);
		SeaLionsPanel.add(txtTypeWeight_1);
		txtTypeWeight_1.setColumns(10);
		
		txtTtpeGps = new JTextField();
		txtTtpeGps.setText("Type GPS");
		txtTtpeGps.setBounds(77, 295, 116, 24);
		SeaLionsPanel.add(txtTtpeGps);
		txtTtpeGps.setColumns(10);
		
		txtTypeNumberOf = new JTextField();
		txtTypeNumberOf.setText("Type Number of Spots");
		txtTypeNumberOf.setBounds(32, 354, 161, 24);
		SeaLionsPanel.add(txtTypeNumberOf);
		txtTypeNumberOf.setColumns(10);
		
		SealionsWeight = new JTextField();
		SealionsWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			    PassWeight = Double.parseDouble(SealionsWeight.getText());
			}
		});
		SealionsWeight.setBounds(217, 239, 116, 24);
		SeaLionsPanel.add(SealionsWeight);
		SealionsWeight.setColumns(10);
		
		SealionsGPS = new JTextField();
		SealionsGPS.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    PassGPS = SealionsGPS.getText();
		}
	});
		SealionsGPS.setBounds(217, 295, 116, 24);
		SeaLionsPanel.add(SealionsGPS);
		SealionsGPS.setColumns(10);
		
		SealionsSpots = new JTextField();
		SealionsSpots.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			PassSpots = Integer.parseInt(SealionsSpots.getText());
		}
	});
		SealionsSpots.setBounds(217, 354, 116, 24);
		SeaLionsPanel.add(SealionsSpots);
		SealionsSpots.setColumns(10);
		
		SealionInvalidLabel = new JLabel("");
		SealionInvalidLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		SealionInvalidLabel.setBounds(450, 128, 177, 61);
		SeaLionsPanel.add(SealionInvalidLabel);
		
		ToWalrusbtn = new JButton("Next ->");
		ToWalrusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				PassSpecies = SealionSpeciesBox.getSelectedItem().toString();
//				PassWeight = Double.parseDouble(SealionsWeight.getText());
//				PassSpots = Integer.parseInt(SealionsSpots.getText());
//				PassSex = SealionSexBox.getSelectedItem().toString();
//			    PassGPS = SealionsGPS.getText();
				
				if(SealionsWeight.getText().matches(regDouble) && SealionsSpots.getText().matches(regInt) && SealionsGPS.getText().matches(regGps))
				{
					
					
					PassSpecies = SealionSpeciesBox.getSelectedItem().toString();
					PassWeight = Double.parseDouble(SealionsWeight.getText());
					PassSpots = Integer.parseInt(SealionsSpots.getText());
					PassSex = SealionSexBox.getSelectedItem().toString();
				    PassGPS = SealionsGPS.getText();

					StartPanel.setVisible(false);
					PenguinesPanel.setVisible(false);
					SeaLionsPanel.setVisible(false);
					WalrusPanel.setVisible(true);
					ReportPanel.setVisible(false);
					controller.Object(PassSpecies, PassSex, PassWeight, PassSpots, PassGPS);
					controller.doWrite(controller.animal.toString());
					
					

				}//end if
				else
				{
					SealionInvalidLabel.setText("Invaild!! Type again.");
				}//end else
			}//end action

		});//end listener
		ToWalrusbtn.setBounds(522, 353, 105, 27);
		SeaLionsPanel.add(ToWalrusbtn);
		

		


		
		WalrusPanel = new JPanel();
		frame.getContentPane().add(WalrusPanel, "name_31337958885700");
		WalrusPanel.setLayout(null);
		
		txtWalrus = new JTextField();
		txtWalrus.setText("Walrus");
		txtWalrus.setBounds(42, 47, 116, 24);
		WalrusPanel.add(txtWalrus);
		txtWalrus.setColumns(10);
		
		txtTypeSpeceis = new JTextField();
		txtTypeSpeceis.setText("Type Species");
		txtTypeSpeceis.setBounds(60, 107, 116, 24);
		WalrusPanel.add(txtTypeSpeceis);
		txtTypeSpeceis.setColumns(10);
		
		WalrusSpeciesBox = new JComboBox();
		WalrusSpeciesBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {

		    PassSpecies = WalrusSpeciesBox.getSelectedItem().toString();
		}
	});
		WalrusSpeciesBox.setModel(new DefaultComboBoxModel(new String[] {"Pacific Walrus", "Atlantic Walrus"}));
		WalrusSpeciesBox.setBounds(202, 107, 174, 24);
		WalrusPanel.add(WalrusSpeciesBox);
		
		txtTypeSex_1 = new JTextField();
		txtTypeSex_1.setText("Type Sex");
		txtTypeSex_1.setBounds(60, 157, 116, 24);
		WalrusPanel.add(txtTypeSex_1);
		txtTypeSex_1.setColumns(10);
		
		WalrusSexBox = new JComboBox();
		WalrusSexBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

			    PassSex = WalrusSexBox.getSelectedItem().toString();
			}
		});
		WalrusSexBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		WalrusSexBox.setBounds(202, 157, 116, 24);
		WalrusPanel.add(WalrusSexBox);
		
		txtTypeWeight_2 = new JTextField();
		txtTypeWeight_2.setText("Type Weight");
		txtTypeWeight_2.setBounds(60, 208, 116, 24);
		WalrusPanel.add(txtTypeWeight_2);
		txtTypeWeight_2.setColumns(10);
		
		txtTypeGps_1 = new JTextField();
		txtTypeGps_1.setText("Type GPS");
		txtTypeGps_1.setBounds(60, 263, 116, 24);
		WalrusPanel.add(txtTypeGps_1);
		txtTypeGps_1.setColumns(10);
		
		txtChooseDeatalStatus = new JTextField();
		txtChooseDeatalStatus.setText("Choose Dental Status");
		txtChooseDeatalStatus.setBounds(14, 319, 162, 24);
		WalrusPanel.add(txtChooseDeatalStatus);
		txtChooseDeatalStatus.setColumns(10);
		
		WalrusWeight = new JTextField();
		WalrusWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			    PassWeight = Double.parseDouble(WalrusWeight.getText());
			}
		});
		WalrusWeight.setBounds(202, 208, 116, 24);
		WalrusPanel.add(WalrusWeight);
		WalrusWeight.setColumns(10);
		
		WalrusGPS = new JTextField();
		WalrusGPS.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		    PassGPS = WalrusGPS.getText();
		}
	});
		WalrusGPS.setBounds(202, 263, 116, 24);
		WalrusPanel.add(WalrusGPS);
		WalrusGPS.setColumns(10);
		
		DentalBox = new JComboBox();
		DentalBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {

		    PassDental = DentalBox.getSelectedItem().toString();
		}
	});
		DentalBox.setModel(new DefaultComboBoxModel(new String[] {"Good", "Average", "Poor"}));
		DentalBox.setBounds(202, 319, 116, 24);
		WalrusPanel.add(DentalBox);
		
//		SendingWalrus = new JButton("Sending");
//		SendingWalrus.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg) {
//				if(WalrusWeight.getText().matches(regDouble) && WalrusGPS.getText().matches(regGps))
//				{
//					control.Object(PassSex, PassWeight, PassDental, PassGPS, PassSpecies);
//					control.doWrite(control.animal.toString());
//					ToReportbtn.setEnabled(true);
//				}//end if
//				else
//				{
//					ToReportbtn.setEnabled(false);
//				}//end else
//			}//end action
//		});
//		SendingWalrus.setBounds(525, 318, 105, 27);
//		WalrusPanel.add(SendingWalrus);
		

		
		WalrusInvalidLabel = new JLabel("");
		WalrusInvalidLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		WalrusInvalidLabel.setBounds(421, 110, 209, 49);
		WalrusPanel.add(WalrusInvalidLabel);
		

		
		ReportPanel = new JPanel();
		frame.getContentPane().add(ReportPanel, "name_31337981282300");
		ReportPanel.setLayout(null);
		
		Reporting = new JTextArea();
		Reporting.setBounds(14, 12, 695, 384);
		ReportPanel.add(Reporting);		
		ToReportbtn = new JButton("Next ->");
		ToReportbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				PassSpecies = WalrusSpeciesBox.getSelectedItem().toString();
//				PassWeight = Double.parseDouble(WalrusWeight.getText());
//				PassDental = DentalBox.getSelectedItem().toString();
//				PassSex = WalrusSexBox.getSelectedItem().toString();
//			    PassGPS = WalrusGPS.getText();
				
				if(WalrusWeight.getText().matches(regDouble) && WalrusGPS.getText().matches(regGps))
				{
					
					PassSpecies = WalrusSpeciesBox.getSelectedItem().toString();
					PassWeight = Double.parseDouble(WalrusWeight.getText());
					PassDental = DentalBox.getSelectedItem().toString();
					PassSex = WalrusSexBox.getSelectedItem().toString();
				    PassGPS = WalrusGPS.getText();
					
					StartPanel.setVisible(false);
					PenguinesPanel.setVisible(false);
					SeaLionsPanel.setVisible(false);
					WalrusPanel.setVisible(false);
					ReportPanel.setVisible(true);
					controller.Object(PassSpecies, PassSex, PassWeight, PassDental, PassGPS);
					controller.doWrite(controller.animal.toString());
					

				}//end if
				else
				{
					WalrusInvalidLabel.setText("Invaild!! Type again.");
				}//end else
			}//end action

		});//end btn
		ToReportbtn.setBounds(525, 357, 105, 27);
		WalrusPanel.add(ToReportbtn);
		

		

		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(392, 408, 105, 27);
		ReportPanel.add(btnQuit);
		
		btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				Reporting.append(controller.doRead());
			}
		});
		btnReport.setBounds(216, 408, 105, 27);
		ReportPanel.add(btnReport);
	}
}
