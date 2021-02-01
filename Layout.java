import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Layout extends JFrame
{
  ImageIcon dice,blank,img,img2;
  Layout(String title)
	{
		super(title);
		setBounds(200,10,900,640);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBackground(Color.white);
    setResizable(false);
  }

  public void paint(Graphics g)
	{


		blank=new ImageIcon("blankdice.png");

		img=new ImageIcon("LudoGame.jpg");

    img.paintIcon(this,g,160,0);
		try {
			TimeUnit.SECONDS.sleep(3);
		}
    catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    }

    for(int i=0; i<900; i+=40)
		{
			for(int j=0; j<700; j+=40)
			{
				blank.paintIcon(this, g,i,j);   //to fill the background with white spaces
			}
		}
    img2=new ImageIcon("Webp.net-resizeimage (3).jpg");
		img2.paintIcon(this,g,610,40);

    //player 1 red
		g.setColor(Color.red);
		g.fillRect(0, 40, 240, 240);
		g.setColor(Color.white);
		g.fillRect(40,80, 160, 160);
		//player 2 green
		g.setColor(Color.green);
	   g.fillRect(0+360, 40, 240, 240);
		g.setColor(Color.white);
		g.fillRect(40+360,80, 160, 160);
		//player 3 yellow
		g.setColor(Color.yellow);
		g.fillRect(0+360, 40+360, 240, 240);
		g.setColor(Color.white);
		g.fillRect(40+360,80+360, 160, 160);
		//player 4 blue
		g.setColor(Color.blue);
		g.fillRect(0, 40+360, 240, 240);
		g.setColor(Color.white);
		g.fillRect(40,80+360, 160, 160);


    g.setColor(Color.black);
		g.drawRect(0, 40,600,600);    //outer frame
		g.drawLine(240, 80, 360, 80);
		g.drawLine(240, 120, 360, 120);
		g.drawLine(240, 160, 360, 160);
		g.drawLine(240, 200, 360, 200);
		g.drawLine(240, 240, 360, 240);
		g.drawLine(240, 280, 360, 280);

    g.drawLine(240, 400, 360, 400);
		g.drawLine(240, 440, 360, 440);
		g.drawLine(240, 480, 360, 480);
		g.drawLine(240, 520, 360, 520);
		g.drawLine(240, 560, 360, 560);
		g.drawLine(240, 600, 360, 600);

    g.drawLine(0, 280, 0, 400);
		g.drawLine(40, 280, 40, 400);
		g.drawLine(80, 280, 80, 400);
		g.drawLine(120, 280, 120, 400);
		g.drawLine(160, 280, 160, 400);
		g.drawLine(200, 280, 200, 400);
		g.drawLine(240, 280, 240, 400);

    g.drawLine(360, 280, 360, 400);
		g.drawLine(400, 280, 400, 400);
		g.drawLine(440, 280, 440, 400);
		g.drawLine(480, 280, 480, 400);
		g.drawLine(520, 280, 520, 400);
		g.drawLine(560, 280, 560, 400);

    g.drawLine(240,40,240,280);
		g.drawLine(280,40,280,280);
		g.drawLine(320,40,320,280);
		g.drawLine(360,40,360,280);

		g.drawLine(240,400,240,640);
		g.drawLine(280,400,280,640);
		g.drawLine(320,400,320,640);
		g.drawLine(360,400,360,640);

		g.drawLine(0,280,240,280);
		g.drawLine(0,320,240,320);
		g.drawLine(0,360,240,360);
		g.drawLine(0,400,240,400);

		g.drawLine(360,280,600,280);
		g.drawLine(360,320,600,320);
		g.drawLine(360,360,600,360);
		g.drawLine(360,400,600,400);

    g.setColor(Color.red);
    g.fillOval(55, 95,60, 60);    //circles in starting square
		g.fillOval(130,95,60,60);
		g.fillOval(55, 165, 60, 60);
		g.fillOval(130, 165, 60, 60);

    g.setColor(Color.green);
    g.fillOval(55+360, 95,60, 60);
		g.fillOval(130+360,95,60,60);
		g.fillOval(55+360, 165, 60, 60);
		g.fillOval(130+360, 165, 60, 60);

    g.setColor(Color.yellow);
    g.fillOval(55+360, 95+360,60, 60);
		g.fillOval(130+360,95+360,60,60);
		g.fillOval(55+360, 165+360, 60, 60);
		g.fillOval(130+360, 165+360, 60, 60);

    g.setColor(Color.blue);
    g.fillOval(55, 95+360,60, 60);
		g.fillOval(130,95+360,60,60);
		g.fillOval(55, 165+360, 60, 60);
		g.fillOval(130, 165+360, 60, 60);

    g.setColor(Color.black);
		g.drawLine(240, 280, 240+120,280+120); //diagonals in central square
		g.drawLine(360, 280, 240, 400);
  }

  public static void main(String args[])
  {
    Layout l=new Layout("placement");

	}
}
