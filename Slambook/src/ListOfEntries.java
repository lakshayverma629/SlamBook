import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Chose extends JFrame implements ActionListener {
	public Chose() {
		setLayout(new BorderLayout());

		JLabel text = new JLabel("Choose the person you want to see in slam book and click view....");
		text.setFont(new Font("Mistral", Font.BOLD, 45));
		final Choice ch = new Choice();
		JButton views = new JButton("View"), can = new JButton("Cancel");
		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/match.jpg")));
		add(bg);
		bg.setLayout(null);

		text.setBounds(10, 100, 1300, 100);
		ch.setBounds(400, 300, 300, 100);
		views.setBounds(450, 400, 80, 20);
		can.setBounds(600, 400, 80, 20);

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			for (ResultSet ¢ = DriverManager.getConnection("jdbc:odbc:Slambook", "", "").createStatement()
					.executeQuery("select * from Slampage"); ¢.next();)
				ch.add(¢.getString("uniqueid"));
		} catch (Exception ¢) {
			// TODO Auto-generated catch block
			¢.printStackTrace();
		}

		bg.add(text);
		bg.add(ch);
		bg.add(views);
		bg.add(can);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("View slam..");
		setSize(1366, 768);
		setVisible(true);

		views.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Variables.apname = ch.getSelectedItem();
				new ViewSlamBook1();
				setVisible(false);
			}
		});
		can.addActionListener(new ActionListener() {

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