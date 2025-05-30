/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:07:16 GMT 2022
 */

package simplenlg.xmlrealiser.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.xmlrealiser.wrapper.XmlForm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlForm_ESTest extends XmlForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlForm[] xmlFormArray0 = XmlForm.values();
      assertEquals(7, xmlFormArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlForm xmlForm0 = XmlForm.fromValue("NORMAL");
      assertEquals(XmlForm.NORMAL, xmlForm0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlForm xmlForm0 = XmlForm.valueOf("NORMAL");
      String string0 = xmlForm0.value();
      assertEquals("NORMAL", string0);
  }
}
