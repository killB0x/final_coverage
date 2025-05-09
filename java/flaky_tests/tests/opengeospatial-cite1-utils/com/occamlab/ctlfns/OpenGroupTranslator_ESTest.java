/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 08:22:14 GMT 2022
 */

package com.occamlab.ctlfns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.occamlab.ctlfns.OpenGroupTranslator;
import java.net.URLConnection;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpenGroupTranslator_ESTest extends OpenGroupTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      try { 
        OpenGroupTranslator.translate((URLConnection) null, iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.occamlab.ctlfns.OpenGroupTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OpenGroupTranslator openGroupTranslator0 = new OpenGroupTranslator();
  }
}
