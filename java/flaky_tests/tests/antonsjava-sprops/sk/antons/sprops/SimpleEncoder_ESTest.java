/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:25:33 GMT 2022
 */

package sk.antons.sprops;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sk.antons.sprops.SimpleEncoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleEncoder_ESTest extends SimpleEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      SimpleEncoder simpleEncoder0 = SimpleEncoder.instance(byteArray0);
      assertNotNull(simpleEncoder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleEncoder simpleEncoder0 = SimpleEncoder.instance("q73;T5i##pA!&oyU[Q");
      assertNotNull(simpleEncoder0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleEncoder simpleEncoder0 = new SimpleEncoder();
      // Undeclared exception!
      try { 
        simpleEncoder0.encode(";Sa#KO.q9'd8z");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // sk/antons/jaul/Is
         //
         verifyException("sk.antons.sprops.SimpleEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleEncoder.instance("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad password - encoding
         //
         verifyException("sk.antons.sprops.AbstractEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleEncoder.instance((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad password
         //
         verifyException("sk.antons.sprops.AbstractEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleEncoder simpleEncoder0 = new SimpleEncoder();
      // Undeclared exception!
      try { 
        simpleEncoder0.decode(";Sa#KO.q9'd8z");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // sk/antons/jaul/Is
         //
         verifyException("sk.antons.sprops.SimpleEncoder", e);
      }
  }
}
