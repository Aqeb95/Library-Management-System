import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.ImageIcon;

import java.awt.Window.Type; //imports*/


public class GUI {

	private JFrame frame;
	private JFrame frame2;
	
	private JTextField textField;
	
	private JTextField signUpID;
	private JPasswordField signUpPass;

	private JTextField frigginImportant;
	private JPasswordField alsoFrigginImportant;
	private JTextField passwordField_2;
	private JTextField passwordField_3;
	private JTextField passwordField_4;
	
	private JLabel LabelMessage;
	
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton showbooks;
	private JSeparator separator;
	private JButton btnSearch;
	private JSeparator separator_1;
	private JLabel lblResults;
	private JLabel lblNumberOfCopies;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblSearch_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JLabel lblIssueTheBook;
	private JLabel lblPublisher;
	private JTextField textField_3;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JLabel numberofcopies;
	private JLabel available;
	private JLabel signuplabel;
	private JLabel biglabel;
	private JLabel Wallpaper2;
	//devin
	private JPanel panel1;
	private JPanel panel2;
	private String adminID = "000";
	private String adminPass = "admin";
	private String ID;
	private String pass;
	

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
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

	/*
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Agency FB", Font.PLAIN, 14));
		frame.setBounds(100, 100, 504, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		


		JLabel lblNewLabel = new JLabel("Library Management System ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		lblNewLabel.setBounds(129, 13, 264, 24);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblSignIn = new JLabel("Sign In");
		lblSignIn.setForeground(new Color(0, 0, 51));
		lblSignIn.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		lblSignIn.setBounds(88, 50, 75, 24);
		frame.getContentPane().add(lblSignIn);

		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setForeground(new Color(0, 0, 51));
		lblSignUp.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		lblSignUp.setBounds(352, 50, 68, 24);
		frame.getContentPane().add(lblSignUp);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(245, 34, 2, 347);
		frame.getContentPane().add(separator);

		JLabel lblUsername = new JLabel("I.D. Number");
		lblUsername.setBounds(12, 87, 75, 24);
		frame.getContentPane().add(lblUsername);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(259, 91, 44, 16);
		frame.getContentPane().add(lblName);

		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(259, 120, 34, 24);
		frame.getContentPane().add(lblAge);

		JLabel lblNewLabel_1 = new JLabel("Sex");
		lblNewLabel_1.setBounds(259, 157, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblContactNumber = new JLabel("Email I.D.");
		lblContactNumber.setBounds(259, 185, 63, 16);
		frame.getContentPane().add(lblContactNumber);

		JLabel lblUsername_1 = new JLabel("I.D. Number");
		lblUsername_1.setBounds(259, 214, 75, 24);
		frame.getContentPane().add(lblUsername_1);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(259, 251, 77, 16);
		frame.getContentPane().add(lblPassword);

		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(12, 157, 75, 16);
		frame.getContentPane().add(lblPassword_1);

		frigginImportant = new JTextField();
		frigginImportant.setBounds(88, 94, 116, 19);
		frame.getContentPane().add(frigginImportant);
		//textField.setColumns(10);

		signUpPass = new JPasswordField();
		signUpPass.setBounds(330, 251, 116, 19);
		frame.getContentPane().add(signUpPass);

		alsoFrigginImportant = new JPasswordField();
		alsoFrigginImportant.setBounds(88, 154, 116, 19);
		frame.getContentPane().add(alsoFrigginImportant);
		

		passwordField_2 = new JTextField();
		passwordField_2.setBounds(330, 88, 116, 19);
		frame.getContentPane().add(passwordField_2);

		passwordField_3 = new JTextField();
		passwordField_3.setBounds(330, 121, 116, 19);
		frame.getContentPane().add(passwordField_3);

		passwordField_4 = new JTextField();
		passwordField_4.setBounds(330, 182, 116, 19);
		frame.getContentPane().add(passwordField_4);

		signUpID = new JTextField();
		signUpID.setBounds(330, 215, 116, 19);
		frame.getContentPane().add(signUpID);
		
		signuplabel = new JLabel("");
		signuplabel.setForeground(Color.RED);
		signuplabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		signuplabel.setBounds(302, 358, 133, 16);
		frame.getContentPane().add(signuplabel);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(new Color(51, 204, 204));
		rdbtnMale.setBounds(323, 153, 63, 25);
		frame.getContentPane().add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(51, 204, 204));
		rdbtnFemale.setBounds(385, 153, 84, 25);
		frame.getContentPane().add(rdbtnFemale);

		JButton btnSignIn = new JButton("Sign In !");
		btnSignIn.setBackground(new Color(51, 204, 204));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ID = frigginImportant.getText();
				pass = alsoFrigginImportant.getText();
				
				try {
					if (e.getSource()==btnSignIn){//add code here to determine if the user exists, or if admin credentials are entered
						
						if (ID.length()==3 && pass.length()>=1) {
							//call FileAccessor
							if (adminID.equals(ID)&&adminPass.equals(pass)) {
								frame.setVisible(false);
								frame2.setVisible(false);
								gui3.init();
								
								
							}
							else if (FileAccessor.correctPassword(ID, pass)) {
								frame.setVisible(false);
								frame2.setVisible(true);
							}
							else {
								LabelMessage.setText("Incorrect information");
							}
						}
					}
				}
						
				catch (Exception d) {
					
				}
			}
				
			}
		);
		btnSignIn.setBounds(71, 320, 97, 25);
		frame.getContentPane().add(btnSignIn);

		JButton btnSignUp = new JButton("Sign Up !");
		btnSignUp.setBackground(new Color(51, 204, 204));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = signUpID.getText();
				pass = signUpPass.getText();
				try {
					if (!FileAccessor.alreadyUser(ID)) {
						if (pass.length()>=4) {
							FileAccessor.newUser(ID, pass);
							frame.setVisible(false);
							frame2.setVisible(true);
						}
					}
					else
						signuplabel.setText("User ID already taken!");
				}
				catch (Exception d) {
					
				}
				
			}
		});
		btnSignUp.setBounds(323, 320, 97, 25);
		frame.getContentPane().add(btnSignUp);

		JLabel lblNoteOnlyLetters = new JLabel("Note: Use only letters for password.");
		lblNoteOnlyLetters.setBounds(259, 280, 210, 24);
		frame.getContentPane().add(lblNoteOnlyLetters);

	    LabelMessage = new JLabel("");
	    LabelMessage.setForeground(Color.RED);
		LabelMessage.setBounds(71, 358, 133, 16);
		frame.getContentPane().add(LabelMessage);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(51, 204, 204));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Aqeb Hamdan\\Downloads\\cross_remove_no_image_delete_exit.png"));
		lblNewLabel_2.setBounds(58, 199, 131, 108);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 34, 431, 3);
		frame.getContentPane().add(separator_1);
		
		JLabel lblIdCanConsist = new JLabel("ID can consist only 3 digits.");
		lblIdCanConsist.setBounds(302, 302, 165, 16);
		frame.getContentPane().add(lblIdCanConsist);
		
		JLabel wallpaper = new JLabel("New label");
		wallpaper.setIcon(new ImageIcon("C:\\Users\\Aqeb Hamdan\\Downloads\\1390455025_nice_abstract_background.png"));
		wallpaper.setBounds(0, 0, 490, 381);
		frame.getContentPane().add(wallpaper);
		
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 739, 559);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

	

		JLabel lblName2 = new JLabel("Title");
		lblName2.setBounds(24, 141, 44, 16);
		frame2.getContentPane().add(lblName2);

		textField = new JTextField();
		textField.setBounds(80, 138, 199, 22);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);


		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setForeground(new Color(0, 0, 0));
		lblLibraryManagementSystem.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 22));
		lblLibraryManagementSystem.setBounds(232, 13, 395, 44);
		frame2.getContentPane().add(lblLibraryManagementSystem);

		separator = new JSeparator();
		separator.setBounds(99, 44, 534, 2);
		frame2.getContentPane().add(separator);

		btnSearch = new JButton("Search");
		btnSearch.setBounds(115, 159, 130, 34);
		frame2.getContentPane().add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if (FileAccessor.available(textField.getText())>0) {
						
						numberofcopies.setText(FileAccessor.available(textField.getText())+"");
						numberofcopies.setVisible(true);
						available.setText("Yes");
						available.setVisible(true);
					}
					else {
						numberofcopies.setText(FileAccessor.available(textField.getText())+"");
						numberofcopies.setVisible(true);
						available.setText("No");
						available.setVisible(true);
					}
				}
				catch(Exception d) {
					
				}
			}
		});

		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(348, 44, 2, 487);
		frame2.getContentPane().add(separator_1);

		lblResults = new JLabel("Results");
		lblResults.setForeground(new Color(0, 0, 51));
		lblResults.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblResults.setBounds(362, 83, 86, 34);
		frame2.getContentPane().add(lblResults);

		lblNumberOfCopies = new JLabel("Number of copies :");
		lblNumberOfCopies.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumberOfCopies.setBounds(362, 196, 130, 22);
		frame2.getContentPane().add(lblNumberOfCopies);

		lblNewLabel = new JLabel("Available :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(362, 241, 77, 16);
		frame2.getContentPane().add(lblNewLabel);

		btnNewButton = new JButton("Sign Out Book");
		btnNewButton.setBounds(527, 396, 130, 34);
		frame2.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if (FileAccessor.available(textField.getText())>0){
						FileAccessor.signOutBook(ID, textField.getText());
						available.setText("Book signed out");
						numberofcopies.setText(FileAccessor.available(textField.getText())+"");
					}
					else
						available.setText("Book is not in stock!");
				}
				catch (Exception d){
					
				}
			}
		});

		lblSearch_1 = new JLabel("Search");
		lblSearch_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSearch_1.setForeground(new Color(0, 0, 51));
		lblSearch_1.setBounds(12, 85, 168, 30);
		frame2.getContentPane().add(lblSearch_1);
		
		biglabel = new JLabel();
		biglabel.setVerticalAlignment(SwingConstants.TOP);
		biglabel.setBounds(12, 211, 338, 301);
		frame2.getContentPane().add(biglabel);

		btnNewButton_1 = new JButton("Request");
		btnNewButton_1.setBounds(527, 348, 130, 34);
		frame2.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!(FileAccessor.available(textField.getText())>0)){
						FileAccessor.requestBook(ID, textField.getText());
						available.setText("Book requested");
					}
					else{
						available.setText("Book is in stock!");
					}
				}
				catch (Exception d){
					
				}
			}
		});
		lblNewLabel_2 = new JLabel("Request To Purchase : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(362, 348, 155, 22);
		frame2.getContentPane().add(lblNewLabel_2);

		separator_2 = new JSeparator();
		separator_2.setBounds(0, 113, 350, 7);
		frame2.getContentPane().add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setBounds(348, 113, 373, 2);
		frame2.getContentPane().add(separator_3);
		
		numberofcopies = new JLabel("");
		numberofcopies.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
		numberofcopies.setBounds(501, 200, 77, 16);
		frame2.getContentPane().add(numberofcopies);
		
		showbooks = new JButton("Show Books");
		showbooks.setBounds(116, 118, 130, 22);
		frame2.getContentPane().add(showbooks);
		showbooks.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					biglabel.setText("<html>"+FileAccessor.books()+"</html>");
				}
				catch(Exception d){
				}
			}
		});
		
		available = new JLabel("");
		available.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
		available.setBounds(489, 235, 108, 22);
		frame2.getContentPane().add(available);
		
		Wallpaper2 = new JLabel("New label");
		Wallpaper2.setIcon(new ImageIcon("C:\\Users\\Aqeb Hamdan\\Downloads\\1390455025_nice_abstract_background.png"));
		Wallpaper2.setBounds(0, 0, 721, 512);
		frame2.getContentPane().add(Wallpaper2);
		
	}
}
