/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 00:06:11 GMT 2022
 */

package net.masterthought.cucumber.reducers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.masterthought.cucumber.json.Element;
import net.masterthought.cucumber.reducers.ElementComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ElementComparator_ESTest extends ElementComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElementComparator elementComparator0 = new ElementComparator();
      Element element0 = new Element();
      Element element1 = new Element();
      // Undeclared exception!
      try { 
        elementComparator0.compare(element0, element1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("net.masterthought.cucumber.reducers.ElementComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElementComparator elementComparator0 = new ElementComparator();
      int int0 = elementComparator0.compare((Element) null, (Element) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElementComparator elementComparator0 = new ElementComparator();
      Element element0 = new Element();
      int int0 = elementComparator0.compare(element0, (Element) null);
      assertEquals((-1), int0);
  }
}
