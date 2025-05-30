/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 21:25:59 GMT 2022
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.DragonBall;
import com.github.javafaker.Faker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DragonBall_ESTest extends DragonBall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Faker faker0 = new Faker();
      DragonBall dragonBall0 = new DragonBall(faker0);
      // Undeclared exception!
      try { 
        dragonBall0.character();
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
      DragonBall dragonBall0 = new DragonBall((Faker) null);
      // Undeclared exception!
      try { 
        dragonBall0.character();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.DragonBall", e);
      }
  }
}
