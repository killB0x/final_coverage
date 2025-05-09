/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:35:10 GMT 2022
 */

package org.mk300.marshal.minimum.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mk300.marshal.minimum.handler.ArrayListHandler;
import org.mk300.marshal.minimum.io.OInput;
import org.mk300.marshal.minimum.io.OInputImpl;
import org.mk300.marshal.minimum.io.OOutput;
import org.mk300.marshal.minimum.io.OOutputImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArrayListHandler_ESTest extends ArrayListHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      // Undeclared exception!
      try { 
        arrayListHandler0.writeObject((OOutput) null, arrayList0);
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
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-5);
      byteArray0[1] = (byte) (-5);
      byteArray0[2] = (byte) (-5);
      byteArray0[3] = (byte) (-5);
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<ArrayList> class0 = ArrayList.class;
      // Undeclared exception!
      arrayListHandler0.readObject(oInputImpl0, class0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      Class<ArrayList> class0 = ArrayList.class;
      // Undeclared exception!
      try { 
        arrayListHandler0.readObject((OInput) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mk300.marshal.minimum.io.NaturalNumberIoHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte) (-75);
      byteArray0[2] = (byte) (-6);
      byteArray0[3] = (byte) (-15);
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<ArrayList> class0 = ArrayList.class;
      // Undeclared exception!
      try { 
        arrayListHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1186904320
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)106;
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<ArrayList> class0 = ArrayList.class;
      // Undeclared exception!
      try { 
        arrayListHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte)106;
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<ArrayList> class0 = ArrayList.class;
      // Undeclared exception!
      try { 
        arrayListHandler0.readObject(oInputImpl0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.mk300.marshal.minimum.registry.HandlerRegistry
         //
         verifyException("org.mk300.marshal.minimum.io.OInputImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      OOutputImpl oOutputImpl0 = new OOutputImpl(0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      // Undeclared exception!
      try { 
        arrayListHandler0.writeObject((OOutput) oOutputImpl0, (ArrayList) arrayList0);
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
      ArrayListHandler arrayListHandler0 = new ArrayListHandler();
      OOutputImpl oOutputImpl0 = new OOutputImpl(0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayListHandler0.writeObject((OOutput) oOutputImpl0, (ArrayList) arrayList0);
      byte[] byteArray0 = oOutputImpl0.toBytes();
      OInputImpl oInputImpl0 = new OInputImpl(byteArray0);
      Class<ArrayList> class0 = ArrayList.class;
      ArrayList arrayList1 = arrayListHandler0.readObject(oInputImpl0, class0);
      assertTrue(arrayList1.isEmpty());
  }
}
