import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;


public class QA extends JFrame {

	private JPanel contentPane;
	private JLabel lblQ = new JLabel("Who are the four caliphs of Islam?");


	/**
	 * Create the frame.
	 */
	public QA(final JFrame main) {
		setTitle("Question");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblQ.setHorizontalAlignment(SwingConstants.CENTER);
		lblQ.setForeground(new Color(255, 255, 255));
		lblQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				main.setVisible(true);
			}
		});
		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		 
		// Determine the new location of the window
		int w = getSize().width;
		int h = getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		 
		// Move the window
		setLocation(x, y);
		
		lblQ.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblQ.setBounds(73, 35, 842, 286);
		contentPane.add(lblQ);
	}

	public void setLbl(String Q){
		lblQ.setText(Q);
	}
	public void setFont(int i){
		lblQ.setFont(new Font("Tahoma", Font.BOLD, i));
	}
}
