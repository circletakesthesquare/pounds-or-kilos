/*
 * 	sources: https://exrx.net/Calculators/OneRepMax
 * 			https://en.wikipedia.org/wiki/One-repetition_maximum -> Brzycki's formula
 * 
 * 
 * 		order of program:
 * 			1 - initialize frame
 * 			2 - declare all labels, textfields and combo box (set up the calculator)
 * 			3 - implement functionality for calculate and clear buttons
 * 
 */

package swing_beginner;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Application extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField textFieldWeightLifted;
	private JTextField textField50PercentRM;
	private JTextField textField55PercentRM;
	private JTextField textField60PercentRM;
	private JTextField textField65PercentRM;
	private JTextField textField70PercentRM;
	private JTextField textField75PercentRM;
	private JTextField textField80PercentRM;
	private JTextField textField85PercentRM;
	private JTextField textField90PercentRM;
	private JTextField textField95PercentRM;
	private JTextField textFieldPredicted1RM;

	private int reps;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setTitle("1 Rep Max Prediction Calculator");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Application() {
		
		getContentPane().setBackground(SystemColor.window);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 400);
		getContentPane().setLayout(null);

		

		JLabel weightLiftedLabel = new JLabel("Weight Lifted: (lbs)");
		weightLiftedLabel.setBounds(25, 12, 114, 20);
		getContentPane().add(weightLiftedLabel);
		
		
		
		JLabel lblRepsPerformed = new JLabel("Reps Performed:");
		lblRepsPerformed.setBounds(25, 87, 100, 14);
		getContentPane().add(lblRepsPerformed);
		
		

		JLabel lbl50PercentLabel = new JLabel("50% 1RM:");
		lbl50PercentLabel.setBounds(201, 15, 58, 14);
		getContentPane().add(lbl50PercentLabel);
		


		JLabel lbl55PercentLabel = new JLabel("55% 1RM: ");
		lbl55PercentLabel.setBounds(201, 68, 58, 14);
		getContentPane().add(lbl55PercentLabel);
		


		JLabel lbl60PercentLabel = new JLabel("60% 1RM:");
		lbl60PercentLabel.setBounds(201, 118, 58, 14);
		getContentPane().add(lbl60PercentLabel);
		


		JLabel lbl65PercentLabel = new JLabel("65% 1RM:");
		lbl65PercentLabel.setBounds(201, 174, 58, 14);
		getContentPane().add(lbl65PercentLabel);
		

		JLabel lbl70PercentLabel = new JLabel("70% 1RM:");
		lbl70PercentLabel.setBounds(201, 230, 58, 14);
		getContentPane().add(lbl70PercentLabel);
		


		JLabel lbl75PercentLabel = new JLabel("75% 1RM:");
		lbl75PercentLabel.setBounds(327, 15, 58, 14);
		getContentPane().add(lbl75PercentLabel);
		


		JLabel lbl80PercentLabel = new JLabel("80% 1RM:");
		lbl80PercentLabel.setBounds(327, 68, 58, 14);
		getContentPane().add(lbl80PercentLabel);
		


		JLabel lbl85PercentLabel = new JLabel("85% 1RM:");
		lbl85PercentLabel.setBounds(327, 118, 58, 14);
		getContentPane().add(lbl85PercentLabel);
		


		JLabel lbl90PercentLabel = new JLabel("90% 1RM:");
		lbl90PercentLabel.setBounds(327, 174, 58, 14);
		getContentPane().add(lbl90PercentLabel);
		


		JLabel lbl95PercentLabel = new JLabel("95% 1RM:");
		lbl95PercentLabel.setBounds(327, 230, 58, 14);
		getContentPane().add(lbl95PercentLabel);
		


		JLabel lblPredicted1RM = new JLabel("Predicted 1 Rep Max: ");
		lblPredicted1RM.setBounds(131, 315, 128, 17);
		getContentPane().add(lblPredicted1RM);
		
		
		textFieldWeightLifted = new JTextField();
		textFieldWeightLifted.setToolTipText("Enter a number in this box to calculate a one-rep max.");
		textFieldWeightLifted.setBounds(25, 37, 86, 20);
		getContentPane().add(textFieldWeightLifted);
		textFieldWeightLifted.setColumns(10);
		
		
		textField50PercentRM = new JTextField();
		textField50PercentRM.setBackground(SystemColor.control);
		textField50PercentRM.setEditable(false);
		textField50PercentRM.setBounds(201, 37, 86, 20);
		getContentPane().add(textField50PercentRM);
		textField50PercentRM.setColumns(10);

		
		textField55PercentRM = new JTextField();
		textField55PercentRM.setBackground(SystemColor.control);
		textField55PercentRM.setEditable(false);
		textField55PercentRM.setBounds(201, 87, 86, 20);
		getContentPane().add(textField55PercentRM);
		textField55PercentRM.setColumns(10);
		
		
		textField60PercentRM = new JTextField();
		textField60PercentRM.setBackground(SystemColor.control);
		textField60PercentRM.setEditable(false);
		textField60PercentRM.setBounds(201, 143, 86, 20);
		getContentPane().add(textField60PercentRM);
		textField60PercentRM.setColumns(10);
		
		
		textField65PercentRM = new JTextField();
		textField65PercentRM.setBackground(SystemColor.control);
		textField65PercentRM.setEditable(false);
		textField65PercentRM.setBounds(201, 200, 86, 20);
		getContentPane().add(textField65PercentRM);
		textField65PercentRM.setColumns(10);

		
		textField70PercentRM = new JTextField();
		textField70PercentRM.setBackground(SystemColor.control);
		textField70PercentRM.setEditable(false);
		textField70PercentRM.setBounds(201, 255, 86, 20);
		getContentPane().add(textField70PercentRM);
		textField70PercentRM.setColumns(10);
		
		
		textField75PercentRM = new JTextField();
		textField75PercentRM.setBackground(SystemColor.control);
		textField75PercentRM.setEditable(false);
		textField75PercentRM.setBounds(324, 37, 86, 20);
		getContentPane().add(textField75PercentRM);
		textField75PercentRM.setColumns(10);
		
		
		textField80PercentRM = new JTextField();
		textField80PercentRM.setBackground(SystemColor.control);
		textField80PercentRM.setEditable(false);
		textField80PercentRM.setBounds(327, 87, 86, 20);
		getContentPane().add(textField80PercentRM);
		textField80PercentRM.setColumns(10);
		
		
		textField85PercentRM = new JTextField();
		textField85PercentRM.setBackground(SystemColor.control);
		textField85PercentRM.setEditable(false);
		textField85PercentRM.setBounds(324, 143, 86, 20);
		getContentPane().add(textField85PercentRM);
		textField85PercentRM.setColumns(10);
		
		
		textField90PercentRM = new JTextField();
		textField90PercentRM.setBackground(SystemColor.control);
		textField90PercentRM.setEditable(false);
		textField90PercentRM.setBounds(324, 200, 86, 20);
		getContentPane().add(textField90PercentRM);
		textField90PercentRM.setColumns(10);
		
		
		textField95PercentRM = new JTextField();
		textField95PercentRM.setBackground(SystemColor.control);
		textField95PercentRM.setEditable(false);
		textField95PercentRM.setBounds(324, 255, 86, 20);
		getContentPane().add(textField95PercentRM);
		textField95PercentRM.setColumns(10);

		
		textFieldPredicted1RM = new JTextField();
		textFieldPredicted1RM.setBackground(SystemColor.control);
		textFieldPredicted1RM.setEditable(false);
		textFieldPredicted1RM.setBounds(262, 315, 92, 20);
		getContentPane().add(textFieldPredicted1RM);
		textFieldPredicted1RM.setColumns(10);
		
		
		
		JComboBox<Integer> comboBox = new JComboBox<>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				reps = comboBox.getItemAt(comboBox.getSelectedIndex());
			}
		});
		comboBox.setToolTipText("Pick a number of reps from 1-10, then click calculate.");
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(25, 112, 86, 20);
		for (int i = 1; i <= 10; i++) {
			comboBox.addItem(new Integer(i));
		}
		getContentPane().add(comboBox);
		

		JButton btnCalculateButton = new JButton("Calculate");
		btnCalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent calcButtonClicked) {

				double weightLifted;
				double predictedMax;

				String percentageCalculated;
				double setOutput;
				

				try {
					weightLifted = Double.parseDouble(textFieldWeightLifted.getText());
					
					if(weightLifted >= 2000.0) {
						throw new IllegalArgumentException();
					}

					predictedMax = (weightLifted / (1.0278 - (0.0278 * (double) reps))); // Brzycki equation
					
					percentageCalculated = String.format("%.0f", predictedMax);
					textFieldPredicted1RM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .5);
					percentageCalculated = String.format("%.0f", setOutput);

					textField50PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .55);
					percentageCalculated = String.format("%.0f", setOutput);

					textField55PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .60);
					percentageCalculated = String.format("%.0f", setOutput);

					textField60PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .65);
					percentageCalculated = String.format("%.0f", setOutput);

					textField65PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .70);
					percentageCalculated = String.format("%.0f", setOutput);

					textField70PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .75);
					percentageCalculated = String.format("%.0f", setOutput);

					textField75PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .80);
					percentageCalculated = String.format("%.0f", setOutput);

					textField80PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .85);
					percentageCalculated = String.format("%.0f", setOutput);

					textField85PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .90);
					percentageCalculated = String.format("%.0f", setOutput);

					textField90PercentRM.setText(percentageCalculated);

					setOutput = Math.round(predictedMax * .95);
					percentageCalculated = String.format("%.0f", setOutput);

					textField95PercentRM.setText(percentageCalculated);

				} catch (Exception e) {

					JOptionPane.showMessageDialog(null,
							"Enter a number <= 2000 lbs into Weight Lifted and a number of reps"
									+ " to perform the calculation. e.g. '100' or '100.00'");

					textFieldWeightLifted.setText("");
				}
			}
		});
		
		btnCalculateButton.setBounds(25, 199, 100, 23);
		getContentPane().add(btnCalculateButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent clearButtonClicked) {

				textFieldWeightLifted.setText("");
				textFieldPredicted1RM.setText("");
				textField50PercentRM.setText("");
				textField55PercentRM.setText("");
				textField60PercentRM.setText("");
				textField65PercentRM.setText("");
				textField70PercentRM.setText("");
				textField75PercentRM.setText("");
				textField80PercentRM.setText("");
				textField85PercentRM.setText("");
				textField90PercentRM.setText("");
				textField95PercentRM.setText("");
			}
		});
		btnClear.setBounds(25, 272, 100, 23);
		getContentPane().add(btnClear);
	}
}