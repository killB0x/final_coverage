/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 15:02:38 GMT 2022
 */

package se.natusoft.tools.optionsmgr.internal.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.w3c.dom.Attr;
import se.natusoft.tools.optionsmgr.internal.utils.XMLAttribute;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XMLAttribute_ESTest extends XMLAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLAttribute xMLAttribute0 = new XMLAttribute("%|{~wEv|4{", "%|{~wEv|4{");
      String string0 = xMLAttribute0.getName();
      assertEquals("%|{~wEv|4{", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLAttribute xMLAttribute0 = null;
      try {
        xMLAttribute0 = new XMLAttribute((Attr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("se.natusoft.tools.optionsmgr.internal.utils.XMLAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getName();
      doReturn("{Cd1<m*|^A7+B/zu").when(attr0).getValue();
      XMLAttribute xMLAttribute0 = new XMLAttribute(attr0);
      String string0 = xMLAttribute0.getValue();
      assertEquals("{Cd1<m*|^A7+B/zu", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getName();
      doReturn((String) null).when(attr0).getValue();
      XMLAttribute xMLAttribute0 = new XMLAttribute(attr0);
      String string0 = xMLAttribute0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getName();
      doReturn("").when(attr0).getValue();
      XMLAttribute xMLAttribute0 = new XMLAttribute(attr0);
      String string0 = xMLAttribute0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XMLAttribute xMLAttribute0 = new XMLAttribute("", "se.natusoft.tools.optionsmgr.internal.utils.XMLAttribute");
      assertEquals("se.natusoft.tools.optionsmgr.internal.utils.XMLAttribute", xMLAttribute0.getValue());
      assertEquals("", xMLAttribute0.getName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getName();
      doReturn("").when(attr0).getValue();
      XMLAttribute xMLAttribute0 = new XMLAttribute(attr0);
      xMLAttribute0.setValue("");
      String string0 = xMLAttribute0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XMLAttribute xMLAttribute0 = new XMLAttribute("");
      assertNull(xMLAttribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getName();
      doReturn("").when(attr0).getValue();
      XMLAttribute xMLAttribute0 = new XMLAttribute(attr0);
      String string0 = xMLAttribute0.getName();
      assertEquals("", string0);
  }
}
