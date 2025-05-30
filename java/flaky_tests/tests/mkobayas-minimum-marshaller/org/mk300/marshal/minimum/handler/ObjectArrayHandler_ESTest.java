/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:41:24 GMT 2022
 */

package org.mk300.marshal.minimum.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mk300.marshal.minimum.handler.ObjectArrayHandler;
import org.mk300.marshal.minimum.io.OInput;
import org.mk300.marshal.minimum.io.OInputImpl;
import org.mk300.marshal.minimum.io.OOutput;
import org.mk300.marshal.minimum.io.OOutputImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectArrayHandler_ESTest extends ObjectArrayHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        objectArrayHandler0.writeObject((OOutput) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mk300.marshal.minimum.io.NaturalNumberIoHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      Class<Object[]> class0 = Object[].class;
      // Undeclared exception!
      try { 
        objectArrayHandler0.readObject((OInput) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mk300.marshal.minimum.io.NaturalNumberIoHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-95);
      byteArray0[1] = (byte) (-95);
      byteArray0[2] = (byte) (-95);
      byteArray0[3] = (byte) (-95);
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<Object[]> class0 = Object[].class;
      // Undeclared exception!
      try { 
        objectArrayHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -69751040
         //
         verifyException("org.mk300.marshal.minimum.handler.ObjectArrayHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-95);
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<Object[]> class0 = Object[].class;
      // Undeclared exception!
      try { 
        objectArrayHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)8;
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<Object[]> class0 = Object[].class;
      // Undeclared exception!
      try { 
        objectArrayHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.mk300.marshal.minimum.registry.HandlerRegistry
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      byte[] byteArray0 = new byte[7];
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<Object[]> class0 = Object[].class;
      Object[] objectArray0 = objectArrayHandler0.readObject(oInputImpl0, class0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      OOutputImpl oOutputImpl0 = new OOutputImpl(1);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        objectArrayHandler0.writeObject((OOutput) oOutputImpl0, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.mk300.marshal.minimum.registry.HandlerRegistry
         //
         verifyException("org.mk300.marshal.minimum.io.OOutputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectArrayHandler objectArrayHandler0 = new ObjectArrayHandler();
      OOutputImpl oOutputImpl0 = new OOutputImpl(0);
      Object[] objectArray0 = new Object[0];
      objectArrayHandler0.writeObject((OOutput) oOutputImpl0, objectArray0);
      assertEquals(0, objectArray0.length);
  }
}
