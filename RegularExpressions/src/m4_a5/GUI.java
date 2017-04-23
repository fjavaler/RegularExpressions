/********************************************************
 *
 *  Project :  Regular Expressions
 *  File    :  GUI
 *  Name    :  Frederick Javalera
 *  Date    :  3-20-2017 (due date: 3-22-2017)
 *
 *  Description : (Narrative description, not code)
 *
 *    1) What is the purpose of the code; what problem does the code solve.
 *    This code creates a GUI with text fields which verifies whether the values entered
 *    are in accordance with its corresponding regex validator from Validator.java.
 *
 *    2) What data-structures are used.
 *    JFrame, JTextFields, and JComboBox.
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *	  actionListeners
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  <Description|date of modifications>
 *
 ********************************************************/
package m4_a5;

//test
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class creates and displays a GUI interface containing
 * JTextFileds for data entry by the user. The user can then
 * check if the input is valid by pressing the enter button.
 * 
 * @author Frederick Javalera
 */
public class GUI
{

	//fields
	private JFrame frmRegularExpressions;
	private JTextField firstTxt;
	private JTextField addressTxt;
	private JTextField phoneTxt;
	private JTextField emailTxt;
	private JTextField lastTxt;
	private JTextField cityTxt;
	private JTextField zipTxt;

	// String to hold states for combo box.
	private String[] states = new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
			"Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
			"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
			"Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
			"North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
			"South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
			"West Virginia", "Wisconsin", "Wyoming" };

	/****************************************************
	 * Method     : Main
	 *
	 * Purpose    : The Main method creates and displays the GUI.
	 * It also listens for keys being pressed.
	 *
	 * Parameters : args               - an array of Strings
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUI window = new GUI();
					window.frmRegularExpressions.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI()
	{
		initialize();
	}

	/****************************************************
	 * Method     : Initialize
	 *
	 * Purpose    : The Initialize method initiates the creation
	 * of the GUI and contains actionListeners through anonymous
	 * classes.
	 *
	 * Parameters : None.
	 *
	 * Returns    : This method does not return a value.
	 *
	 ****************************************************/
	private void initialize()
	{
		frmRegularExpressions = new JFrame();
		frmRegularExpressions.setTitle("Regular Expressions");
		frmRegularExpressions.getContentPane().setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		frmRegularExpressions.getContentPane().setBackground(new Color(153, 204, 255));
		frmRegularExpressions.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("First Name:");
		lblName.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblName.setForeground(Color.WHITE);
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(6, 33, 110, 16);
		frmRegularExpressions.getContentPane().add(lblName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(6, 80, 110, 16);
		frmRegularExpressions.getContentPane().add(lblAddress);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setBounds(6, 165, 110, 16);
		frmRegularExpressions.getContentPane().add(lblPhone);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(6, 210, 110, 16);
		frmRegularExpressions.getContentPane().add(lblEmail);

		firstTxt = new JTextField();
		firstTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String firstName = firstTxt.getText();
					if (!Validator.validateFirstName(firstName))
					{
						JOptionPane.showMessageDialog(null, "Invalid first name.", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		firstTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		firstTxt.setBounds(128, 29, 120, 26);
		frmRegularExpressions.getContentPane().add(firstTxt);
		firstTxt.setColumns(10);

		addressTxt = new JTextField();
		addressTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String address = addressTxt.getText();
					if (!Validator.validateAddress(address))
					{
						JOptionPane.showMessageDialog(null, "Invalid address.", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		addressTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		addressTxt.setColumns(10);
		addressTxt.setBounds(128, 76, 300, 26);
		frmRegularExpressions.getContentPane().add(addressTxt);

		phoneTxt = new JTextField();
		phoneTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String phone = phoneTxt.getText();
					if (!Validator.validatePhone(phone))
					{
						JOptionPane.showMessageDialog(null, "Invalid phone number.", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		phoneTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		phoneTxt.setColumns(10);
		phoneTxt.setBounds(128, 161, 300, 26);
		frmRegularExpressions.getContentPane().add(phoneTxt);

		emailTxt = new JTextField();
		emailTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String email = emailTxt.getText();
					if (!Validator.validateEmail(email))
					{
						JOptionPane.showMessageDialog(null, "Invalid email address.", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		emailTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		emailTxt.setColumns(10);
		emailTxt.setBounds(128, 206, 300, 26);
		frmRegularExpressions.getContentPane().add(emailTxt);

		JLabel lblValidator = new JLabel("Validator");
		lblValidator.setForeground(new Color(0, 153, 255));
		lblValidator.setFont(new Font("Chalkboard", Font.BOLD | Font.ITALIC, 55));
		lblValidator.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidator.setBounds(123, 229, 300, 70);
		frmRegularExpressions.getContentPane().add(lblValidator);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(260, 34, 90, 16);
		frmRegularExpressions.getContentPane().add(lblLastName);

		lastTxt = new JTextField();
		lastTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String lastName = lastTxt.getText();
					if (!Validator.validateLastName(lastName))
					{
						JOptionPane.showMessageDialog(null, "Invalid last name", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		lastTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		lastTxt.setBounds(362, 29, 130, 26);
		frmRegularExpressions.getContentPane().add(lastTxt);
		lastTxt.setColumns(10);

		JLabel lblCity = new JLabel("City:");
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setBounds(15, 122, 40, 16);
		frmRegularExpressions.getContentPane().add(lblCity);

		cityTxt = new JTextField();
		cityTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String city = cityTxt.getText();
					if (!Validator.validateCity(city))
					{
						JOptionPane.showMessageDialog(null, "Invalid city name.", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		cityTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		cityTxt.setBounds(67, 118, 130, 26);
		frmRegularExpressions.getContentPane().add(cityTxt);
		cityTxt.setColumns(10);

		JLabel lblState = new JLabel("State:");
		lblState.setForeground(Color.WHITE);
		lblState.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setBounds(205, 122, 41, 16);
		frmRegularExpressions.getContentPane().add(lblState);

		JComboBox<String> stateComboBox = new JComboBox<String>();
		for(String state : states)
		{
			stateComboBox.addItem(state);
		}
		stateComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		stateComboBox.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		stateComboBox.setBounds(255, 118, 100, 27);
		frmRegularExpressions.getContentPane().add(stateComboBox);

		JLabel lblZip = new JLabel("Zip:");
		lblZip.setFont(new Font("Noto Sans UI", Font.PLAIN, 15));
		lblZip.setForeground(Color.WHITE);
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setBounds(360, 122, 33, 16);
		frmRegularExpressions.getContentPane().add(lblZip);

		zipTxt = new JTextField();
		zipTxt.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == 10)
				{
					String zip = zipTxt.getText();
					if (!Validator.validateZip(zip))
					{
						JOptionPane.showMessageDialog(null, "Invalid zip code.", "Invalid Input Received",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		zipTxt.setFont(new Font("Noto Sans UI", Font.PLAIN, 13));
		zipTxt.setBounds(405, 118, 107, 26);
		frmRegularExpressions.getContentPane().add(zipTxt);
		zipTxt.setColumns(10);
		frmRegularExpressions.setBounds(100, 100, 550, 350);
		frmRegularExpressions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegularExpressions.setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		frmRegularExpressions.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Noto Sans UI", Font.PLAIN, 14));
		menuBar.add(mnFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		mntmExit.setFont(new Font("Noto Sans UI", Font.PLAIN, 14));
		mntmExit.setIcon(new ImageIcon(GUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Noto Sans UI", Font.PLAIN, 14));
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setFont(new Font("Noto Sans UI", Font.PLAIN, 14));
		mntmAbout.setIcon(new ImageIcon(GUI.class.getResource("/about.png")));
		mnHelp.add(mntmAbout);
	}
}
