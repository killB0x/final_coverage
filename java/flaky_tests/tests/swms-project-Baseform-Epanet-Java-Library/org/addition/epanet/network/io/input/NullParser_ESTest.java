/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 17:01:11 GMT 2022
 */

package org.addition.epanet.network.io.input;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.logging.Logger;
import org.addition.epanet.network.Network;
import org.addition.epanet.network.io.input.NullParser;
import org.addition.epanet.network.structures.Pump;
import org.addition.epanet.network.structures.Tank;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NullParser_ESTest extends NullParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Network network0 = new Network();
      NullParser nullParser0 = new NullParser((Logger) null);
      Network network1 = nullParser0.parse(network0, (File) null);
      assertSame(network1, network0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      NullParser nullParser0 = new NullParser(logger0);
      Network network0 = new Network();
      Tank tank0 = new Tank();
      network0.addJunction("Z1jXs3vw]1')AN]@a", tank0);
      // Undeclared exception!
      try { 
        nullParser0.parse(network0, (File) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullParser nullParser0 = new NullParser((Logger) null);
      Network network0 = new Network();
      File file0 = MockFile.createTempFile("*,9>Tc|?Xnq>K<: .j", "*,9>Tc|?Xnq>K<: .j");
      Pump pump0 = new Pump();
      network0.addPump("*,9>Tc|?Xnq>K<: .j", pump0);
      // Undeclared exception!
      try { 
        nullParser0.parse(network0, file0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.network.io.input.InputParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NullParser nullParser0 = new NullParser((Logger) null);
      // Undeclared exception!
      try { 
        nullParser0.parse((Network) null, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.network.io.input.InputParser", e);
      }
  }
}
