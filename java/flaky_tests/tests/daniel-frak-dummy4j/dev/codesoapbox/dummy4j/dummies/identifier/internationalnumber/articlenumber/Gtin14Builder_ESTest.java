/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:29:09 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.DefaultRandomService;
import dev.codesoapbox.dummy4j.Dummy4j;
import dev.codesoapbox.dummy4j.ExpressionResolver;
import dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gtin14Builder;
import dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModTenFormula;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Gtin14Builder_ESTest extends Gtin14Builder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      Gtin14Builder gtin14Builder0 = new Gtin14Builder((Dummy4j) null, modTenFormula0);
      // Undeclared exception!
      try { 
        gtin14Builder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gtin14Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      ModTenFormula modTenFormula0 = new ModTenFormula();
      Gtin14Builder gtin14Builder0 = new Gtin14Builder(dummy4j0, modTenFormula0);
      String string0 = gtin14Builder0.build();
      assertEquals((-1621500333L), (long)dummy4j0.getSeed());
      assertEquals("00000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      ModTenFormula modTenFormula0 = new ModTenFormula();
      Gtin14Builder gtin14Builder0 = new Gtin14Builder(dummy4j0, modTenFormula0);
      gtin14Builder0.withoutApplicationIdentifier();
      assertEquals(1642149112L, (long)dummy4j0.getSeed());
      assertEquals(1642149112L, defaultRandomService0.getSeed());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultRandomService defaultRandomService0 = new DefaultRandomService();
      Dummy4j dummy4j0 = new Dummy4j((ExpressionResolver) null, defaultRandomService0);
      ModTenFormula modTenFormula0 = new ModTenFormula();
      Gtin14Builder gtin14Builder0 = new Gtin14Builder(dummy4j0, modTenFormula0);
      gtin14Builder0.withApplicationIdentifier();
      String string0 = gtin14Builder0.build();
      assertEquals(2003641362L, (long)dummy4j0.getSeed());
      assertEquals("(01)00000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ModTenFormula modTenFormula0 = new ModTenFormula();
      Gtin14Builder gtin14Builder0 = new Gtin14Builder((Dummy4j) null, modTenFormula0);
      Gtin14Builder gtin14Builder1 = gtin14Builder0.self();
      assertSame(gtin14Builder1, gtin14Builder0);
  }
}
