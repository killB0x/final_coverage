/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:08:29 GMT 2022
 */

package sk.antons.sprops.tool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sk.antons.sprops.tool.PropFile;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PropFile_ESTest extends PropFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        PropFile.instance("4~.=KGq>[+f{cfH ");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // sk/antons/jaul/util/TextFile
         //
         verifyException("sk.antons.sprops.tool.PropFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropFile propFile0 = null;
      try {
        propFile0 = new PropFile("4~.=KGq>[+f{cfH ");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // sk/antons/jaul/util/TextFile
         //
         verifyException("sk.antons.sprops.tool.PropFile", e);
      }
  }
}
