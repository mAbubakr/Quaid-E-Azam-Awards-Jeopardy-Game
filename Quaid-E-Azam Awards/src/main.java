import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class main extends JFrame {
	private static QA qa; 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setTitle("Quaid-E-Azam Award Knowledge Contest");
		qa = new QA(this);
		setVisible(true);		
		setForeground(Color.GREEN);
		setResizable(false);
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1018, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		 
		// Determine the new location of the window
		int w = getSize().width;
		int h = getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		 
		// Move the window
		setLocation(x, y);
		
		JLabel lblHeading = new JLabel("Quaid-E-Azam Knowledge Contest");
		lblHeading.setForeground(new Color(255, 255, 255));
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeading.setBounds(334, 11, 344, 49);
		contentPane.add(lblHeading);
		
		JLabel lblCat = new JLabel("Islam");
		lblCat.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCat.setBounds(28, 61, 114, 22);
		contentPane.add(lblCat);
		
		JLabel lblCat2 = new JLabel("Canada");
		lblCat2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCat2.setBounds(214, 61, 114, 22);
		contentPane.add(lblCat2);
		
		JLabel lblCat3 = new JLabel("Qur'an");
		lblCat3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCat3.setBounds(449, 61, 114, 22);
		contentPane.add(lblCat3);
		
		JLabel lblCat4 = new JLabel("Sports");
		lblCat4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCat4.setBounds(707, 61, 114, 22);
		contentPane.add(lblCat4);
		
		JLabel lblCat5 = new JLabel("Who Am I?");
		lblCat5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCat5.setBounds(898, 61, 114, 22);
		contentPane.add(lblCat5);
		
		final JButton btnC32 = new JButton("$200");
		btnC32.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC32.setEnabled(false);
				qa.setLbl("<html>Who is the relative of Prohpet Muhammad (PBUH) whose name is mentioned in the Qur'an?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC32.setBounds(432, 178, 105, 58);
		contentPane.add(btnC32);
		
		final JButton btnC33 = new JButton("$300");
		btnC33.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC33.setEnabled(false);
				qa.setLbl("<html>In the Qur'an mankind is divided into two groups. Which are those two groups?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
				
			}
		});
		btnC33.setBounds(432, 247, 105, 58);
		contentPane.add(btnC33);
		
		final JButton btnC34 = new JButton("$400");
		btnC34.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC34.setEnabled(false);
				qa.setLbl("<html>What was the age of Prophet Muhammad (PBUH) when the Qur'an was first revealed to him through Jibraeel (Alahis-Salaam)?</html>");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC34.setBounds(432, 316, 105, 58);
		contentPane.add(btnC34);
		
		final JButton btnC35 = new JButton("$500");
		btnC35.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC35.setEnabled(false);
				qa.setLbl("<html>There were four angels mentioned in the Qur'an. What were the names of two of them?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC35.setBounds(432, 386, 105, 58);
		contentPane.add(btnC35);
		
		final JButton btnC31 = new JButton("$100");
		btnC31.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC31.setEnabled(false);
				qa.setLbl("<html>Which Prophet has been mentioned and discussed the most in the Qur'an?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC31.setBounds(432, 105, 105, 58);
		contentPane.add(btnC31);
		
		final JButton btnC21 = new JButton("$100");
		btnC21.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC21.setEnabled(false);
				qa.setLbl("<html>What is Canada's current population (+/- 3 million)?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC21.setBounds(200, 105, 105, 58);
		contentPane.add(btnC21);
		
		final JButton btnC22 = new JButton("$200");
		btnC22.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC22.setEnabled(false);
				qa.setLbl("<html>Which five Canadian provinces have a population over 1 million?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC22.setBounds(200, 178, 105, 58);
		contentPane.add(btnC22);
		
		final JButton btnC23 = new JButton("$300");
		btnC23.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC23.setEnabled(false);
				qa.setLbl("<html>What is the highest mountain in Canada?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC23.setBounds(200, 247, 105, 58);
		contentPane.add(btnC23);
		
		final JButton btnC24 = new JButton("$400");
		btnC24.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC24.setEnabled(false);
				qa.setLbl("<html>Who are four of the major trading partners of Canada for Import and Export? </html>");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC24.setBounds(200, 316, 105, 58);
		contentPane.add(btnC24);
		
		final JButton btnC25 = new JButton("$500");
		btnC25.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC25.setEnabled(false);
				qa.setLbl("<html>In what year did the most recent territory in Canada form?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC25.setBounds(200, 386, 105, 58);
		contentPane.add(btnC25);
		
		final JButton btnC11 = new JButton("$100");
		btnC11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnC11.setEnabled(false);
				qa.setLbl("<html>Who are four caliphs of Islam?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
				
			}
		});
		btnC11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnC11.setBounds(10, 105, 105, 58);
		contentPane.add(btnC11);
		
		final JButton btnC12 = new JButton("$200");
		btnC12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC12.setEnabled(false);
				qa.setLbl("<html>How many Farad rakat do we pray each day?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC12.setBounds(10, 178, 105, 58);
		contentPane.add(btnC12);
		
		final JButton btnC13 = new JButton("$300");
		btnC13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC13.setEnabled(false);
				qa.setLbl("<html>What year was the holy Prophet Muhammad (PBUH) born?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC13.setBounds(10, 247, 105, 58);
		contentPane.add(btnC13);
		
		final JButton btnC14 = new JButton("$400");
		btnC14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC14.setEnabled(false);
				qa.setLbl("<html>What major event took place in the second Hijrah year in the month of Ramadan?</html>");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC14.setBounds(10, 316, 105, 58);
		contentPane.add(btnC14);
		
		final JButton btnC15 = new JButton("$500");
		btnC15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC15.setEnabled(false);
				qa.setLbl("<html>Where were the first Ayats (verses) revealed to Prophet Muhammad (PBUH)?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC15.setBounds(10, 386, 105, 58);
		contentPane.add(btnC15);
		
		final JButton btnC41 = new JButton("$100");
		btnC41.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC41.setEnabled(false);
				qa.setLbl("<html>Who is currently the captain for the Maple Leafs?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC41.setBounds(690, 105, 105, 58);
		contentPane.add(btnC41);
		
		final JButton btnC42 = new JButton("$200");
		btnC42.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC42.setEnabled(false);
				qa.setLbl("<html>What are the two most popular sports played in the world?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC42.setBounds(690, 178, 105, 58);
		contentPane.add(btnC42);
		
		final JButton btnC43 = new JButton("$300");
		btnC43.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC43.setEnabled(false);
				qa.setLbl("<html>How many medals did Canada have in total in the 2010 winter Olympics?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC43.setBounds(690, 247, 105, 58);
		contentPane.add(btnC43);
		
		final JButton btnC44 = new JButton("$400");
		btnC44.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC44.setEnabled(false);
				qa.setLbl("<html>How many times has Canada hosted the winter Olypmic Games?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC44.setBounds(690, 316, 105, 58);
		contentPane.add(btnC44);
		
		final JButton btnC45 = new JButton("$500");
		btnC45.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC45.setEnabled(false);
				qa.setLbl("<html>There has been a change in names and location for one particular NHL team; now there are seven Canadian hockey teams in this year's season, what is the name of the NHL franchise and where did it relocate from?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC45.setBounds(690, 386, 105, 58);
		contentPane.add(btnC45);
		
		final JButton btnC51 = new JButton("$100");
		btnC51.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC51.setEnabled(false);
				qa.setLbl("<html>This individual is best known for co-creating the social networking site Facebook, of which this individual is chief executive and president. Time magazine named this individual in 2010 Person of the Year. Who is (s)he?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC51.setBounds(897, 105, 105, 58);
		contentPane.add(btnC51);
		
		final JButton btnC52 = new JButton("$200");
		btnC52.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC52.setEnabled(false);
				qa.setLbl("<html>This individual received an Academy Award for the portrayal of King George VI in The King's Speech. In 2011 received a star on the Hollywood Walk of Fame. Who is (s)he?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC52.setBounds(897, 178, 105, 58);
		contentPane.add(btnC52);
		
		final JButton btnC53 = new JButton("$300");
		btnC53.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC53.setEnabled(false);
				qa.setLbl("<html>This individual was an English physicist, mathematician, astronomer, natural philosopher, alchemist, and theologian. His work described universal gravitation and the three laws of motion. Who is (s)he?");
				qa.setFont(40);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC53.setBounds(897, 247, 105, 58);
		contentPane.add(btnC53);
		
		final JButton btnC54 = new JButton("$400");
		btnC54.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC54.setEnabled(false);
				qa.setLbl("<html>Led the French army to several important victories during the Hundred Years' War, which paved the way for the coronation of Charles VII. This individual was captured by the Burgundians, sold to the English, tried by an ecclesiastical, and burned at the stake when this individual was 19 years old. Who is (s)he?");
				qa.setFont(30);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC54.setBounds(897, 316, 105, 58);
		contentPane.add(btnC54);
		
		final JButton btnC55 = new JButton("$500");
		btnC55.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnC55.setEnabled(false);
				qa.setLbl("<html>This individual was an African-American abolitionist, humanitarian, and Union spy during the American Civil War. After escaping from slavery, this individual made thirteen missions to rescue more than 70 slaves. Who is (s)he? (Hint: Underground Railroad)");
				qa.setFont(35);
				qa.setVisible(true);
				setVisible(false);
			}
		});
		btnC55.setBounds(897, 386, 105, 58);
		contentPane.add(btnC55);
		
		
	}
}
