import javax.swing.JOptionPane;

public class Prime {
	
public static void main(String[] args) {
	
	String flop=JOptionPane.showInputDialog("number?");
int ha=Integer.parseInt(flop);
	int score=0;
	if(ha<=1) {
		JOptionPane.showMessageDialog(null,"Not Prime");
	}
	
	
	else if(ha>1){  
		for(int g=ha-1;g>1;g--) {
			if(ha%g==0) {
				JOptionPane.showMessageDialog(null, "Not Prime");
			break;
			}
		score++;
		}
		
	
	}
	if(score==ha-2) {
		JOptionPane.showMessageDialog(null, "Prime");
	}
	
	
	
}
	
}
