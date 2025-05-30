/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:16:11 GMT 2022
 */

package com.mongodb.atlas.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mongodb.atlas.model.Measurement;
import com.mongodb.atlas.model.MeasurementsResult;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MeasurementsResult_ESTest extends MeasurementsResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeasurementsResult measurementsResult0 = new MeasurementsResult();
      LinkedList<Measurement> linkedList0 = new LinkedList<Measurement>();
      measurementsResult0.measurements = (List<Measurement>) linkedList0;
      List<Measurement> list0 = measurementsResult0.getMeasurements();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MeasurementsResult measurementsResult0 = new MeasurementsResult();
      LinkedList<Measurement> linkedList0 = new LinkedList<Measurement>();
      measurementsResult0.measurements = (List<Measurement>) linkedList0;
      Measurement measurement0 = new Measurement();
      linkedList0.offerFirst(measurement0);
      List<Measurement> list0 = measurementsResult0.getMeasurements();
      assertTrue(list0.contains(measurement0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MeasurementsResult measurementsResult0 = new MeasurementsResult();
      List<Measurement> list0 = measurementsResult0.getMeasurements();
      assertNull(list0);
  }
}
