/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:26:23 GMT 2022
 */

package org.mk300.marshal.minimum.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EnumMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mk300.marshal.minimum.handler.EnumMapHandler;
import org.mk300.marshal.minimum.io.OInput;
import org.mk300.marshal.minimum.io.OInputImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EnumMapHandler_ESTest extends EnumMapHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnumMapHandler enumMapHandler0 = new EnumMapHandler();
      Class<EnumMap> class0 = EnumMap.class;
      // Undeclared exception!
      try { 
        enumMapHandler0.readObject((OInput) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mk300.marshal.minimum.handler.EnumMapHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnumMapHandler enumMapHandler0 = new EnumMapHandler();
      byte[] byteArray0 = new byte[2];
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<EnumMap> class0 = EnumMap.class;
      // Undeclared exception!
      try { 
        enumMapHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.mk300.marshal.minimum.registry.HandlerRegistry
         //
         verifyException("org.mk300.marshal.minimum.handler.EnumMapHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EnumMapHandler enumMapHandler0 = new EnumMapHandler();
      byte[] byteArray0 = new byte[0];
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<EnumMap> class0 = EnumMap.class;
      // Undeclared exception!
      try { 
        enumMapHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }
}
