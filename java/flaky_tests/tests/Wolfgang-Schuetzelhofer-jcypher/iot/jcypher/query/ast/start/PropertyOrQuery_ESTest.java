/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:33:00 GMT 2022
 */

package iot.jcypher.query.ast.start;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.ast.start.PropertyOrQuery;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PropertyOrQuery_ESTest extends PropertyOrQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery("", "#wf4|8'");
      propertyOrQuery0.setPropertyValue("#wf4|8'");
      propertyOrQuery0.getPropertyValue();
      assertEquals("", propertyOrQuery0.getPropertyName());
      assertEquals("#wf4|8'", propertyOrQuery0.getLuceneQuery());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery("'7=p=N;pj]vAsOO }", "'7=p=N;pj]vAsOO }");
      String string0 = propertyOrQuery0.getPropertyName();
      assertEquals("'7=p=N;pj]vAsOO }", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery("", "");
      String string0 = propertyOrQuery0.getPropertyName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery("'7=p=N;pj]vAsOO }", "'7=p=N;pj]vAsOO }");
      String string0 = propertyOrQuery0.getLuceneQuery();
      assertEquals("'7=p=N;pj]vAsOO }", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery("", "");
      String string0 = propertyOrQuery0.getLuceneQuery();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery((String) null, (String) null);
      propertyOrQuery0.getPropertyValue();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery((String) null, (String) null);
      String string0 = propertyOrQuery0.getLuceneQuery();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PropertyOrQuery propertyOrQuery0 = new PropertyOrQuery((String) null, (String) null);
      String string0 = propertyOrQuery0.getPropertyName();
      assertNull(string0);
  }
}
