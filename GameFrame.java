package Snake;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	GameFrame(){
		String pic_path = "";
		String title_name = "";
		this.add(new GamePanel());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocation(600,40);
		
		/*アイコンを設定する*/
		ImageIcon icon = new ImageIcon(pic_path);
	    	this.setIconImage(icon.getImage()); 
	    
	    	/*フレームタイトル*/
	    	this.setTitle(title_name);
		
	}
}
