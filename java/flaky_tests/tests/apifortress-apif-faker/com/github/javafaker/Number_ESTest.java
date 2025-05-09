/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 12:45:42 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import java.util.Locale;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Number_ESTest extends Number_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = new Number(faker0);
      number0.randomNumber(1, true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      Faker faker0 = new Faker(locale0);
      Number number0 = new Number(faker0);
      number0.randomDouble((-433), (long) (-433), (long) (-433));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Faker faker0 = new Faker(locale0);
      Number number0 = new Number(faker0);
      number0.randomDouble(6, (-1L), 0L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Faker faker0 = new Faker();
      Number number0 = new Number(faker0);
      number0.randomDouble((-3277), (-3277), (-3277));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Faker faker0 = new Faker(locale0);
      Number number0 = new Number(faker0);
      number0.randomDigit();
      number0.randomDouble(0, 163L, 409L);
      number0.numberBetween(0, 305);
      number0.randomDigit();
      number0.randomNumber();
      number0.randomDigit();
      number0.digit();
      number0.randomDouble(11, 1687L, 0L);
      number0.randomDouble(0, 171, 0);
      number0.numberBetween((-921L), 1687L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(308L);
      Faker faker0 = new Faker(mockRandom0);
      Number number0 = faker0.number();
      number0.numberBetween((-1666L), 3115L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Faker faker0 = Faker.instance(locale0);
      Number number0 = new Number(faker0);
      number0.numberBetween((-1231), 0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = faker0.number();
      number0.digits((-510));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = new Number(faker0);
      // Undeclared exception!
      try { 
        number0.randomNumber((-1), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be positive
         //
         verifyException("com.github.javafaker.service.RandomService", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.randomNumber();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.randomDouble(67, 2932L, (long) 67);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.randomDouble(90, 90, (-2282));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = faker0.number();
      // Undeclared exception!
      try { 
        number0.randomDouble(2145790048, 2145790048, 2145790048);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // BigInteger would overflow supported range
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.randomDigitNotZero();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.randomDigit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.numberBetween((-409L), (-1247L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.numberBetween(2122, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = new Number(faker0);
      // Undeclared exception!
      number0.digits(949999);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.digits(1637);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.digit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Faker faker0 = new Faker(locale0);
      Number number0 = new Number(faker0);
      String string0 = number0.digits(11);
      assertEquals("07429307526", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Number number0 = new Number((Faker) null);
      // Undeclared exception!
      try { 
        number0.randomNumber(61, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Number", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = new Number(faker0);
      // Undeclared exception!
      try { 
        number0.randomDouble(2147045654, (long) 2147045654, (long) 2147045654);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // BigInteger would overflow supported range
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Faker faker0 = Faker.instance((Random) mockRandom0);
      Number number0 = new Number(faker0);
      long long0 = number0.randomNumber(0, true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = new Number(faker0);
      int int0 = number0.randomDigitNotZero();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(308L);
      Faker faker0 = new Faker(mockRandom0);
      Number number0 = faker0.number();
      double double0 = number0.randomDouble(4, 4, (-4320));
      assertEquals((-4313.4243), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Number number0 = faker0.number();
      long long0 = number0.numberBetween(0L, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Faker faker0 = Faker.instance((Random) mockRandom0);
      Number number0 = new Number(faker0);
      int int0 = number0.numberBetween(0, 0);
      assertEquals(0, int0);
  }
}
