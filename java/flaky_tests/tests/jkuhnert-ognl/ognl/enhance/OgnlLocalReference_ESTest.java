/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 13:57:27 GMT 2022
 */

package ognl.enhance;

import org.junit.Test;
import static org.junit.Assert.*;
import ognl.enhance.OgnlLocalReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OgnlLocalReference_ESTest extends OgnlLocalReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      Class<?> class1 = ognlLocalReference0.getType();
      OgnlLocalReference ognlLocalReference1 = new OgnlLocalReference("{<03c\"a~21*", "fI)Q0LU72ZJ/oj-bB", class1);
      String string0 = ognlLocalReference1.getName();
      assertEquals("fI)Q0LU72ZJ/oj-bB", ognlLocalReference1.getExpression());
      assertEquals("{<03c\"a~21*", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("", "", class0);
      String string0 = ognlLocalReference0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      Class<?> class1 = ognlLocalReference0.getType();
      OgnlLocalReference ognlLocalReference1 = new OgnlLocalReference((String) null, "fI)Q0LU72ZJ/oj-bB", class1);
      String string0 = ognlLocalReference1.getExpression();
      assertNotNull(string0);
      assertFalse(ognlLocalReference0.equals((Object)ognlLocalReference1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("", "", class0);
      String string0 = ognlLocalReference0.getExpression();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("P.x;;](A#exZ<V|_~:", "ues)<wL", (Class<?>) null);
      ognlLocalReference0.hashCode();
      assertEquals("P.x;;](A#exZ<V|_~:", ognlLocalReference0.getName());
      assertEquals("ues)<wL", ognlLocalReference0.getExpression());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("", "", class0);
      ognlLocalReference0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      ognlLocalReference0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("ues)<wL", "ues)<wL", class0);
      OgnlLocalReference ognlLocalReference1 = new OgnlLocalReference("ues)<wL", "ues)<wL", class0);
      boolean boolean0 = ognlLocalReference0.equals(ognlLocalReference1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      Class<?> class1 = ognlLocalReference0.getType();
      OgnlLocalReference ognlLocalReference1 = new OgnlLocalReference((String) null, "fI)Q0LU72ZJ/oj-bB", class1);
      OgnlLocalReference ognlLocalReference2 = new OgnlLocalReference("{<03c\"a~21*", "fI)Q0LU72ZJ/oj-bB", class1);
      boolean boolean0 = ognlLocalReference1.equals(ognlLocalReference2);
      assertFalse(boolean0);
      assertFalse(ognlLocalReference1.equals((Object)ognlLocalReference0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      boolean boolean0 = ognlLocalReference0.equals("ues)<wL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      boolean boolean0 = ognlLocalReference0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("ues)<wL", "LocalReferenceImpl[_name='", class0);
      boolean boolean0 = ognlLocalReference0.equals(ognlLocalReference0);
      assertEquals("LocalReferenceImpl[_name='", ognlLocalReference0.getExpression());
      assertTrue(boolean0);
      assertEquals("ues)<wL", ognlLocalReference0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      Class<?> class1 = ognlLocalReference0.getType();
      OgnlLocalReference ognlLocalReference1 = new OgnlLocalReference((String) null, "fI)Q0LU72ZJ/oj-bB", class1);
      boolean boolean0 = ognlLocalReference0.equals(ognlLocalReference1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      String string0 = ognlLocalReference0.getExpression();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("P.x;;](A#exZ<V|_~:", "ues)<wL", (Class<?>) null);
      String string0 = ognlLocalReference0.toString();
      assertEquals("LocalReferenceImpl[_name='P.x;;](A#exZ<V|_~:'\n, _type=null\n, _expression='ues)<wL'\n]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference((String) null, (String) null, class0);
      String string0 = ognlLocalReference0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OgnlLocalReference ognlLocalReference0 = new OgnlLocalReference("P.x;;](A#exZ<V|_~:", "ues)<wL", (Class<?>) null);
      ognlLocalReference0.getType();
      assertEquals("ues)<wL", ognlLocalReference0.getExpression());
      assertEquals("P.x;;](A#exZ<V|_~:", ognlLocalReference0.getName());
  }
}
