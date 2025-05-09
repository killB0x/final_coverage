/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 13:32:40 GMT 2022
 */

package com.insightml.data.samples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.insightml.data.samples.SelectionSample;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SelectionSample_ESTest extends SelectionSample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(2616);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      SelectionSample<Locale.FilteringMode, Double> selectionSample0 = new SelectionSample<Locale.FilteringMode, Double>(2616, locale_FilteringMode0, double0, 2616, 0.0F);
      selectionSample0.getElement();
      assertEquals(2616, selectionSample0.getElementPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SelectionSample<Double, Double> selectionSample0 = null;
      try {
        selectionSample0 = new SelectionSample<Double, Double>(9999, (Double) null, (Double) null, (-549.670949321975), 9999);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.insightml.utils.Check", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      SelectionSample<Locale.FilteringMode, Locale.FilteringMode> selectionSample0 = null;
      try {
        selectionSample0 = new SelectionSample<Locale.FilteringMode, Locale.FilteringMode>((-187), locale_FilteringMode0, locale_FilteringMode0, (-187), (-187));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.String@0000000002                        (null:-1 : SelectionSample.java:30)
         //
         verifyException("com.insightml.utils.Check", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(2616);
      SelectionSample<Double, Double> selectionSample0 = new SelectionSample<Double, Double>(2616, double0, double0, 2616, 2616);
      String string0 = selectionSample0.toString();
      assertEquals("SelectionItem{2616.0, 2616.0}", string0);
      assertEquals(2616, selectionSample0.getElementPosition());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      SelectionSample<Double, Locale.FilteringMode> selectionSample0 = new SelectionSample<Double, Locale.FilteringMode>(537, (Double) null, locale_FilteringMode0, 537, 537);
      selectionSample0.getElement();
      assertEquals(537, selectionSample0.getElementPosition());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      SelectionSample<Locale.FilteringMode, Locale.FilteringMode> selectionSample0 = new SelectionSample<Locale.FilteringMode, Locale.FilteringMode>(100, locale_FilteringMode0, locale_FilteringMode0, 100, 100);
      int int0 = selectionSample0.getElementPosition();
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      SelectionSample<Locale.FilteringMode, Locale.FilteringMode> selectionSample0 = new SelectionSample<Locale.FilteringMode, Locale.FilteringMode>(1909, locale_FilteringMode0, locale_FilteringMode0, 1909, 1909);
      selectionSample0.getReference();
      assertEquals(1909, selectionSample0.getElementPosition());
  }
}
