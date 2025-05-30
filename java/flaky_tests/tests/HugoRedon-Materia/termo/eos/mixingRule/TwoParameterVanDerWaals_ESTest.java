/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 05:12:26 GMT 2022
 */

package termo.eos.mixingRule;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import termo.binaryParameter.ActivityModelBinaryParameter;
import termo.binaryParameter.InteractionParameter;
import termo.component.Compound;
import termo.eos.Cubic;
import termo.eos.alpha.TwoEquationsAlphaExpression;
import termo.eos.alpha.UnitAlpha;
import termo.eos.alpha.commonaAlphaEquationsImplementation.PengAndRobinsonAlpha;
import termo.eos.alpha.commonaAlphaEquationsImplementation.SoaveAlpha;
import termo.eos.mixingRule.TwoParameterVanDerWaals;
import termo.matter.Mixture;
import termo.matter.Substance;
import termo.phase.Phase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TwoParameterVanDerWaals_ESTest extends TwoParameterVanDerWaals_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      String string0 = twoParameterVanDerWaals0.getParameterName((-508));
      assertEquals("Kji", string0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Compound compound0 = new Compound();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Compound compound1 = new Compound();
      twoParameterVanDerWaals0.setParameter(1151.0, compound1, compound0, activityModelBinaryParameter0, 1);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Compound compound0 = new Compound();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Compound compound1 = new Compound("");
      twoParameterVanDerWaals0.getParameter(compound0, compound1, activityModelBinaryParameter0, 1);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Compound compound0 = new Compound();
      Compound compound1 = new Compound();
      twoParameterVanDerWaals0.getParameter(compound1, compound0, activityModelBinaryParameter0, 0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      double double0 = twoParameterVanDerWaals0.getParameter((Compound) null, (Compound) null, activityModelBinaryParameter0, (-929));
      assertEquals(0.0, double0, 0.01);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      UnitAlpha unitAlpha0 = new UnitAlpha();
      Compound compound0 = new Compound();
      Phase phase0 = Phase.LIQUID;
      Substance substance0 = new Substance(cubic0, unitAlpha0, compound0, phase0);
      LinkedHashSet<Compound> linkedHashSet0 = new LinkedHashSet<Compound>();
      linkedHashSet0.add(compound0);
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Mixture mixture0 = new Mixture(cubic0, unitAlpha0, linkedHashSet0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      twoParameterVanDerWaals0.setParameter(Double.NaN, compound0, compound0, activityModelBinaryParameter0, 1);
      double double0 = twoParameterVanDerWaals0.oneOverNParcial_aN2RespectN(substance0, mixture0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      UnitAlpha unitAlpha0 = new UnitAlpha();
      Compound compound0 = new Compound();
      LinkedHashSet<Compound> linkedHashSet0 = new LinkedHashSet<Compound>();
      linkedHashSet0.add(compound0);
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Phase phase0 = Phase.VAPOR;
      activityModelBinaryParameter0.setValue(compound0, compound0, (-0.15613));
      activityModelBinaryParameter0.setTwoParameterVanDerWaals(activityModelBinaryParameter0);
      Mixture mixture0 = new Mixture(cubic0, unitAlpha0, linkedHashSet0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      double double0 = twoParameterVanDerWaals0.a(mixture0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      UnitAlpha unitAlpha0 = new UnitAlpha();
      Compound compound0 = new Compound();
      LinkedHashSet<Compound> linkedHashSet0 = new LinkedHashSet<Compound>();
      linkedHashSet0.add(compound0);
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Phase phase0 = Phase.LIQUID;
      Mixture mixture0 = new Mixture(cubic0, unitAlpha0, linkedHashSet0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      PengAndRobinsonAlpha pengAndRobinsonAlpha0 = new PengAndRobinsonAlpha();
      Substance substance0 = new Substance(cubic0, pengAndRobinsonAlpha0, compound0, phase0);
      mixture0.addComponent(substance0, 516.36);
      double double0 = mixture0.calculateFugacity(compound0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Cubic cubic0 = new Cubic();
      Phase phase0 = Phase.LIQUID;
      Mixture mixture0 = new Mixture(cubic0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      Compound compound0 = new Compound("Kji");
      UnitAlpha unitAlpha0 = new UnitAlpha();
      Substance substance0 = new Substance(cubic0, unitAlpha0, compound0, phase0);
      double double0 = twoParameterVanDerWaals0.oneOverNParcial_aN2RespectN(substance0, mixture0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Compound compound0 = new Compound();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      twoParameterVanDerWaals0.setParameter(1151.0, compound0, compound0, activityModelBinaryParameter0, 1);
      double double0 = twoParameterVanDerWaals0.getParameter(compound0, compound0, activityModelBinaryParameter0, 1);
      assertEquals(1151.0, double0, 0.01);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Cubic cubic0 = new Cubic();
      Phase phase0 = Phase.LIQUID;
      Mixture mixture0 = new Mixture(cubic0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      double double0 = twoParameterVanDerWaals0.a(mixture0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.getName());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Compound compound0 = new Compound();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      InteractionParameter interactionParameter0 = activityModelBinaryParameter0.getA();
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.setParameter(2, compound0, compound0, interactionParameter0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class termo.binaryParameter.InteractionParameter cannot be cast to class termo.binaryParameter.ActivityModelBinaryParameter (termo.binaryParameter.InteractionParameter and termo.binaryParameter.ActivityModelBinaryParameter are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5ac0ee4a)
         //
         verifyException("termo.eos.mixingRule.TwoParameterVanDerWaals", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      TwoEquationsAlphaExpression twoEquationsAlphaExpression0 = new TwoEquationsAlphaExpression();
      Phase phase0 = Phase.LIQUID;
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Mixture mixture0 = new Mixture(cubic0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      Compound compound0 = new Compound("Kij");
      Substance substance0 = new Substance(cubic0, twoEquationsAlphaExpression0, compound0, phase0);
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.oneOverNParcial_aN2RespectN(substance0, mixture0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("termo.eos.alpha.TwoEquationsAlphaExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      SoaveAlpha soaveAlpha0 = new SoaveAlpha();
      Compound compound0 = new Compound("");
      Phase phase0 = Phase.LIQUID;
      Substance substance0 = new Substance(cubic0, soaveAlpha0, compound0, phase0);
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      InteractionParameter interactionParameter0 = activityModelBinaryParameter0.getAlpha();
      Mixture mixture0 = new Mixture(cubic0, phase0, twoParameterVanDerWaals0, interactionParameter0);
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.oneOverNParcial_aN2RespectN(substance0, mixture0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class termo.binaryParameter.InteractionParameter cannot be cast to class termo.binaryParameter.ActivityModelBinaryParameter (termo.binaryParameter.InteractionParameter and termo.binaryParameter.ActivityModelBinaryParameter are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5ac0ee4a)
         //
         verifyException("termo.eos.mixingRule.TwoParameterVanDerWaals", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      InteractionParameter interactionParameter0 = new InteractionParameter();
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.getParameter((Compound) null, (Compound) null, interactionParameter0, (-2254));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class termo.binaryParameter.InteractionParameter cannot be cast to class termo.binaryParameter.ActivityModelBinaryParameter (termo.binaryParameter.InteractionParameter and termo.binaryParameter.ActivityModelBinaryParameter are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5ac0ee4a)
         //
         verifyException("termo.eos.mixingRule.TwoParameterVanDerWaals", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Mixture mixture0 = new Mixture();
      Substance substance0 = new Substance();
      mixture0.addComponent(substance0, 0.0);
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.a(mixture0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("termo.matter.Substance", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      Phase phase0 = Phase.LIQUID;
      InteractionParameter interactionParameter0 = new InteractionParameter();
      Mixture mixture0 = new Mixture(cubic0, phase0, twoParameterVanDerWaals0, interactionParameter0);
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.a(mixture0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class termo.binaryParameter.InteractionParameter cannot be cast to class termo.binaryParameter.ActivityModelBinaryParameter (termo.binaryParameter.InteractionParameter and termo.binaryParameter.ActivityModelBinaryParameter are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5ac0ee4a)
         //
         verifyException("termo.eos.mixingRule.TwoParameterVanDerWaals", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      String string0 = twoParameterVanDerWaals0.getParameterName(0);
      assertEquals("Kij", string0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      String string0 = twoParameterVanDerWaals0.getParameterName(2229);
      assertEquals("Kji", string0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      twoParameterVanDerWaals0.setParameter(443.9704, (Compound) null, (Compound) null, activityModelBinaryParameter0, (-119956446));
      assertEquals("2PDVW", twoParameterVanDerWaals0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Compound compound0 = new Compound();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.setParameter((-233.8006), compound0, (Compound) null, activityModelBinaryParameter0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("termo.binaryParameter.InteractionParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      // Undeclared exception!
      try { 
        twoParameterVanDerWaals0.getParameter((Compound) null, (Compound) null, (InteractionParameter) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("termo.eos.mixingRule.TwoParameterVanDerWaals", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      Cubic cubic0 = new Cubic();
      UnitAlpha unitAlpha0 = new UnitAlpha();
      Compound compound0 = new Compound();
      LinkedHashSet<Compound> linkedHashSet0 = new LinkedHashSet<Compound>();
      linkedHashSet0.add(compound0);
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Compound compound1 = new Compound("(0)B_qR)n^`=dm(^,d");
      linkedHashSet0.add(compound1);
      Phase phase0 = Phase.LIQUID;
      Mixture mixture0 = new Mixture(cubic0, unitAlpha0, linkedHashSet0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      mixture0.calculateFugacity(compound0);
      assertEquals("2PDVW", twoParameterVanDerWaals0.getName());
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      ActivityModelBinaryParameter activityModelBinaryParameter0 = new ActivityModelBinaryParameter();
      Cubic cubic0 = new Cubic();
      Phase phase0 = Phase.LIQUID;
      Mixture mixture0 = new Mixture(cubic0, phase0, twoParameterVanDerWaals0, activityModelBinaryParameter0);
      double double0 = twoParameterVanDerWaals0.temperatureParcial_a(mixture0);
      assertEquals(0.0, double0, 0.01);
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TwoParameterVanDerWaals twoParameterVanDerWaals0 = new TwoParameterVanDerWaals();
      int int0 = twoParameterVanDerWaals0.numberOfParameters();
      assertEquals("2PDVW", twoParameterVanDerWaals0.toString());
      assertEquals(2, int0);
  }
}
