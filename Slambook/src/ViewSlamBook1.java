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

class ViewSlamBook1 extends JFrame {
	JLabel fullname;
	JLabel nickname;
	JLabel phoneno;
	JLabel email;
	JLabel dob;
	JLabel assests;
	JLabel strength;
	JLabel bestfriend;
	JLabel movie;
	JLabel food;
	JLabel vacationspot;
	JLabel sport;
	JLabel superhero;
	JLabel zodiac;
	JLabel weakpt;
	JLabel outfit;
	JLabel color;

	JLabel lfullname;
	JLabel lnickname;
	JLabel lphoneno;
	JLabel lemail;
	JLabel ldob;
	JLabel lassests;
	JLabel lstrength;
	JLabel lbestfriend;
	JLabel lmovie;
	JLabel lfood;
	JLabel lvacationspot;
	JLabel lsport;
	JLabel lsuperhero;
	JLabel lzodiac;
	JLabel lweakpt;
	JLabel loutfit;
	JLabel lcolor;
	JButton next;

	public ViewSlamBook1() {
		Font l = new Font("Lucida Handwriting", Font.PLAIN, 20), f = new Font("Viner Hand ITC", Font.BOLD, 30);
		setLayout(new BorderLayout());

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
			for (ResultSet ¢ = con.createStatement().executeQuery("select * from Slampage"); ¢.next();)
				if (¢.getString("uniqueid").equals(Variables.apname)) {
					Variables.rsname = ¢.getString("fname");
					Variables.rsnickname = ¢.getString("nickname");
					Variables.rsphoneno = ¢.getString("phoneno");
					Variables.rsemail = ¢.getString("email");
					Variables.rsdob = ¢.getString("dob");
					Variables.rsassests = ¢.getString("assests");
					Variables.rsstrength = ¢.getString("strength");
					Variables.rsbestfriend = ¢.getString("bestfriend");
					Variables.rsmovie = ¢.getString("movie");
					Variables.rsfood = ¢.getString("food");
					Variables.rsvacatiospot = ¢.getString("vacationspot");
					Variables.rssport = ¢.getString("sport");
					Variables.rssuperhero = ¢.getString("superhero");
					Variables.rszodiac = ¢.getString("zodiac");
					Variables.rsweakpt = ¢.getString("weakpt");
					Variables.rsoutfit = ¢.getString("outfit");
					Variables.rscolor = ¢.getString("color");
				}
			con.close();
		} catch (Exception ¢) {
			// TODO Auto-generated catch block
			¢.printStackTrace();
		}

		fullname = new JLabel(Variables.rsname);
		fullname.setFont(l);
		nickname = new JLabel(Variables.rsnickname);
		nickname.setFont(l);
		phoneno = new JLabel(Variables.rsphoneno);
		phoneno.setFont(l);
		email = new JLabel(Variables.rsemail);
		email.setFont(l);
		dob = new JLabel(Variables.rsdob);
		dob.setFont(l);
		assests = new JLabel(Variables.rsassests);
		assests.setFont(l);
		strength = new JLabel(Variables.rsstrength);
		strength.setFont(l);
		bestfriend = new JLabel(Variables.rsbestfriend);
		bestfriend.setFont(l);
		movie = new JLabel(Variables.rsmovie);
		movie.setFont(l);
		food = new JLabel(Variables.rsfood);
		food.setFont(l);
		vacationspot = new JLabel(Variables.rsvacatiospot);
		vacationspot.setFont(l);
		sport = new JLabel(Variables.rssport);
		sport.setFont(l);
		superhero = new JLabel(Variables.rssuperhero);
		superhero.setFont(l);
		zodiac = new JLabel(Variables.rszodiac);
		zodiac.setFont(l);
		weakpt = new JLabel(Variables.rsweakpt);
		weakpt.setFont(l);
		outfit = new JLabel(Variables.rsoutfit);
		outfit.setFont(l);
		color = new JLabel(Variables.rscolor);
		color.setFont(l);

		lfullname = new JLabel("My sweet name:");
		lfullname.setFont(f);
		lnickname = new JLabel("My nick name:");
		lnickname.setFont(f);
		lphoneno = new JLabel("Ring me at:");
		lphoneno.setFont(f);
		lemail = new JLabel("Mail me at:");
		lemail.setFont(f);
		ldob = new JLabel("The day I blossommed on earth:");
		ldob.setFont(f);
		lassests = new JLabel("Biggest assests:");
		lassests.setFont(f);
		lstrength = new JLabel("My strength:");
		lstrength.setFont(f);
		lbestfriend = new JLabel("Dearesr pal:");
		lbestfriend.setFont(f);
		lmovie = new JLabel("Movie I can watch many times:");
		lmovie.setFont(f);
		lfood = new JLabel("Food I feel delicious at all times:");
		lfood.setFont(f);
		lvacationspot = new JLabel("Perfect vacation spot:");
		lvacationspot.setFont(f);
		lsport = new JLabel("Sport I like to play most:");
		lsport.setFont(f);
		lsuperhero = new JLabel("Superhero I want to be:");
		lsuperhero.setFont(f);
		lzodiac = new JLabel("Zodiac sign:");
		lzodiac.setFont(f);
		lweakpt = new JLabel("Weak point:");
		lweakpt.setFont(f);
		loutfit = new JLabel("Favourite outfit:");
		loutfit.setFont(f);
		lcolor = new JLabel("Favourite color:");
		lcolor.setFont(f);
		next = new JButton("Next");
		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/page1.jpg")));
		fullname.setBounds(310, 80, 200, 50);
		nickname.setBounds(300, 130, 200, 50);
		phoneno.setBounds(250, 180, 200, 50);
		email.setBounds(794, 180, 400, 50);
		dob.setBounds(550, 230, 250, 50);
		zodiac.setBounds(955, 230, 200, 50);
		assests.setBounds(290, 280, 200, 50);
		strength.setBounds(265, 330, 200, 50);
		bestfriend.setBounds(257, 380, 200, 50);
		movie.setBounds(550, 430, 200, 50);
		food.setBounds(735, 480, 200, 50);
		vacationspot.setBounds(600, 530, 200, 50);
		sport.setBounds(625, 580, 200, 50);
		superhero.setBounds(450, 630, 200, 50);
		weakpt.setBounds(778, 330, 300, 50);
		outfit.setBounds(927, 380, 300, 50);
		color.setBounds(1139, 430, 200, 50);
		lfullname.setBounds(55, 80, 500, 50);
		lnickname.setBounds(55, 130, 500, 50);
		lphoneno.setBounds(50, 180, 500, 50);
		lemail.setBounds(590, 180, 500, 50);
		ldob.setBounds(55, 230, 600, 50);
		lzodiac.setBounds(760, 230, 500, 50);
		lassests.setBounds(55, 280, 500, 50);
		lstrength.setBounds(55, 330, 500, 50);
		lbestfriend.setBounds(55, 380, 500, 50);
		lmovie.setBounds(55, 430, 500, 50);
		lfood.setBounds(210, 480, 600, 50);
		lvacationspot.setBounds(240, 530, 500, 50);
		lsport.setBounds(220, 580, 500, 50);
		lsuperhero.setBounds(55, 630, 500, 50);
		lweakpt.setBounds(570, 330, 500, 50);
		loutfit.setBounds(640, 380, 500, 50);
		lcolor.setBounds(870, 430, 500, 50);
		next.setBounds(1070, 680, 80, 20);
		add(bg);

		bg.setLayout(null);
		bg.add(fullname);
		bg.add(nickname);
		bg.add(phoneno);
		bg.add(email);
		bg.add(dob);
		bg.add(assests);
		bg.add(strength);
		bg.add(bestfriend);
		bg.add(movie);
		bg.add(food);
		bg.add(vacationspot);
		bg.add(sport);
		bg.add(superhero);
		bg.add(zodiac);
		bg.add(weakpt);
		bg.add(outfit);
		bg.add(color);

		bg.add(lfullname);
		bg.add(lnickname);
		bg.add(lphoneno);
		bg.add(lemail);
		bg.add(ldob);
		bg.add(lassests);
		bg.add(lstrength);
		bg.add(lbestfriend);
		bg.add(lmovie);
		bg.add(lfood);
		bg.add(lvacationspot);
		bg.add(lsport);
		bg.add(lsuperhero);
		bg.add(lzodiac);
		bg.add(lweakpt);
		bg.add(loutfit);
		bg.add(lcolor);
		bg.add(next);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Slam book page 1");
		setSize(1366, 768);
		setVisible(true);

		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
				new ViewSlamBook2();
			}

		});
	}
}
