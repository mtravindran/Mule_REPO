/**
 *
 */
package deploymentnew;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

/**
 * @author Madhumitha
 *
 */
public class Tester extends FunctionalTestCase {
	@Override
	protected String[] getConfigFiles() {
		String[] configFile = new String[] { "salesforcetraining.xml" };
		return configFile;
	}

	@Test
	public void mavenFlowReturnsHelloMaven() throws Exception {
		runFlowAndExpect("mavenFlow", "Hello Maven");
	}
}
