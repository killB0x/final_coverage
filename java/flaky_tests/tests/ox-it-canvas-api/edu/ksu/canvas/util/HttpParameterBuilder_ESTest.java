/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 10:35:39 GMT 2022
 */

package edu.ksu.canvas.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.ksu.canvas.util.HttpParameterBuilder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HttpParameterBuilder_ESTest extends HttpParameterBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.put("", linkedList0);
      linkedList0.addFirst("");
      linkedList0.add("");
      String string0 = HttpParameterBuilder.buildParameters(hashMap0);
      assertEquals("?=&=", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.put(",q`6@x]h", linkedList0);
      linkedList0.add("");
      hashMap0.put("", linkedList0);
      String string0 = HttpParameterBuilder.buildParameters(hashMap0);
      assertEquals("?=&%2Cq%606%40x%5Dh=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put(" HFwE*zQ>(", (List<String>) null);
      // Undeclared exception!
      try { 
        HttpParameterBuilder.buildParameters(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.ksu.canvas.util.HttpParameterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpParameterBuilder httpParameterBuilder0 = new HttpParameterBuilder();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("g-%@=SJe", linkedList0);
      String string0 = HttpParameterBuilder.buildParameters(hashMap0);
      assertEquals("", string0);
  }
}
