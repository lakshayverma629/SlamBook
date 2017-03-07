import java.awt.BorderLayout;
import java.awt.Choice;
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

class DeleteSlamBook extends JFrame {
	public DeleteSlamBook() {
		setLayout(new BorderLayout());

		final Choice ch = new Choice();

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
			for (ResultSet ¢ = con.createStatement().executeQuery("select * from Slampage"); ¢.next();)
				ch.add(¢.getString("uniqueid"));
			con.close();
		} catch (Exception ¢) {
			// TODO Auto-generated catch block
			¢.printStackTrace();
		}

		JLabel text = new JLabel("Choose and press delete..");
		text.setFont(new Font("Kristen ITC", Font.BOLD, 45));

		JButton delete = new JButton("Delete"), cane = new JButton("Cancel");
		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/delete.jpg")));
		add(bg);
		bg.setLayout(null);

		text.setBounds(10, 100, 1300, 100);
		ch.setBounds(400, 300, 300, 100);
		delete.setBounds(450, 400, 80, 20);
		cane.setBounds(600, 400, 80, 20);
		bg.add(text);
		bg.add(ch);
		bg.add(delete);
		bg.add(cane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("View slam..");
		setSize(1366, 768);
		setVisible(true);

		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Variables.delname = ch.getSelectedItem();

				try {
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
					int s = con.createStatement()
							.executeUpdate("delete from Slampage where uniqueid='" + Variables.delname + "'");
					con.close();
					setVisible(false);
					new DeleteSlamBook();
					JOptionPane.showMessageDialog(null,
							Variables.delname + " has been deleted successfully from Slampage..");

				} catch (Exception ¢) {
					// TODO Auto-generated catch block
					¢.printStackTrace();
				}

			}

		});
		cane.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				new OptionsSlambook();
			}
		});
	}
}
