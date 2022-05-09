import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.sql.*;


public class Vehical_Network_Router extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	Container c;

	public Font f = new Font("Times New roman", Font.BOLD, 20);

	public Font f1 = new Font("Times New roman", Font.BOLD, 15);

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();

	ImageIcon nw, node1, node2, node3, node4, node5, node6, node7, node8,
			node9, node10, node11, node12, node13, node14, node15, node16,
			node17, node18, node19, node20, node21, node22, node23, node24,
			node25, node26, node27, node28, node29, node30, flow1, flow2,
			flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11,
			flow12, flow13, flow14, flow15, flow16, flow17, flow18, flow19,
			flow20, flow21, flow22, flow23, flow24, flow25, flow26, flow27,
			flow28, flow29, flow30, rn1, rn2, rn3, rn4, rn5, rn6, rn7, rn8,
			rn9, rn10, rn11, rn12, rn13, rn14, rn15, rn16, rn17, rn18, rn19,
			rn20, rn21, rn22, rn23, rn24, rn25, rn26, rn27, rn28, rn29, rn30;

	JLabel nw1 = new JLabel(), nw2 = new JLabel(), nw3 = new JLabel();

	JLabel n1 = new JLabel(), n2 = new JLabel(), n3 = new JLabel(),
			n4 = new JLabel(), n5 = new JLabel(), n6 = new JLabel(),
			n7 = new JLabel(), n8 = new JLabel(), n9 = new JLabel(),
			n10 = new JLabel(), n11 = new JLabel(), n12 = new JLabel(),
			n13 = new JLabel(), n14 = new JLabel(), n15 = new JLabel(),
			n16 = new JLabel(), n17 = new JLabel(), n18 = new JLabel(),
			n19 = new JLabel(), n20 = new JLabel(), n21 = new JLabel(),
			n22 = new JLabel(), n23 = new JLabel(), n24 = new JLabel(),
			n25 = new JLabel(), n26 = new JLabel(), n27 = new JLabel(),
			n28 = new JLabel(), n29 = new JLabel(), n30 = new JLabel();

	JLabel l1 = new JLabel("Network-1"), l2 = new JLabel("Network-2"),
			l3 = new JLabel("Network-3");

	JMenuBar mbr = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem item = new JMenuItem("Modify Energy");
	JMenuItem netwok1 = new JMenuItem("View Network1 Energy");
	JMenuItem netwok2 = new JMenuItem("View Network2 Energy");
	JMenuItem netwok3 = new JMenuItem("View Network3 Energy");
	
	JMenuItem item2 = new JMenuItem("Exit");

	JTextArea ta = new JTextArea();
	JScrollPane pane = new JScrollPane();

	JTextArea ta2 = new JTextArea();
	JScrollPane pane2 = new JScrollPane();

	JLabel label = new JLabel("MOVING NODES");

	JLabel label2 = new JLabel("NEGHBOUR NODES");

	JButton refresh = new JButton("REFRESH");

	int z;

	JOptionPane op = new JOptionPane();

	String cond;

	@SuppressWarnings("deprecation")
	Vehical_Network_Router() {

		c = getContentPane();
		c.setLayout(null);
		setTitle("Vehical_Network_Router::Blockchain Based Secure Computation Offloading in Vehicular Networks");
		c.setBackground(Color.WHITE);

		setJMenuBar(mbr);
		mbr.add(file);
		file.add(item);
		
		file.add(netwok1);
		file.add(netwok2);
		file.add(netwok3);
                 file.add(item2);
		ta.setFont(f1);
		ta.setRows(5);
		ta.setColumns(5);
		ta.setEditable(false);
		pane.setViewportView(ta);

		ta2.setFont(f1);
		ta2.setRows(5);
		ta2.setColumns(5);
		ta2.setEditable(false);
		pane2.setViewportView(ta2);

		ta.setForeground(Color.blue);
		ta2.setForeground(Color.blue);

		label.setBounds(10, 380, 150, 30);
		pane.setBounds(10, 410, 150, 270);

		label2.setBounds(830, 380, 150, 30);
		pane2.setBounds(830, 410, 150, 270);

		label.setForeground(Color.MAGENTA);
		label2.setForeground(Color.MAGENTA);

		l1.setBounds(50, 20, 150, 30);
		l2.setBounds(500, 20, 150, 30);
		l3.setBounds(250, 380, 150, 30);

		l1.setForeground(Color.RED);
		l2.setForeground(Color.RED);
		l3.setForeground(Color.RED);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);

		rn1 = new ImageIcon("image/rn1.png");
		rn2 = new ImageIcon("image/rn2.png");
		rn3 = new ImageIcon("image/rn3.png");
		rn4 = new ImageIcon("image/rn4.png");
		rn5 = new ImageIcon("image/rn5.png");
		rn6 = new ImageIcon("image/rn6.png");
		rn7 = new ImageIcon("image/rn7.png");
		rn8 = new ImageIcon("image/rn8.png");
		rn9 = new ImageIcon("image/rn9.png");
		rn10 = new ImageIcon("image/rn10.png");
		rn11 = new ImageIcon("image/rn11.png");
		rn12 = new ImageIcon("image/rn12.png");
		rn13 = new ImageIcon("image/rn13.png");
		rn14 = new ImageIcon("image/rn14.png");
		rn15 = new ImageIcon("image/rn15.png");
		rn16 = new ImageIcon("image/rn16.png");
		rn17 = new ImageIcon("image/rn17.png");
		rn18 = new ImageIcon("image/rn18.png");
		rn19 = new ImageIcon("image/rn19.png");
		rn20 = new ImageIcon("image/rn20.png");
		rn21 = new ImageIcon("image/rn21.png");
		rn22 = new ImageIcon("image/rn22.png");
		rn23 = new ImageIcon("image/rn23.png");
		rn24 = new ImageIcon("image/rn24.png");
		rn25 = new ImageIcon("image/rn25.png");
		rn26 = new ImageIcon("image/rn26.png");
		rn27 = new ImageIcon("image/rn27.png");
		rn28 = new ImageIcon("image/rn28.png");
		rn29 = new ImageIcon("image/rn29.png");
		rn30 = new ImageIcon("image/rn30.png");

		flow1 = new ImageIcon("image/flow1.png");
		flow2 = new ImageIcon("image/flow2.png");
		flow3 = new ImageIcon("image/flow3.png");
		flow4 = new ImageIcon("image/flow4.png");
		flow5 = new ImageIcon("image/flow5.png");
		flow6 = new ImageIcon("image/flow6.png");
		flow7 = new ImageIcon("image/flow7.png");
		flow8 = new ImageIcon("image/flow8.png");
		flow9 = new ImageIcon("image/flow9.png");
		flow10 = new ImageIcon("image/flow10.png");
		flow11 = new ImageIcon("image/flow11.png");
		flow12 = new ImageIcon("image/flow12.png");
		flow13 = new ImageIcon("image/flow13.png");
		flow14 = new ImageIcon("image/flow14.png");
		flow15 = new ImageIcon("image/flow15.png");
		flow16 = new ImageIcon("image/flow16.png");
		flow17 = new ImageIcon("image/flow17.png");
		flow18 = new ImageIcon("image/flow18.png");
		flow19 = new ImageIcon("image/flow19.png");
		flow20 = new ImageIcon("image/flow20.png");
		flow21 = new ImageIcon("image/flow21.png");
		flow22 = new ImageIcon("image/flow22.png");
		flow23 = new ImageIcon("image/flow23.png");
		flow24 = new ImageIcon("image/flow24.png");
		flow25 = new ImageIcon("image/flow25.png");
		flow26 = new ImageIcon("image/flow26.png");
		flow27 = new ImageIcon("image/flow27.png");
		flow28 = new ImageIcon("image/flow28.png");
		flow29 = new ImageIcon("image/flow29.png");
		flow30 = new ImageIcon("image/flow30.png");

		nw = new ImageIcon("image/network.png");
		nw1.setIcon(nw);
		nw1.setBounds(90, 30, 350, 340);

		nw2.setIcon(nw);
		nw2.setBounds(540, 30, 350, 340);

		nw3.setIcon(nw);
		nw3.setBounds(340, 380, 350, 340);

		node1 = new ImageIcon("image/n1.png");
		n1.setIcon(node1);

		node2 = new ImageIcon("image/n2.png");
		n2.setIcon(node2);

		node3 = new ImageIcon("image/n3.png");
		n3.setIcon(node3);

		node4 = new ImageIcon("image/n4.png");
		n4.setIcon(node4);

		node5 = new ImageIcon("image/n5.png");
		n5.setIcon(node5);

		node6 = new ImageIcon("image/n6.png");
		n6.setIcon(node6);

		node7 = new ImageIcon("image/n7.png");
		n7.setIcon(node7);

		node8 = new ImageIcon("image/n8.png");
		n8.setIcon(node8);

		node9 = new ImageIcon("image/n9.png");
		n9.setIcon(node9);

		node10 = new ImageIcon("image/n10.png");
		n10.setIcon(node10);

		node11 = new ImageIcon("image/n11.png");
		n11.setIcon(node11);

		node12 = new ImageIcon("image/n12.png");
		n12.setIcon(node12);

		node13 = new ImageIcon("image/n13.png");
		n13.setIcon(node13);

		node14 = new ImageIcon("image/n14.png");
		n14.setIcon(node14);

		node15 = new ImageIcon("image/n15.png");
		n15.setIcon(node15);

		node16 = new ImageIcon("image/n16.png");
		n16.setIcon(node16);

		node17 = new ImageIcon("image/n17.png");
		n17.setIcon(node17);

		node18 = new ImageIcon("image/n18.png");
		n18.setIcon(node18);

		node19 = new ImageIcon("image/n19.png");
		n19.setIcon(node19);

		node20 = new ImageIcon("image/n20.png");
		n20.setIcon(node20);

		node21 = new ImageIcon("image/n21.png");
		n21.setIcon(node21);

		node22 = new ImageIcon("image/n22.png");
		n22.setIcon(node22);

		node23 = new ImageIcon("image/n23.png");
		n23.setIcon(node23);

		node24 = new ImageIcon("image/n24.png");
		n24.setIcon(node24);

		node25 = new ImageIcon("image/n25.png");
		n25.setIcon(node25);

		node26 = new ImageIcon("image/n26.png");
		n26.setIcon(node26);

		node27 = new ImageIcon("image/n27.png");
		n27.setIcon(node27);

		node28 = new ImageIcon("image/n28.png");
		n28.setIcon(node28);

		node29 = new ImageIcon("image/n29.png");
		n29.setIcon(node29);

		node30 = new ImageIcon("image/n30.png");
		n30.setIcon(node30);

		n1.setBounds(185, 55, 50, 50);
		n2.setBounds(285, 55, 50, 50);
		n3.setBounds(125, 135, 50, 50);
		n4.setBounds(235, 135, 50, 50);
		n5.setBounds(360, 135, 50, 50);
		n6.setBounds(125, 225, 50, 50);
		n7.setBounds(235, 225, 50, 50);
		n8.setBounds(360, 225, 50, 50);
		n9.setBounds(185, 305, 50, 50);
		n10.setBounds(285, 305, 50, 50);
		n11.setBounds(615, 55, 50, 50);
		n12.setBounds(715, 55, 50, 50);
		n13.setBounds(585, 135, 50, 50);
		n14.setBounds(695, 135, 50, 50);
		n15.setBounds(805, 135, 50, 50);
		n16.setBounds(585, 225, 50, 50);
		n17.setBounds(695, 225, 50, 50);
		n18.setBounds(805, 225, 50, 50);
		n19.setBounds(645, 305, 50, 50);
		n20.setBounds(745, 305, 50, 50);
		n21.setBounds(415, 410, 50, 50);
		n22.setBounds(525, 410, 50, 50);
		n23.setBounds(385, 500, 50, 50);
		n24.setBounds(485, 500, 50, 50);
		n25.setBounds(585, 500, 50, 50);
		n26.setBounds(385, 590, 50, 50);
		n27.setBounds(485, 590, 50, 50);
		n28.setBounds(585, 590, 50, 50);
		n29.setBounds(435, 655, 50, 50);
		n30.setBounds(535, 655, 50, 50);

		p1.setBounds(50, 40, 400, 340);
		p2.setBounds(490, 40, 400, 340);
		p3.setBounds(300, 400, 400, 340);
		
		refresh.setBounds(420, 100, 120, 40);

		c.add(l1);
		c.add(l2);
		c.add(l3);

		c.add(n1);
		c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
		c.add(n6);
		c.add(n7);
		c.add(n8);
		c.add(n9);
		c.add(n10);
		c.add(n11);

		c.add(n12);
		c.add(n13);
		c.add(n14);
		c.add(n15);
		c.add(n16);
		c.add(n17);
		c.add(n18);
		c.add(n19);
		c.add(n20);

		c.add(refresh);

		c.add(n21);
		c.add(n22);
		c.add(n23);
		c.add(n24);
		c.add(n25);
		c.add(n26);
		c.add(n27);
		c.add(n28);
		c.add(n29);
		c.add(n30);

		c.add(label);
		c.add(pane);
		c.add(label2);
		c.add(pane2);

		c.add(nw1);
		c.add(nw2);
		c.add(nw3);

		setSize(1020, 790);
		setVisible(true);

		int[] ports = new int[] { 8000, 9000 };

		item.addActionListener(this);
		item2.addActionListener(this);
		netwok1.addActionListener(this);
		netwok2.addActionListener(this);
		netwok3.addActionListener(this);

		refresh.addActionListener(this);

		for (int i = 0; i < 2; i++) {

			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();

		}

		while (true) {

			try {

				Thread t1 = new Thread();
				Thread t2 = new Thread();
				Thread t3 = new Thread();

				z = 10;

				n1.setBounds(185, 55, 50, 50);
				n2.setBounds(285, 55, 50, 50);
				n3.setBounds(125, 135, 50, 50);
				n4.setBounds(235, 135, 50, 50);
				n5.setBounds(360, 135, 50, 50);
				n6.setBounds(125, 225, 50, 50);
				n7.setBounds(235, 225, 50, 50);
				n8.setBounds(360, 225, 50, 50);
				n9.setBounds(185, 305, 50, 50);
				n10.setBounds(285, 305, 50, 50);
				n11.setBounds(615, 55, 50, 50);
				n12.setBounds(715, 55, 50, 50);
				n13.setBounds(585, 135, 50, 50);
				n14.setBounds(695, 135, 50, 50);
				n15.setBounds(805, 135, 50, 50);
				n16.setBounds(585, 225, 50, 50);
				n17.setBounds(695, 225, 50, 50);
				n18.setBounds(805, 225, 50, 50);
				n19.setBounds(645, 305, 50, 50);
				n20.setBounds(745, 305, 50, 50);
				n21.setBounds(415, 410, 50, 50);
				n22.setBounds(525, 410, 50, 50);
				n23.setBounds(385, 500, 50, 50);
				n24.setBounds(485, 500, 50, 50);
				n25.setBounds(585, 500, 50, 50);
				n26.setBounds(385, 590, 50, 50);
				n27.setBounds(485, 590, 50, 50);
				n28.setBounds(585, 590, 50, 50);
				n29.setBounds(435, 655, 50, 50);
				n30.setBounds(535, 655, 50, 50);

				Thread.sleep(10000);
				t1.start();
				t2.suspend();
				t3.suspend();

				z = 20;

				n2.setBounds(715, 55, 50, 50);
				n3.setBounds(585, 135, 50, 50);
				n4.setBounds(695, 135, 50, 50);
				n5.setBounds(805, 135, 50, 50);

				n12.setBounds(525, 410, 50, 50);
				n13.setBounds(385, 500, 50, 50);
				n14.setBounds(485, 500, 50, 50);
				n15.setBounds(585, 500, 50, 50);

				n22.setBounds(285, 55, 50, 50);
				n23.setBounds(125, 135, 50, 50);
				n24.setBounds(235, 135, 50, 50);
				n25.setBounds(360, 135, 50, 50);

				n6.setBounds(125, 225, 50, 50);
				n7.setBounds(235, 225, 50, 50);
				n8.setBounds(360, 225, 50, 50);
				n9.setBounds(185, 305, 50, 50);

				n16.setBounds(585, 225, 50, 50);
				n17.setBounds(695, 225, 50, 50);
				n18.setBounds(805, 225, 50, 50);
				n19.setBounds(645, 305, 50, 50);

				n26.setBounds(385, 590, 50, 50);
				n27.setBounds(485, 590, 50, 50);
				n28.setBounds(585, 590, 50, 50);
				n29.setBounds(435, 655, 50, 50);

				Thread.sleep(10000);
				t2.start();
				t1.suspend();
				t3.suspend();

				z = 30;

				n2.setBounds(525, 410, 50, 50);
				n3.setBounds(385, 500, 50, 50);
				n4.setBounds(485, 500, 50, 50);
				n5.setBounds(585, 500, 50, 50);

				n6.setBounds(585, 225, 50, 50);
				n7.setBounds(695, 225, 50, 50);
				n8.setBounds(805, 225, 50, 50);
				n9.setBounds(645, 305, 50, 50);

				n16.setBounds(385, 590, 50, 50);
				n17.setBounds(485, 590, 50, 50);
				n18.setBounds(585, 590, 50, 50);
				n19.setBounds(435, 655, 50, 50);

				n26.setBounds(125, 225, 50, 50);
				n27.setBounds(235, 225, 50, 50);
				n28.setBounds(360, 225, 50, 50);
				n29.setBounds(185, 305, 50, 50);

				n12.setBounds(285, 55, 50, 50);
				n13.setBounds(125, 135, 50, 50);
				n14.setBounds(235, 135, 50, 50);
				n15.setBounds(360, 135, 50, 50);

				n22.setBounds(715, 55, 50, 50);
				n23.setBounds(585, 135, 50, 50);
				n24.setBounds(695, 135, 50, 50);
				n25.setBounds(805, 135, 50, 50);

				Thread.sleep(10000);
				t3.start();
				t1.suspend();
				t2.suspend();

				z = 40;

				n2.setBounds(285, 55, 50, 50);
				n3.setBounds(125, 135, 50, 50);
				n4.setBounds(235, 135, 50, 50);
				n5.setBounds(360, 135, 50, 50);

				n12.setBounds(715, 55, 50, 50);
				n13.setBounds(585, 135, 50, 50);
				n14.setBounds(695, 135, 50, 50);
				n15.setBounds(805, 135, 50, 50);

				n22.setBounds(525, 410, 50, 50);
				n23.setBounds(385, 500, 50, 50);
				n24.setBounds(485, 500, 50, 50);
				n25.setBounds(585, 500, 50, 50);

				n6.setBounds(385, 590, 50, 50);
				n7.setBounds(485, 590, 50, 50);
				n8.setBounds(585, 590, 50, 50);
				n9.setBounds(435, 655, 50, 50);

				n16.setBounds(125, 225, 50, 50);
				n17.setBounds(235, 225, 50, 50);
				n18.setBounds(360, 225, 50, 50);
				n19.setBounds(185, 305, 50, 50);

				n26.setBounds(585, 225, 50, 50);
				n27.setBounds(695, 225, 50, 50);
				n28.setBounds(805, 225, 50, 50);
				n29.setBounds(645, 305, 50, 50);

				Thread.sleep(10000);

			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	}

	public static void main(String[] args) {
		new Vehical_Network_Router();
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==netwok1)
		{
			ViewNetwork1 vn1=new ViewNetwork1();
			
			
		}
		if(e.getSource()==netwok2)
		{
			ViewNetwork2 vn2=new ViewNetwork2();
		}
		if(e.getSource()==netwok3)
		{
			ViewNetwork3 vn1=new ViewNetwork3();	
		}
		if (e.getSource() == item) {

			String[] network = { "Select Netwotk", "Network1", "Network2",
					"Network3" };

			String Snet = (String) JOptionPane.showInputDialog(null,
					"Select Destination Node", "node",
					JOptionPane.QUESTION_MESSAGE, null, network, network[0]);

			AssignNodeEnergy as = new AssignNodeEnergy();
			as.setSize(500, 670);

			if (Snet.equals("Network1")) {

				as.cb.setSelectedItem("Network1");

				as.l1.setText("Node1");
				as.l2.setText("Node2");
				as.l3.setText("Node3");
				as.l4.setText("Node4");
				as.l5.setText("Node5");
				as.l6.setText("Node6");
				as.l7.setText("Node7");
				as.l8.setText("Node8");
				as.l9.setText("Node9");
				as.l10.setText("Node10");
			}

			if (Snet.equals("Network2")) {

				as.cb.setSelectedItem("Network2");

				as.l1.setText("Node11");
				as.l2.setText("Node12");
				as.l3.setText("Node13");
				as.l4.setText("Node14");
				as.l5.setText("Node15");
				as.l6.setText("Node16");
				as.l7.setText("Node17");
				as.l8.setText("Node18");
				as.l9.setText("Node19");
				as.l10.setText("Node20");
			}

			if (Snet.equals("Network3")) {

				as.cb.setSelectedItem("Network3");

				as.l1.setText("Node21");
				as.l2.setText("Node22");
				as.l3.setText("Node23");
				as.l4.setText("Node24");
				as.l5.setText("Node25");
				as.l6.setText("Node26");
				as.l7.setText("Node27");
				as.l8.setText("Node28");
				as.l9.setText("Node29");
				as.l10.setText("Node30");

			}

			as.setVisible(true);

		}

		if (e.getSource() == item2) {
			System.exit(0);
		}

		if (e.getSource() == refresh) {

			n1.setIcon(node1);
			n2.setIcon(node2);
			n3.setIcon(node3);
			n4.setIcon(node4);
			n5.setIcon(node5);
			n6.setIcon(node6);
			n7.setIcon(node7);
			n8.setIcon(node8);
			n9.setIcon(node9);
			n10.setIcon(node10);
			n11.setIcon(node11);
			n12.setIcon(node12);
			n13.setIcon(node13);
			n14.setIcon(node14);
			n15.setIcon(node15);
			n16.setIcon(node16);
			n17.setIcon(node17);
			n18.setIcon(node18);
			n19.setIcon(node19);
			n20.setIcon(node20);
			n21.setIcon(node21);
			n22.setIcon(node22);
			n23.setIcon(node23);
			n24.setIcon(node24);
			n25.setIcon(node25);
			n26.setIcon(node26);
			n27.setIcon(node27);
			n28.setIcon(node28);
			n29.setIcon(node29);
			n30.setIcon(node30);

		}

	}

	class PortListener implements Runnable {

		int port;

		public PortListener(int port) {
			this.port = port;
		}

		@SuppressWarnings({ "unused" })
		public void run() {

			if (this.port == 8000) {

				try {

					ServerSocket server = new ServerSocket(8000);
					Socket socket;

					while (true) {

						socket = server.accept();

						DataInputStream dis = new DataInputStream(
								socket.getInputStream());

						String net = dis.readUTF();

						if (net.equals("Network1")) {

							String node = dis.readUTF();
							String status = dis.readUTF();

							if (node.equals("Node1")) {

								if (status.equals("ON")) {
									n1.setIcon(node1);

								}
								if (status.equals("OFF")) {

									n1.setIcon(rn1);
								}
							}

							if (node.equals("Node2")) {

								if (status.equals("ON")) {
									n2.setIcon(node2);

								}
								if (status.equals("OFF")) {

									n2.setIcon(rn2);
								}
							}

							if (node.equals("Node3")) {

								if (status.equals("ON")) {
									n3.setIcon(node3);

								}
								if (status.equals("OFF")) {

									n3.setIcon(rn3);
								}
							}

							if (node.equals("Node4")) {
								if (status.equals("ON")) {
									n4.setIcon(node4);

								}
								if (status.equals("OFF")) {

									n4.setIcon(rn4);

								}
							}

							if (node.equals("Node5")) {
								if (status.equals("ON")) {
									n5.setIcon(node5);

								}
								if (status.equals("OFF")) {

									n5.setIcon(rn5);
								}
							}

							if (node.equals("Node6")) {

								if (status.equals("ON")) {
									n6.setIcon(node6);

								}
								if (status.equals("OFF")) {

									n6.setIcon(rn6);
								}

							}

							if (node.equals("Node7")) {

								if (status.equals("ON")) {
									n7.setIcon(node7);

								}
								if (status.equals("OFF")) {

									n7.setIcon(rn7);

								}
							}

							if (node.equals("Node8")) {

								if (status.equals("ON")) {
									n8.setIcon(node8);

								}
								if (status.equals("OFF")) {

									n8.setIcon(rn8);
								}

							}

							if (node.equals("Node9")) {

								if (status.equals("ON")) {
									n9.setIcon(node9);

								}
								if (status.equals("OFF")) {

									n9.setIcon(rn9);
								}
							}

							if (node.equals("Node10")) {

								if (status.equals("ON")) {
									n10.setIcon(node10);

								}
								if (status.equals("OFF")) {

									n10.setIcon(rn10);
								}
							}

							SimpleDateFormat sdfDate = new SimpleDateFormat(
									"dd/MM/yyyy");
							SimpleDateFormat sdfTime = new SimpleDateFormat(
									"HH:mm:ss");

							Date now = new Date();

							String strDate = sdfDate.format(now);
							String strTime = sdfTime.format(now);

							String dt = strDate + "   " + strTime;

							String s = "Yes";

							DBConnection
									.getConnection()
									.createStatement()
									.executeUpdate(
											"update Network1 set Attacker = '"
													+ s
													+ "' where NodeName = '"
													+ node + "'   ");
							DBConnection
									.getConnection()
									.createStatement()
									.executeUpdate(
											"insert into Attacker values( '"
													+ net + "','" + node
													+ "' ,'" + dt + "')");

						}

						if (net.equals("Network2")) {

							String node = dis.readUTF();
							String status = dis.readUTF();
							if (node.equals("Node11")) {
								if (status.equals("ON")) {
									n11.setIcon(node11);

								}
								if (status.equals("OFF")) {

									n11.setIcon(rn11);
								}
							}

							if (node.equals("Node12")) {
								if (status.equals("ON")) {
									n12.setIcon(node12);

								}
								if (status.equals("OFF")) {

									n12.setIcon(rn12);
								}
							}

							if (node.equals("Node13")) {

								if (status.equals("ON")) {
									n13.setIcon(node13);
								}
								if (status.equals("OFF")) {
									n13.setIcon(rn13);
								}
							}

							if (node.equals("Node14")) {

								if (status.equals("ON")) {
									n14.setIcon(node14);
								}
								if (status.equals("OFF")) {
									n14.setIcon(rn14);
								}
							}

							if (node.equals("Node15")) {
								if (status.equals("ON")) {
									n15.setIcon(node15);

								}
								if (status.equals("OFF")) {

									n15.setIcon(rn15);
								}
							}

							if (node.equals("Node16")) {

								if (status.equals("ON")) {
									n16.setIcon(node16);
								}
								if (status.equals("OFF")) {
									n16.setIcon(rn16);
								}

							}

							if (node.equals("Node17")) {

								if (status.equals("ON")) {
									n17.setIcon(node17);
								}
								if (status.equals("OFF")) {
									n17.setIcon(rn17);
								}

							}

							if (node.equals("Node18")) {

								if (status.equals("ON")) {
									n18.setIcon(node18);
								}
								if (status.equals("OFF")) {
									n18.setIcon(rn18);
								}

							}

							if (node.equals("Node19")) {

								if (status.equals("ON")) {
									n19.setIcon(node19);
								}
								if (status.equals("OFF")) {
									n19.setIcon(rn19);
								}
							}

							if (node.equals("Node20")) {

								if (status.equals("ON")) {
									n20.setIcon(node20);
								}
								if (status.equals("OFF")) {
									n20.setIcon(rn20);
								}

							}
							SimpleDateFormat sdfDate = new SimpleDateFormat(
									"dd/MM/yyyy");
							SimpleDateFormat sdfTime = new SimpleDateFormat(
									"HH:mm:ss");

							Date now = new Date();

							String strDate = sdfDate.format(now);
							String strTime = sdfTime.format(now);

							String dt = strDate + "   " + strTime;

							String s = "Yes";

							DBConnection
									.getConnection()
									.createStatement()
									.executeUpdate(
											"update Network2 set Attacker = '"
													+ s
													+ "' where NodeName = '"
													+ node + "'   ");
							DBConnection
									.getConnection()
									.createStatement()
									.executeUpdate(
											"insert into Attacker values( '"
													+ net + "','" + node
													+ "' ,'" + dt + "')");
						}

						if (net.equals("Network3")) {

							String node = dis.readUTF();
							String status = dis.readUTF();

							if (node.equals("Node21")) {
								if (status.equals("ON")) {
									n21.setIcon(node21);
								}
								if (status.equals("OFF")) {

									n21.setIcon(rn21);
								}
							}

							if (node.equals("Node22")) {

								if (status.equals("ON")) {

									n22.setIcon(node22);

								}
								if (status.equals("OFF")) {

									n22.setIcon(rn22);
								}
							}

							if (node.equals("Node23")) {

								if (status.equals("ON")) {
									n23.setIcon(node23);
								}
								if (status.equals("OFF")) {
									n23.setIcon(rn23);
								}
							}

							if (node.equals("Node24")) {

								if (status.equals("ON")) {
									n24.setIcon(node24);
								}
								if (status.equals("OFF")) {
									n24.setIcon(rn24);
								}

							}

							if (node.equals("Node25")) {

								if (status.equals("ON")) {
									n25.setIcon(node25);

								}
								if (status.equals("OFF")) {

									n25.setIcon(rn25);
								}
							}

							if (node.equals("Node26")) {

								if (status.equals("ON")) {
									n26.setIcon(node26);
								}
								if (status.equals("OFF")) {
									n26.setIcon(rn26);
								}

							}

							if (node.equals("Node27")) {

								if (status.equals("ON")) {
									n27.setIcon(node27);
								}
								if (status.equals("OFF")) {
									n27.setIcon(rn27);
								}

							}

							if (node.equals("Node28")) {

								if (status.equals("ON")) {
									n28.setIcon(node28);
								}
								if (status.equals("OFF")) {
									n28.setIcon(rn28);
								}
							}

							if (node.equals("Node29")) {

								if (status.equals("ON")) {
									n29.setIcon(node29);
								}
								if (status.equals("OFF")) {
									n29.setIcon(rn29);
								}

							}

							if (node.equals("Node30")) {

								if (status.equals("ON")) {
									n30.setIcon(node30);
								}
								if (status.equals("OFF")) {
									n30.setIcon(rn30);
								}
							}

							SimpleDateFormat sdfDate = new SimpleDateFormat(
									"dd/MM/yyyy");
							SimpleDateFormat sdfTime = new SimpleDateFormat(
									"HH:mm:ss");

							Date now = new Date();

							String strDate = sdfDate.format(now);
							String strTime = sdfTime.format(now);

							String dt = strDate + "   " + strTime;

							String s = "Yes";

							DBConnection
									.getConnection()
									.createStatement()
									.executeUpdate(
											"update Network3 set Attacker = '"
													+ s
													+ "' where  NodeName = '"
													+ node + "'   ");
							DBConnection
									.getConnection()
									.createStatement()
									.executeUpdate(
											"insert into Attacker values( '"
													+ net + "','" + node
													+ "' ,'" + dt + "')");

						}

					}

				} catch (Exception ex) {
					System.out.println(ex);
				}
			}

			if (this.port == 9000) {

				try {

					ServerSocket server = new ServerSocket(9000);
					Socket socket;

					while (true) {

						socket = server.accept();

						DataInputStream dis = new DataInputStream(
								socket.getInputStream());

						String fname = dis.readUTF();
						String ct = dis.readUTF();

						int wt1 = 0, wt2 = 0, wt3 = 0, wt4 = 0, wt5 = 0, wt6 = 0, wt7 = 0, wt8 = 0, wt9 = 0, wt10 = 0;

						String node1 = "Node1";
						String node2 = "Node2";
						String node3 = "Node3";
						String node4 = "Node4";
						String node5 = "Node5";
						String node6 = "Node6";
						String node7 = "Node7";
						String node8 = "Node8";
						String node9 = "Node9";
						String node10 = "Nod10";

						ResultSet rs1 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node1 + "'  ");

						if (rs1.next() == true) {

							wt1 = Integer.parseInt(rs1.getString(2));

						}

						ResultSet rs2 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node2 + "'  ");

						if (rs2.next() == true) {

							wt2 = Integer.parseInt(rs2.getString(2));

						}

						ResultSet rs3 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node3 + "'  ");

						if (rs3.next() == true) {

							wt3 = Integer.parseInt(rs3.getString(2));

						}

						ResultSet rs4 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node4 + "'  ");

						if (rs4.next() == true) {

							wt4 = Integer.parseInt(rs4.getString(2));

						}

						ResultSet rs5 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node5 + "'  ");

						if (rs5.next() == true) {

							wt5 = Integer.parseInt(rs5.getString(2));

						}

						ResultSet rs6 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node6 + "'  ");

						if (rs6.next() == true) {

							wt6 = Integer.parseInt(rs6.getString(2));

						}

						ResultSet rs7 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node7 + "'  ");

						if (rs7.next() == true) {

							wt7 = Integer.parseInt(rs7.getString(2));

						}

						ResultSet rs8 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node8 + "'  ");

						if (rs8.next() == true) {

							wt8 = Integer.parseInt(rs8.getString(2));

						}

						ResultSet rs9 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node9 + "'  ");

						if (rs9.next() == true) {

							wt9 = Integer.parseInt(rs9.getString(2));

						}

						ResultSet rs10 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network1 where NodeName ='"
												+ node10 + "'  ");

						if (rs1.next() == true) {

							wt10 = Integer.parseInt(rs10.getString(2));

						}

						int wt11 = 0, wt12 = 0, wt13 = 0, wt14 = 0, wt15 = 0, wt16 = 0, wt17 = 0, wt18 = 0, wt19 = 0;

						String node11 = "Node11";
						String node12 = "Node12";
						String node13 = "Node13";
						String node14 = "Node14";
						String node15 = "Node15";
						String node16 = "Node16";
						String node17 = "Node17";
						String node18 = "Node18";
						String node19 = "Node19";
						String node20 = "Node20";

						ResultSet rs11 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node11 + "'  ");

						if (rs11.next() == true) {

							wt11 = Integer.parseInt(rs11.getString(2));

						}

						ResultSet rs12 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node12 + "'  ");

						if (rs12.next() == true) {

							wt12 = Integer.parseInt(rs12.getString(2));

						}

						ResultSet rs13 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node13 + "'  ");

						if (rs13.next() == true) {

							wt13 = Integer.parseInt(rs13.getString(2));

						}

						ResultSet rs14 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node14 + "'  ");

						if (rs14.next() == true) {

							wt14 = Integer.parseInt(rs14.getString(2));

						}

						ResultSet rs15 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node15 + "'  ");

						if (rs15.next() == true) {

							wt15 = Integer.parseInt(rs15.getString(2));

						}

						ResultSet rs16 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node16 + "'  ");

						if (rs16.next() == true) {

							wt16 = Integer.parseInt(rs16.getString(2));

						}

						ResultSet rs17 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node17 + "'  ");

						if (rs17.next() == true) {

							wt17 = Integer.parseInt(rs17.getString(2));

						}

						ResultSet rs18 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node18 + "'  ");

						if (rs18.next() == true) {

							wt18 = Integer.parseInt(rs18.getString(2));

						}

						ResultSet rs19 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node19 + "'  ");

						if (rs19.next() == true) {

							wt19 = Integer.parseInt(rs19.getString(2));

						}

						ResultSet rs20 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network2 where NodeName ='"
												+ node20 + "'  ");

						if (rs20.next() == true) {

							int wt20 = Integer.parseInt(rs20.getString(2));

						}

						int wt22 = 0, wt23 = 0, wt24 = 0, wt25 = 0, wt26 = 0, wt27 = 0, wt28 = 0, wt29 = 0;

						String node21 = "Node21";
						String node22 = "Node22";
						String node23 = "Node23";
						String node24 = "Node24";
						String node25 = "Node25";
						String node26 = "Node26";
						String node27 = "Node27";
						String node28 = "Node28";
						String node29 = "Node29";
						String node30 = "Node30";

						ResultSet rs21 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node21 + "'  ");

						if (rs21.next() == true) {

							int wt21 = Integer.parseInt(rs21.getString(2));

						}

						ResultSet rs22 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node22 + "'  ");

						if (rs22.next() == true) {

							wt22 = Integer.parseInt(rs22.getString(2));

						}

						ResultSet rs23 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node23 + "'  ");

						if (rs23.next() == true) {

							wt23 = Integer.parseInt(rs23.getString(2));

						}

						ResultSet rs24 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node24 + "'  ");

						if (rs24.next() == true) {

							wt24 = Integer.parseInt(rs24.getString(2));

						}

						ResultSet rs25 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node25 + "'  ");

						if (rs25.next() == true) {

							wt25 = Integer.parseInt(rs25.getString(2));

						}

						ResultSet rs26 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node26 + "'  ");

						if (rs26.next() == true) {

							wt26 = Integer.parseInt(rs26.getString(2));

						}

						ResultSet rs27 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node27 + "'  ");

						if (rs27.next() == true) {

							wt27 = Integer.parseInt(rs27.getString(2));

						}

						ResultSet rs28 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node28 + "'  ");

						if (rs28.next() == true) {

							wt28 = Integer.parseInt(rs28.getString(2));

						}

						ResultSet rs29 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node29 + "'  ");

						if (rs29.next() == true) {

							wt29 = Integer.parseInt(rs29.getString(2));

						}

						ResultSet rs30 = DBConnection
								.getConnection()
								.createStatement()
								.executeQuery(
										"select * from Network3 where NodeName ='"
												+ node30 + "'  ");

						if (rs30.next() == true) {

							int wt30 = Integer.parseInt(rs30.getString(2));

						}

						int x = JOptionPane.showConfirmDialog(null,
								"Do you wnt to Connect..??");

						if (x == 0) {

							long start = System.currentTimeMillis();

							n1.setIcon(flow1);
							// ta2.append("Node1");
							// ta2.append("\n");

							String attack = "Yes";

							if (z == 10) {

								ResultSet set = DBConnection
										.getConnection()
										.createStatement()
										.executeQuery(
												"select * from Network1 where Attacker= '"
														+ attack + "' ");

								if (set.next() == true) {

									String n = set.getString(1);

									String net1 = "Network1";

									ResultSet set2 = DBConnection
											.getConnection()
											.createStatement()
											.executeQuery(
													"select * from Attacker where Network = '"
															+ net1
															+ "' and Node = '"
															+ n + "' ");

									String node = null;

									while (set2.next() == true) {

										node = set2.getString(2);

									}

									n1.setIcon(flow1);
									ta2.append("Node1");
									ta2.append("\n");

									if (wt2 <wt3) {

										if (node.equals("Node2")) {

											System.out.println("under node2");

											n2.setIcon(rn2);
											Thread.sleep(250);

											ta.append("AttackNode : Node2 ");
											ta.append("\n");
											n4.setIcon(flow4);

											ta2.append("Node4");
											ta2.append("\n");

											Thread.sleep(250);

											n7.setIcon(flow7);

											ta2.append("Node7");
											ta2.append("\n");

											Thread.sleep(250);
											n10.setIcon(flow10);

										} else {

											n2.setIcon(flow2);

											ta2.append("Node2");
											ta2.append("\n");

											if (wt4< wt5) {

												n4.setIcon(flow4);

												if (node.equals("Node4")) {

													ta.append("AttackNode : Node4");
													ta.append("\n");

													n4.setIcon(rn4);

													Thread.sleep(250);
													n7.setIcon(flow7);

													ta2.append("Node7");
													ta2.append("\n");

													Thread.sleep(250);
													n10.setIcon(flow10);

												} else {

													Thread.sleep(250);
													n7.setIcon(flow7);

													ta2.append("Node7");
													ta2.append("\n");

													Thread.sleep(250);
													n10.setIcon(flow10);

												}
											}

											if (wt4 >wt5) {

												n5.setIcon(flow5);

												if (node.equals("Node5")) {

													ta.append("AttackNode : Node5 ");
													ta.append("\n");

													n5.setIcon(rn5);

													Thread.sleep(250);
													n7.setIcon(flow7);

													ta2.append("Node7");
													ta2.append("\n");

													Thread.sleep(250);
													n10.setIcon(flow10);

												} else {

													Thread.sleep(250);
													n7.setIcon(flow7);

													ta2.append("Node7");
													ta2.append("\n");

													Thread.sleep(250);
													n10.setIcon(flow10);

												}
											}

											if (wt7 < wt8) {

												n7.setIcon(flow7);

												if (node.equals("Node7")) {

													ta.append("AttackNode : Node7 ");
													ta.append("\n");

													n7.setIcon(rn7);
													Thread.sleep(250);
													n8.setIcon(flow8);

													ta2.append("Node8");
													ta2.append("\n");

													Thread.sleep(250);

													n10.setIcon(flow10);

												} else {
													Thread.sleep(250);
													n10.setIcon(flow10);
												}
											}

											if (wt7 >wt8) {

												n8.setIcon(flow8);

												if (node.equals("Node8")) {

													ta.append("AttackNode : Node8 ");
													ta.append("\n");

													n8.setIcon(rn8);
													Thread.sleep(250);
													n7.setIcon(flow7);

													ta2.append("Node7");
													ta2.append("\n");

													Thread.sleep(250);
													n10.setIcon(flow10);

												} else {
													Thread.sleep(250);
													n10.setIcon(flow10);
												}
											}
										}
									}

									if (wt2 > wt3) {

										n3.setIcon(flow3);

										if (node.equals("Node3")) {

											ta.append("AttackNode : Node3");
											ta.append("\n");

											n3.setIcon(rn3);

											Thread.sleep(250);

											n4.setIcon(flow4);

											ta2.append("Node4");
											ta2.append("\n");

											Thread.sleep(250);

											ta2.append("Node7");
											ta2.append("\n");
											n7.setIcon(flow7);

											Thread.sleep(250);

											n10.setIcon(flow10);

										} else {

											ta2.append("Node3");
											ta2.append("\n");

											if (wt6 > wt7) {

												n7.setIcon(flow7);

												if (node.equals("Node7")) {

													ta.append("AttackNode : Node7");
													ta.append("\n");

													n7.setIcon(rn7);
													Thread.sleep(250);

													ta2.append("Node8");
													ta2.append("\n");

													n8.setIcon(flow8);
													Thread.sleep(250);

													n10.setIcon(flow10);

												}

												else {

													if (wt8 > wt9) {

														n9.setIcon(flow9);

														if (node.equals("Node9")) {

															ta.append("AttackNode : Node9");
															ta.append("\n");

															n9.setIcon(rn9);

															Thread.sleep(250);

															ta2.append("Node8");
															ta2.append("\n");
															n8.setIcon(flow8);
															Thread.sleep(250);

															n10.setIcon(flow10);

														}

														else {

															Thread.sleep(250);

															n10.setIcon(flow10);
														}
													}
													if (wt8 < wt9) {

														n8.setIcon(flow8);

														if (node.equals("Node8")) {

															ta.append("AttackNode : Node8");
															ta.append("\n");

															n8.setIcon(rn8);
															Thread.sleep(250);

															ta2.append("Node9");
															ta2.append("\n");

															n9.setIcon(flow9);
															Thread.sleep(250);

															n10.setIcon(flow10);

														} else {

															ta2.append("Node8");
															ta2.append("\n");
															Thread.sleep(250);

															n10.setIcon(flow10);

														}
													}
												}
											}

											if (wt6 < wt7) {

												n6.setIcon(flow6);

												if (node.equals("Node6")) {

													ta.append("AttackNode : Node6");
													ta.append("\n");

													n6.setIcon(rn6);
													Thread.sleep(250);
													n7.setIcon(flow7);

													ta2.append("Node7");
													ta2.append("\n");

													Thread.sleep(250);
													n10.setIcon(flow10);

												} else {

													ta2.append("Node6");
													ta2.append("\n");

													Thread.sleep(250);
													n7.setIcon(flow7);
													ta2.append("Node7");
													ta2.append("\n");
													Thread.sleep(250);
													n10.setIcon(flow10);

												}
											}
										}
									}

									ta2.append("Node10");
									ta2.append("\n");

									// network-2
									n11.setIcon(flow11);

									ResultSet set1 = DBConnection
											.getConnection()
											.createStatement()
											.executeQuery(
													"select * from Network2 where Attacker= '"
															+ attack + "' ");

									if (set1.next() == true) {

										String n2 = set1.getString(1);

										String net2 = "Network2";

										ResultSet set3 = DBConnection
												.getConnection()
												.createStatement()
												.executeQuery(
														"select * from Attacker where Network = '"
																+ net2
																+ "' and Node = '"
																+ n2 + "'  ");

										String nod1 = null;
										while (set3.next() == true) {
											nod1 = set3.getString(2);
										}

										Thread.sleep(500);
										n11.setIcon(flow11);
										ta2.append("Node11");
										ta2.append("\n");

										if (nod1.equals("Node12")) {

											ta.append("AttackNode : Node12");
											ta.append("\n");

											n12.setIcon(rn12);

											Thread.sleep(250);

											ta2.append("Node14");
											ta2.append("\n");
											n14.setIcon(flow14);

											Thread.sleep(250);

											ta2.append("Node17");
											ta2.append("\n");
											n17.setIcon(flow17);
											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (nod1.equals("Node13")) {

											// 14,17,20

											n13.setIcon(rn13);
											ta.append("AttackNode : Node13");
											ta.append("\n");
											Thread.sleep(250);

											ta2.append("Node17");
											ta2.append("\n");
											n17.setIcon(flow17);
											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (nod1.equals("Node14")) {

											//

											n14.setIcon(rn14);
											ta.append("AttackNode : Node14");
											ta.append("\n");
											Thread.sleep(250);

											ta2.append("Node17");
											ta2.append("\n");
											n17.setIcon(flow17);

											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (nod1.equals("Node15")) {

											// 12,18,20

											Thread.sleep(250);

											ta2.append("Node12");
											ta2.append("\n");
											n12.setIcon(flow12);

											n15.setIcon(rn15);

											ta.append("AttackNode : Node15");
											ta.append("\n");
											Thread.sleep(250);

											ta2.append("Node18");
											ta2.append("\n");
											n18.setIcon(flow18);

											Thread.sleep(250);

											ta2.append("Node17");
											ta2.append("\n");
											n17.setIcon(flow17);
											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (nod1.equals("Node16")) {

											Thread.sleep(250);

											ta2.append("Node13");
											ta2.append("\n");
											n13.setIcon(flow13);

											n16.setIcon(rn16);
											ta.append("AttackNode : Node16");
											ta.append("\n");
											Thread.sleep(250);

											ta2.append("Node17");
											ta2.append("\n");
											n17.setIcon(flow17);

											Thread.sleep(250);

											ta2.append("Node17");
											ta2.append("\n");
											n17.setIcon(flow17);
											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (nod1.equals("Node17")) {

											Thread.sleep(250);

											ta2.append("Node14");
											ta2.append("\n");

											n14.setIcon(flow14);

											n17.setIcon(rn17);
											ta.append("AttackNode : Node17");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (node.equals("Node18")) {

											Thread.sleep(250);

											ta2.append("Node14");
											n14.setIcon(flow14);

											n18.setIcon(rn18);
											ta.append("AttackNode : Node18");
											ta.append("\n");
											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

										if (node.equals("Node19")) {

											Thread.sleep(250);

											ta2.append("Node13");
											ta2.append("\n");

											n13.setIcon(flow13);

											Thread.sleep(250);

											ta2.append("Node16");
											ta2.append("\n");

											n16.setIcon(flow16);
											ta2.append("\n");
											n19.setIcon(rn19);

											ta.append("AttackNode : Node19");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node20");
											ta2.append("\n");
											n20.setIcon(flow20);

										}

									} else {

										if (wt12 < wt13) {

											ta2.append("Node12");
											ta2.append("\n");

											n12.setIcon(flow12);

											Thread.sleep(500);

											if (wt14 > wt15) {

												ta2.append("Node14");
												ta2.append("\n");

												n14.setIcon(flow14);
												Thread.sleep(500);

												if (wt17 < wt18) {

													ta2.append("Node17");
													ta2.append("\n");

													n17.setIcon(flow17);
													Thread.sleep(500);
													n20.setIcon(flow20);

													ta2.append("Node20");
													ta2.append("\n");

												}

												if (wt17 > wt18) {

													ta2.append("Node18");
													ta2.append("\n");

													n18.setIcon(flow18);
													Thread.sleep(500);
													n20.setIcon(flow20);

												}
											}

											if (wt14 > wt15) {

												ta2.append("Node15");
												ta2.append("\n");

												n15.setIcon(flow15);
												Thread.sleep(500);

												if (wt17 < wt18) {

													ta2.append("Node17");
													ta2.append("\n");

													n17.setIcon(flow17);
													Thread.sleep(500);
													n20.setIcon(flow20);

												}

												if (wt17 > wt18) {

													ta2.append("Node18");
													ta2.append("\n");

													n18.setIcon(flow18);
													Thread.sleep(500);
													n20.setIcon(flow20);

												}
											}
										}

										if (wt12 > wt13) {

											ta2.append("Node13");
											ta2.append("\n");

											n13.setIcon(flow13);
											if (wt16 < wt17) {

												ta2.append("Node17");
												ta2.append("\n");

												n17.setIcon(flow17);

												Thread.sleep(500);
												n20.setIcon(flow20);

											}

											if (wt16 < wt17) {

												ta2.append("Node16");
												ta2.append("\n");

												n16.setIcon(flow16);

												if (wt17 > wt19) {

													ta2.append("Node19");
													ta2.append("\n");

													n19.setIcon(flow19);

													Thread.sleep(500);

													n20.setIcon(flow20);

												} else {

													ta2.append("Node17");
													ta2.append("\n");

													n17.setIcon(flow17);

													Thread.sleep(500);

													n20.setIcon(flow20);
												}
											}
										}
									}
									// network-2

									// network-3

									n20.setIcon(flow20);
									ta2.append("\n");

									ResultSet set3 = DBConnection
											.getConnection()
											.createStatement()
											.executeQuery(
													"select * from Network3 where Attacker= '"
															+ attack + "' ");

									if (set3.next() == true) {

										String n3 = set3.getString(1);

										String net3 = "Network3";

										ResultSet set4 = DBConnection
												.getConnection()
												.createStatement()
												.executeQuery(
														"select * from Attacker where Network = '"
																+ net3
																+ "' and Node = '"
																+ n3 + "'  ");

										String nod = null;

										if (set4.next() == true) {
											nod = set4.getString(2);
										}

										Thread.sleep(500);

										n21.setIcon(flow21);
										ta2.append("Node21");
										ta.append("\n");

										if (nod.equals("Node22")) {

											n22.setIcon(rn22);

											ta.append("AttackNode : Node22");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node24");
											ta2.append("\n");
											n24.setIcon(flow24);

											Thread.sleep(250);

											ta2.append("Node27");
											ta2.append("\n");
											n27.setIcon(flow27);
											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node23")) {

											// 27, 30

											n22.setIcon(rn23);

											ta.append("AttackNode : Node23");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node27");
											ta2.append("\n");
											n27.setIcon(flow27);
											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node24")) {

											// 27, 30

											n24.setIcon(rn24);

											ta.append("AttackNode : Node24");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node27");
											ta2.append("\n");
											n27.setIcon(flow27);
											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node25")) {

											// 27, 30

											ta2.append("Node22");
											ta2.append("\n");
											n22.setIcon(flow22);
											Thread.sleep(250);

											n25.setIcon(rn25);

											ta.append("AttackNode : Node25");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node27");
											ta2.append("\n");
											n27.setIcon(flow27);
											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node26")) {

											ta2.append("Node23");
											ta2.append("\n");
											n23.setIcon(flow23);
											Thread.sleep(250);

											n26.setIcon(rn26);

											ta.append("AttackNode : Node26");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node29");
											ta2.append("\n");
											n29.setIcon(flow29);
											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node27")) {

											// 27, 30

											ta2.append("Node24");
											ta2.append("\n");
											n24.setIcon(flow24);
											Thread.sleep(250);

											n27.setIcon(rn27);

											ta.append("AttackNode : Node27");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node28")) {

											// 27, 30

											ta2.append("Node24");
											ta2.append("\n");
											n24.setIcon(flow24);
											Thread.sleep(250);

											n28.setIcon(rn28);

											ta.append("AttackNode : Node28");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

										if (nod.equals("Node29")) {

											// 27, 30

											ta2.append("Node24");
											ta2.append("\n");
											n24.setIcon(flow24);
											Thread.sleep(250);

											ta2.append("Node26");
											ta2.append("\n");
											n26.setIcon(flow26);
											Thread.sleep(250);

											n29.setIcon(rn29);

											ta.append("AttackNode : Node29");
											ta.append("\n");

											Thread.sleep(250);

											ta2.append("Node30");
											n30.setIcon(flow30);

										}

									} else {

										n21.setIcon(flow21);

										ta2.append("Node21");
										ta2.append("\n");

										if (wt22 >wt23) {

											ta2.append("Node23");
											ta2.append("\n");

											n23.setIcon(flow23);

											if (wt24 >wt25) {

												n24.setIcon(flow24);
												ta2.append("Node24");
												ta2.append("\n");

											}

											if (wt24 < wt25) {
												n25.setIcon(flow25);
												ta2.append("Node25");
												ta2.append("\n");
											}

											if (wt26 > wt27) {

												ta2.append("Node27");
												ta2.append("\n");

												n27.setIcon(flow27);

												Thread.sleep(500);
												n30.setIcon(flow30);

											}

											if (wt26 < wt27) {

												n26.setIcon(flow26);

												ta2.append("Node26");
												ta2.append("\n");

												if (wt27 > wt29) {

													ta2.append("Node29");
													ta2.append("\n");

													n29.setIcon(flow29);

													Thread.sleep(500);

													n30.setIcon(flow30);

												} else {

													ta2.append("Node27");
													ta2.append("\n");

													n27.setIcon(flow27);

													Thread.sleep(500);

													n30.setIcon(flow30);
												}
											}

										}

										if (wt22 >wt23) {

											ta2.append("Node23");
											ta2.append("\n");

											n23.setIcon(flow23);

										}
										if (wt24 > wt25) {

											n24.setIcon(flow24);
											ta2.append("Node24");
											ta2.append("\n");

										}

										if (wt24 < wt25) {
											n25.setIcon(flow25);
											ta2.append("Node25");
											ta2.append("\n");
										}

										if (wt26 >wt27) {

											n27.setIcon(flow27);
											ta2.append("Node27");
											ta2.append("\n");
											Thread.sleep(500);
											n30.setIcon(flow30);

										}

										if (wt26< wt27) {

											n26.setIcon(flow26);

											ta2.append("Node26");
											ta2.append("\n");

											if (wt27 >wt29) {

												ta2.append("Node29");
												ta2.append("\n");

												n29.setIcon(flow29);

												Thread.sleep(500);

												n30.setIcon(flow30);

											} else {

												ta2.append("Node27");
												ta2.append("\n");

												n27.setIcon(flow27);

												Thread.sleep(500);

												n30.setIcon(flow30);
											}
										}
									}

									n30.setIcon(flow30);
									ta2.append("Node30");

									Socket socket1 = new Socket("localhost",
											9009);
									DataOutputStream stream = new DataOutputStream(
											socket1.getOutputStream());
									stream.writeUTF(fname);
									stream.writeUTF(ct);

									long end = System.currentTimeMillis();

									long total = end - start;
									
									String timeDelay = Long.toString(end-start);
									
									long tpt=(Integer.parseInt(timeDelay)/ct.length())*1000;
						            
						            long routerhead=(ct.length()/16)*100;
						            
									
						           
								 	Connection connect=DBConnection.getConnection();
						             Statement stmt = connect.createStatement();
						             
						             
						             String query = "insert into results values('"+fname+"','"+timeDelay+"','"+tpt+"')";
						             stmt.executeUpdate(query);
									

									JOptionPane.showMessageDialog(null,
											"The total time is : " + total);
									
									
									
									

									break;

								}

								else {

									n1.setIcon(flow1);
									ta2.append("Node1");
									ta2.append("\n");
									Thread.sleep(500);

									if (wt2 < wt3) {

										n2.setIcon(flow2);
										ta2.append("Node2");
										ta2.append("\n");

										Thread.sleep(500);

										if (wt4 < wt5) {

											n4.setIcon(flow4);
											Thread.sleep(500);

											ta2.append("Node4");
											ta2.append("\n");

											if (wt7 < wt8) {

												n7.setIcon(flow7);
												ta2.append("Node7");
												ta2.append("\n");

												Thread.sleep(500);
												n10.setIcon(flow10);

											}

											if (wt7 > wt8) {

												n8.setIcon(flow8);
												ta2.append("Node8");
												ta2.append("\n");

												Thread.sleep(500);
												n10.setIcon(flow10);

											}
										}

										if (wt4 > wt5) {

											n5.setIcon(flow5);
											ta2.append("Node5");
											ta2.append("\n");

											Thread.sleep(500);

											if (wt7 < wt8) {

												n7.setIcon(flow7);
												ta2.append("Node7");
												ta2.append("\n");

												Thread.sleep(500);
												ta2.append("Node10");
												ta2.append("\n");

												n10.setIcon(flow10);

											}

											if (wt7 > wt8) {

												n8.setIcon(flow8);
												ta2.append("Node8");
												ta2.append("\n");

												Thread.sleep(500);

												ta2.append("Node10");
												ta2.append("\n");

												n10.setIcon(flow10);

											}
										}
									}

									else {

										if (wt2 > wt3) {

											n3.setIcon(flow3);
											ta2.append("Node3");
											ta2.append("\n");

										}

										if (wt6 > wt7) {

											n7.setIcon(flow7);
											ta2.append("Node7");
											ta2.append("\n");

											Thread.sleep(500);
											n10.setIcon(flow10);
											ta2.append("Node10");
											ta2.append("\n");

										}

										if (wt6 < wt7) {

											n6.setIcon(flow6);
											ta2.append("Node6");
											ta2.append("\n");

											if (wt7 > wt9) {

												n9.setIcon(flow9);
												ta2.append("Node9");
												ta2.append("\n");

												Thread.sleep(500);
												ta2.append("Node10");
												ta2.append("\n");

												n10.setIcon(flow10);

											} else {

												n7.setIcon(flow7);
												ta2.append("Node7");
												ta2.append("\n");

												Thread.sleep(500);
												ta2.append("Node10");
												ta2.append("\n");

												n10.setIcon(flow10);
											}
										}
									}
								}

								// to do attacker
								// ////////////*****************////////////////////

								n11.setIcon(flow11);
								ta2.append("Node11");
								ta2.append("\n");

								ResultSet set1 = DBConnection
										.getConnection()
										.createStatement()
										.executeQuery(
												"select * from Network2 where Attacker= '"
														+ attack + "' ");
								if (set1.next() == true) {

									String n = set1.getString(1);

									String net1 = "Network2";

									ResultSet set2 = DBConnection
											.getConnection()
											.createStatement()
											.executeQuery(
													"select * from Attacker where Network = '"
															+ net1
															+ "' and Node = '"
															+ n + "'  ");

									String node = null;
									while (set2.next() == true) {
										node = set2.getString(2);
									}

									Thread.sleep(500);
									n11.setIcon(flow11);

									if (node.equals("Node12")) {

										ta.append("AttackNode : Node12");
										ta.append("\n");

										n12.setIcon(rn12);

										Thread.sleep(250);

										ta2.append("Node14");
										ta2.append("\n");
										n14.setIcon(flow14);

										Thread.sleep(250);

										ta2.append("Node17");
										ta2.append("\n");
										n17.setIcon(flow17);
										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node13")) {

										// 14,17,20

										n13.setIcon(rn13);
										ta.append("AttackNode : Node13");
										ta.append("\n");
										Thread.sleep(250);

										ta2.append("Node17");
										ta2.append("\n");
										n17.setIcon(flow17);
										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node14")) {

										//

										n14.setIcon(rn14);
										ta.append("AttackNode : Node14");
										ta.append("\n");
										Thread.sleep(250);

										ta2.append("Node17");
										ta2.append("\n");
										n17.setIcon(flow17);

										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node15")) {

										// 12,18,20

										Thread.sleep(250);

										ta2.append("Node12");
										n20.setIcon(flow20);

										n15.setIcon(rn15);

										ta.append("AttackNode : Node15");
										ta.append("\n");
										Thread.sleep(250);

										ta2.append("Node18");
										ta2.append("\n");
										n18.setIcon(flow18);

										Thread.sleep(250);

										ta2.append("Node17");
										ta2.append("\n");
										n17.setIcon(flow17);
										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node16")) {

										// 12,18,20

										Thread.sleep(250);

										ta2.append("Node13");
										n13.setIcon(flow13);

										n16.setIcon(rn16);
										ta.append("AttackNode : Node16");
										ta.append("\n");
										Thread.sleep(250);

										ta2.append("Node17");
										ta2.append("\n");
										n17.setIcon(flow17);

										Thread.sleep(250);

										ta2.append("Node17");
										ta2.append("\n");
										n17.setIcon(flow17);
										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node17")) {

										// 12,18,20

										Thread.sleep(250);

										ta2.append("Node14");
										n14.setIcon(flow14);

										n17.setIcon(rn17);
										ta.append("AttackNode : Node17");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node18")) {

										// 12,18,20

										Thread.sleep(250);

										ta2.append("Node14");
										n14.setIcon(flow14);

										n18.setIcon(rn18);
										ta.append("AttackNode : Node18");
										ta.append("\n");
										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}

									if (node.equals("Node19")) {

										Thread.sleep(250);

										ta2.append("Node13");
										n13.setIcon(flow13);

										Thread.sleep(250);

										ta2.append("Node16");
										n16.setIcon(flow16);

										n19.setIcon(rn19);

										ta.append("AttackNode : Node19");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node20");
										ta2.append("\n");
										n20.setIcon(flow20);

									}
								} else {

									if (wt12 < wt13) {

										n12.setIcon(flow12);
										ta2.append("Node12");
										ta2.append("\n");

										Thread.sleep(500);

										if (wt14 < wt15) {

											ta2.append("Node14");
											ta2.append("\n");

											n14.setIcon(flow14);
											Thread.sleep(500);

											if (wt17 < wt18) {
												ta2.append("Node17");
												ta2.append("\n");

												n17.setIcon(flow17);
												Thread.sleep(500);
												n20.setIcon(flow20);

											}

											if (wt17 > wt18) {

												ta2.append("Node18");
												ta2.append("\n");

												n18.setIcon(flow18);
												Thread.sleep(500);
												n20.setIcon(flow20);
												ta2.append("Node20");
												ta2.append("\n");

											}
										}

										if (wt14 > wt15) {

											ta2.append("Node15");
											ta2.append("\n");

											n15.setIcon(flow15);
											Thread.sleep(500);

											if (wt17 < wt18) {

												ta2.append("Node17");
												ta2.append("\n");

												n17.setIcon(flow17);
												Thread.sleep(500);
												n20.setIcon(flow20);
												ta2.append("Node20");
												ta2.append("\n");

											}

											if (wt17 > wt18) {

												ta2.append("Node18");
												ta2.append("\n");

												n18.setIcon(flow18);
												Thread.sleep(500);
												n20.setIcon(flow20);

												ta2.append("Node20");
												ta2.append("\n");

											}
										}
									}

									if (wt12 > wt13) {

										ta2.append("Node13");
										ta2.append("\n");

										n13.setIcon(flow13);

										if (wt16 > wt17) {

											ta2.append("Node17");
											ta2.append("\n");

											n17.setIcon(flow17);

											Thread.sleep(500);
											n20.setIcon(flow20);

											ta2.append("Node20");
											ta2.append("\n");

										}

										if (wt16 < wt17) {

											n16.setIcon(flow16);

											ta2.append("Node16");
											ta2.append("\n");

											if (wt17 > wt19) {

												n19.setIcon(flow19);
												ta2.append("Node19");
												ta2.append("\n");

												Thread.sleep(500);

												n20.setIcon(flow20);
												ta2.append("Node20");
												ta2.append("\n");

											} else {

												n17.setIcon(flow17);
												ta2.append("Node17");
												ta2.append("\n");

												Thread.sleep(500);
												ta2.append("Node20");
												ta2.append("\n");

												n20.setIcon(flow20);
											}
										}

									}
								}// to do attacker for 3rd net

								n20.setIcon(flow20);
								Thread.sleep(500);
								ta2.append("\n");
								n21.setIcon(flow21);
								ta2.append("Node21");
								ta2.append("\n");

								ResultSet set3 = DBConnection
										.getConnection()
										.createStatement()
										.executeQuery(
												"select * from Network3 where Attacker= '"
														+ attack + "' ");

								if (set3.next() == true) {

									String n = set3.getString(1);

									String net1 = "Network3";

									ResultSet set2 = DBConnection
											.getConnection()
											.createStatement()
											.executeQuery(
													"select * from Attacker where Network = '"
															+ net1
															+ "' and Node = '"
															+ n + "'  ");

									String node = null;

									if (set2.next() == true) {
										node = set2.getString(2);
									}

									Thread.sleep(500);
									n21.setIcon(flow21);

									if (node.equals("Node22")) {

										n22.setIcon(rn22);

										ta.append("AttackNode : Node22");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node24");
										ta2.append("\n");
										n24.setIcon(flow24);

										Thread.sleep(250);

										ta2.append("Node27");
										ta2.append("\n");
										n27.setIcon(flow27);
										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node23")) {

										// 27, 30

										n22.setIcon(rn23);

										ta.append("AttackNode : Node23");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node27");
										ta2.append("\n");
										n27.setIcon(flow27);
										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node24")) {

										// 27, 30

										n24.setIcon(rn24);

										ta.append("AttackNode : Node24");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node27");
										ta2.append("\n");
										n27.setIcon(flow27);
										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node25")) {

										// 27, 30

										ta2.append("Node22");
										ta2.append("\n");
										n22.setIcon(flow22);
										Thread.sleep(250);

										n25.setIcon(rn25);

										ta.append("AttackNode : Node25");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node27");
										ta2.append("\n");
										n27.setIcon(flow27);
										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node26")) {

										// 27, 30

										ta2.append("Node23");
										ta2.append("\n");
										n23.setIcon(flow23);
										Thread.sleep(250);

										n26.setIcon(rn26);

										ta.append("AttackNode : Node26");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node29");
										ta2.append("\n");
										n29.setIcon(flow29);
										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node27")) {

										// 27, 30

										ta2.append("Node24");
										ta2.append("\n");
										n24.setIcon(flow24);
										Thread.sleep(250);

										n27.setIcon(rn27);

										ta.append("AttackNode : Node27");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node28")) {

										ta2.append("Node24");
										ta2.append("\n");
										n24.setIcon(flow24);
										Thread.sleep(250);

										n28.setIcon(rn28);

										ta.append("AttackNode : Node28");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

									if (node.equals("Node29")) {

										ta2.append("Node24");
										ta2.append("\n");
										n24.setIcon(flow24);
										Thread.sleep(250);

										ta2.append("Node26");
										ta2.append("\n");
										n26.setIcon(flow26);
										Thread.sleep(250);

										n29.setIcon(rn29);

										ta.append("AttackNode : Node29");
										ta.append("\n");

										Thread.sleep(250);

										ta2.append("Node30");
										n30.setIcon(flow30);

									}

								} else {

									if (wt22 > wt23) {

										ta2.append("Node23");
										ta2.append("\n");

										n23.setIcon(flow23);

										if (wt26 > wt27) {

											n27.setIcon(flow27);

											Thread.sleep(500);
											n30.setIcon(flow30);

										}

										if (wt26 < wt27) {

											n26.setIcon(flow26);

											ta2.append("Node26");
											ta2.append("\n");

											if (wt27 > wt29) {

												ta2.append("Node29");
												ta2.append("\n");

												n29.setIcon(flow29);

												Thread.sleep(500);

												n30.setIcon(flow30);

											} else {

												ta2.append("Node27");
												ta2.append("\n");

												n27.setIcon(flow27);

												Thread.sleep(500);

												n30.setIcon(flow30);
											}
										}
									}

									if (wt22 < wt23) {

										n22.setIcon(flow22);

										ta2.append("Node22");
										ta2.append("\n");

										if (wt24 > wt25) {

											n25.setIcon(flow25);

											ta2.append("Node25");
											ta2.append("\n");

											Thread.sleep(250);
											n28.setIcon(flow28);

											ta2.append("Node28");
											ta2.append("\n");

										}

										if (wt24 < wt25) {

											ta2.append("Node24");
											ta2.append("\n");

											n24.setIcon(flow24);

											if (wt26 < wt27) {

												n26.setIcon(flow26);

												ta2.append("Node26");
												ta2.append("\n");

												Thread.sleep(250);

												ta2.append("Node29");
												ta2.append("\n");

												n29.setIcon(flow29);

											}
											if (wt26 > wt27) {

												n27.setIcon(flow27);

												ta2.append("Node27");
												ta2.append("\n");

												Thread.sleep(250);

											}
										}
									}

									Thread.sleep(250);
									ta2.append("Node30");
									n30.setIcon(flow30);

								}

								Socket socket1 = new Socket("localhost", 9009);
								DataOutputStream stream = new DataOutputStream(
										socket1.getOutputStream());
								stream.writeUTF(fname);
								stream.writeUTF(ct);

								long end = System.currentTimeMillis();

								long total = end - start;

								String timeDelay = Long.toString(end-start);
								
								long tpt=(Integer.parseInt(timeDelay)/ct.length())*1000;
					            
					            long routerhead=(ct.length()/16)*100;
					            
								
					           
							 	Connection connect=DBConnection.getConnection();
					             Statement stmt = connect.createStatement();
					             
					             
					             String query = "insert into results values('"+fname+"','"+timeDelay+"','"+tpt+"')";
					             stmt.executeUpdate(query);
								
								JOptionPane.showMessageDialog(null,
										"The total time is : " + total);

								break;

							}
							if (z == 20) {

								n1.setIcon(flow1);

								ta2.append("Node1");
								ta2.append("\n");

								Thread.sleep(250);
								ta.append("Node24");
								ta.append("\n");
								n24.setIcon(rn24);

								n7.setIcon(flow7);

								if (wt7 < wt8) {

									ta2.append("Node7");
									ta2.append("\n");

									n7.setIcon(flow7);
									Thread.sleep(500);
									n10.setIcon(flow10);

								}

								if (wt7 > wt8) {

									ta2.append("Node8");
									ta2.append("\n");

									n8.setIcon(flow8);
									Thread.sleep(500);
									n10.setIcon(flow10);

								}

								Thread.sleep(500);
								n11.setIcon(flow11);
								Thread.sleep(250);

								n4.setIcon(rn4);
								ta.append("Node4");
								ta.append("\n");
								Thread.sleep(250);

								n17.setIcon(flow17);

								Thread.sleep(250);

								if (wt17 < wt18) {

									n17.setIcon(flow17);
									ta2.append("Node17");
									ta2.append("\n");
									Thread.sleep(500);
									n20.setIcon(flow20);

								}

								if (wt17 >wt18) {

									ta2.append("Node18");
									ta2.append("\n");

									n18.setIcon(flow18);

									Thread.sleep(500);
									n20.setIcon(flow20);

								}

								Thread.sleep(250);
								n21.setIcon(flow21);

								n14.setIcon(rn14);
								ta.append("Node14");
								ta.append("\n");
								Thread.sleep(250);

								n27.setIcon(flow27);

								Thread.sleep(250);

								if (wt27 < wt28) {

									ta2.append("Node27");
									ta2.append("\n");

									n27.setIcon(flow27);

									Thread.sleep(500);
									n30.setIcon(flow30);

								}

								if (wt27 > wt28) {

									ta2.append("Node28");
									ta2.append("\n");

									n28.setIcon(flow28);
									Thread.sleep(500);
									n30.setIcon(flow30);

								}

								Socket socket1 = new Socket("localhost", 9009);
								DataOutputStream stream = new DataOutputStream(
										socket1.getOutputStream());
								stream.writeUTF(fname);
								stream.writeUTF(ct);

								long end = System.currentTimeMillis();

								long total = end - start;
								
								String timeDelay = Long.toString(end-start);
								
								long tpt=(Integer.parseInt(timeDelay)/ct.length())*1000;
					            
					            long routerhead=(ct.length()/16)*100;
					            
								
					           
							 	Connection connect=DBConnection.getConnection();
					             Statement stmt = connect.createStatement();
					             
					             
					             String query = "insert into results values('"+fname+"','"+timeDelay+"','"+tpt+"')";
					             stmt.executeUpdate(query);
								
								

								JOptionPane.showMessageDialog(null,
										"The total time is : " + total);
								break;

							}

							if (z == 30) {

								ta2.append("Node1");
								ta2.append("\n");

								n1.setIcon(flow1);
								Thread.sleep(250);
								n14.setIcon(rn14);
								ta.append("Node14");
								ta.append("\n");

								Thread.sleep(250);
								n27.setIcon(rn27);
								ta.append("Node27");
								ta.append("\n");

								n10.setIcon(flow10);

								ta2.append("Node10");
								ta2.append("\n");

								Thread.sleep(250);

								ta2.append("Node11");
								ta2.append("\n");

								n11.setIcon(flow11);

								Thread.sleep(250);
								n24.setIcon(rn24);
								ta.append("Node24");
								ta.append("\n");
								Thread.sleep(250);
								n7.setIcon(rn7);
								ta.append("Node7");
								ta.append("\n");

								n20.setIcon(flow20);

								ta2.append("Node20");
								ta2.append("\n");

								Thread.sleep(250);

								n21.setIcon(flow21);

								ta2.append("Node21");
								ta2.append("\n");

								Thread.sleep(250);

								n4.setIcon(rn4);
								ta.append("Node4");
								ta.append("\n");
								Thread.sleep(250);

								n17.setIcon(rn17);
								ta.append("Node17");

								Thread.sleep(250);
								n30.setIcon(flow30);

								ta2.append("Node30");
								ta2.append("\n");

								Socket socket1 = new Socket("localhost", 9009);
								DataOutputStream stream = new DataOutputStream(
										socket1.getOutputStream());
								stream.writeUTF(fname);
								stream.writeUTF(ct);

								long end = System.currentTimeMillis();

								long total = end - start;

								
								
								String timeDelay = Long.toString(end-start);
								
								long tpt=(Integer.parseInt(timeDelay)/ct.length())*1000;
					            
					            long routerhead=(ct.length()/16)*100;
					            
								
					           
							 	Connection connect=DBConnection.getConnection();
					             Statement stmt = connect.createStatement();
					             
					             
					             String query = "insert into results values('"+fname+"','"+timeDelay+"','"+tpt+"')";
					             stmt.executeUpdate(query);
								
					             JOptionPane.showMessageDialog(null,
											"The total time is : " + total);
									
								
								
								break;

							}

							if (z == 40) {

								n1.setIcon(flow1);

								ta2.append("Node1");
								ta2.append("\n");

								Thread.sleep(250);

								if (wt2 < wt3) {

									n2.setIcon(flow2);

									ta2.append("Node2");
									ta2.append("\n");

									Thread.sleep(500);

									if (wt4 < wt5) {

										n4.setIcon(flow5);

										ta2.append("Node5");
										ta2.append("\n");

										Thread.sleep(250);
										n17.setIcon(rn17);
										ta.append("Node17");
										ta.append("\n");

										Thread.sleep(250);

										n10.setIcon(flow10);

									}

									if (wt4 > wt5) {

										ta2.append("Node5");
										ta2.append("\n");

										n5.setIcon(flow5);
										ta2.append("Node5");
										ta2.append("\n");

										Thread.sleep(250);

										n18.setIcon(rn18);

										Thread.sleep(250);

										n10.setIcon(flow10);

										ta2.append("Node10");
										ta2.append("\n");

									}
								}

								if (wt2 >wt3) {

									n3.setIcon(flow3);

									ta2.append("Node3");
									ta2.append("\n");

									Thread.sleep(250);

									n16.setIcon(rn16);
									ta.append("Node16");
									ta.append("\n");
									Thread.sleep(250);

									n17.setIcon(rn17);
									ta.append("Node17");
									ta.append("\n");

									Thread.sleep(250);

									n10.setIcon(flow10);
								}
								ta2.append("Node10");
								ta2.append("\n");
								Thread.sleep(250);

								n11.setIcon(flow11);
								Thread.sleep(250);

								if (wt12 <wt13) {

									n12.setIcon(flow12);

									ta2.append("Node12");
									ta2.append("\n");

									Thread.sleep(500);

									if (wt14 < wt15) {

										ta2.append("Node14");
										ta2.append("\n");

										n14.setIcon(flow14);
										Thread.sleep(500);

										n27.setIcon(rn27);
										ta.append("Node27");
										ta.append("\n");

										Thread.sleep(250);
										n20.setIcon(flow20);

									}

									if (wt14 > wt15) {

										ta2.append("Node15");
										ta2.append("\n");

										n15.setIcon(flow15);
										Thread.sleep(250);

										n28.setIcon(rn28);
										ta.append("Node28");
										ta.append("\n");
										Thread.sleep(250);

										n20.setIcon(flow20);

									}
								}

								if (wt12 > wt13) {

									n13.setIcon(flow13);

									ta2.append("Node13");
									ta2.append("\n");

									if (wt14 < wt15) {

										ta2.append("Node14");
										ta2.append("\n");

										n14.setIcon(flow14);
										Thread.sleep(500);

										n27.setIcon(rn27);
										ta.append("Node27");
										ta.append("\n");

										Thread.sleep(250);
										n20.setIcon(flow20);

									}

									if (wt14 > wt15) {

										ta2.append("Node15");
										ta2.append("\n");

										n15.setIcon(flow18);
										Thread.sleep(250);

										n28.setIcon(rn28);
										ta.append("Node28");
										ta.append("\n");
										Thread.sleep(250);

										n20.setIcon(flow20);

									}
								}

								// 3rd net

								n21.setIcon(flow21);
								Thread.sleep(250);

								if (wt22 < wt23) {

									n22.setIcon(flow22);

									ta2.append("Node22");
									ta2.append("\n");

									Thread.sleep(500);

									if (wt24 < wt25) {

										ta2.append("Node24");
										ta2.append("\n");

										n24.setIcon(flow24);
										Thread.sleep(500);

										n7.setIcon(rn7);
										ta.append("Node7");
										ta.append("\n");

										Thread.sleep(250);
										n30.setIcon(flow30);

										ta2.append("Node30");
										ta2.append("\n");

									}

									if (wt24 > wt25) {

										ta2.append("Node25");
										ta2.append("\n");

										n25.setIcon(flow25);
										Thread.sleep(500);

										n8.setIcon(rn8);
										ta.append("Node8");
										ta.append("\n");

										Thread.sleep(250);
										n30.setIcon(flow30);

										ta2.append("Node30");
										ta2.append("\n");

									}
								}

								if (wt22 > wt23) {

									ta2.append("Node23");
									ta2.append("\n");

									n23.setIcon(flow23);

									Thread.sleep(250);

									n6.setIcon(rn6);
									ta.append("Node6");
									ta.append("\n");

									Thread.sleep(250);

									n7.setIcon(rn7);
									ta.append("Node7");
									ta.append("\n");

									Thread.sleep(250);

									ta2.append("Node30");
									ta2.append("\n");

									n30.setIcon(flow30);

								}

								Socket socket1 = new Socket("localhost", 9009);
								DataOutputStream stream = new DataOutputStream(
										socket1.getOutputStream());
								stream.writeUTF(fname);
								stream.writeUTF(ct);

								long end = System.currentTimeMillis();

								long total = end - start;
								
								String timeDelay = Long.toString(end-start);
								
								long tpt=(Integer.parseInt(timeDelay)/ct.length())*1000;
					            
					            long routerhead=(ct.length()/16)*100;
					            
								
					           
							 	Connection connect=DBConnection.getConnection();
					             Statement stmt = connect.createStatement();
					             
					             
					             String query = "insert into results values('"+fname+"','"+timeDelay+"','"+tpt+"')";
					             stmt.executeUpdate(query);

								JOptionPane.showMessageDialog(null,
										"The total time is : " + total);
								
								
							}
						}

						else {
							System.out.println("refused");
						}
					}
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}
}
