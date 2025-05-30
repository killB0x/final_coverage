/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 20:56:54 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IdNumber_ESTest extends IdNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Faker faker0 = Faker.instance();
      IdNumber idNumber0 = faker0.idNumber();
      // Undeclared exception!
      idNumber0.validSvSeSsn();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Faker faker0 = new Faker();
      IdNumber idNumber0 = faker0.idNumber();
      // Undeclared exception!
      try { 
        idNumber0.valid();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Faker faker0 = Faker.instance();
      IdNumber idNumber0 = new IdNumber(faker0);
      // Undeclared exception!
      try { 
        idNumber0.ssnValid();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/mifmif/common/regex/Generex
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Faker faker0 = Faker.instance();
      IdNumber idNumber0 = faker0.idNumber();
      // Undeclared exception!
      try { 
        idNumber0.invalid();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IdNumber idNumber0 = new IdNumber((Faker) null);
      // Undeclared exception!
      try { 
        idNumber0.invalid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.IdNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IdNumber idNumber0 = new IdNumber((Faker) null);
      // Undeclared exception!
      try { 
        idNumber0.valid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.IdNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IdNumber idNumber0 = new IdNumber((Faker) null);
      String string0 = idNumber0.invalidSvSeSsn();
      assertEquals("121212-1212", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IdNumber idNumber0 = new IdNumber((Faker) null);
      // Undeclared exception!
      try { 
        idNumber0.validSvSeSsn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.idnumbers.SvSEIdNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IdNumber idNumber0 = new IdNumber((Faker) null);
      // Undeclared exception!
      try { 
        idNumber0.ssnValid();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.idnumbers.EnIdNumber", e);
      }
  }
}
