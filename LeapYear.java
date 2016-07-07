import javax.swing.*;

public class LeapYear{
	public static void main(String[] args){
		String v = JOptionPane.showInputDialog("Shkruani vitin:");
		int viti = new Integer(v).intValue();
		if((viti%4==0 && viti%100!=0)||(viti%100==0 && viti%400==0)){
		   JOptionPane.showMessageDialog(null,"Viti "+viti+" është i brishtë.");
		}else{
		   JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk është i brishtë.");
		}
	}

}