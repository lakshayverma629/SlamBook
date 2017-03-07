import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class OptionsSlambook extends JFrame implements ActionListener {
	JButton add;
	JButton view;
	JButton delete;
	JButton update;
	JButton exit;

	public OptionsSlambook() {
		setLayout(new BorderLayout());

		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/gobg.jpg")));
		add(bg);
		bg.setLayout(null);

		ImageIcon ladd = new ImageIcon(this.getClass().getResource("/ladd.jpg")),
				lview = new ImageIcon(this.getClass().getResource("/lview.jpg")),
				ldelete = new ImageIcon(this.getClass().getResource("/ldelete.jpg")),
				lupdate = new ImageIcon(this.getClass().getResource("/lupdate.jpg")),
				lexit = new ImageIcon(this.getClass().getResource("/lexit.jpg"));
		add = new JButton("", ladd);
		view = new JButton("", lview);
		delete = new JButton("", ldelete);
		update = new JButton("", lupdate);
		exit = new JButton("", lexit);

		add.setBounds(32, 32, 217, 704);
		view.setBounds(292, 32, 217, 704);
		update.setBounds(552, 32, 217, 704);
		delete.setBounds(812, 32, 217, 704);
		exit.setBounds(1072, 32, 217, 704);

		bg.add(add);
		bg.add(view);
		bg.add(delete);
		bg.add(update);
		bg.add(exit);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Make your choice..");
		setSize(1366, 768);
		setVisible(true);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				new Questions();
			}
		});
		view.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Chose();
				setVisible(false);
			}
		});
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Variables.editorselete = 10;
				new Login();
				setVisible(false);
			}
		});

		update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Variables.editorselete = 5;
				new Login();
				setVisible(false);
			}
		});

		exit.addActionListener(new ActionListener() {

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
