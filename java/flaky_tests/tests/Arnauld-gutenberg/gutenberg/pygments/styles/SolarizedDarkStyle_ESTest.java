/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:21:17 GMT 2022
 */

package gutenberg.pygments.styles;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import gutenberg.pygments.styles.SolarizedDarkStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SolarizedDarkStyle_ESTest extends SolarizedDarkStyle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolarizedDarkStyle solarizedDarkStyle0 = null;
      try {
        solarizedDarkStyle0 = new SolarizedDarkStyle();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("gutenberg.pygments.StyleSheet", e);
      }
  }
}
