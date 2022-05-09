import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Attacker extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;

	JPanel p1 = new JPanel();

	public Font f1 = new Font("Times New roman", Font.BOLD, 15);

	JLabel l1 = new JLabel("Network"), l2 = new JLabel("Node"),
			l3 = new JLabel("Energy status");

	JComboBox cb = new JComboBox();

	JComboBox n1 = new JComboBox();
	JComboBox n2 = new JComboBox();
	JComboBox n3 = new JComboBox();

	JComboBox ncb = new JComboBox();

	JTextArea ta = new JTextArea();
	JScrollPane pane = new JScrollPane();

	JButton request = new JButton("Submit"), reset = new JButton("Reset");

	Attacker() {

		p1.setLayout(null);
		p1.setBackground(Color.lightGray);

		ncb.addItem("Select");

		ncb.addItem("Network1");
		ncb.addItem("Network2");
		ncb.addItem("Network3");

		n1.addItem("Select");

		n1.addItem("Node2");
		n1.addItem("Node3");
		n1.addItem("Node4");
		n1.addItem("Node5");
		n1.addItem("Node6");
		n1.addItem("Node7");
		n1.addItem("Node8");
		n1.addItem("Node9");

		n2.addItem("select");

		n2.addItem("Node12");
		n2.addItem("Node13");
		n2.addItem("Node14");
		n2.addItem("Node15");
		n2.addItem("Node16");
		n2.addItem("Node17");
		n2.addItem("Node18");
		n2.addItem("Node19");

		n3.addItem("Select");

		n3.addItem("Node22");
		n3.addItem("Node23");
		n3.addItem("Node24");
		n3.addItem("Node25");
		n3.addItem("Node26");
		n3.addItem("Node27");
		n3.addItem("Node28");
		n3.addItem("Node29");

		cb.addItem("Select");
		cb.addItem("ON");
		cb.addItem("OFF");

		TitledBorder b1 = BorderFactory.createTitledBorder("Network");
		JLabel brd1 = new JLabel();
		brd1.setBorder(b1);

		TitledBorder b2 = BorderFactory.createTitledBorder("Attacker file");
		JLabel brd2 = new JLabel();
		brd2.setBorder(b2);

		b1.setTitleColor(Color.blue);
		b2.setTitleColor(Color.blue);

		brd1.setBounds(20, 25, 370, 250);
		brd2.setBounds(20, 290, 370, 350);

		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);

		ncb.setFont(f1);
		n1.setFont(f1);
		n2.setFont(f1);
		n3.setFont(f1);
		cb.setFont(f1);

		request.setFont(f1);
		reset.setFont(f1);

		ta.setFont(f1);

		ta.setRows(10);
		ta.setColumns(10);
		pane.setViewportView(ta);

		l1.setBounds(50, 50, 100, 25);
		l2.setBounds(50, 100, 100, 25);
		l3.setBounds(50, 150, 100, 25);

		ncb.setBounds(165, 50, 150, 25);
		n1.setBounds(165, 100, 150, 25);
		n2.setBounds(165, 100, 150, 25);
		n3.setBounds(165, 100, 150, 25);
		cb.setBounds(165, 150, 150, 25);

		request.setBounds(50, 200, 125, 25);
		reset.setBounds(200, 200, 125, 25);

		pane.setBounds(50, 310, 320, 300);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);

		p1.add(n1);
		p1.add(n2);
		p1.add(n3);

		p1.add(ncb);
		p1.add(cb);

		p1.add(brd1);
		p1.add(brd2);

		p1.add(request);
		p1.add(reset);

		p1.add(pane);

		add(p1);

		request.addActionListener(this);
		reset.addActionListener(this);
		ncb.addItemListener(this);

	}

	public static void main(String[] args) {

		Attacker rc = new Attacker();
		rc.setSize(450, 700);
		rc.setVisible(true);
		rc.setTitle("Network Attacker::Blockchain Based Secure Computation Offloading in Vehicular Networks");

	}

	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == request) {

			String node = "";
			String status = "";

			JOptionPane op = new JOptionPane();

			try {

				String net = (String) ncb.getSelectedItem();

				if (net.equals("Network1")) {

					node = (String) n1.getSelectedItem();

					if (node.equals("Select")) {

						op.showMessageDialog(null, "Select the node");

					}
				}

				if (net.equals("Network2")) {
					node = (String) n2.getSelectedItem();
					if (node.equals("Select")) {
						op.showMessageDialog(null, "Select the node");
					}
				}
				if (net.equals("Network3")) {
					node = (String) n3.getSelectedItem();
					if (node.equals("Select")) {
						op.showMessageDialog(null, "Select the node");
					}
				}

				status = (String) cb.getSelectedItem();

				Socket socket = new Socket(op.showInputDialog(null,
						"Enter Router IPAddress"), 8000);

				DataOutputStream dos = new DataOutputStream(
						socket.getOutputStream());
				dos.writeUTF(net);
				dos.writeUTF(node);
				dos.writeUTF(status);
				
				JOptionPane.showMessageDialog(null,"Attack Successfull ");
				

			} catch (Exception ex) {
				System.out.println(ex);
			}
		}

		if (e.getSource() == reset) {

			ncb.setSelectedItem("Select");
			n1.setSelectedItem("Select");
			cb.setSelectedItem("Select Status");

		}
	}

	public void itemStateChanged(ItemEvent e) {

		if (e.getSource() == ncb) {

			if (ncb.getSelectedItem().equals("Network1")) {
				n1.setVisible(true);
				n2.setVisible(false);
				n3.setVisible(false);
			}

			if (ncb.getSelectedItem().equals("Network2")) {
				n2.setVisible(true);
				n1.setVisible(false);
				n3.setVisible(false);
			}

			if (ncb.getSelectedItem().equals("Network3")) {
				n3.setVisible(true);
				n1.setVisible(false);
				n2.setVisible(false);

			}

		}
	}

}