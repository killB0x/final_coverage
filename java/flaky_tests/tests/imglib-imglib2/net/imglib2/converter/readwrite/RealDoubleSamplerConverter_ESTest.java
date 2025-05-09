/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 17:11:35 GMT 2022
 */

package net.imglib2.converter.readwrite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Supplier;
import net.imglib2.PointSample;
import net.imglib2.PointSampleList;
import net.imglib2.converter.readwrite.RealDoubleSamplerConverter;
import net.imglib2.img.basictypeaccess.DoubleAccess;
import net.imglib2.type.numeric.real.DoubleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RealDoubleSamplerConverter_ESTest extends RealDoubleSamplerConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RealDoubleSamplerConverter<DoubleType> realDoubleSamplerConverter0 = new RealDoubleSamplerConverter<DoubleType>();
      PointSampleList<Object> pointSampleList0 = (PointSampleList<Object>) mock(PointSampleList.class, new ViolatedAssumptionAnswer());
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      DoubleType doubleType0 = realDoubleSamplerConverter0.convert(pointSampleList_PointSampleListCursor0);
      // Undeclared exception!
      try { 
        doubleType0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.converter.readwrite.RealDoubleSamplerConverter$RealConvertingDoubleAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RealDoubleSamplerConverter<DoubleType> realDoubleSamplerConverter0 = new RealDoubleSamplerConverter<DoubleType>();
      DoubleAccess doubleAccess0 = mock(DoubleAccess.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(doubleAccess0).getValue(anyInt());
      DoubleType doubleType0 = new DoubleType(doubleAccess0);
      Supplier<DoubleType> supplier0 = (Supplier<DoubleType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(doubleType0, doubleType0).when(supplier0).get();
      PointSample<DoubleType> pointSample0 = new PointSample<DoubleType>(supplier0, 126);
      DoubleType doubleType1 = realDoubleSamplerConverter0.convert(pointSample0);
      doubleType1.set(doubleType0);
      assertEquals(64, doubleType0.getBitsPerPixel());
  }
}
