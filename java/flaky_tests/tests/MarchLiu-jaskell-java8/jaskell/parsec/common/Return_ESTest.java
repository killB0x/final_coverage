/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:09:10 GMT 2022
 */

package jaskell.parsec.common;

import org.junit.Test;
import static org.junit.Assert.*;
import jaskell.parsec.common.Return;
import jaskell.parsec.common.SimpleState;
import jaskell.parsec.common.State;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Return_ESTest extends Return_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Return<LinkedList<Integer>, LinkedList<Integer>> return0 = new Return<LinkedList<Integer>, LinkedList<Integer>>((LinkedList<Integer>) null);
      LinkedList<LinkedList<Integer>> linkedList0 = new LinkedList<LinkedList<Integer>>();
      SimpleState<LinkedList<Integer>> simpleState0 = new SimpleState<LinkedList<Integer>>(linkedList0);
      LinkedList<Integer> linkedList1 = return0.parse((State<LinkedList<Integer>>) simpleState0);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Return<LinkedList<Integer>, LinkedList<Integer>> return0 = new Return<LinkedList<Integer>, LinkedList<Integer>>(linkedList0);
      LinkedList<LinkedList<Integer>> linkedList1 = new LinkedList<LinkedList<Integer>>();
      SimpleState<LinkedList<Integer>> simpleState0 = new SimpleState<LinkedList<Integer>>(linkedList1);
      LinkedList<Integer> linkedList2 = return0.parse((State<LinkedList<Integer>>) simpleState0);
      assertEquals(0, linkedList2.size());
  }
}
