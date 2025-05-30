/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 20:44:19 GMT 2022
 */

package com.github.uuidcode.builder.process;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.uuidcode.builder.process.MavenProcessBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MavenProcessBuilder_ESTest extends MavenProcessBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MavenProcessBuilder mavenProcessBuilder0 = MavenProcessBuilder.of();
      String string0 = mavenProcessBuilder0.getCommand();
      assertEquals("mvn", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MavenProcessBuilder mavenProcessBuilder0 = MavenProcessBuilder.of();
      // Undeclared exception!
      try { 
        mavenProcessBuilder0.getLibraryPathList();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/gson/ExclusionStrategy
         //
         verifyException("com.github.uuidcode.builder.process.ProcessBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MavenProcessBuilder mavenProcessBuilder0 = new MavenProcessBuilder();
      // Undeclared exception!
      try { 
        mavenProcessBuilder0.getLibraryList();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/gson/ExclusionStrategy
         //
         verifyException("com.github.uuidcode.builder.process.ProcessBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MavenProcessBuilder mavenProcessBuilder0 = MavenProcessBuilder.of();
      MavenProcessBuilder mavenProcessBuilder1 = mavenProcessBuilder0.dependencyBuildClasspath();
      assertSame(mavenProcessBuilder0, mavenProcessBuilder1);
  }
}
