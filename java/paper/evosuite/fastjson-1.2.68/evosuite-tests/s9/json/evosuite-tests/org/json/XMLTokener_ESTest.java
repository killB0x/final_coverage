/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 18:21:01 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.XMLTokener;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLTokener_ESTest extends XMLTokener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("x[,XlB^BvW8HRIVo");
      xMLTokener0.skipPast("val [");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("R'ro1yYA#p`^?");
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 13 [character 14 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity(" W84}|qqeA~3b{");
      assertEquals("& W84}|qqeA~3b{;", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">IC-O7Q<_$x");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextEntity('-');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: & at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("f[H}\"*R]]k0}vh");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S@C?TyPpRn]e j.[L");
      stringReader0.close();
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast("S@C?TyPpRn]e j.[L");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("E'yjHK{#8");
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XMLTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("q3.[_ge_M+HPlD+S&l");
      try { 
        xMLTokener0.nextContent();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &l at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLTokener xMLTokener0 = null;
      try {
        xMLTokener0 = new XMLTokener((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLTokener xMLTokener0 = null;
      try {
        xMLTokener0 = new XMLTokener((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#9;");
      Object object0 = xMLTokener0.nextEntity('?');
      assertEquals("\t", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Unterminated string");
      xMLTokener0.skipPast("Unterminated string");
      assertFalse(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.skipPast("B8\"u+dWv ,");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("q3.[_ge_:+HPlD+O");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("q3.", object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z%z_)? ;u=7");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals("z%z_)", object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("J=a`{#q9AES-{B");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("J", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("{k/H~ybJ");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("{k", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("E'yj6K{#8");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("U1Y\"{wFVX:~=]");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Y!](p{Y`|D=D<");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("Y", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("BYB");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("BYB", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Bad character in a name");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("Bad", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"~V\"(");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("~V", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?>");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">IC-O7Q<_$x");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<@^0\"=],cpbz:");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misplaced '<' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" ");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#cbg(?Iq,>");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("3>|#wit/7il");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("j$=v-q^8_g/j1;V");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("S<bVs^");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Garu.o8/B");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("E1Y\"PwFVX:~O]");
      xMLTokener0.nextMeta();
      char char0 = xMLTokener0.next();
      assertEquals('\"', char0);
      
      Object object0 = xMLTokener0.nextToken();
      assertEquals("PwFVX:~O", object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("pJsL)T!B['?3%R-o3Xw");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("5");
      xMLTokener0.nextMeta();
      assertFalse(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">IC-O7Q<_$x");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("=2$0row7W;jl*wAKt");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('<', object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("/L,EG}z/AY&}");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("' and instead saw ''");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"S<bV8,^");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("!Rj:=");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("!Rj:=");
      xMLTokener0.nextContent();
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 5 [character 6 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" at ");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("lt");
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#xZM@T!m')\"nI");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ZM@T!m')\"nI\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#-H=CA@Ys*>1|zq");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-H=CA@Ys*>1|zq\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"jcx@=aq=)wh&#");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &# at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Y!](p{Y`|D=D<");
      Object object0 = xMLTokener0.nextContent();
      assertEquals("Y!](p{Y`|D=D", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<");
      Object object0 = xMLTokener0.nextContent();
      assertNotNull(object0);
      assertEquals('<', object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      Object object0 = xMLTokener0.nextContent();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" 'o]I7e");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("f[H}4*R]]0k0}vh");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("_S0>j%HnP>Q^+Z");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("_S0", object0);
  }
}
