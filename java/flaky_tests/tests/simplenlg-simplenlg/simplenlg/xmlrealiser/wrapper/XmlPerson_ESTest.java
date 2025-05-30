/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:07:55 GMT 2022
 */

package simplenlg.xmlrealiser.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simplenlg.xmlrealiser.wrapper.XmlPerson;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlPerson_ESTest extends XmlPerson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlPerson[] xmlPersonArray0 = XmlPerson.values();
      assertEquals(3, xmlPersonArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlPerson xmlPerson0 = XmlPerson.valueOf("THIRD");
      assertEquals(XmlPerson.THIRD, xmlPerson0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlPerson xmlPerson0 = XmlPerson.fromValue("THIRD");
      assertEquals(XmlPerson.THIRD, xmlPerson0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlPerson xmlPerson0 = XmlPerson.THIRD;
      String string0 = xmlPerson0.value();
      assertEquals("THIRD", string0);
  }
}
