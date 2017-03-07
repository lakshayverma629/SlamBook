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

class ViewSlamBook2 extends JFrame implements ActionListener {
	JLabel passion;
	JLabel hangoutplaces;
	JLabel actor;
	JLabel music;
	JLabel unfrgtmnt;
	JLabel couple;
	JLabel scariest;
	JLabel silliest;
	JLabel happiest;
	JLabel worst;
	JLabel motto;
	JLabel punch;
	JLabel hobbies;
	JLabel actress;
	JLabel crush;
	JLabel ucallme;

	JLabel lpassion;
	JLabel lhangoutplaces;
	JLabel lactor;
	JLabel lmusic;
	JLabel lunfrgtmnt;
	JLabel lcouple;
	JLabel lscariest;
	JLabel lsilliest;
	JLabel lhappiest;
	JLabel lworst;
	JLabel lmotto;
	JLabel lpunch;
	JLabel lhobbies;
	JLabel lactress;
	JLabel lcrush;
	JLabel lucallme;
	JButton ok;
	JButton back;

	public ViewSlamBook2() {
		Font f = new Font("Viner Hand ITC", Font.BOLD, 30), l = new Font("Lucida Handwriting", Font.PLAIN, 20);
		setLayout(new BorderLayout());

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
			for (ResultSet ¢ = con.createStatement().executeQuery("select * from Slampage"); ¢.next();) {
				Variables.rspassion = ¢.getString("passion");
				if (Variables.apname.equals(¢.getString("uniqueid"))) {
					Variables.rshangoutplaces = ¢.getString("hangoutplaces");
					Variables.rsactor = ¢.getString("actor");
					Variables.rsmusic = ¢.getString("music");
					Variables.rsunfrgtmnt = ¢.getString("unfrgtmnt");
					Variables.rscouple = ¢.getString("couple");
					Variables.rsscariest = ¢.getString("scariest");
					Variables.rssilliest = ¢.getString("silliest");
					Variables.rshappiest = ¢.getString("happiest");
					Variables.rsworst = ¢.getString("worst");
					Variables.rsmotto = ¢.getString("motto");
					Variables.rspunch = ¢.getString("punch");
					Variables.rshobbies = ¢.getString("hobbies");
					Variables.rsactress = ¢.getString("actress");
					Variables.rscrush = ¢.getString("crush");
					Variables.rsucallme = ¢.getString("ucallme");
					con.close();
				}
			}
		} catch (Exception ¢) {
			// TODO Auto-generated catch block
			¢.printStackTrace();
		}

		passion = new JLabel(Variables.rspassion);
		hangoutplaces = new JLabel(Variables.rshangoutplaces);
		actor = new JLabel(Variables.rsactor);
		music = new JLabel(Variables.rsmusic);
		unfrgtmnt = new JLabel(Variables.rsunfrgtmnt);
		couple = new JLabel(Variables.rscouple);
		scariest = new JLabel(Variables.rsscariest);
		silliest = new JLabel(Variables.rssilliest);
		happiest = new JLabel(Variables.rshappiest);
		worst = new JLabel(Variables.rsworst);
		motto = new JLabel(Variables.rsmotto);
		punch = new JLabel(Variables.rspunch);
		hobbies = new JLabel(Variables.rshobbies);
		actress = new JLabel(Variables.rsactress);
		crush = new JLabel(Variables.rscrush);
		ucallme = new JLabel(Variables.rsucallme);

		lpassion = new JLabel("My passion:");
		lhangoutplaces = new JLabel("Hangout places:");
		lactor = new JLabel("Favourite actor:");
		lmusic = new JLabel("Music I tap my feet to:");
		lunfrgtmnt = new JLabel("Most unforgettable moment:");
		lcouple = new JLabel("Best couple(real or fictional):");
		lscariest = new JLabel("Scariest thing for me:");
		lsilliest = new JLabel("Silliest thing I had ever done:");
		lhappiest = new JLabel("Happiest day of my life:");
		lworst = new JLabel("Worst day of my life:");
		lmotto = new JLabel("Motto of my life:");
		lpunch = new JLabel("My punch line:");
		lhobbies = new JLabel("Hobbies:");
		lactress = new JLabel("Favourite actress:");
		lcrush = new JLabel("My crush is:");
		lucallme = new JLabel("You can call me:");
		ok = new JButton("Ok");
		back = new JButton("Back");

		passion.setFont(l);
		hangoutplaces.setFont(l);
		actor.setFont(l);
		music.setFont(l);
		unfrgtmnt.setFont(l);
		couple.setFont(l);
		scariest.setFont(l);
		silliest.setFont(l);
		happiest.setFont(l);
		worst.setFont(l);
		motto.setFont(l);
		punch.setFont(l);
		hobbies.setFont(l);
		actress.setFont(l);
		crush.setFont(l);
		ucallme.setFont(l);

		lpassion.setFont(f);
		lhangoutplaces.setFont(f);
		lactor.setFont(f);
		lmusic.setFont(f);
		lunfrgtmnt.setFont(f);
		lcouple.setFont(f);
		lscariest.setFont(f);
		lsilliest.setFont(f);
		lhappiest.setFont(f);
		lworst.setFont(f);
		lmotto.setFont(f);
		lpunch.setFont(f);
		lhobbies.setFont(f);
		lactress.setFont(f);
		lcrush.setFont(f);
		lucallme.setFont(f);

		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/page2.jpg")));

		passion.setBounds(230, 80, 500, 50);
		hangoutplaces.setBounds(320, 130, 500, 50);
		actor.setBounds(320, 180, 500, 50);
		music.setBounds(420, 230, 500, 50);
		unfrgtmnt.setBounds(492, 280, 600, 50);
		couple.setBounds(525, 330, 600, 50);
		scariest.setBounds(400, 380, 600, 50);
		silliest.setBounds(525, 430, 600, 50);
		happiest.setBounds(433, 480, 600, 50);
		worst.setBounds(545, 530, 600, 50);
		motto.setBounds(490, 580, 300, 50);
		punch.setBounds(450, 630, 300, 50);
		hobbies.setBounds(850, 130, 300, 50);
		actress.setBounds(1010, 180, 300, 50);
		crush.setBounds(1060, 230, 300, 50);
		ucallme.setBounds(1145, 330, 300, 50);
		ok.setBounds(1070, 680, 80, 20);
		back.setBounds(200, 680, 80, 20);

		lpassion.setBounds(50, 80, 300, 50);
		lhangoutplaces.setBounds(50, 130, 300, 50);
		lactor.setBounds(50, 180, 300, 50);
		lmusic.setBounds(50, 230, 500, 50);
		lunfrgtmnt.setBounds(50, 280, 600, 50);
		lcouple.setBounds(50, 330, 600, 50);
		lscariest.setBounds(50, 380, 600, 50);
		lsilliest.setBounds(50, 430, 600, 50);
		lhappiest.setBounds(50, 480, 600, 50);
		lworst.setBounds(200, 530, 600, 50);
		lmotto.setBounds(210, 580, 300, 50);
		lpunch.setBounds(195, 630, 300, 50);
		lhobbies.setBounds(720, 130, 300, 50);
		lactress.setBounds(720, 180, 300, 50);
		lcrush.setBounds(860, 230, 300, 50);
		lucallme.setBounds(870, 330, 300, 50);

		add(bg);
		bg.setLayout(null);
		bg.add(passion);
		bg.add(hangoutplaces);
		bg.add(actor);
		bg.add(music);
		bg.add(unfrgtmnt);
		bg.add(couple);
		bg.add(scariest);
		bg.add(silliest);
		bg.add(happiest);
		bg.add(worst);
		bg.add(motto);
		bg.add(punch);
		bg.add(hobbies);
		bg.add(actress);
		bg.add(crush);
		bg.add(ucallme);

		bg.add(lpassion);
		bg.add(lhangoutplaces);
		bg.add(lactor);
		bg.add(lmusic);
		bg.add(lunfrgtmnt);
		bg.add(lcouple);
		bg.add(lscariest);
		bg.add(lsilliest);
		bg.add(lhappiest);
		bg.add(lworst);
		bg.add(lmotto);
		bg.add(lpunch);
		bg.add(lhobbies);
		bg.add(lactress);
		bg.add(lcrush);
		bg.add(lucallme);
		bg.add(ok);
		bg.add(back);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Slam Book page 2");
		setSize(1366, 768);
		setVisible(true);

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				new OptionsSlambook();

			}
		});
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				new ViewSlamBook1();

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
