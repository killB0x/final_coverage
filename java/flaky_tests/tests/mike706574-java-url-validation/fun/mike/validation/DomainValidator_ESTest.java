/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 28 03:55:50 GMT 2022
 */

package fun.mike.validation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fun.mike.validation.DomainValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DomainValidator_ESTest extends DomainValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidLocalTld(".t-hcawvgasl}_|s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = DomainValidator.unicodeToASCII((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = DomainValidator.unicodeToASCII("N<g92{2+55+");
      assertEquals("N<g92{2+55+", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = DomainValidator.unicodeToASCII("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidLocalTld("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidInfrastructureTld(".arpa");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_MINUS;
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      // Undeclared exception!
      try { 
        domainValidator0.isValidLocalTld((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      // Undeclared exception!
      try { 
        domainValidator0.isValidInfrastructureTld((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      // Undeclared exception!
      try { 
        domainValidator0.isValidGenericTld((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      // Undeclared exception!
      try { 
        domainValidator0.isValidCountryCodeTld((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DomainValidator.getTLDEntries((DomainValidator.ArrayType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidCountryCodeTld("KzB}7#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidGenericTld(",");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidInfrastructureTld("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      // Undeclared exception!
      try { 
        domainValidator0.isValidTld((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.INFRASTRUCTURE_RO;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_RO;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(1236, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.COUNTRY_CODE_RO;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(294, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_PLUS;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_MINUS;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.COUNTRY_CODE_PLUS;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.COUNTRY_CODE_MINUS;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.LOCAL_RO;
      String[] stringArray0 = DomainValidator.getTLDEntries(domainValidator_ArrayType0);
      // Undeclared exception!
      try { 
        DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot update the table: LOCAL_RO
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.INFRASTRUCTURE_RO;
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot update the table: INFRASTRUCTURE_RO
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_RO;
      // Undeclared exception!
      try { 
        DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot update the table: GENERIC_RO
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.COUNTRY_CODE_RO;
      // Undeclared exception!
      try { 
        DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot update the table: COUNTRY_CODE_RO
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DomainValidator.getInstance();
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_RO;
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can only invoke this method before calling getInstance
         //
         verifyException("fun.mike.validation.DomainValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.COUNTRY_CODE_MINUS;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "C#x";
      stringArray0[1] = "cw";
      stringArray0[2] = "@x";
      stringArray0[3] = "q";
      stringArray0[4] = "C";
      DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidCountryCodeTld("cw");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.COUNTRY_CODE_PLUS;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "*+H-N>_ZOs";
      DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidCountryCodeTld("*+H-N>_ZOs");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_MINUS;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "shell";
      stringArray0[1] = "shell";
      DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      boolean boolean0 = domainValidator0.isValidGenericTld("shell");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DomainValidator.ArrayType domainValidator_ArrayType0 = DomainValidator.ArrayType.GENERIC_PLUS;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "shell";
      stringArray0[1] = "&X";
      DomainValidator.updateTLDOverride(domainValidator_ArrayType0, stringArray0);
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidGenericTld("&X");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidTld(".bv");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidTld("shia");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidTld("arpa");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidTld("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidTld("localdomain");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidDomainSyntax("s");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidDomainSyntax("fun.mike.validation.RegexValidator");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidDomainSyntax((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidDomainSyntax("wACL@y?Z>?w<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValid(".m'd!nm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValid("SO");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      boolean boolean0 = domainValidator0.isValid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DomainValidator.clearTLDOverrides();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidLocalTld("localdomain");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValid("fun.mike.validation.RegexValidator");
      assertFalse(boolean0);
  }
}
