/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:32:07 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.future.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.future.item.FutureTickBatchItem;
import com.tigerbrokers.stock.openapi.client.https.domain.future.item.FutureTickItem;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FutureTickBatchItem_ESTest extends FutureTickBatchItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      LinkedList<FutureTickItem> linkedList0 = new LinkedList<FutureTickItem>();
      FutureTickItem futureTickItem0 = new FutureTickItem();
      linkedList0.add(futureTickItem0);
      futureTickBatchItem0.setItems(linkedList0);
      List<FutureTickItem> list0 = futureTickBatchItem0.getItems();
      assertTrue(list0.contains(futureTickItem0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      futureTickBatchItem0.setContractCode("");
      String string0 = futureTickBatchItem0.getContractCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      List<FutureTickItem> list0 = futureTickBatchItem0.getItems();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      LinkedList<FutureTickItem> linkedList0 = new LinkedList<FutureTickItem>();
      futureTickBatchItem0.setItems(linkedList0);
      List<FutureTickItem> list0 = futureTickBatchItem0.getItems();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      futureTickBatchItem0.setContractCode("JVwu^.[c?");
      String string0 = futureTickBatchItem0.getContractCode();
      assertEquals("JVwu^.[c?", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      String string0 = futureTickBatchItem0.getContractCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FutureTickBatchItem futureTickBatchItem0 = new FutureTickBatchItem();
      String string0 = futureTickBatchItem0.toString();
      assertEquals("FutureTickBatchItem{contractCode='null', items=null}", string0);
  }
}
