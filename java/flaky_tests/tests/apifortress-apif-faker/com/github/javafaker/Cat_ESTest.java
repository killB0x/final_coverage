/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 13:20:13 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Cat;
import com.github.javafaker.Faker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Cat_ESTest extends Cat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Cat cat0 = new Cat(faker0);
      // Undeclared exception!
      try { 
        cat0.registry();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Faker faker0 = new Faker();
      Cat cat0 = faker0.cat();
      // Undeclared exception!
      try { 
        cat0.name();
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
      Faker faker0 = new Faker();
      Cat cat0 = new Cat(faker0);
      // Undeclared exception!
      try { 
        cat0.breed();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Cat cat0 = new Cat((Faker) null);
      // Undeclared exception!
      try { 
        cat0.name();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Cat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Cat cat0 = new Cat((Faker) null);
      // Undeclared exception!
      try { 
        cat0.registry();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Cat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Cat cat0 = new Cat((Faker) null);
      // Undeclared exception!
      try { 
        cat0.breed();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Cat", e);
      }
  }
}
