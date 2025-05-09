/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:42:54 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.DefaultRandomService;
import dev.codesoapbox.dummy4j.Dummy4j;
import dev.codesoapbox.dummy4j.ExpressionResolver;
import dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gs1Dash128Factory;
import dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gtin14Builder;
import dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.SsccFactory;
import dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModTenFormula;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Gs1Dash128Factory_ESTest extends Gs1Dash128Factory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      SsccFactory ssccFactory0 = new SsccFactory((Dummy4j) null, modTenFormula0);
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      Gs1Dash128Factory gs1Dash128Factory0 = new Gs1Dash128Factory(dummy4j0, (Gtin14Builder) null, ssccFactory0);
      // Undeclared exception!
      gs1Dash128Factory0.createCode();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gs1Dash128Factory gs1Dash128Factory0 = null;
      try {
        gs1Dash128Factory0 = new Gs1Dash128Factory((Dummy4j) null, (Gtin14Builder) null, (SsccFactory) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      SsccFactory ssccFactory0 = new SsccFactory((Dummy4j) null, modTenFormula0);
      Gs1Dash128Factory gs1Dash128Factory0 = new Gs1Dash128Factory((Dummy4j) null, (Gtin14Builder) null, ssccFactory0);
      // Undeclared exception!
      try { 
        gs1Dash128Factory0.createCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gs1Dash128Factory", e);
      }
  }
}
