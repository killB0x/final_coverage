/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:04:27 GMT 2022
 */

package io.theves.denon4j.controls;

import org.junit.Test;
import static org.junit.Assert.*;
import io.theves.denon4j.controls.MenuNavigation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MenuNavigation_ESTest extends MenuNavigation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MenuNavigation[] menuNavigationArray0 = MenuNavigation.values();
      assertEquals(10, menuNavigationArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MenuNavigation menuNavigation0 = MenuNavigation.valueOf("RETURN");
      assertEquals(MenuNavigation.RETURN, menuNavigation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MenuNavigation menuNavigation0 = MenuNavigation.SOURCE_ON;
      String string0 = menuNavigation0.getControl();
      assertEquals("SRC ON", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MenuNavigation menuNavigation0 = MenuNavigation.RETURN;
      String string0 = menuNavigation0.toString();
      assertEquals("RTN", string0);
  }
}
