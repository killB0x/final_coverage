/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:19:05 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.expand;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import jp.co.yahoo.yosegi.binary.ColumnBinary;
import jp.co.yahoo.yosegi.blockindex.BlockIndexNode;
import jp.co.yahoo.yosegi.spread.expand.NotExpandFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NotExpandFunction_ESTest extends NotExpandFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotExpandFunction notExpandFunction0 = new NotExpandFunction();
      int int0 = notExpandFunction0.expandFromColumnBinary((List<ColumnBinary>) null, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NotExpandFunction notExpandFunction0 = new NotExpandFunction();
      LinkedList<ColumnBinary> linkedList0 = new LinkedList<ColumnBinary>();
      int int0 = notExpandFunction0.expandFromColumnBinary(linkedList0, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NotExpandFunction notExpandFunction0 = new NotExpandFunction();
      String[] stringArray0 = notExpandFunction0.getExpandLinkColumnName("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NotExpandFunction notExpandFunction0 = new NotExpandFunction();
      notExpandFunction0.expandIndexNode((BlockIndexNode) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NotExpandFunction notExpandFunction0 = new NotExpandFunction();
      LinkedList<ColumnBinary> linkedList0 = new LinkedList<ColumnBinary>();
      int int0 = notExpandFunction0.expandFromColumnBinary(linkedList0, 4330);
      assertEquals(4330, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NotExpandFunction notExpandFunction0 = new NotExpandFunction();
      List<String[]> list0 = notExpandFunction0.getExpandColumnName();
      assertEquals(0, list0.size());
  }
}
