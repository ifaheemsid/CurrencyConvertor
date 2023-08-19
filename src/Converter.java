import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Converter extends JFrame {

	private JPanel contentPane;
	private JTextField txtamount;
	private JTextField txtfrom;
	private JTextField txtto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Converter() {
		setTitle("Convertor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(17, 221, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(226, 11, 302, 36);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 26));
		contentPane.add(lblNewLabel);
		
		JLabel lebel_2 = new JLabel("From");
		lebel_2.setForeground(new Color(0, 0, 0));
		lebel_2.setFont(new Font("Algerian", Font.BOLD, 17));
		lebel_2.setBounds(124, 144, 131, 30);
		contentPane.add(lebel_2);
		
		JLabel lebel_1 = new JLabel("Enter a Amount");
		lebel_1.setForeground(new Color(0, 0, 0));
		lebel_1.setFont(new Font("Algerian", Font.BOLD, 17));
		lebel_1.setBounds(124, 82, 146, 33);
		contentPane.add(lebel_1);
		
		JLabel lebel_3 = new JLabel("To");
		lebel_3.setForeground(new Color(0, 0, 0));
		lebel_3.setFont(new Font("Algerian", Font.BOLD, 17));
		lebel_3.setBounds(124, 206, 131, 28);
		contentPane.add(lebel_3);
		
		txtamount = new JTextField();
		txtamount.setBounds(318, 80, 199, 36);
		contentPane.add(txtamount);
		txtamount.setColumns(10);
		
		//edited it should be final
		final JComboBox txtfrom = new JComboBox();
		txtfrom.setModel(new DefaultComboBoxModel(new String[] {"USD", "Euro", "Pound", "Rial", "Dinar"}));
		txtfrom.setToolTipText("");
		txtfrom.setBounds(318, 142, 199, 34);
		contentPane.add(txtfrom);
		
		final JComboBox txtto = new JComboBox();
		txtto.setModel(new DefaultComboBoxModel(new String[] {"Indian Rupees", "Srilankan Rupees", "Pakistani Rupees"}));
		txtto.setBounds(318, 205, 199, 31);
		contentPane.add(txtto);
		
		JButton btn = new JButton("Convert");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code here
				Double tot;				
				Double amount = Double.parseDouble(txtamount.getText());
				
				//converting for Doller
				if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "Indian Rupees") {
					tot = amount * 82.71;
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}				
				else if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "Srilankan Rupees") {
					tot = amount * 319.77;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				else if(txtfrom.getSelectedItem().toString() == "USD" && txtto.getSelectedItem().toString() == "Pakistani Rupees") {
					tot = amount * 287.60;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				
				//Euro
				else if(txtfrom.getSelectedItem().toString() == "Euro" && txtto.getSelectedItem().toString() == "Indian Rupees") {
					tot = amount * 91.09;
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}				
				else if(txtfrom.getSelectedItem().toString() == "Euro" && txtto.getSelectedItem().toString() == "Srilankan Rupees") {
					tot = amount * 352.34;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				else if(txtfrom.getSelectedItem().toString() == "Euro" && txtto.getSelectedItem().toString() == "Pakistani Rupees") {
					tot = amount * 316.00;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				
				//Pound
				else if(txtfrom.getSelectedItem().toString() == "Pound" && txtto.getSelectedItem().toString() == "Indian Rupees") {
					tot = amount * 105.243;
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}				
				else if(txtfrom.getSelectedItem().toString() == "Pound" && txtto.getSelectedItem().toString() == "Srilankan Rupees") {
					tot = amount * 407.50;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				else if(txtfrom.getSelectedItem().toString() == "Pound" && txtto.getSelectedItem().toString() == "Pakistani Rupees") {
					tot = amount * 366.06;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				//Rial
				else if(txtfrom.getSelectedItem().toString() == "Rial" && txtto.getSelectedItem().toString() == "Indian Rupees") {
					tot = amount * 22.11;
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}				
				else if(txtfrom.getSelectedItem().toString() == "Rial" && txtto.getSelectedItem().toString() == "Srilankan Rupees") {
					tot = amount * 85.56;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				else if(txtfrom.getSelectedItem().toString() == "Rial" && txtto.getSelectedItem().toString() == "Pakistani Rupees") {
					tot = amount * 76.86;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				
				//Dinar
				else if(txtfrom.getSelectedItem().toString() == "Dinar" && txtto.getSelectedItem().toString() == "Indian Rupees") {
					tot = amount * 269.67;
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}				
				else if(txtfrom.getSelectedItem().toString() == "Dinar" && txtto.getSelectedItem().toString() == "Srilankan Rupees") {
					tot = amount * 1043.55;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				else if(txtfrom.getSelectedItem().toString() == "Dinar" && txtto.getSelectedItem().toString() == "Pakistani Rupees") {
					tot = amount * 937.43 ;					
					JOptionPane.showMessageDialog(contentPane,"Your Amount will be "+ tot.toString());
				}
				
				
			}
		});
		btn.setFont(new Font("Algerian", Font.PLAIN, 14));
		btn.setBounds(372, 261, 105, 36);
		contentPane.add(btn);
		
		JLabel backgroundImage = new JLabel("");
		backgroundImage.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\CurrencyConverter\\image\\4.jpg"));
		backgroundImage.setBounds(0, 0, 716, 452);
		contentPane.add(backgroundImage);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lebel_2, lebel_1, lebel_3, txtamount, txtfrom, txtto, btn}));
	}
}
