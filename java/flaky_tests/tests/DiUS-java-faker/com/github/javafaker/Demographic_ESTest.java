/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 21:30:47 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Demographic;
import com.github.javafaker.Faker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Demographic_ESTest extends Demographic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Faker faker0 = new Faker();
      Demographic demographic0 = faker0.demographic();
      // Undeclared exception!
      try { 
        demographic0.sex();
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
      Demographic demographic0 = faker0.demographic();
      // Undeclared exception!
      try { 
        demographic0.race();
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
      Demographic demographic0 = faker0.demographic();
      // Undeclared exception!
      try { 
        demographic0.maritalStatus();
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
      Faker faker0 = Faker.instance();
      Demographic demographic0 = faker0.demographic();
      // Undeclared exception!
      try { 
        demographic0.demonym();
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
      Demographic demographic0 = new Demographic((Faker) null);
      // Undeclared exception!
      try { 
        demographic0.educationalAttainment();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Demographic", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Demographic demographic0 = new Demographic((Faker) null);
      // Undeclared exception!
      try { 
        demographic0.sex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Demographic", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Demographic demographic0 = new Demographic((Faker) null);
      // Undeclared exception!
      try { 
        demographic0.demonym();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Demographic", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Demographic demographic0 = new Demographic((Faker) null);
      // Undeclared exception!
      try { 
        demographic0.race();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Demographic", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Demographic demographic0 = new Demographic((Faker) null);
      // Undeclared exception!
      try { 
        demographic0.maritalStatus();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Demographic", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Faker faker0 = new Faker();
      Demographic demographic0 = faker0.demographic();
      // Undeclared exception!
      try { 
        demographic0.educationalAttainment();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }
}
