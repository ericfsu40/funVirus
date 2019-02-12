package f;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class f {

	public static int width = 0;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new MyRectangleJPanel();
		p.setLayout(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p);
		JLabel l = new JLabel();
		l.setText("YOU HAZ COMPOOTER VIRUZ");
		l.setFont(new Font("Serif", Font.BOLD, 55));
		l.setBounds(400, 50, 1000, 100);
		
		p.add(l);
		f.setVisible(true);
		f.setSize(3000, 1500);
		
		for(int i = 0; i < 800; i++){
			p.repaint();
			
			
			if(i == 200){		
				JLabel l2 = new JLabel();
				l2.setText("GAT REKT SCRUB");
				l2.setFont(new Font("Serif", Font.BOLD, 35));
				l2.setBounds(400, 300, 1000, 100);
				p.add(l2);	
				p.repaint();	
			}
			
			if(i == 300){		
				JLabel l2 = new JLabel();
				l2.setText("TURN OFF AND ON AGAIN BOIII");
				l2.setFont(new Font("Serif", Font.BOLD, 35));
				l2.setBounds(800, 200, 1000, 100);
				p.add(l2);	
				p.repaint();	
			}
			
			if(i == 400){		
				JLabel l2 = new JLabel();
				l2.setText("Press F to Pay Respects");
				l2.setFont(new Font("Serif", Font.BOLD, 45));
				l2.setBounds(1100, 500, 1000, 100);
				p.add(l2);	
				p.repaint();	
			}
			
			if(i == 400){		
				JLabel l2 = new JLabel();
				l2.setText("Downloading Bigger Virus");
				l2.setFont(new Font("Serif", Font.BOLD, 45));
				l2.setBounds(400, 700, 1000, 100);
				p.add(l2);	
				p.repaint();	
			}
			if(i == 550){
				ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "opendisk.bat");
				File dir = new File("./");
				pb.directory(dir);
				try {
					Process p1 = pb.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(i > 400){
				width+=15;
			}
			
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			if(i>400){
				frame.setBounds(1000-i, -250+i, 1000-i, 1000-i);
			}else{
				frame.setBounds(i+100, i+100, i+100, i+100);
			}
			panel.setBackground(Color.GREEN);
			if(i%4 == 1){
				panel.setBackground(Color.CYAN);
			}
			if(i%4 == 2){
				panel.setBackground(Color.BLACK);
			}
			if(i%4 == 3){
				panel.setBackground(Color.RED);
			}
			if(i%4 == 4){
				panel.setBackground(Color.ORANGE);
			}
			frame.add(panel);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			frame.setVisible(false);
		}
		
		f.setVisible(false);
		f.dispose();
		
	}

}


class MyRectangleJPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(200, 900, f.width, 100);
        if(f.width>2100){
        	g.fillRect(0, 1000, f.width-2100, 100);
        }
        if(f.width>4200){
        	g.fillRect(100, 0, 100, f.width-4200);
        }
 
    }
}