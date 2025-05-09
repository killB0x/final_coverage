/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 00:10:59 GMT 2022
 */

package net.masterthought.cucumber.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.masterthought.cucumber.json.Embedding;
import net.masterthought.cucumber.json.Hook;
import net.masterthought.cucumber.json.Match;
import net.masterthought.cucumber.json.Output;
import net.masterthought.cucumber.json.Result;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Hook_ESTest extends Hook_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hook hook0 = new Hook();
      // Undeclared exception!
      try { 
        hook0.hasContent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.masterthought.cucumber.json.Hook", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hook hook0 = new Hook();
      Result result0 = hook0.getResult();
      assertNull(result0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hook hook0 = new Hook();
      Embedding[] embeddingArray0 = hook0.getEmbeddings();
      assertEquals(0, embeddingArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hook hook0 = new Hook();
      Match match0 = hook0.getMatch();
      assertNull(match0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Hook hook0 = new Hook();
      Output[] outputArray0 = hook0.getOutputs();
      assertEquals(0, outputArray0.length);
  }
}
