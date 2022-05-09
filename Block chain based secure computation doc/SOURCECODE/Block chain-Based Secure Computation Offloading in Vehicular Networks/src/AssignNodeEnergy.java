import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AssignNodeEnergy extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JComboBox cb = new JComboBox();

	JLabel l1 = new JLabel("."), l2 = new JLabel("."), l3 = new JLabel("."),
			l4 = new JLabel("."), l5 = new JLabel("."), l6 = new JLabel("."),
			l7 = new JLabel("."), l8 = new JLabel("."), l9 = new JLabel("."),
			l10 = new JLabel(".");

	JButton b1 = new JButton("Assign"), b2 = new JButton("Reset");

	JTextField t1 = new JTextField(), t2 = new JTextField(),
			t3 = new JTextField(), t4 = new JTextField(),
			t5 = new JTextField(), t6 = new JTextField(),
			t7 = new JTextField(), t8 = new JTextField(),
			t9 = new JTextField(), t10 = new JTextField();

	JLabel net = new JLabel("Network");

	JPanel p = new JPanel();

	AssignNodeEnergy() {

		p.setLayout(null);
		p.setBackground(Color.cyan);

		cb.addItem("Network1");
		cb.addItem("Network2");
		cb.addItem("Network3");

		net.setBounds(50, 50, 150, 25);
		l1.setBounds(50, 100, 150, 25);
		l2.setBounds(50, 150, 150, 25);
		l3.setBounds(50, 200, 150, 25);
		l4.setBounds(50, 250, 150, 25);
		l5.setBounds(50, 300, 150, 25);
		l6.setBounds(50, 350, 150, 25);
		l7.setBounds(50, 400, 150, 25);
		l8.setBounds(50, 450, 150, 25);
		l9.setBounds(50, 500, 150, 25);
		l10.setBounds(50, 550, 150, 25);

		cb.setBounds(175, 50, 150, 25);

		t1.setBounds(175, 100, 150, 25);
		t2.setBounds(175, 150, 150, 25);
		t3.setBounds(175, 200, 150, 25);
		t4.setBounds(175, 250, 150, 25);
		t5.setBounds(175, 300, 150, 25);
		t6.setBounds(175, 350, 150, 25);
		t7.setBounds(175, 400, 150, 25);
		t8.setBounds(175, 450, 150, 25);
		t9.setBounds(175, 500, 150, 25);
		t10.setBounds(175, 550, 150, 25);

		b1.setBounds(50, 585, 125, 30);
		b2.setBounds(200, 585, 125, 30);

		p.add(cb);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l8);
		p.add(l6);
		p.add(l7);
		p.add(l8);
		p.add(l9);
		p.add(l10);

		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(t5);
		p.add(t6);
		p.add(t7);
		p.add(t8);
		p.add(t9);
		p.add(t10);

		p.add(b1);
		p.add(b2);

		add(p);

		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {

			String net = (String) cb.getSelectedItem();

			if (net.equals("Network1")) {

				try {

					String node1 = "Node1";
					String node2 = "Node2";
					String node3 = "Node3";
					String node4 = "Node4";
					String node5 = "Node5";
					String node6 = "Node6";
					String node7 = "Node7";
					String node8 = "Node8";
					String node9 = "Node9";
					String node10 = "Node10";

					String sql1 = "update Network1 set Linkwt = '"
							+ t1.getText() + "' where NodeName ='" + node1
							+ "'  ";

					String sql2 = "update Network1 set Linkwt = '"
							+ t2.getText() + "' where NodeName ='" + node2
							+ "'  ";
					String sql3 = "update Network1 set Linkwt = '"
							+ t3.getText() + "' where NodeName ='" + node3
							+ "'  ";

					String sql4 = "update Network1 set Linkwt = '"
							+ t4.getText() + "' where NodeName ='" + node4
							+ "'  ";

					String sql5 = "update Network1 set Linkwt = '"
							+ t5.getText() + "' where NodeName ='" + node5
							+ "'  ";
					String sql6 = "update Network1 set Linkwt = '"
							+ t6.getText() + "' where NodeName ='" + node6
							+ "'  ";

					String sql7 = "update Network1 set Linkwt = '"
							+ t7.getText() + "' where NodeName ='" + node7
							+ "'  ";

					String sql8 = "update Network1 set Linkwt = '"
							+ t8.getText() + "' where NodeName ='" + node8
							+ "'  ";
					String sql9 = "update Network1 set Linkwt = '"
							+ t9.getText() + "' where NodeName ='" + node9
							+ "'  ";

					String sql10 = "update Network1 set Linkwt = '"
							+ t10.getText() + "' where NodeName ='" + node10
							+ "'  ";

					Connection con = DBConnection.getConnection();

					con.createStatement().executeUpdate(sql1);
					con.createStatement().executeUpdate(sql2);
					con.createStatement().executeUpdate(sql3);
					con.createStatement().executeUpdate(sql4);
					con.createStatement().executeUpdate(sql5);
					con.createStatement().executeUpdate(sql6);
					con.createStatement().executeUpdate(sql7);
					con.createStatement().executeUpdate(sql8);
					con.createStatement().executeUpdate(sql9);
					con.createStatement().executeUpdate(sql10);

				} catch (Exception ex) {
					System.out.println(ex);
				}

			}

			if (net.equals("Network2")) {

				try {

					String node1 = "Node11";
					String node2 = "Node12";
					String node3 = "Node13";
					String node4 = "Node14";
					String node5 = "Node15";
					String node6 = "Node16";
					String node7 = "Node17";
					String node8 = "Node18";
					String node9 = "Node19";
					String node10 = "Node20";

					String sql1 = "update Network2 set Linkwt = '"
							+ t1.getText() + "' where NodeName ='" + node1
							+ "'  ";

					String sql2 = "update Network2 set Linkwt = '"
							+ t2.getText() + "' where NodeName ='" + node2
							+ "'  ";
					String sql3 = "update Network2 set Linkwt = '"
							+ t3.getText() + "' where NodeName ='" + node3
							+ "'  ";

					String sql4 = "update Network2 set Linkwt = '"
							+ t4.getText() + "' where NodeName ='" + node4
							+ "'  ";

					String sql5 = "update Network2 set Linkwt = '"
							+ t5.getText() + "' where NodeName ='" + node5
							+ "'  ";
					String sql6 = "update Network2 set Linkwt = '"
							+ t6.getText() + "' where NodeName ='" + node6
							+ "'  ";

					String sql7 = "update Network2 set Linkwt = '"
							+ t7.getText() + "' where NodeName ='" + node7
							+ "'  ";

					String sql8 = "update Network2 set Linkwt = '"
							+ t8.getText() + "' where NodeName ='" + node8
							+ "'  ";
					String sql9 = "update Network2 set Linkwt = '"
							+ t9.getText() + "' where NodeName ='" + node9
							+ "'  ";

					String sql10 = "update Network2 set Linkwt = '"
							+ t10.getText() + "' where NodeName ='" + node10
							+ "'  ";

					Connection con = DBConnection.getConnection();

					con.createStatement().executeUpdate(sql1);
					con.createStatement().executeUpdate(sql2);
					con.createStatement().executeUpdate(sql3);
					con.createStatement().executeUpdate(sql4);
					con.createStatement().executeUpdate(sql5);
					con.createStatement().executeUpdate(sql6);
					con.createStatement().executeUpdate(sql7);
					con.createStatement().executeUpdate(sql8);
					con.createStatement().executeUpdate(sql9);
					con.createStatement().executeUpdate(sql10);

				} catch (Exception ex) {
					System.out.println(ex);
				}

			}

			if (net.equals("Network3")) {

				try {

					String node1 = "Node21";
					String node2 = "Node22";
					String node3 = "Node23";
					String node4 = "Node24";
					String node5 = "Node25";
					String node6 = "Node26";
					String node7 = "Node27";
					String node8 = "Node28";
					String node9 = "Node29";
					String node10 = "Node30";

					String sql1 = "update Network3 set Linkwt = '"
							+ t1.getText() + "' where NodeName ='" + node1
							+ "'  ";

					String sql2 = "update Network3 set Linkwt = '"
							+ t2.getText() + "' where NodeName ='" + node2
							+ "'  ";
					String sql3 = "update Network3 set Linkwt = '"
							+ t3.getText() + "' where NodeName ='" + node3
							+ "'  ";

					String sql4 = "update Network3 set Linkwt = '"
							+ t4.getText() + "' where NodeName ='" + node4
							+ "'  ";

					String sql5 = "update Network3 set Linkwt = '"
							+ t5.getText() + "' where NodeName ='" + node5
							+ "'  ";
					String sql6 = "update Network3 set Linkwt = '"
							+ t6.getText() + "' where NodeName ='" + node6
							+ "'  ";

					String sql7 = "update Network3 set Linkwt = '"
							+ t7.getText() + "' where NodeName ='" + node7
							+ "'  ";

					String sql8 = "update Network3 set Linkwt = '"
							+ t8.getText() + "' where NodeName ='" + node8
							+ "'  ";
					String sql9 = "update Network3 set Linkwt = '"
							+ t9.getText() + "' where NodeName ='" + node9
							+ "'  ";

					String sql10 = "update Network3 set Linkwt = '"
							+ t10.getText() + "' where NodeName ='" + node10
							+ "'  ";

					Connection con = DBConnection.getConnection();

					con.createStatement().executeUpdate(sql1);
					con.createStatement().executeUpdate(sql2);
					con.createStatement().executeUpdate(sql3);
					con.createStatement().executeUpdate(sql4);
					con.createStatement().executeUpdate(sql5);
					con.createStatement().executeUpdate(sql6);
					con.createStatement().executeUpdate(sql7);
					con.createStatement().executeUpdate(sql8);
					con.createStatement().executeUpdate(sql9);
					con.createStatement().executeUpdate(sql10);

				} catch (Exception ex) {
					System.out.println(ex);
				}

			}

			JOptionPane.showMessageDialog(null, "Link weight Assigned");

		}

		if (e.getSource() == b2) {

			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");

		}

	}

}
