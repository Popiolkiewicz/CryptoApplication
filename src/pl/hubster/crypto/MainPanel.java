/**
 * 
 */
package pl.hubster.crypto;

import javax.swing.JButton;
import javax.swing.JPanel;

import pl.hubster.crypto.buttons.CryptographyButton;
import pl.hubster.crypto.buttons.NumericConversionButton;

/**
 * @author Hubert
 *
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = -4495795404461122533L;

	private JButton numericConversionButton, cryptographyButton;

	public MainPanel() {
		setSize(360, 150);
		numericConversionButton = new NumericConversionButton();
		cryptographyButton = new CryptographyButton();
		add(numericConversionButton);
		add(cryptographyButton);
		setVisible(true);
	}
}
