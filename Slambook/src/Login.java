import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Login extends JFrame implements ActionListener {
	public Login() {

		JLabel lusername = new JLabel("Enter owners name:"), lpassword = new JLabel("Enter password:");
		final JTextField username = new JTextField(20), password = new JTextField(50);
		JButton login = new JButton("Login"), cancel = new JButton("Cancel");
		final JLabel wrong = new JLabel("Please enter write password");

		Font fm = new Font("OCR A Std", Font.BOLD, 23);

		lusername.setFont(fm);
		lpassword.setFont(fm);
		setLayout(new BorderLayout());

		final JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/match.jpg")));
		add(bg);
		bg.setLayout(null);

		lusername.setBounds(400, 300, 300, 30);
		lpassword.setBounds(400, 400, 300, 30);
		username.setBounds(700, 300, 200, 30);
		password.setBounds(700, 400, 200, 30);
		login.setBounds(500, 500, 80, 20);
		cancel.setBounds(700, 500, 80, 20);
		wrong.setBounds(600, 600, 200, 30);
		bg.add(lusername);
		bg.add(lpassword);
		bg.add(username);
		bg.add(password);
		bg.add(login);
		bg.add(cancel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Authentification..");
		setSize(1366, 768);
		setVisible(true);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String user = username.getText(), pass = password.getText();
				try {
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
					for (ResultSet ¢ = con.createStatement().executeQuery("select * from owner_table"); ¢.next();)
						if (!user.equals(¢.getString("owner")) || !pass.equals(¢.getString("password")))
							JOptionPane.showMessageDialog(null, "Invalid username or password");
						else {
							if (Variables.editorselete == 10)
								new DeleteSlamBook();
							if (Variables.editorselete == 5)
								new EditSlamBook();
							setVisible(false);
						}
					con.close();
				} catch (Exception ¢) {
					// TODO Auto-generated catch block
					¢.printStackTrace();
				}

			}

		});
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}

		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
