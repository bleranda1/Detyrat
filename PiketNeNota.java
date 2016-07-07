import javax.swing.*;
public class PiketNeNota{
	private int nota;

	public PiketNeNota(){}
	public static void main(String args []){
	 new PiketNeNota().piket();
	}
	public void piket(){
		String rez = JOptionPane.showInputDialog("Ju lutem shkruani piket qe keni marre :");
		int r = new Integer(rez).intValue();
		if(r>=90 && r<=100){
			nota=10;
		switch(nota){
		case 10: JOptionPane.showMessageDialog(null,"Nota juaj eshte "+nota);
		    break;}
		}
		else if(r>=80 && r<=89){
			nota = 9;
		switch(nota){	
		case 9: JOptionPane.showMessageDialog(null,"Nota juaj eshte "+nota);
			break;}
		}
		else if(r>=70&&r<=79){
		nota = 8;
		switch (nota){
		case 8: JOptionPane.showMessageDialog(null,"Nota juaj eshte "+nota);
			break;}
		}
		else if(r>=60&&r<=69){
		nota=7;	
		switch(nota){
		case 7: JOptionPane.showMessageDialog(null,"Nota juaj eshte "+nota);
			break;}
		}
		else if(r>=50&&r<=59){
			nota= 6;
		switch(nota){	
		case 6: JOptionPane.showMessageDialog(null,"Nota juaj eshte "+nota);	
		    break;}
		}
		else{
			nota=5;
		switch(nota){	
		default:JOptionPane.showMessageDialog(null, "Nota juaj eshte "+nota);
		    }
		}
		}
}
