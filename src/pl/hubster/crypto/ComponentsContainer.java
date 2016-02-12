/**
 * 
 */
package pl.hubster.crypto;

/**
 * @author Hubert
 *
 */
public class ComponentsContainer {

	private static ComponentsContainer componentsContainer;
	private MainFrame mainFrame;

	private ComponentsContainer() {
	}

	public static ComponentsContainer getInstance() {
		if (componentsContainer == null)
			componentsContainer = new ComponentsContainer();
		return componentsContainer;
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
}
