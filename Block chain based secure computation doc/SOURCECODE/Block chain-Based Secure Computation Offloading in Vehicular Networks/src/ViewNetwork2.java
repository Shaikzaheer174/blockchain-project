import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.*;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.*;

import java.net.*;

public class ViewNetwork2 extends JFrame implements ActionListener
{
 JButton property,Reset;
 JPanel panel;
 JLabel label1;
  JTextField  text1;
  Vector data;
Vector heading;

JButton view;
JScrollPane pane;
JTable table;
int v,h;
String s,d,call,dt;
Container c;

JLabel imglabel;
ViewNetwork2() 
 {

setTitle("Network2 Node and Energy Details");
c= getContentPane();
c.setLayout (new FlowLayout());

c.setBackground(Color.ORANGE);
setSize(600,500);
setVisible(true);

try {
	 Vector heading = new Vector();	 
	 heading.addElement("Node-Name");
	 heading.addElement("Energy");
	 heading.addElement("Attacker");
	 
	 
			  Vector data=new Vector();
	           
	             Connection con = DBConnection.getConnection();
	             Statement stmt = con.createStatement();
	             
	             
	             String query = "SELECT * From Network2";
	             ResultSet rs = stmt.executeQuery(query);


	ResultSetMetaData rsm=rs.getMetaData();
	int col=rsm.getColumnCount();



	            while(rs.next())
	             {
	Vector row = new Vector();
	  for(int i = 1; i <=col; i++){
	                   row.addElement(rs.getObject(i));

	             }

	data.addElement(row);
	             }
			  
			JTable table = new JTable(data,heading);
			  
			  pane = new JScrollPane(table);
			 
			  pane.setBounds(100,50,650,200);
			  c.add(pane);
			 // c.add(image);
	 } 
	 catch(Exception ex) {
		 ex.printStackTrace();
		 } 

  }


public void actionPerformed(ActionEvent ae)
{

Object o=ae.getSource();

if(o==property)
{
		
}

}

}