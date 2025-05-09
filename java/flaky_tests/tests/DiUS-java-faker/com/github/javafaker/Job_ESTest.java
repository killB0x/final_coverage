/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 21:36:18 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Faker;
import com.github.javafaker.Job;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Job_ESTest extends Job_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Faker faker0 = Faker.instance();
      Job job0 = new Job(faker0);
      // Undeclared exception!
      try { 
        job0.title();
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
      Faker faker0 = Faker.instance();
      Job job0 = faker0.job();
      // Undeclared exception!
      try { 
        job0.seniority();
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
      Job job0 = new Job(faker0);
      // Undeclared exception!
      try { 
        job0.position();
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
      Job job0 = new Job(faker0);
      // Undeclared exception!
      try { 
        job0.keySkills();
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
      Faker faker0 = Faker.instance();
      Job job0 = new Job(faker0);
      // Undeclared exception!
      try { 
        job0.field();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Job job0 = new Job((Faker) null);
      // Undeclared exception!
      try { 
        job0.keySkills();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Job job0 = new Job((Faker) null);
      // Undeclared exception!
      try { 
        job0.field();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Job job0 = new Job((Faker) null);
      // Undeclared exception!
      try { 
        job0.position();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Job job0 = new Job((Faker) null);
      // Undeclared exception!
      try { 
        job0.title();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Job job0 = new Job((Faker) null);
      // Undeclared exception!
      try { 
        job0.seniority();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Job", e);
      }
  }
}
