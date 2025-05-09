/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 12:28:15 GMT 2022
 */

package es.bsc.dataclay.util.management.contractmgr;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.util.ids.ImplementationID;
import es.bsc.dataclay.util.management.contractmgr.OpImplementations;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpImplementations_ESTest extends OpImplementations_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("dIh6P&Vj?:h&ze=\"'=A", 0, 0);
      UUID uUID0 = MockUUID.randomUUID();
      ImplementationID implementationID0 = new ImplementationID(uUID0);
      opImplementations0.setRemoteImplementationID(implementationID0);
      opImplementations0.getRemoteImplementationID();
      assertEquals(0, opImplementations0.getNumRemoteImpl());
      assertEquals(0, opImplementations0.getNumLocalImpl());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("t..K>]|hkie#imY", (-3735), 0);
      opImplementations0.getOperationSignature();
      assertEquals((-3735), opImplementations0.getNumLocalImpl());
      assertEquals(0, opImplementations0.getNumRemoteImpl());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("", 127, 785);
      opImplementations0.getOperationSignature();
      assertEquals(127, opImplementations0.getNumLocalImpl());
      assertEquals(785, opImplementations0.getNumRemoteImpl());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("DB%n9:I ", 5630, 128);
      int int0 = opImplementations0.getNumRemoteImpl();
      assertEquals(5630, opImplementations0.getNumLocalImpl());
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      opImplementations0.setNumRemoteImpl((-717));
      int int0 = opImplementations0.getNumRemoteImpl();
      assertEquals((-717), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("'p&Zsx'hLV9e0Ex", 625, 1433);
      int int0 = opImplementations0.getNumLocalImpl();
      assertEquals(1433, opImplementations0.getNumRemoteImpl());
      assertEquals(625, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("", (-647), (-647));
      int int0 = opImplementations0.getNumLocalImpl();
      assertEquals((-647), opImplementations0.getNumRemoteImpl());
      assertEquals((-647), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      UUID uUID0 = MockUUID.randomUUID();
      ImplementationID implementationID0 = new ImplementationID(uUID0);
      opImplementations0.setLocalImplementationID(implementationID0);
      ImplementationID implementationID1 = opImplementations0.getLocalImplementationID();
      assertSame(implementationID1, implementationID0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Random.setNextRandom(460);
      OpImplementations opImplementations0 = new OpImplementations("", 460, 1048);
      UUID uUID0 = MockUUID.randomUUID();
      opImplementations0.setId(uUID0);
      opImplementations0.getId();
      assertEquals(1048, opImplementations0.getNumRemoteImpl());
      assertEquals(460, opImplementations0.getNumLocalImpl());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("", 460, 1048);
      UUID uUID0 = MockUUID.randomUUID();
      opImplementations0.setId(uUID0);
      opImplementations0.getId();
      assertEquals(460, opImplementations0.getNumLocalImpl());
      assertEquals(1048, opImplementations0.getNumRemoteImpl());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID((UUID) null);
      opImplementations0.setRemoteImplementationID(implementationID0);
      // Undeclared exception!
      try { 
        opImplementations0.equals(opImplementations0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("t..K>]|hkie#imY", (-3735), 0);
      opImplementations0.getLocalImplementationID();
      assertEquals(0, opImplementations0.getNumRemoteImpl());
      assertEquals((-3735), opImplementations0.getNumLocalImpl());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("t..K>]|hkie#imY", (-3735), 0);
      opImplementations0.setNumLocalImpl((-1978));
      assertEquals((-1978), opImplementations0.getNumLocalImpl());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations("", 0, 0);
      opImplementations0.getRemoteImplementationID();
      assertEquals(0, opImplementations0.getNumLocalImpl());
      assertEquals(0, opImplementations0.getNumRemoteImpl());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      opImplementations0.setOperationSignature("z!op2*+ PW%KB_J%2a");
      assertEquals("z!op2*+ PW%KB_J%2a", opImplementations0.getOperationSignature());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      UUID uUID0 = MockUUID.fromString("@[%2w!");
      ImplementationID implementationID0 = new ImplementationID(uUID0);
      opImplementations0.setLocalImplementationID(implementationID0);
      opImplementations0.setRemoteImplementationID(implementationID0);
      OpImplementations opImplementations1 = new OpImplementations();
      opImplementations1.setLocalImplementationID(implementationID0);
      boolean boolean0 = opImplementations1.equals(opImplementations0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      opImplementations0.setLocalImplementationID(implementationID0);
      opImplementations0.setRemoteImplementationID(implementationID0);
      OpImplementations opImplementations1 = new OpImplementations();
      boolean boolean0 = opImplementations1.equals(opImplementations0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      OpImplementations opImplementations1 = new OpImplementations();
      opImplementations1.setLocalImplementationID(implementationID0);
      boolean boolean0 = opImplementations0.equals(opImplementations1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      opImplementations0.setLocalImplementationID(implementationID0);
      OpImplementations opImplementations1 = new OpImplementations();
      opImplementations1.setRemoteImplementationID(implementationID0);
      boolean boolean0 = opImplementations1.equals(opImplementations0);
      assertFalse(opImplementations1.equals((Object)opImplementations0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      UUID uUID0 = MockUUID.fromString("@[%2w!");
      ImplementationID implementationID0 = new ImplementationID(uUID0);
      opImplementations0.setLocalImplementationID(implementationID0);
      opImplementations0.setRemoteImplementationID(implementationID0);
      boolean boolean0 = opImplementations0.equals(opImplementations0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      OpImplementations opImplementations1 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      opImplementations1.setRemoteImplementationID(implementationID0);
      boolean boolean0 = opImplementations0.equals(opImplementations1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      opImplementations0.setLocalImplementationID(implementationID0);
      OpImplementations opImplementations1 = new OpImplementations();
      assertFalse(opImplementations1.equals((Object)opImplementations0));
      
      opImplementations1.setRemoteImplementationID(implementationID0);
      boolean boolean0 = opImplementations0.equals(opImplementations1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      OpImplementations opImplementations1 = new OpImplementations();
      opImplementations1.setRemoteImplementationID(implementationID0);
      boolean boolean0 = opImplementations1.equals(opImplementations0);
      assertFalse(opImplementations1.equals((Object)opImplementations0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      UUID uUID0 = MockUUID.fromString("@[%2w!");
      ImplementationID implementationID0 = new ImplementationID(uUID0);
      opImplementations0.setLocalImplementationID(implementationID0);
      boolean boolean0 = opImplementations0.equals(opImplementations0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      boolean boolean0 = opImplementations0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      int int0 = opImplementations0.getNumLocalImpl();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      boolean boolean0 = opImplementations0.equals(opImplementations0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      int int0 = opImplementations0.getNumRemoteImpl();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      UUID uUID0 = opImplementations0.getId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      opImplementations0.setLocalImplementationID(implementationID0);
      OpImplementations opImplementations1 = new OpImplementations();
      boolean boolean0 = opImplementations0.equals(opImplementations1);
      assertFalse(opImplementations1.equals((Object)opImplementations0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      String string0 = opImplementations0.getOperationSignature();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      opImplementations0.hashCode();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpImplementations opImplementations0 = new OpImplementations();
      ImplementationID implementationID0 = new ImplementationID();
      opImplementations0.setRemoteImplementationID(implementationID0);
      boolean boolean0 = opImplementations0.equals(opImplementations0);
      assertTrue(boolean0);
  }
}
