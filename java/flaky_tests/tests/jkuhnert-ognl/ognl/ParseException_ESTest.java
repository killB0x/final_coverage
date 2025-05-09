/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 13:51:03 GMT 2022
 */

package ognl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ognl.ParseException;
import ognl.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParseException_ESTest extends ParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ParseException.add_escapes("\"ZAVa?~oPS''!V6,Gn");
      assertEquals("\\\"ZAVa?~oPS\\'\\'!V6,Gn", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ParseException.add_escapes("qLJ >W&([<;mrXO");
      assertEquals("qLJ >W&([<;mrXO", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Token token0 = Token.newToken(1, "");
      int[][] intArray0 = new int[7][4];
      int[] intArray1 = new int[5];
      intArray0[1] = intArray1;
      String[] stringArray0 = new String[7];
      ParseException parseException0 = null;
      try {
        parseException0 = new ParseException(token0, intArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ognl.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ParseException.add_escapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParseException.add_escapes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ognl.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Token token0 = Token.newToken(1, "");
      int[][] intArray0 = new int[7][4];
      int[] intArray1 = new int[4];
      intArray1[3] = 2837;
      intArray0[3] = intArray1;
      String[] stringArray0 = new String[7];
      ParseException parseException0 = null;
      try {
        parseException0 = new ParseException(token0, intArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2837 out of bounds for length 7
         //
         verifyException("ognl.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ParseException.add_escapes("\\f");
      assertEquals("\\\\f", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ParseException.add_escapes("-uDe8BGgIV\";:m");
      assertEquals("-uDe8BGgIV\\\";:\\u007fm", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ParseException.add_escapes("\f");
      assertEquals("\\f", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ParseException.add_escapes("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token token0 = new Token((-1193), "c|\"*@p6");
      int[][] intArray0 = new int[0][9];
      String[] stringArray0 = new String[4];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[][] intArray0 = new int[3][8];
      String[] stringArray0 = new String[4];
      Token token0 = new Token();
      token0.next = token0;
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[][] intArray0 = new int[1][8];
      String[] stringArray0 = new String[8];
      Token token0 = new Token(1, "0m");
      token0.next = token0;
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Token token0 = new Token(1);
      int[][] intArray0 = new int[1][9];
      int[] intArray1 = new int[1];
      intArray1[0] = 1;
      intArray0[0] = intArray1;
      String[] stringArray0 = new String[3];
      ParseException parseException0 = null;
      try {
        parseException0 = new ParseException(token0, intArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ognl.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParseException parseException0 = new ParseException("4(YtZe{4H");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParseException parseException0 = new ParseException();
  }
}
