import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class EditSlamBook extends JFrame implements ActionListener {
	public EditSlamBook() {
		setLayout(new BorderLayout());
		final Choice cname = new Choice(), cfield = new Choice();
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
			ResultSet rs = con.createStatement().executeQuery("select * from Slampage");
			ResultSetMetaData md = rs.getMetaData();
			for (int fieldno = md.getColumnCount(), ¢ = 2; ¢ < fieldno; ++¢)
				cfield.add(md.getColumnName(¢));
			while (rs.next())
				cname.add(rs.getString("uniqueid"));
			con.close();
		} catch (Exception ¢) {
			// TODO Auto-generated catch block
			¢.printStackTrace();
		}

		JLabel lb = new JLabel("Choose name of person & field and upgrade answer in text box..");
		lb.setFont(new Font("Poor Richard", Font.BOLD, 26));
		final JTextField tv = new JTextField(300);
		JButton upgrade = new JButton("Update"), cancel = new JButton("Cancel");
		final JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/edit.jpg")));
		add(bg);
		bg.setLayout(null);
		lb.setBounds(10, 300, 900, 50);
		cname.setBounds(200, 400, 200, 30);
		cfield.setBounds(600, 400, 200, 30);
		upgrade.setBounds(450, 500, 100, 20);

		tv.setBounds(900, 400, 100, 20);
		cancel.setBounds(600, 500, 100, 20);
		bg.add(lb);
		bg.add(cname);
		bg.add(cfield);
		bg.add(tv);
		bg.add(upgrade);
		bg.add(cancel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("View slam..");
		setSize(1366, 768);
		setVisible(true);

		upgrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Variables.upname = cname.getSelectedItem();
				Variables.upfield = cfield.getSelectedItem();
				Variables.upvalue = tv.getText();
				try {

					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
					int s = con.createStatement().executeUpdate("update Slampage set " + Variables.upfield + " = '"
							+ Variables.upvalue + "' where uniqueid = '" + Variables.upname + "'");
					con.close();
					setVisible(false);
					new EditSlamBook();
					JOptionPane.showMessageDialog(null,
							Variables.upfield + " has been updated to " + Variables.upvalue + " successfully..");

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
				new OptionsSlambook();
			}

		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
