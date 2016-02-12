/**
 * 
 */
package pl.hubster.crypto.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import pl.hubster.crypto.ComponentsContainer;
import pl.hubster.crypto.enumeration.Panel;

/**
 * @author Hubert
 *
 */
public class NumericConversionButton extends JButton {

	private static final long serialVersionUID = 7179319046162745417L;

	public NumericConversionButton() {
		super("Numeric Conversion");
		setBounds(20, 20, 150, 20);
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ComponentsContainer.getInstance().getMainFrame().switchPanel(Panel.NUMERIC_CONVERION);
			}
		});
	}
}
