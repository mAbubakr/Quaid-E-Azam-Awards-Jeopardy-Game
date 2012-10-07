import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane; // The content pane.

	// Objects used to run program in full screen.
	private GraphicsDevice device;
	private GraphicsEnvironment ge;

	private JLabel lblHeading = new JLabel(); // The title of the Jeopardy Game.
	private JLabel[] categories = new JLabel[5]; // Categories used in the game.
	private JLabel[][] question = new JLabel[5][5]; // Questions in the game
	private JLabel[][] answer = new JLabel[5][5]; // Answers to questions in the game
	
	private JButton[][] questionButtons = new JButton[5][5];

	InputStream is = getClass().getResourceAsStream("data.txt");
	BufferedReader in = new BufferedReader(new InputStreamReader(is));
	
	int width, height;
	boolean isMain = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Main() throws IOException {
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		device = ge.getDefaultScreenDevice();

		// Set look
		setTitle("Quaid-E-Azam Award Knowledge Contest");
		setVisible(true);
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setResizable(false);

		// Setup JFrame properties
		dispose();
		setUndecorated(true);
		device.setFullScreenWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Setup the content pane
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Get the size of the screen and set size.
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		width = (int) dim.getWidth();
		height = (int) dim.getHeight();
		setSize(width, height);
		
		setupView();

	}

	private void setupView() throws IOException {
		//Setup title text.
		lblHeading.setForeground(new Color(255, 255, 255));
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblHeading.setText(in.readLine());
		int strWidth = lblHeading.getFontMetrics(lblHeading.getFont()).stringWidth(lblHeading.getText());
		int strHeight = lblHeading.getFontMetrics(lblHeading.getFont()).getHeight();
		lblHeading.setBounds(width / 2 - (strWidth / 2), 11, strWidth, strHeight);
		contentPane.add(lblHeading);
		
		int catWidth = 0, catHeight = 0;
		//Setup category labels and questions/answers.
		for (int i = 0; i < 5; i++){
			categories[i] = new JLabel();
			categories[i].setText(in.readLine());
			categories[i].setFont(new Font("Tahoma", Font.BOLD, 18));
			catWidth = categories[i].getFontMetrics(categories[i].getFont()).stringWidth(categories[i].getText());
			catHeight = categories[i].getFontMetrics(categories[i].getFont()).getHeight();
			categories[i].setBounds((i * (width / 5)) + width / 15, 61, catWidth, catHeight);
			contentPane.add(categories[i]);
			for (int j = 0; j < 5; j++){
				final int temp1 = i, temp2 = j;
				String[] temp = in.readLine().split("\\*\\*");
				question[i][j] = new JLabel("<html>" + temp[0] + "</html>", JLabel.CENTER);
				question[i][j].setForeground(new Color(255, 255, 255));
				question[i][j].setFont(new Font("Tahoma", Font.BOLD,70));
				if (i == 4){
					question[i][j].setFont(new Font("Tahoma", Font.BOLD,40));
				}
				strWidth = question[i][j].getFontMetrics(question[i][j].getFont()).stringWidth(question[i][j].getText());
				strHeight = question[i][j].getFontMetrics(question[i][j].getFont()).getHeight();
				question[i][j].setBounds(width / 2 - (strWidth / 2), height / 2 - (strHeight * 15 / 2), strWidth, strHeight * 15 );
				contentPane.add(question[i][j]);
				question[i][j].setVisible(false);
				question[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0){
						question[temp1][temp2].setVisible(false);
						answer[temp1][temp2].setVisible(true);
					}
				});
//				System.out.println(question[i][j].getText());
				answer[i][j] = new JLabel("<html>" + temp[1] + "</html>");
				answer[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				answer[i][j].setForeground(new Color(255, 255, 255));
				answer[i][j].setFont(new Font("Tahoma", Font.BOLD,70));
				strWidth = answer[i][j].getFontMetrics(answer[i][j].getFont()).stringWidth(answer[i][j].getText());
				strHeight = answer[i][j].getFontMetrics(answer[i][j].getFont()).getHeight();
				answer[i][j].setBounds(width / 2 - (strWidth / 2), height / 2 - (strHeight * 10/ 2), strWidth, strHeight * 10);
				contentPane.add(answer[i][j]);
				answer[i][j].setVisible(false);
				answer[i][j].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0){
						switchViews(temp1, temp2);
						answer[temp1][temp2].setVisible(false);
					}
				});
//				System.out.println(answer[i][j].getText());
			}
		}
		
		//Setup all question buttons to show values from 100 - 500.
		for (int i = 0; i < 5; i++){
			for (int z = 0; z < 5; z++){
				questionButtons[i][z] = new JButton("$" + String.valueOf((z + 1) * 100));
				questionButtons[i][z].setFont(new Font("Tahoma", Font.PLAIN, 16));
				questionButtons[i][z].setBounds(((i * (width / 5)) + width / 15) - catWidth/4, ((z * ((height - 70)/ 5)) + (height - 70)/ 15) + 61, width / 10, height / 15);
				contentPane.add(questionButtons[i][z]);
				final int temp1 = i, temp2 = z;
				questionButtons[i][z].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0){
						if (questionButtons[temp1][temp2].isEnabled()){
						questionButtons[temp1][temp2].setEnabled(false);
						switchViews(temp1, temp2);
						}
					}
				});
//				System.out.println(questionButtons[i][z].getText());
			}
		}
	}
	


	private void switchViews(int temp1, int temp2) {
		for (int i = 0; i < 5; i++){
			categories[i].setVisible(!isMain);
			for (int j = 0; j < 5; j++){
				questionButtons[i][j].setVisible(!isMain);
			}
		}
		question[temp1][temp2].setVisible(isMain);
		isMain = !isMain;
	}
}
