/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 12:58:57 GMT 2022
 */

package es.bsc.dataclay.util.management.classmgr.python;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.util.management.classmgr.python.PythonTypeInfo;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PythonTypeInfo_ESTest extends PythonTypeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      pythonTypeInfo0.setSignature("Bg^gr I");
      pythonTypeInfo0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo("!/`leqD[Vb");
      pythonTypeInfo0.setSignature("");
      String string0 = pythonTypeInfo0.getSignature();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Random.setNextRandom((-1810906550));
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      UUID uUID0 = MockUUID.randomUUID();
      pythonTypeInfo0.setId(uUID0);
      UUID uUID1 = pythonTypeInfo0.getId();
      assertEquals((-5170712451691450261L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = null;
      try {
        pythonTypeInfo0 = new PythonTypeInfo((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Signature cannot be null
         //
         verifyException("es.bsc.dataclay.util.management.classmgr.python.PythonTypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      pythonTypeInfo0.setSignature("Bg^gr I");
      String string0 = pythonTypeInfo0.getSignature();
      assertEquals("Bg^gr I", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      String string0 = pythonTypeInfo0.getSignature();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      // Undeclared exception!
      try { 
        pythonTypeInfo0.setSignature((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Signature cannot be null
         //
         verifyException("es.bsc.dataclay.util.management.classmgr.python.PythonTypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      PythonTypeInfo pythonTypeInfo1 = new PythonTypeInfo("");
      boolean boolean0 = pythonTypeInfo0.equals(pythonTypeInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo("q;m=f8*zX");
      PythonTypeInfo pythonTypeInfo1 = new PythonTypeInfo();
      boolean boolean0 = pythonTypeInfo0.equals(pythonTypeInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      boolean boolean0 = pythonTypeInfo0.equals(pythonTypeInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      Object object0 = new Object();
      boolean boolean0 = pythonTypeInfo0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      // Undeclared exception!
      try { 
        pythonTypeInfo0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.management.classmgr.python.PythonTypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      UUID uUID0 = MockUUID.randomUUID();
      pythonTypeInfo0.setId(uUID0);
      UUID uUID1 = pythonTypeInfo0.getId();
      assertEquals(16793600L, uUID1.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      String string0 = pythonTypeInfo0.toString();
      assertEquals("PythonTypeInfo(signature = null)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo();
      UUID uUID0 = pythonTypeInfo0.getId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PythonTypeInfo pythonTypeInfo0 = new PythonTypeInfo(">@!k(`");
      boolean boolean0 = pythonTypeInfo0.equals(pythonTypeInfo0);
      assertTrue(boolean0);
  }
}
