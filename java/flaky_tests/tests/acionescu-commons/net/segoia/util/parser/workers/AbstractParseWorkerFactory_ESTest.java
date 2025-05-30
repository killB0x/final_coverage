/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:40:54 GMT 2022
 */

package net.segoia.util.parser.workers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import net.segoia.util.parser.workers.AbstractParseWorkerFactory;
import net.segoia.util.parser.workers.ParseWorker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractParseWorkerFactory_ESTest extends AbstractParseWorkerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      try { 
        AbstractParseWorkerFactory.createWorker("", hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No factory found for worker of type 
         //
         verifyException("net.segoia.util.parser.workers.AbstractParseWorkerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      ParseWorker parseWorker0 = AbstractParseWorkerFactory.createWorker("STRING_CONCAT", hashMap0);
      assertNotNull(parseWorker0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      ParseWorker parseWorker0 = AbstractParseWorkerFactory.createWorker("MAPPER", hashMap0);
      assertNotNull(parseWorker0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbstractParseWorkerFactory abstractParseWorkerFactory0 = new AbstractParseWorkerFactory();
  }
}
