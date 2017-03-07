import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SlamBookStart extends JFrame implements MouseListener {

	public SlamBookStart() {
		setLayout(new BorderLayout());
		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/Slam.jpg")));
		add(bg);
		bg.setLayout(null);
		bg.addMouseListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Slambook-One of million reason to smile..");
		setSize(1366, 768);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setVisible(false);
		new OptionsSlambook();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}


