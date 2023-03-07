package Snake;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	GameFrame(){
		
		this.add(new GamePanel());
		//this.setTitle("Snake");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocation(600,40);
		
		/*アイコンを設定する*/
		ImageIcon icon = new ImageIcon("./rsc/pic/me.png");
	    this.setIconImage(icon.getImage()); 
	    
	    /*フレームタイトル*/
	    this.setTitle("Snake Game");
		
	}
}
