/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:46:32 GMT 2022
 */

package net.segoia.util.expression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import net.segoia.util.expression.ExpressionEvaluator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExpressionEvaluator_ESTest extends ExpressionEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.divide("6", "net.segoia.util.expression.ExpressionEvaluator");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Character array is missing \"e\" notation exponential mark.
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.multiply("6", "net.segoia.util.expression.ExpressionEvaluator");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Character array is missing \"e\" notation exponential mark.
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      BigDecimal bigDecimal0 = expressionEvaluator0.subtract("6", "6");
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      BigDecimal bigDecimal0 = expressionEvaluator0.multiply("6", "6");
      assertEquals((short)36, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      BigDecimal bigDecimal0 = expressionEvaluator0.divide("5", "5");
      assertEquals((byte)1, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      BigDecimal bigDecimal0 = expressionEvaluator0.add("5", "5");
      assertEquals((short)10, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.subtract("6", "V");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Character V is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.divide((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.divide("0", "0");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Division undefined
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.add("6", "");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.add((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.multiply((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      // Undeclared exception!
      try { 
        expressionEvaluator0.subtract((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionEvaluator expressionEvaluator0 = new ExpressionEvaluator();
      BigDecimal bigDecimal0 = expressionEvaluator0.add("0", "0");
      assertEquals((short)0, bigDecimal0.shortValue());
  }
}
