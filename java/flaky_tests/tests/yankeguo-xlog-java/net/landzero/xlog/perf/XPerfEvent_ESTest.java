/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:57:59 GMT 2022
 */

package net.landzero.xlog.perf;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import net.landzero.xlog.perf.XPerfEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XPerfEvent_ESTest extends XPerfEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.topic();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setMethodName("JCv^fUa?iLRf");
      xPerfEvent0.getMethodName();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setMethodName("");
      xPerfEvent0.getMethodName();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setDuration(3212L);
      long long0 = xPerfEvent0.getDuration();
      assertEquals(3212L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setDuration((-1237L));
      long long0 = xPerfEvent0.getDuration();
      assertEquals((-1237L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setClassName("Gan:B('.BOp=S5=[DH");
      xPerfEvent0.getClassName();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setClassName("");
      xPerfEvent0.getClassName();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(" ");
      xPerfEvent0.setArguments(linkedList0);
      xPerfEvent0.getArguments();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      xPerfEvent0.setArguments(list0);
      xPerfEvent0.getArguments();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setAction("JCv^fUa?iLRf");
      xPerfEvent0.getAction();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.getAction();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.getClassName();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.setAction("");
      xPerfEvent0.getAction();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.getMethodName();
      assertEquals(0L, xPerfEvent0.getDuration());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      long long0 = xPerfEvent0.getDuration();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPerfEvent xPerfEvent0 = new XPerfEvent();
      xPerfEvent0.getArguments();
      assertEquals(0L, xPerfEvent0.getDuration());
  }
}
