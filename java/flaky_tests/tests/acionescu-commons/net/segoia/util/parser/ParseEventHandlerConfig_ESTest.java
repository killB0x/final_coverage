/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 06:04:16 GMT 2022
 */

package net.segoia.util.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import net.segoia.util.parser.ParseEventHandlerConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParseEventHandlerConfig_ESTest extends ParseEventHandlerConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("net.segoia.util.parser.ParseEventHandlerConfig", "net.segoia.util.parser.ParseEventHandlerConfig", "TUi'L=a", "net.segoia.util.parser.ParseEventHandlerConfig");
      parseEventHandlerConfig0.hashCode();
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getOutputCharsToBeEscaped());
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getEndEscapeGroup());
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getOutputEscapeChar());
      assertEquals("TUi'L=a", parseEventHandlerConfig0.getStartEscapeGroup());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "Pi'=", (String) null, "");
      String string0 = parseEventHandlerConfig0.getStartEscapeGroup();
      assertEquals("", parseEventHandlerConfig0.getEndEscapeGroup());
      assertEquals("", parseEventHandlerConfig0.getOutputCharsToBeEscaped());
      assertEquals("Pi'=", parseEventHandlerConfig0.getOutputEscapeChar());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("net.segoia.util.parser.ParseEventHandlerConfig", "net.segoia.util.parser.ParseEventHandlerConfig", "TUi'L=a", "net.segoia.util.parser.ParseEventHandlerConfig");
      String string0 = parseEventHandlerConfig0.getStartEscapeGroup();
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getOutputEscapeChar());
      assertEquals("TUi'L=a", string0);
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getEndEscapeGroup());
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getOutputCharsToBeEscaped());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "2Q(C'A;:-N::", "");
      assertEquals("", parseEventHandlerConfig0.getOutputEscapeChar());
      
      parseEventHandlerConfig0.setOutputEscapeChar((String) null);
      parseEventHandlerConfig0.getOutputEscapeChar();
      assertEquals("", parseEventHandlerConfig0.getOutputCharsToBeEscaped());
      assertEquals("", parseEventHandlerConfig0.getEndEscapeGroup());
      assertEquals("2Q(C'A;:-N::", parseEventHandlerConfig0.getStartEscapeGroup());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("La4jf^JcVrE}'z", (String) null);
      parseEventHandlerConfig0.setOutputCharsToBeEscaped((String) null);
      String string0 = parseEventHandlerConfig0.getOutputCharsToBeEscaped();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, "/g%(o$", (String) null, (String) null);
      String string0 = parseEventHandlerConfig0.getEndEscapeGroup();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("net.segoia.util.parser.ParseEventHandlerConfig", "net.segoia.util.parser.ParseEventHandlerConfig", "TUi'L=a", "net.segoia.util.parser.ParseEventHandlerConfig");
      String string0 = parseEventHandlerConfig0.getEndEscapeGroup();
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", string0);
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getOutputCharsToBeEscaped());
      assertEquals("TUi'L=a", parseEventHandlerConfig0.getStartEscapeGroup());
      assertEquals("net.segoia.util.parser.ParseEventHandlerConfig", parseEventHandlerConfig0.getOutputEscapeChar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, (String) null, (String) null, (String) null);
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig((String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = parseEventHandlerConfig1.equals(parseEventHandlerConfig0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("r", "r", "r", "r");
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig("r", "r", (String) null, "r");
      boolean boolean0 = parseEventHandlerConfig1.equals(parseEventHandlerConfig0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, (String) null);
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig("", (String) null, (String) null, "");
      parseEventHandlerConfig1.setOutputCharsToBeEscaped((String) null);
      boolean boolean0 = parseEventHandlerConfig0.equals(parseEventHandlerConfig1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "");
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig("", (String) null, "t('};ZFfM:ryuv:", "");
      boolean boolean0 = parseEventHandlerConfig1.equals(parseEventHandlerConfig0);
      assertEquals("", parseEventHandlerConfig1.getOutputCharsToBeEscaped());
      assertEquals("", parseEventHandlerConfig1.getEndEscapeGroup());
      assertEquals("t('};ZFfM:ryuv:", parseEventHandlerConfig1.getStartEscapeGroup());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig((String) null, "Pb$Qt'?Jq;M#Di");
      parseEventHandlerConfig1.setOutputCharsToBeEscaped("");
      boolean boolean0 = parseEventHandlerConfig0.equals(parseEventHandlerConfig1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, "Pi'=");
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig("Pi'=", (String) null);
      boolean boolean0 = parseEventHandlerConfig0.equals(parseEventHandlerConfig1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, "Pi'=");
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig((String) null, "Pi'=");
      boolean boolean0 = parseEventHandlerConfig0.equals(parseEventHandlerConfig1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, (String) null, (String) null, (String) null);
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig((String) null, (String) null);
      boolean boolean0 = parseEventHandlerConfig1.equals(parseEventHandlerConfig0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, (String) null, (String) null, (String) null);
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig("n$<;q:(v+/a", "n$<;q:(v+/a", "Mzt,0;C/w3[S,5[", (String) null);
      boolean boolean0 = parseEventHandlerConfig1.equals(parseEventHandlerConfig0);
      assertFalse(boolean0);
      assertEquals("n$<;q:(v+/a", parseEventHandlerConfig1.getOutputCharsToBeEscaped());
      assertEquals("Mzt,0;C/w3[S,5[", parseEventHandlerConfig1.getStartEscapeGroup());
      assertEquals("n$<;q:(v+/a", parseEventHandlerConfig1.getOutputEscapeChar());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, (String) null, (String) null, (String) null);
      ParseEventHandlerConfig parseEventHandlerConfig1 = new ParseEventHandlerConfig((String) null, (String) null);
      boolean boolean0 = parseEventHandlerConfig0.equals(parseEventHandlerConfig1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, "Pi'=");
      boolean boolean0 = parseEventHandlerConfig0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("SqwRyJqb", "SqwRyJqb");
      boolean boolean0 = parseEventHandlerConfig0.equals(parseEventHandlerConfig0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      Object object0 = new Object();
      boolean boolean0 = parseEventHandlerConfig0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig((String) null, (String) null, (String) null, (String) null);
      parseEventHandlerConfig0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      String string0 = parseEventHandlerConfig0.getEndEscapeGroup();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      String string0 = parseEventHandlerConfig0.getOutputEscapeChar();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      parseEventHandlerConfig0.setOutputCharsToBeEscaped("Pb$Qt'?Jq;M#Di");
      String string0 = parseEventHandlerConfig0.getOutputCharsToBeEscaped();
      assertEquals("Pb$Qt'?Jq;M#Di", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      String string0 = parseEventHandlerConfig0.getOutputCharsToBeEscaped();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      String string0 = parseEventHandlerConfig0.getStartEscapeGroup();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ParseEventHandlerConfig parseEventHandlerConfig0 = new ParseEventHandlerConfig("", "", "", "");
      parseEventHandlerConfig0.setOutputEscapeChar("Pb$Qt'?Jq;M#Di");
      String string0 = parseEventHandlerConfig0.getOutputEscapeChar();
      assertEquals("Pb$Qt'?Jq;M#Di", string0);
  }
}
