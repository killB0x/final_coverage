/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 15:46:03 GMT 2022
 */

package edu.nps.moves.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.nps.moves.examples.EspduReceiverNIO;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EspduReceiverNIO_ESTest extends EspduReceiverNIO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[3];
          EspduReceiverNIO.main(stringArray0);
          assertEquals(3, stringArray0.length);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EspduReceiverNIO espduReceiverNIO0 = new EspduReceiverNIO();
      assertEquals(8192, EspduReceiverNIO.MAX_PDU_SIZE);
  }
}
