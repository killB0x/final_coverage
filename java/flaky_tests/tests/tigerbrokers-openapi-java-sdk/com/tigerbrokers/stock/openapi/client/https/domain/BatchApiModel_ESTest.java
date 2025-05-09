/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:54:34 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.ApiModel;
import com.tigerbrokers.stock.openapi.client.https.domain.BatchApiModel;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BatchApiModel_ESTest extends BatchApiModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<BatchApiModel<Object>> linkedList0 = new LinkedList<BatchApiModel<Object>>();
      BatchApiModel<Object> batchApiModel0 = new BatchApiModel<Object>(linkedList0);
      linkedList0.add(batchApiModel0);
      List<? extends ApiModel> list0 = batchApiModel0.getItems();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BatchApiModel<BatchApiModel<Object>> batchApiModel0 = new BatchApiModel<BatchApiModel<Object>>((List<? extends ApiModel>) null);
      List<? extends ApiModel> list0 = batchApiModel0.getItems();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<BatchApiModel<Object>> linkedList0 = new LinkedList<BatchApiModel<Object>>();
      BatchApiModel<Integer> batchApiModel0 = new BatchApiModel<Integer>(linkedList0);
      batchApiModel0.setItems(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<BatchApiModel<Integer>> linkedList0 = new LinkedList<BatchApiModel<Integer>>();
      BatchApiModel<Object> batchApiModel0 = new BatchApiModel<Object>(linkedList0);
      List<? extends ApiModel> list0 = batchApiModel0.getItems();
      assertEquals(0, list0.size());
  }
}
