/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 20:54:08 GMT 2022
 */

package no.bekk.bekkopen.mail.model;

import org.junit.Test;
import static org.junit.Assert.*;
import no.bekk.bekkopen.mail.model.Postnummer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Postnummer_ESTest extends Postnummer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Postnummer postnummer0 = new Postnummer("D+AWa");
      assertEquals("D+AWa", postnummer0.toString());
  }
}
