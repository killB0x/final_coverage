/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:59:08 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.DefaultRandomService;
import dev.codesoapbox.dummy4j.Dummy4j;
import dev.codesoapbox.dummy4j.ExpressionResolver;
import dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.UpcFactory;
import dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModTenFormula;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UpcFactory_ESTest extends UpcFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      UpcFactory upcFactory0 = new UpcFactory((Dummy4j) null, modTenFormula0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long(203L);
      DefaultRandomService defaultRandomService0 = new DefaultRandomService(long0);
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      ModTenFormula modTenFormula0 = new ModTenFormula();
      UpcFactory upcFactory0 = UpcFactory.newInstance(dummy4j0, modTenFormula0);
      String string0 = upcFactory0.getGs1Prefix();
      assertEquals("000", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      UpcFactory upcFactory0 = UpcFactory.newInstance((Dummy4j) null, modTenFormula0);
      // Undeclared exception!
      try { 
        upcFactory0.getGs1Prefix();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.UpcFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      UpcFactory upcFactory0 = UpcFactory.newInstance((Dummy4j) null, modTenFormula0);
      // Undeclared exception!
      try { 
        upcFactory0.createUpc();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.UpcFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Long long0 = new Long(203L);
      DefaultRandomService defaultRandomService0 = new DefaultRandomService(long0);
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      ModTenFormula modTenFormula0 = new ModTenFormula();
      UpcFactory upcFactory0 = UpcFactory.newInstance(dummy4j0, modTenFormula0);
      String string0 = upcFactory0.createUpc();
      assertEquals("000000000000", string0);
  }
}
