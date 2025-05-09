/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 01:20:01 GMT 2022
 */

package net.sf.sojo.interchange.csv.generate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager;
import net.sf.sojo.interchange.csv.generate.SimpleCharStream;
import net.sf.sojo.interchange.csv.generate.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CsvParserGenerateTokenManager_ESTest extends CsvParserGenerateTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"Y9-5drXsX)");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.jjround = (-2527);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\t");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 6, 6);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      Token token0 = csvParserGenerateTokenManager0.getNextToken();
      assertEquals("", token0.toString());
      assertEquals(8, token0.beginColumn);
      assertEquals(6, token0.beginLine);
      assertEquals(8, token0.endColumn);
      assertEquals(6, token0.endLine);
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">_.$cy'\"uV");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null);
      csvParserGenerateTokenManager0.ReInit(simpleCharStream0, 0);
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-65), 1364);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.getNextToken();
      csvParserGenerateTokenManager0.jjFillToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-65), simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.jjFillToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4096
         //
         verifyException("net.sf.sojo.interchange.csv.generate.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r\n");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.available = (-1060);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1069), (-1069));
      simpleCharStream0.bufpos = (-1069);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1068 out of bounds for length 4096
         //
         verifyException("net.sf.sojo.interchange.csv.generate.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("wtF8R5Wl2");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-614), 13);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.SwitchTo((-614));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -614. State unchanged.
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.SwitchTo(6);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 6. State unchanged.
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 337, 337, 0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.ReInit(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" \"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.jjround = (-1);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 10.  Encountered: <EOF> after : \"\"
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null, 0);
      csvParserGenerateTokenManager0.SwitchTo(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\ro");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      Token token0 = csvParserGenerateTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(4, token0.kind);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"\"\"\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%G@kI7P>X0");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2278, 2278);
      stringReader0.read();
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.getNextToken();
      assertEquals(8, simpleCharStream0.bufpos);
      assertEquals(2286, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-76);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 1.  Encountered: \"\\ufffd\" (65533), after : \"\"
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)34;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      Token token0 = csvParserGenerateTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r\n");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#2?8'4zQB!!`");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      Token token0 = csvParserGenerateTokenManager0.getNextToken();
      assertEquals(5, simpleCharStream0.bufpos);
      assertEquals(9, token0.kind);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" \"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      stringReader0.read();
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      Token token0 = csvParserGenerateTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals("\"", token0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r;");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2888), Integer.MAX_VALUE);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.getNextToken();
      assertEquals(Integer.MAX_VALUE, simpleCharStream0.getBeginColumn());
      assertEquals((-2888), simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\",\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      csvParserGenerateTokenManager0.setDebugStream((PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.ReInit((SimpleCharStream) null, 2817);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 2817. State unchanged.
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = null;
      try {
        csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager((SimpleCharStream) null, (-1165));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1165. State unchanged.
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte)34;
      byteArray0[2] = (byte)34;
      byteArray0[3] = (byte)13;
      byteArray0[4] = (byte)34;
      byteArray0[5] = (byte)34;
      byteArray0[6] = (byte)34;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      CsvParserGenerateTokenManager csvParserGenerateTokenManager0 = new CsvParserGenerateTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        csvParserGenerateTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("net.sf.sojo.interchange.csv.generate.CsvParserGenerateTokenManager", e);
      }
  }
}
