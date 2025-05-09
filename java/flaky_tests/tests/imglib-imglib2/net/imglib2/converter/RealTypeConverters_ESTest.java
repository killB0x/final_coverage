/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:40:42 GMT 2022
 */

package net.imglib2.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.PriorityQueue;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.imglib2.FinalInterval;
import net.imglib2.Localizable;
import net.imglib2.RandomAccessible;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.converter.Converter;
import net.imglib2.converter.RealTypeConverters;
import net.imglib2.img.basictypeaccess.nio.LongBufferAccess;
import net.imglib2.img.list.ListImg;
import net.imglib2.position.FunctionRandomAccessible;
import net.imglib2.type.logic.BitType;
import net.imglib2.type.numeric.RealType;
import net.imglib2.type.numeric.integer.UnsignedIntType;
import net.imglib2.type.volatiles.VolatileUnsignedIntType;
import net.imglib2.view.IntervalView;
import net.imglib2.view.SubsampleView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RealTypeConverters_ESTest extends RealTypeConverters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnsignedIntType unsignedIntType0 = new UnsignedIntType();
      Converter<UnsignedIntType, UnsignedIntType> converter0 = RealTypeConverters.getConverter(unsignedIntType0, unsignedIntType0);
      assertNotNull(converter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BiConsumer<Localizable, Object> biConsumer0 = (BiConsumer<Localizable, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>(2147483639, biConsumer0, supplier0);
      long[] longArray0 = new long[2];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      SubsampleView<UnsignedIntType> subsampleView0 = new SubsampleView<UnsignedIntType>(functionRandomAccessible0, longArray0);
      // Undeclared exception!
      RealTypeConverters.copyFromTo(subsampleView0, intervalView0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long[] longArray0 = new long[0];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>((RandomAccessible<UnsignedIntType>) null, finalInterval0);
      // Undeclared exception!
      try { 
        RealTypeConverters.copyFromTo((RandomAccessible<? extends RealType<?>>) null, intervalView0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.view.IntervalView", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>((-2147376278), (BiConsumer<Localizable, ? super UnsignedIntType>) null, (Supplier<UnsignedIntType>) null);
      long[] longArray0 = new long[8];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      // Undeclared exception!
      try { 
        RealTypeConverters.copyFromTo(functionRandomAccessible0, intervalView0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2147376278
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[7];
      PriorityQueue<VolatileUnsignedIntType> priorityQueue0 = new PriorityQueue<VolatileUnsignedIntType>();
      ListImg<VolatileUnsignedIntType> listImg0 = new ListImg<VolatileUnsignedIntType>(priorityQueue0, longArray0);
      // Undeclared exception!
      try { 
        RealTypeConverters.copyFromTo(listImg0, listImg0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      BiConsumer<Localizable, UnsignedIntType> biConsumer0 = (BiConsumer<Localizable, UnsignedIntType>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      UnsignedIntType unsignedIntType0 = new UnsignedIntType();
      UnsignedIntType unsignedIntType1 = unsignedIntType0.createVariable();
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(unsignedIntType0, unsignedIntType1, (Object) null).when(supplier0).get();
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>(0, biConsumer0, supplier0);
      long[] longArray0 = new long[8];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      IntervalView<UnsignedIntType> intervalView1 = new IntervalView<UnsignedIntType>(intervalView0, longArray0, longArray0);
      // Undeclared exception!
      try { 
        RealTypeConverters.copyFromTo(intervalView0, intervalView1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.view.Views", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BiConsumer<Localizable, UnsignedIntType> biConsumer0 = (BiConsumer<Localizable, UnsignedIntType>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      UnsignedIntType unsignedIntType0 = new UnsignedIntType();
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(unsignedIntType0).when(supplier0).get();
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>(0, biConsumer0, supplier0);
      long[] longArray0 = new long[8];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      // Undeclared exception!
      try { 
        RealTypeConverters.convert((RandomAccessibleInterval<? extends RealType<?>>) intervalView0, (UnsignedIntType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.converter.RealTypeConverterInternals", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BiConsumer<Localizable, UnsignedIntType> biConsumer0 = (BiConsumer<Localizable, UnsignedIntType>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>((-18), biConsumer0, supplier0);
      long[] longArray0 = new long[2];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      VolatileUnsignedIntType volatileUnsignedIntType0 = new VolatileUnsignedIntType((-18));
      // Undeclared exception!
      try { 
        RealTypeConverters.convert((RandomAccessibleInterval<? extends RealType<?>>) intervalView0, volatileUnsignedIntType0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -18
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long[] longArray0 = new long[2];
      ListImg<UnsignedIntType> listImg0 = new ListImg<UnsignedIntType>(longArray0, (UnsignedIntType) null);
      // Undeclared exception!
      try { 
        RealTypeConverters.convert((RandomAccessibleInterval<? extends RealType<?>>) listImg0, (UnsignedIntType) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BiConsumer<Localizable, UnsignedIntType> biConsumer0 = (BiConsumer<Localizable, UnsignedIntType>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>(0, biConsumer0, supplier0);
      long[] longArray0 = new long[8];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      long[] longArray1 = new long[0];
      IntervalView<UnsignedIntType> intervalView1 = new IntervalView<UnsignedIntType>(intervalView0, longArray0, longArray1);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(10);
      BitType bitType0 = new BitType(longBufferAccess0);
      // Undeclared exception!
      try { 
        RealTypeConverters.convert((RandomAccessibleInterval<? extends RealType<?>>) intervalView1, bitType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        RealTypeConverters.getConverter((UnsignedIntType) null, (UnsignedIntType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.converter.RealTypeConverterInternals", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BiConsumer<Localizable, UnsignedIntType> biConsumer0 = (BiConsumer<Localizable, UnsignedIntType>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      UnsignedIntType unsignedIntType0 = new UnsignedIntType();
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(unsignedIntType0, unsignedIntType0).when(supplier0).get();
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>(0, biConsumer0, supplier0);
      long[] longArray0 = new long[8];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      RealTypeConverters.copyFromTo(intervalView0, intervalView0);
      assertEquals(8, intervalView0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BiConsumer<Localizable, UnsignedIntType> biConsumer0 = (BiConsumer<Localizable, UnsignedIntType>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      UnsignedIntType unsignedIntType0 = new UnsignedIntType();
      Supplier<UnsignedIntType> supplier0 = (Supplier<UnsignedIntType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(unsignedIntType0).when(supplier0).get();
      FunctionRandomAccessible<UnsignedIntType> functionRandomAccessible0 = new FunctionRandomAccessible<UnsignedIntType>(0, biConsumer0, supplier0);
      long[] longArray0 = new long[8];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      IntervalView<UnsignedIntType> intervalView0 = new IntervalView<UnsignedIntType>(functionRandomAccessible0, finalInterval0);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(10);
      BitType bitType0 = new BitType(longBufferAccess0);
      RandomAccessibleInterval<BitType> randomAccessibleInterval0 = RealTypeConverters.convert((RandomAccessibleInterval<? extends RealType<?>>) intervalView0, bitType0);
      assertNotNull(randomAccessibleInterval0);
  }
}
