/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 01:30:29 GMT 2022
 */

package org.chiknrice.iso;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chiknrice.iso.IsoMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IsoMessage_ESTest extends IsoMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-845));
      IsoMessage isoMessage1 = new IsoMessage(1717);
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        isoMessage0.copyFields(isoMessage1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(0);
      IsoMessage isoMessage1 = new IsoMessage(0);
      Integer[] integerArray0 = new Integer[1];
      // Undeclared exception!
      try { 
        isoMessage0.copyFields(isoMessage1, integerArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(58);
      Integer integer0 = new Integer(58);
      Integer integer1 = new Integer(0);
      isoMessage0.setField(integer0, (Object) integer1);
      isoMessage0.hashCode();
      assertEquals(58, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      isoMessage0.appendHeader((Object) null);
      isoMessage0.hashCode();
      assertEquals((-1339), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(0);
      Integer integer0 = isoMessage0.getMti();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(548);
      Integer integer0 = isoMessage0.getMti();
      assertEquals(548, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1341));
      isoMessage0.setField("0.0", (Object) isoMessage0);
      Integer integer0 = new Integer(0);
      TreeMap treeMap0 = (TreeMap)isoMessage0.getField(integer0);
      assertNotNull(treeMap0);
      assertEquals((-1341), (int)isoMessage0.getMti());
      assertEquals(1, treeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-2870));
      // Undeclared exception!
      try { 
        isoMessage0.setHeader((List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.chiknrice.iso.IsoMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(2430);
      // Undeclared exception!
      try { 
        isoMessage0.setField((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(1);
      // Undeclared exception!
      try { 
        isoMessage0.getHeader((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(4);
      // Undeclared exception!
      try { 
        isoMessage0.getField((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(4);
      // Undeclared exception!
      try { 
        isoMessage0.getField((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(3145);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "0Q+t$!QMTKZHBD";
      // Undeclared exception!
      try { 
        isoMessage0.copyFields(isoMessage0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0Q+t$!QMTKZHBD is not a valid iso field expression
         //
         verifyException("org.chiknrice.iso.IsoMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(4);
      // Undeclared exception!
      try { 
        isoMessage0.setField((Integer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(13);
      Integer integer0 = new Integer(13);
      isoMessage0.setField(integer0, (Object) integer0);
      Map<String, Object> map0 = isoMessage0.getAllFields();
      assertFalse(map0.isEmpty());
      assertEquals(13, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(266);
      Integer integer0 = new Integer(266);
      isoMessage0.getField(integer0);
      assertEquals(266, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(58);
      String[] stringArray0 = new String[0];
      isoMessage0.copyFields(isoMessage0, stringArray0);
      assertEquals(58, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1341));
      Integer integer0 = new Integer((-1341));
      Integer[] integerArray0 = new Integer[9];
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      integerArray0[2] = integer0;
      integerArray0[3] = integer0;
      integerArray0[4] = integer0;
      integerArray0[5] = integer0;
      integerArray0[6] = integer0;
      integerArray0[7] = integer0;
      integerArray0[8] = integer0;
      isoMessage0.copyFields(isoMessage0, integerArray0);
      assertEquals((-1341), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(266);
      Integer integer0 = new Integer(266);
      isoMessage0.setField(integer0, (Object) integer0);
      String string0 = isoMessage0.toString();
      assertEquals("\nMTI: 266\nFields:+\n  266: 266\n", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      isoMessage0.setField("0.0", (Object) null);
      String string0 = isoMessage0.toString();
      assertEquals("\nMTI: -1339\nFields:+\n  0:+\n", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(15);
      IsoMessage isoMessage1 = new IsoMessage((-701));
      boolean boolean0 = isoMessage1.equals(isoMessage0);
      assertEquals((-701), (int)isoMessage1.getMti());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(2180);
      Object object0 = new Object();
      isoMessage0.appendHeader(object0);
      IsoMessage isoMessage1 = new IsoMessage(2180);
      boolean boolean0 = isoMessage1.equals(isoMessage0);
      assertEquals(2180, (int)isoMessage1.getMti());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      Object object0 = new Object();
      boolean boolean0 = isoMessage0.equals(object0);
      assertEquals((-1339), (int)isoMessage0.getMti());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      boolean boolean0 = isoMessage0.equals(isoMessage0);
      assertTrue(boolean0);
      assertEquals((-1339), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-4));
      boolean boolean0 = isoMessage0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-4), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1341));
      isoMessage0.setField("0.0", (Object) isoMessage0);
      Integer integer0 = new Integer((-1341));
      isoMessage0.setField("0.0", (Object) integer0);
      assertEquals((-1341), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      // Undeclared exception!
      try { 
        isoMessage0.setField("8O@D _??@v_{0GR9+", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8O@D _??@v_{0GR9+ is not a valid iso field expression
         //
         verifyException("org.chiknrice.iso.IsoMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      Integer integer0 = new Integer((-1339));
      isoMessage0.setField(integer0, (Object) integer0);
      IsoMessage isoMessage1 = new IsoMessage((-1339));
      boolean boolean0 = isoMessage1.equals(isoMessage0);
      assertEquals((-1339), (int)isoMessage1.getMti());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-855));
      isoMessage0.setField("0.0", (Object) "0.0");
      Map<String, Object> map0 = isoMessage0.getAllFields();
      assertFalse(map0.isEmpty());
      assertEquals((-855), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      isoMessage0.setField("0.0", (Object) null);
      HashMap<Integer, HashMap<Integer, HashMap>> hashMap0 = isoMessage0.getField("0.0");
      assertEquals((-1339), (int)isoMessage0.getMti());
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1));
      // Undeclared exception!
      try { 
        isoMessage0.getField("TKhbI6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // TKhbI6 is not a valid iso field expression
         //
         verifyException("org.chiknrice.iso.IsoMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      isoMessage0.getField("0.0");
      assertEquals((-1339), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(266);
      Integer integer0 = new Integer(266);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.addFirst(integer0);
      isoMessage0.setHeader(linkedList0);
      assertEquals(266, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1316));
      Integer integer0 = isoMessage0.getMti();
      assertEquals((-1316), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-1339));
      isoMessage0.getHeader();
      assertEquals((-1339), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage((-855));
      isoMessage0.getAllFields();
      assertEquals((-855), (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(266);
      isoMessage0.getFields();
      assertEquals(266, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(43);
      Integer integer0 = new Integer(43);
      isoMessage0.getHeader(integer0);
      assertEquals(43, (int)isoMessage0.getMti());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IsoMessage isoMessage0 = new IsoMessage(43);
      Integer integer0 = new Integer(43);
      isoMessage0.appendHeader(integer0);
      String string0 = isoMessage0.toString();
      assertEquals("\nHeader:+\n  43\nMTI: 43\nFields:+\n", string0);
  }
}
