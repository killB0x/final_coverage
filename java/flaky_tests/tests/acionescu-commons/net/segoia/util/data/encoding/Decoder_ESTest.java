/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 06:28:56 GMT 2022
 */

package net.segoia.util.data.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.segoia.util.data.encoding.Decoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Decoder_ESTest extends Decoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Decoder decoder0 = new Decoder("=#?P}fv~.9}f41K", "=#?P}fv~.9}f41K");
      String string0 = decoder0.decode();
      assertEquals("=#?P}fv~.9}f41K", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Decoder decoder0 = new Decoder("", "");
      String string0 = decoder0.decode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Decoder decoder0 = new Decoder("ShMU:58+gt", "ShMU:58+gt");
      // Undeclared exception!
      try { 
        decoder0.decode();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Decoder decoder0 = new Decoder((String) null, (String) null);
      // Undeclared exception!
      try { 
        decoder0.decode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Decoder decoder0 = new Decoder("=#?P}fv~.9}f41K", "H4");
      decoder0.matchBlock = true;
      // Undeclared exception!
      try { 
        decoder0.decode();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"=#?P}fv~.9}f41K\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Decoder decoder0 = new Decoder("(!)@w1:5-(A+$M#;tC", "(!)@w1:5-(A+$M#;tC");
      // Undeclared exception!
      try { 
        decoder0.decode();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(A\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Decoder decoder0 = new Decoder("\\6_k", "\\6_k");
      String string0 = decoder0.decode();
      assertEquals("6_k", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Decoder decoder0 = new Decoder(":", (String) null);
      String string0 = decoder0.decode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Decoder decoder0 = new Decoder("(!)@y+1:5+$M#;C", "(!)@y+1:5+$M#;C");
      String string0 = decoder0.decode();
      assertEquals("(!)@y+1(!)@y+$M#;C", string0);
  }
}
