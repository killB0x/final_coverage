/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:47:40 GMT 2022
 */

package net.imglib2.converter.read;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Supplier;
import net.imglib2.PointSampleList;
import net.imglib2.RealCursor;
import net.imglib2.RealPointSampleList;
import net.imglib2.converter.Converter;
import net.imglib2.converter.TypeIdentity;
import net.imglib2.converter.read.ConvertedRealCursor;
import net.imglib2.type.numeric.ARGBDoubleType;
import net.imglib2.type.volatiles.VolatileUnsignedIntType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConvertedRealCursor_ESTest extends ConvertedRealCursor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypeIdentity<ARGBDoubleType> typeIdentity0 = new TypeIdentity<ARGBDoubleType>();
      Supplier<ARGBDoubleType> supplier0 = (Supplier<ARGBDoubleType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      ConvertedRealCursor<ARGBDoubleType, ARGBDoubleType> convertedRealCursor0 = new ConvertedRealCursor<ARGBDoubleType, ARGBDoubleType>((RealCursor<ARGBDoubleType>) null, typeIdentity0, supplier0);
      // Undeclared exception!
      try { 
        convertedRealCursor0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.converter.read.ConvertedRealCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PointSampleList<VolatileUnsignedIntType> pointSampleList0 = new PointSampleList<VolatileUnsignedIntType>(14);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      TypeIdentity<VolatileUnsignedIntType> typeIdentity0 = new TypeIdentity<VolatileUnsignedIntType>();
      Supplier<VolatileUnsignedIntType> supplier0 = (Supplier<VolatileUnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      ConvertedRealCursor<VolatileUnsignedIntType, VolatileUnsignedIntType> convertedRealCursor0 = new ConvertedRealCursor<VolatileUnsignedIntType, VolatileUnsignedIntType>(pointSampleList_PointSampleListCursor0, typeIdentity0, supplier0);
      // Undeclared exception!
      try { 
        convertedRealCursor0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.converter.TypeIdentity", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RealPointSampleList<PointSampleList.PointSampleListCursor> realPointSampleList0 = new RealPointSampleList<PointSampleList.PointSampleListCursor>(3024);
      RealCursor<PointSampleList.PointSampleListCursor> realCursor0 = realPointSampleList0.cursor();
      Converter<PointSampleList.PointSampleListCursor, PointSampleList.PointSampleListCursor> converter0 = (Converter<PointSampleList.PointSampleListCursor, PointSampleList.PointSampleListCursor>) mock(Converter.class, new ViolatedAssumptionAnswer());
      Supplier<PointSampleList.PointSampleListCursor> supplier0 = (Supplier<PointSampleList.PointSampleListCursor>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(supplier0).get();
      ConvertedRealCursor<PointSampleList.PointSampleListCursor, PointSampleList.PointSampleListCursor> convertedRealCursor0 = new ConvertedRealCursor<PointSampleList.PointSampleListCursor, PointSampleList.PointSampleListCursor>(realCursor0, converter0, supplier0);
      ConvertedRealCursor<PointSampleList.PointSampleListCursor, PointSampleList.PointSampleListCursor> convertedRealCursor1 = convertedRealCursor0.copy();
      assertFalse(convertedRealCursor1.equals((Object)convertedRealCursor0));
  }
}
