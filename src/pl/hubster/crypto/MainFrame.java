/**
 * 
 */
package pl.hubster.crypto;

import javax.swing.JFrame;

import pl.hubster.crypto.enumeration.Panel;

/**
 * @author Hubert
 *
 */
public class MainFrame extends JFrame implements PanelSwitcher {

	private static final long serialVersionUID = 1L;
	private ComponentsContainer componentsContainer = ComponentsContainer.getInstance();
	public MainFrame() {
		setSize(360, 80);
		setTitle("Crypto BETA");
		setLayout(null);
		MainPanel mainPanel = new MainPanel();
		add(mainPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		componentsContainer.setMainFrame(this);
	}

	@Override
	public void switchPanel(Panel panel) {
		handleSwitchOperation(panel);
	}


	private void handleSwitchOperation(Panel panel) {
		switch (panel) {
		case MAIN:
			System.out.println("1");
			break;
		case NUMERIC_CONVERION:
			System.out.println("2");
			break;
		case CRYPTOGRAPHY:
			System.out.println("3");
			break;
		default:
			break;
		}
	}

	public void go() {
		setVisible(true);
	}
}
