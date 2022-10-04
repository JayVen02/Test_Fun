import javax.swing.JOptionPane;
public class JOptionPanePractice {

	public static void main(String[] args) {
		
		String First_Name;
		First_Name = JOptionPane.showInputDialog("FirstName");
		
		String Family_Name;
		Family_Name = JOptionPane.showInputDialog("FamilyName");
		
		String Full_Name;
		Full_Name = "You are " + First_Name + " " + Family_Name;
		JOptionPane.showMessageDialog(null, Full_Name);
		System.exit(0);
		

	}

}
