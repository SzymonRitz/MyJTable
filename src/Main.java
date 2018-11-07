import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Main extends JPanel{

	public static void main(String[] args) {
		
		String[] columnsName = { "Imie", "Wiek", "Płeć" };
		String[][] data = { { "John", "20", "Mężczyzna" }
				,{ "Daisy", "19", "Kobieta" }
				,{ "Dave", "23", "Mężczyzna" }
				,{ "Jake", "30", "Mężczyzna" } };
		
		
		MyTable t = new MyTable(data,columnsName);
		JScrollPane scrollPane = t.getJScrollPane();
		JPanel panel = new JPanel();
		panel.add(scrollPane);
		Main main = new Main();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}
