package graphique;

import java.awt.*;
import javax.swing.*;

public class LabelImage extends JLabel{
	private Image im;

	public LabelImage(String nomImage)  {
		super();
		this.setIcon(new ImageIcon(nomImage));
		this.im = Toolkit.getDefaultToolkit().getImage(nomImage);
	}

	public LabelImage(){
		super();
	}

	public void setImage(String nouvImage){
		ImageIcon icon = new ImageIcon(nouvImage);
		this.setIcon(icon);
		this.im = Toolkit.getDefaultToolkit().getImage(nouvImage);
		this.repaint();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// au cas où 
		if (this.im!=null)	{
			// calcul des dimensions du LabelImage
			int hauteurLabel= this.getHeight();
			int largeurLabel = this.getWidth(); 
			// on redimensionne l'image à la dimension du label lui-même
			g.drawImage(this.im, 0, 0, largeurLabel, hauteurLabel, this);
		}
	}
}	// fin de LabelImage*/
