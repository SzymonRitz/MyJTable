import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class MyTable extends JPanel{
	private JTable table;
	JScrollPane scrollPane;
	private String[] ColumnsName;
	private String[][] data;
	
	public MyTable(String[][] data, String[] ColumnsName) {
		
		table = new JTable(data,ColumnsName);
		table.setPreferredScrollableViewportSize(new Dimension(500,500));
		table.setFillsViewportHeight(true);
		scrollPane = new JScrollPane(table);
		add(scrollPane);
	}
	public JScrollPane getJScrollPane(){
		return scrollPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

}
