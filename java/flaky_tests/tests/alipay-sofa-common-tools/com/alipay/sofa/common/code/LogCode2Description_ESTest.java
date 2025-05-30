/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 19:45:48 GMT 2022
 */

package com.alipay.sofa.common.code;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.code.LogCode2Description;
import com.alipay.sofa.common.space.SpaceId;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LogCode2Description_ESTest extends LogCode2Description_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("O^SKX:]1Q0zG,P2j%");
      assertNotNull(logCode2Description0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpaceId spaceId0 = new SpaceId("");
      String string0 = LogCode2Description.convert(spaceId0, "");
      assertEquals("-: Unknown Code", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.removeCodeSpace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogCode2Description.create("5yI<\"77IT=OE");
      SpaceId spaceId0 = SpaceId.withSpaceName("5yI<\"77IT=OE");
      LogCode2Description.removeCodeSpace(spaceId0);
      assertEquals("5yI<\"77IT=OE", spaceId0.getSpaceName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogCode2Description.removeCodeSpace("com.aipay.sofa.co:mon.log.LogLog$Level");
      LogCode2Description logCode2Description0 = LogCode2Description.create("com.aipay.sofa.co:mon.log.LogLog$Level");
      assertNotNull(logCode2Description0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.create((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogCode2Description.convert("l2+I:Eda", "l2+I:Eda");
      SpaceId spaceId0 = new SpaceId("L2+I:EDA-l2+I:Eda: Unknown Code");
      LogCode2Description logCode2Description0 = LogCode2Description.create(spaceId0);
      assertNotNull(logCode2Description0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("7P-ecq");
      // Undeclared exception!
      try { 
        logCode2Description0.convert("&%z th[", (Object[]) null);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'z'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("Code space \"%s\" initializing fliled!");
      logCode2Description0.convert("Code space: \"", (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("9!_k$>aHmta5E% %:");
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        logCode2Description0.convert("", objectArray0);
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = ' '
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("b3=%C<7B/oL");
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        logCode2Description0.convert("b3=%C<7B/oL", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // c != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("J@9*e");
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        logCode2Description0.convert(";V1L0H(%#C,yFf", objectArray0);
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = c, Flags = #
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("com.alipay.sfa.common.utils.StringUtil$4");
      // Undeclared exception!
      try { 
        logCode2Description0.convert((String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = LogCode2Description.convert("gIl`o?'$x^=xNB>flAo", "gIl`o?'$x^=xNB>flAo");
      assertEquals("GIL`O?'$X^=XNB>FLAO-gIl`o?'$x^=xNB>flAo: Unknown Code", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.convert("G==WjI%j8X<", "G==WjI%j8X<");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'J'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.convert("*djChDf!*@3QBi%", "*djChDf!*@3QBi%");
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %-%
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.convert("Code file for CodeSpace \"%s\" doesn't exist!", " N2'|");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.convert("HoGn[%<", "HoGn[%<");
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = '-<'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.convert("==WjI%8XH", "==WjI%8XH");
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // x != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = LogCode2Description.convert("", "");
      assertEquals("-: Unknown Code", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("2I%N3^e.\"");
      // Undeclared exception!
      try { 
        logCode2Description0.convert("2I%N3^e.\"");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'N'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("Code file for Codepace \"%s\" doesn'texist!");
      // Undeclared exception!
      try { 
        logCode2Description0.convert("Code file for Codepace \"%s\" doesn'texist!");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("9!_k$>aH1mta5E% %:");
      // Undeclared exception!
      try { 
        logCode2Description0.convert("9!_k$>aH1mta5E% %:");
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = ' '
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("==WjI%8XH");
      // Undeclared exception!
      try { 
        logCode2Description0.convert("==WjI%8XH");
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // x != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("^NOw+;/heepr");
      // Undeclared exception!
      try { 
        logCode2Description0.convert((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SpaceId spaceId0 = new SpaceId("7D_7x4,=5:vs*");
      String string0 = LogCode2Description.convert(spaceId0, "7D_7x4,=5:vs*");
      assertEquals("7D_7X4,=5:VS*-7D_7x4,=5:vs*: Unknown Code", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SpaceId spaceId0 = new SpaceId("tNT(qSX5pe%#yVP^S");
      // Undeclared exception!
      try { 
        LogCode2Description.convert(spaceId0, "tNT(qSX5pe%#yVP^S");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'Y'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SpaceId spaceId0 = SpaceId.withSpaceName("(1(#(k`h/AE(KZum`%");
      // Undeclared exception!
      try { 
        LogCode2Description.convert(spaceId0, "lvv]#qUXLJ>,c3");
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %-%
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SpaceId spaceId0 = new SpaceId("9!_k$>aH1mta5E% %:");
      // Undeclared exception!
      try { 
        LogCode2Description.convert(spaceId0, "9!_k$>aH1mta5E% %:");
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = ' '
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SpaceId spaceId0 = SpaceId.withSpaceName("");
      LogCode2Description.removeCodeSpace(spaceId0);
      assertEquals("", spaceId0.getSpaceName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SpaceId spaceId0 = new SpaceId("~>pg+OitqhysC");
      LogCode2Description.removeCodeSpace(spaceId0);
      assertEquals("~>pg+OitqhysC", spaceId0.getSpaceName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogCode2Description.create((SpaceId) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.code.LogCode2Description", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SpaceId spaceId0 = SpaceId.withSpaceName("-%s: %s");
      // Undeclared exception!
      try { 
        LogCode2Description.convert(spaceId0, "-%s: %s");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("eO0n@% 0Bp|s1.OY$");
      // Undeclared exception!
      try { 
        logCode2Description0.convert("");
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = b, Flags =  
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LogCode2Description.removeCodeSpace((SpaceId) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LogCode2Description logCode2Description0 = LogCode2Description.create("h>yXG;Q3y;Ai0eL6wb%");
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        logCode2Description0.convert("h>yXG;Q3y;Ai0eL6wb%", objectArray0);
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %-%
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LogCode2Description.create("nnoxn%+ode");
      LogCode2Description.removeCodeSpace("nnoxn%+ode");
  }
}
