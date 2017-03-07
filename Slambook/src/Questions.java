import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Questions extends JFrame implements ActionListener {
	public Questions() {
		setLayout(new BorderLayout());
		JLabel bg = new JLabel(new ImageIcon(this.getClass().getResource("/questions.jpg")));
		add(bg);
		bg.setLayout(null);
		Font fg = new Font("Calibri", Font.BOLD, 22);

		final JTextField tfullname = new JTextField(300), tnickname = new JTextField(300),
				tphoneno = new JTextField(300), temail = new JTextField(300), tdob = new JTextField(300),
				tassests = new JTextField(300), tstrength = new JTextField(300), tbestfriend = new JTextField(300),
				tmovie = new JTextField(300), tfood = new JTextField(300), tvacationspot = new JTextField(300),
				tsport = new JTextField(300), tsuperhero = new JTextField(300), tzodiac = new JTextField(300),
				tweakpt = new JTextField(300), toutfit = new JTextField(300), tcolor = new JTextField(300),
				tpassion = new JTextField(300), thangoutplaces = new JTextField(300), tactor = new JTextField(300),
				tmusic = new JTextField(300), tunfrgtmnt = new JTextField(300), tcouple = new JTextField(300),
				tscariest = new JTextField(300), tsilliest = new JTextField(300), thappiest = new JTextField(300),
				tworst = new JTextField(300), tmotto = new JTextField(300), tpunch = new JTextField(300),
				thobbies = new JTextField(300), tactress = new JTextField(300), tcrush = new JTextField(300),
				tucallme = new JTextField(300);
		JButton done = new JButton("DONE");
		JLabel intro = new JLabel("Answer these question for me..."), lbfullname = new JLabel("What's your name?"),
				lbnickname = new JLabel("Nick name:"), lbphoneno = new JLabel("Contact Number:"),
				lbemail = new JLabel("Email address:"), lbdob = new JLabel("Date of Birth:"),
				lbassests = new JLabel("Most valueable thing:"), lbstrength = new JLabel("Your strength:"),
				lbbestfriend = new JLabel("Best friend:"), lbmovie = new JLabel("Favourite movie:"),
				lbfood = new JLabel("Favourite food:"), lbvacationspot = new JLabel("Best vacation spot:"),
				lbsport = new JLabel("Favourite sport:"), lbsuperhero = new JLabel("Favourite superhero:"),
				lbzodiac = new JLabel("Zodiac sign:"), lbweakpt = new JLabel("Your weakness:"),
				lboutfit = new JLabel("Favourite clothes:"), lbcolor = new JLabel("Favourite color:"),
				lbpassion = new JLabel("Aim of life:"), lbhangoutplaces = new JLabel("Place you spend your fun time:"),
				lbactor = new JLabel("Favourite actor:"), lbmusic = new JLabel("Favourite song:"),
				lbunfrgtmnt = new JLabel("Unforgettable moment:"), lbcouple = new JLabel("Best couple:"),
				lbscariest = new JLabel("Scariest moment of life:"),
				lbsilliest = new JLabel("Silliest thing ever done:"),
				lbhappiest = new JLabel("Happiest day of your life:"), lbworst = new JLabel("Worst day of your life:"),
				lbmotto = new JLabel("Motto for life:"), lbpunch = new JLabel("My punch line:"),
				lbhobbies = new JLabel("Hobbies:"), lbactress = new JLabel("Favourite Actress:"),
				lbcrush = new JLabel("I have a crush on:"), lbucallme = new JLabel("You can call me:");
		intro.setFont(new Font("Chaparral Pro", Font.BOLD, 30));
		lbfullname.setFont(fg);
		lbnickname.setFont(fg);
		lbphoneno.setFont(fg);
		lbemail.setFont(fg);
		lbdob.setFont(fg);
		lbassests.setFont(fg);
		lbstrength.setFont(fg);
		lbbestfriend.setFont(fg);
		lbmovie.setFont(fg);
		lbfood.setFont(fg);
		lbvacationspot.setFont(fg);
		lbsport.setFont(fg);
		lbsuperhero.setFont(fg);
		lbzodiac.setFont(fg);
		lbweakpt.setFont(fg);
		lboutfit.setFont(fg);
		lbcolor.setFont(fg);
		lbpassion.setFont(fg);
		lbhangoutplaces.setFont(fg);
		lbactor.setFont(fg);
		lbmusic.setFont(fg);
		lbunfrgtmnt.setFont(fg);
		lbcouple.setFont(fg);
		lbscariest.setFont(fg);
		lbsilliest.setFont(fg);
		lbhappiest.setFont(fg);
		lbworst.setFont(fg);
		lbmotto.setFont(fg);
		lbpunch.setFont(fg);
		lbhobbies.setFont(fg);
		lbactress.setFont(fg);
		lbcrush.setFont(fg);
		lbucallme.setFont(fg);

		tfullname.setBounds(55, 90, 350, 20);
		tnickname.setBounds(55, 140, 350, 20);
		tphoneno.setBounds(55, 190, 350, 20);
		temail.setBounds(55, 240, 350, 20);
		tdob.setBounds(55, 290, 350, 20);
		tassests.setBounds(55, 340, 350, 20);
		tstrength.setBounds(55, 390, 350, 20);
		tbestfriend.setBounds(55, 440, 350, 20);
		tmovie.setBounds(55, 490, 350, 20);
		tfood.setBounds(55, 540, 350, 20);
		tvacationspot.setBounds(55, 590, 350, 20);
		tsport.setBounds(455, 90, 350, 20);
		tsuperhero.setBounds(455, 140, 350, 20);
		tzodiac.setBounds(455, 190, 350, 20);
		tweakpt.setBounds(455, 240, 350, 20);
		toutfit.setBounds(455, 290, 350, 20);
		tcolor.setBounds(455, 340, 350, 20);
		tpassion.setBounds(455, 390, 350, 20);
		thangoutplaces.setBounds(455, 440, 350, 20);
		tactor.setBounds(455, 490, 350, 20);
		tmusic.setBounds(455, 540, 350, 20);
		tunfrgtmnt.setBounds(455, 590, 350, 20);
		tcouple.setBounds(855, 90, 350, 20);
		tscariest.setBounds(855, 140, 350, 20);
		tsilliest.setBounds(855, 190, 350, 20);
		thappiest.setBounds(855, 240, 350, 20);
		tworst.setBounds(855, 290, 350, 20);
		tmotto.setBounds(855, 340, 350, 20);
		tpunch.setBounds(855, 390, 350, 20);
		thobbies.setBounds(855, 440, 350, 20);
		tactress.setBounds(855, 490, 350, 20);
		tcrush.setBounds(855, 540, 350, 20);
		tucallme.setBounds(855, 590, 350, 20);

		intro.setBounds(20, 0, 500, 50);
		lbfullname.setBounds(50, 50, 500, 50);
		lbnickname.setBounds(50, 100, 500, 50);
		lbphoneno.setBounds(50, 150, 500, 50);
		lbemail.setBounds(50, 200, 500, 50);
		lbdob.setBounds(50, 250, 500, 50);
		lbassests.setBounds(50, 300, 500, 50);
		lbstrength.setBounds(50, 350, 500, 50);
		lbbestfriend.setBounds(50, 400, 500, 50);
		lbmovie.setBounds(50, 450, 500, 50);
		lbfood.setBounds(50, 500, 500, 50);
		lbvacationspot.setBounds(50, 550, 500, 50);
		lbsport.setBounds(450, 50, 500, 50);
		lbsuperhero.setBounds(450, 100, 500, 50);
		lbzodiac.setBounds(450, 150, 500, 50);
		lbweakpt.setBounds(450, 200, 500, 50);
		lboutfit.setBounds(450, 250, 500, 50);
		lbcolor.setBounds(450, 300, 500, 50);
		lbpassion.setBounds(450, 350, 500, 50);
		lbhangoutplaces.setBounds(450, 400, 500, 50);
		lbactor.setBounds(450, 450, 500, 50);
		lbmusic.setBounds(450, 500, 500, 50);
		lbunfrgtmnt.setBounds(450, 550, 500, 50);
		lbcouple.setBounds(850, 50, 500, 50);
		lbscariest.setBounds(850, 100, 500, 50);
		lbsilliest.setBounds(850, 150, 500, 50);
		lbhappiest.setBounds(850, 200, 500, 50);
		lbworst.setBounds(850, 250, 500, 50);
		lbmotto.setBounds(850, 300, 500, 50);
		lbpunch.setBounds(850, 350, 500, 50);
		lbhobbies.setBounds(850, 400, 500, 50);
		lbactress.setBounds(850, 450, 500, 50);
		lbcrush.setBounds(850, 500, 500, 50);
		lbucallme.setBounds(850, 550, 500, 50);
		done.setBounds(1070, 670, 80, 20);
		bg.add(done);
		bg.add(intro);
		bg.add(lbfullname);
		bg.add(lbnickname);
		bg.add(lbphoneno);
		bg.add(lbemail);
		bg.add(lbdob);
		bg.add(lbassests);
		bg.add(lbstrength);
		bg.add(lbbestfriend);
		bg.add(lbmovie);
		bg.add(lbfood);
		bg.add(lbvacationspot);
		bg.add(lbsport);
		bg.add(lbsuperhero);
		bg.add(lbzodiac);
		bg.add(lbweakpt);
		bg.add(lboutfit);
		bg.add(lbcolor);
		bg.add(lbpassion);
		bg.add(lbhangoutplaces);
		bg.add(lbactor);
		bg.add(lbmusic);
		bg.add(lbunfrgtmnt);
		bg.add(lbcouple);
		bg.add(lbscariest);
		bg.add(lbsilliest);
		bg.add(lbhappiest);
		bg.add(lbworst);
		bg.add(lbmotto);
		bg.add(lbpunch);
		bg.add(lbhobbies);
		bg.add(lbactress);
		bg.add(lbcrush);
		bg.add(lbucallme);

		bg.add(tfullname);
		bg.add(tnickname);
		bg.add(tphoneno);
		bg.add(temail);
		bg.add(tdob);
		bg.add(tassests);
		bg.add(tstrength);
		bg.add(tbestfriend);
		bg.add(tmovie);
		bg.add(tfood);
		bg.add(tvacationspot);
		bg.add(tsport);
		bg.add(tsuperhero);
		bg.add(tzodiac);
		bg.add(tweakpt);
		bg.add(toutfit);
		bg.add(tcolor);
		bg.add(tpassion);
		bg.add(thangoutplaces);
		bg.add(tactor);
		bg.add(tmusic);
		bg.add(tunfrgtmnt);
		bg.add(tcouple);
		bg.add(tscariest);
		bg.add(tsilliest);
		bg.add(thappiest);
		bg.add(tworst);
		bg.add(tmotto);
		bg.add(tpunch);
		bg.add(thobbies);
		bg.add(tactress);
		bg.add(tcrush);
		bg.add(tucallme);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Answer these to fill it up in slam book..");
		setSize(1366, 768);
		setVisible(true);

		done.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String pefname = tfullname.getText(), penickname = tnickname.getText(), pephoneno = tphoneno.getText(),
						peemail = temail.getText(), pedob = tdob.getText(), peassests = tassests.getText(),
						pestrength = tstrength.getText(), pebestfriend = tbestfriend.getText(),
						pemovie = tmovie.getText(), pefood = tfood.getText(), pevacationspot = tvacationspot.getText(),
						pesport = tsport.getText(), pesuperhero = tsuperhero.getText(), pezodiac = tzodiac.getText(),
						peweakpt = tweakpt.getText(), peoutfit = toutfit.getText(), pecolor = tcolor.getText(),
						pepassion = tpassion.getText(), pehangoutplaces = thangoutplaces.getText(),
						peactor = tactor.getText(), pemusic = tmusic.getText(), peunfrgtmnt = tunfrgtmnt.getText(),
						pecouple = tcouple.getText(), pescariest = tscariest.getText(),
						pesilliest = tsilliest.getText(), pehappiest = thappiest.getText(), peworst = tworst.getText(),
						pemotto = tmotto.getText(), pepunch = tpunch.getText(), pehobbies = thobbies.getText(),
						peactress = tactress.getText(), pecrush = tcrush.getText(), peucallme = tucallme.getText(),
						peuniqueid = tfullname.getText() + tphoneno.getText();
				try {
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection("jdbc:odbc:Slambook", "", "");
					Statement st = con.createStatement();
					if (("".equals(pefname)) || ("".equals(penickname)) || ("".equals(pephoneno))
							|| ("".equals(peemail)) || ("".equals(pedob)) || ("".equals(peassests))
							|| ("".equals(pestrength)) || ("".equals(pebestfriend)) || ("".equals(pemovie))
							|| ("".equals(pefood)) || ("".equals(pevacationspot)) || ("".equals(pesport))
							|| ("".equals(pesuperhero)) || ("".equals(pezodiac)) || ("".equals(peweakpt))
							|| ("".equals(peoutfit)) || ("".equals(pecolor)) || ("".equals(pepassion))
							|| ("".equals(pehangoutplaces)) || ("".equals(peactor)) || ("".equals(pemusic))
							|| ("".equals(peunfrgtmnt)) || ("".equals(pecouple)) || ("".equals(pescariest))
							|| ("".equals(pesilliest)) || ("".equals(pehappiest)) || ("".equals(peworst))
							|| ("".equals(pemotto)) || ("".equals(pepunch)) || ("".equals(pehobbies))
							|| ("".equals(peactress)) || ("".equals(pecrush)) || ("".equals(peucallme)))
						JOptionPane.showMessageDialog(null, "Fill all the components first..");
					else {
						int s = st.executeUpdate(
								"insert into Slampage(fname,nickname,phoneno,email,dob,assests,strength,bestfriend,movie,food,vacationspot,sport,superhero,zodiac,weakpt,outfit,color,passion,hangoutplaces,actor,music,unfrgtmnt,couple,scariest,silliest,happiest,worst,motto,punch,hobbies,actress,crush,ucallme,uniqueid) values('"
										+ pefname + "','" + penickname + "','" + pephoneno + "','" + peemail + "','"
										+ pedob + "','" + peassests + "','" + pestrength + "','" + pebestfriend + "','"
										+ pemovie + "','" + pefood + "','" + pevacationspot + "','" + pesport + "','"
										+ pesuperhero + "','" + pezodiac + "','" + peweakpt + "','" + peoutfit + "','"
										+ pecolor + "','" + pepassion + "','" + pehangoutplaces + "','" + peactor
										+ "','" + pemusic + "','" + peunfrgtmnt + "','" + pecouple + "','" + pescariest
										+ "','" + pesilliest + "','" + pehappiest + "','" + peworst + "','" + pemotto
										+ "','" + pepunch + "','" + pehobbies + "','" + peactress + "','" + pecrush
										+ "','" + peucallme + "','" + peuniqueid + "')");
						new OptionsSlambook();
						Variables.rsucallme = Variables.rscrush = Variables.rsactress = Variables.rshobbies = Variables.rspunch = Variables.rsmotto = Variables.rsworst = Variables.rshappiest = Variables.rssilliest = Variables.rsscariest = Variables.rscouple = Variables.rsunfrgtmnt = Variables.rsmusic = Variables.rsactor = Variables.rshangoutplaces = Variables.rscolor = Variables.rsoutfit = Variables.rsweakpt = Variables.rszodiac = Variables.rssuperhero = Variables.rssport = Variables.rsvacatiospot = Variables.rsfood = Variables.rsmovie = Variables.rsbestfriend = Variables.rsstrength = Variables.rsassests = Variables.rsdob = Variables.rsemail = Variables.rsphoneno = Variables.rsnickname = Variables.rsname = "";
						setVisible(false);

					}
					con.close();
				} catch (Exception ¢) {
					// TODO Auto-generated catch block
					¢.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent __) {
		// TODO Auto-generated method stub

	}
}
