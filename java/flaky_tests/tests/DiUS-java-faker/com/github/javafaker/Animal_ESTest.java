/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 20:56:12 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Animal;
import com.github.javafaker.Faker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Animal_ESTest extends Animal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Animal animal0 = new Animal((Faker) null);
      // Undeclared exception!
      try { 
        animal0.name();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.Animal", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Faker faker0 = new Faker();
      Animal animal0 = faker0.animal();
      // Undeclared exception!
      try { 
        animal0.name();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/Yaml
         //
         verifyException("com.github.javafaker.service.FakeValues", e);
      }
  }
}
