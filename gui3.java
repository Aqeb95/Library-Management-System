
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class gui3 {

	private JFrame frame;
	private JTextField textField;
	private JSeparator separator;
	private JButton btnSearch;
	private JSeparator separator_1;
	private JLabel lblResults;
	private JLabel lblNumberOfCopies;
	private JLabel lblNewLabel;
	private JButton returnbook;
	private JLabel lblSearch_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JSeparator separator_3;
	private JLabel lblBookHolder;
	private JLabel lblNewLabel_1;
	private JLabel numberofcopies;
	private JLabel available;
	private JLabel bookholder;
	private JButton showbooks;
	private JLabel biglabel;
	private JTextField textField_1;
	private JTextField textField_2;
	private JSeparator separator_2;
	private JLabel Wallpaper3;

	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui3 window = new gui3();
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
	public gui3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("Title");
		lblName.setBounds(34, 143, 44, 16);
		frame.getContentPane().add(lblName);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(90, 140, 207, 22);
		frame.getContentPane().add(textField);

		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setForeground(new Color(0, 0, 0));
		lblLibraryManagementSystem.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 22));
		lblLibraryManagementSystem.setBounds(232, 13, 395, 44);
		frame.getContentPane().add(lblLibraryManagementSystem);

		separator = new JSeparator();
		separator.setBounds(100, 44, 533, 2);
		frame.getContentPane().add(separator);

		btnSearch = new JButton("Search");
		btnSearch.setBounds(90, 164, 101, 34);
		frame.getContentPane().add(btnSearch);
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if (FileAccessor.available(textField.getText())>0){
						numberofcopies.setText(FileAccessor.available(textField.getText())+"");
						available.setText("Yes");
					}
					else{
						numberofcopies.setText("0");
						available.setText("No");
					}
				}
				catch(Exception d){
					
				}
			}
		});

		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(348, 44, 2, 487);
		frame.getContentPane().add(separator_1);

		lblResults = new JLabel("Results");
		lblResults.setForeground(new Color(0, 0, 51));
		lblResults.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblResults.setBounds(362, 83, 86, 34);
		frame.getContentPane().add(lblResults);

		lblNumberOfCopies = new JLabel("Number Of Copies :");
		lblNumberOfCopies.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumberOfCopies.setBounds(362, 200, 130, 22);
		frame.getContentPane().add(lblNumberOfCopies);

		lblNewLabel = new JLabel("Available :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(362, 237, 77, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(568, 418, 130, 22);
		frame.getContentPane().add(spinner);

		returnbook = new JButton("Return Book");
		returnbook.setBounds(579, 305, 130, 69);
		frame.getContentPane().add(returnbook);
		returnbook.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					FileAccessor.returnBook(textField_1.getText(), textField_2.getText());
					numberofcopies.setText(FileAccessor.available(textField_2.getText())+"");
					available.setText("Yes");
				}
				catch(Exception d){
					
				}
			}
		});

		lblSearch_1 = new JLabel("Search");
		lblSearch_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblSearch_1.setForeground(new Color(0, 0, 51));
		lblSearch_1.setBounds(12, 85, 168, 30);
		frame.getContentPane().add(lblSearch_1);

		btnNewButton_1 = new JButton("Request");
		btnNewButton_1.setBounds(568, 465, 130, 34);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if (textField.getText().length() >1 && (int)spinner.getValue() >= 1){
						biglabel.setText((int)spinner.getValue()+" "+textField.getText()+" requested!");
					}
					else{
						biglabel.setText("Unable to request book");
					}
				}
				catch(Exception d){
					
				}
			}
		});

		lblNewLabel_2 = new JLabel("Request To Purchase : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(363, 424, 168, 22);
		frame.getContentPane().add(lblNewLabel_2);

		separator_3 = new JSeparator();
		separator_3.setBounds(349, 113, 372, 2);
		frame.getContentPane().add(separator_3);

		lblBookHolder = new JLabel("Book Holder:");
		lblBookHolder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBookHolder.setBounds(362, 276, 86, 16);
		frame.getContentPane().add(lblBookHolder);
		
		lblNewLabel_1 = new JLabel("Admin Logged In");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 44, 130, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		numberofcopies = new JLabel("");
		numberofcopies.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 15));
		numberofcopies.setBounds(497, 200, 130, 16);
		frame.getContentPane().add(numberofcopies);
		
		available = new JLabel("");
		available.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 15));
		available.setBounds(507, 231, 108, 22);
		frame.getContentPane().add(available);
		
		bookholder = new JLabel("");
		bookholder.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 15));
		bookholder.setBounds(497, 270, 108, 22);
		frame.getContentPane().add(bookholder);
		
		showbooks = new JButton("Show Books");
		showbooks.setBounds(135, 117, 115, 22);
		frame.getContentPane().add(showbooks);
		showbooks.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					biglabel.setText("<html>"+FileAccessor.books()+"</html>");
				}
				catch(Exception d){
				}
			}
		});
		
		biglabel = new JLabel();
		biglabel.setVerticalAlignment(SwingConstants.TOP);
		biglabel.setBounds(12, 211, 338, 301);
		frame.getContentPane().add(biglabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(431, 305, 139, 34);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(431, 340, 139, 34);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("User ID :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(362, 305, 68, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Book :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(362, 340, 68, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Search User");
		btnNewButton.setBounds(189, 164, 108, 34);
		frame.getContentPane().add(btnNewButton);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(0, 113, 350, 2);
		frame.getContentPane().add(separator_2);
		
		Wallpaper3 = new JLabel("New label");
		Wallpaper3.setIcon(new ImageIcon("C:\\Users\\Aqeb Hamdan\\Downloads\\1390455025_nice_abstract_background.png"));
		Wallpaper3.setBounds(0, 0, 721, 512);
		frame.getContentPane().add(Wallpaper3);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				try{
					if (FileAccessor.alreadyUser(textField.getText())){
						biglabel.setText("<html>"+FileAccessor.getBooks(textField.getText())+"</html>");
					}
					else{
						biglabel.setText("Not a user");
					}
				}
				catch(Exception d){
					
				}
			}
		});
	}
}
