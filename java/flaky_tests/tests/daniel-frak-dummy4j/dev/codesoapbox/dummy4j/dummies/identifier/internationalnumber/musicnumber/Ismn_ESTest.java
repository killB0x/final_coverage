/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 20:41:26 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.Ismn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ismn_ESTest extends Ismn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ismn ismn0 = new Ismn("}oo;,l\"7", "}oo;,l\"7", "}oo;,l\"7", (String) null);
      String string0 = ismn0.getSeparator();
      assertNull(string0);
      assertEquals("}oo;,l\"7", ismn0.getRegistrant());
      assertEquals("}oo;,l\"7", ismn0.getItem());
      assertEquals("}oo;,l\"7", ismn0.getCheckDigit());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ismn ismn0 = new Ismn("\"G", "\"G", (String) null, "");
      String string0 = ismn0.getSeparator();
      assertEquals("", string0);
      assertEquals("\"G", ismn0.getItem());
      assertNotNull(string0);
      assertEquals("\"G", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ismn ismn0 = new Ismn((String) null, (String) null, "].%\"qE+MsQjm<o$D:K", (String) null);
      String string0 = ismn0.getRegistrant();
      assertNull(string0);
      assertEquals("].%\"qE+MsQjm<o$D:K", ismn0.getCheckDigit());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ismn ismn0 = new Ismn("F#cfAJ@KN", "F#cfAJ@KN", "F#cfAJ@KN", "F#cfAJ@KN");
      String string0 = ismn0.getRegistrant();
      assertEquals("F#cfAJ@KN", ismn0.getSeparator());
      assertEquals("F#cfAJ@KN", string0);
      assertEquals("F#cfAJ@KN", ismn0.getCheckDigit());
      assertEquals("F#cfAJ@KN", ismn0.getItem());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ismn ismn0 = new Ismn("", (String) null, "", (String) null);
      String string0 = ismn0.getItem();
      assertEquals("", ismn0.getRegistrant());
      assertNull(string0);
      assertEquals("", ismn0.getCheckDigit());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "979", "", "");
      String string0 = ismn0.getItem();
      assertEquals("", ismn0.getSeparator());
      assertEquals("979", string0);
      assertEquals("", ismn0.getCheckDigit());
      assertEquals("", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ismn ismn0 = new Ismn("\"G", "\"G", (String) null, "");
      String string0 = ismn0.getCheckDigit();
      assertNull(string0);
      assertEquals("\"G", ismn0.getItem());
      assertEquals("", ismn0.getSeparator());
      assertEquals("\"G", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "979", "", "");
      String string0 = ismn0.getCheckDigit();
      assertEquals("", ismn0.getSeparator());
      assertEquals("979", ismn0.getItem());
      assertEquals("", string0);
      assertEquals("", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ismn ismn0 = new Ismn((String) null, (String) null, (String) null, "UOPB");
      Ismn ismn1 = new Ismn("UOPB", "979UOPB0UOPBnullUOPBnullUOPBnull", "~", "(a\"BP0@n@/NRp8EZqc'");
      // Undeclared exception!
      try { 
        ismn0.equals(ismn1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ismn ismn0 = new Ismn("", (String) null, "", (String) null);
      String string0 = ismn0.toString();
      assertEquals("9790null", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "", "qq", "*$6i5$g;");
      String string0 = ismn0.toString();
      assertEquals("979*$6i5$g;0*$6i5$g;*$6i5$g;*$6i5$g;qq", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ismn ismn0 = new Ismn("SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN");
      Ismn ismn1 = new Ismn("SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN");
      boolean boolean0 = ismn0.equals(ismn1);
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getCheckDigit());
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getItem());
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getSeparator());
      assertTrue(boolean0);
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ismn ismn0 = new Ismn("979", "979", "979", "979");
      Ismn ismn1 = new Ismn("979", "979", "979", ">iE:Hc_BULE\"Mv");
      boolean boolean0 = ismn0.equals(ismn1);
      assertFalse(boolean0);
      assertEquals("979", ismn1.getItem());
      assertFalse(ismn1.equals((Object)ismn0));
      assertEquals("979", ismn1.getRegistrant());
      assertEquals("979", ismn1.getCheckDigit());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ismn ismn0 = new Ismn("u", "J", "u", "u");
      Ismn ismn1 = new Ismn("u", "u", "u", "u");
      boolean boolean0 = ismn1.equals(ismn0);
      assertFalse(boolean0);
      assertEquals("u", ismn0.getCheckDigit());
      assertEquals("u", ismn0.getSeparator());
      assertEquals("u", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ismn ismn0 = new Ismn("0", "'", "0", "'");
      Ismn ismn1 = new Ismn("'", "'", "'", "'");
      boolean boolean0 = ismn1.equals(ismn0);
      assertEquals("'", ismn0.getItem());
      assertEquals("'", ismn1.getCheckDigit());
      assertEquals("'", ismn0.getSeparator());
      assertEquals("'", ismn1.getRegistrant());
      assertEquals("0", ismn0.getCheckDigit());
      assertFalse(boolean0);
      assertEquals("0", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ismn ismn0 = new Ismn("GH<{u4w9^Vo", "GH<{u4w9^Vo", "GH<{u4w9^Vo", "GH<{u4w9^Vo");
      boolean boolean0 = ismn0.equals("GH<{u4w9^Vo");
      assertEquals("GH<{u4w9^Vo", ismn0.getCheckDigit());
      assertFalse(boolean0);
      assertEquals("GH<{u4w9^Vo", ismn0.getRegistrant());
      assertEquals("GH<{u4w9^Vo", ismn0.getItem());
      assertEquals("GH<{u4w9^Vo", ismn0.getSeparator());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ismn ismn0 = new Ismn((String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = ismn0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "979", "", "");
      boolean boolean0 = ismn0.equals(ismn0);
      assertEquals("", ismn0.getRegistrant());
      assertEquals("979", ismn0.getItem());
      assertEquals("", ismn0.getCheckDigit());
      assertEquals("", ismn0.getSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "", "qq", "*$6i5$g;");
      String string0 = ismn0.getItem();
      assertEquals("", string0);
      assertEquals("*$6i5$g;", ismn0.getSeparator());
      assertEquals("qq", ismn0.getCheckDigit());
      assertEquals("", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "", "qq", "*$6i5$g;");
      String string0 = ismn0.getRegistrant();
      assertEquals("*$6i5$g;", ismn0.getSeparator());
      assertEquals("", ismn0.getItem());
      assertEquals("", string0);
      assertEquals("qq", ismn0.getCheckDigit());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "", "qq", "*$6i5$g;");
      String string0 = ismn0.getSeparator();
      assertEquals("", ismn0.getItem());
      assertEquals("qq", ismn0.getCheckDigit());
      assertEquals("", ismn0.getRegistrant());
      assertEquals("*$6i5$g;", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "", "qq", "*$6i5$g;");
      ismn0.hashCode();
      assertEquals("qq", ismn0.getCheckDigit());
      assertEquals("", ismn0.getItem());
      assertEquals("*$6i5$g;", ismn0.getSeparator());
      assertEquals("", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ismn ismn0 = new Ismn("", "", "qq", "*$6i5$g;");
      String string0 = ismn0.getCheckDigit();
      assertEquals("qq", string0);
      assertEquals("*$6i5$g;", ismn0.getSeparator());
      assertEquals("", ismn0.getItem());
      assertEquals("", ismn0.getRegistrant());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ismn ismn0 = new Ismn("SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN");
      Ismn ismn1 = new Ismn("SCp@QA=+BH5a{()OUuN", "SCp@QA=+BH5a{()OUuN", "rCtC+D.778K#c@GUG]v", "SCp@QA=+BH5a{()OUuN");
      boolean boolean0 = ismn0.equals(ismn1);
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getRegistrant());
      assertFalse(boolean0);
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getSeparator());
      assertEquals("SCp@QA=+BH5a{()OUuN", ismn1.getItem());
  }
}
