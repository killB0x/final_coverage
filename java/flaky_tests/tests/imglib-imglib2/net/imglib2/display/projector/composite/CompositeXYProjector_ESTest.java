/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 11:46:48 GMT 2022
 */

package net.imglib2.display.projector.composite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.imglib2.Interval;
import net.imglib2.IterableInterval;
import net.imglib2.Localizable;
import net.imglib2.PointSample;
import net.imglib2.RandomAccess;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.converter.ComplexPowerGLogFloatConverter;
import net.imglib2.converter.Converter;
import net.imglib2.display.projector.composite.CompositeXYProjector;
import net.imglib2.img.basictypeaccess.array.IntArray;
import net.imglib2.img.list.ListImg;
import net.imglib2.position.FunctionRandomAccessible;
import net.imglib2.transform.integer.TranslationTransform;
import net.imglib2.type.logic.BoolType;
import net.imglib2.type.numeric.ARGBType;
import net.imglib2.type.numeric.integer.ShortType;
import net.imglib2.type.numeric.integer.Unsigned128BitType;
import net.imglib2.view.IntervalView;
import net.imglib2.view.IterableRandomAccessibleInterval;
import net.imglib2.view.MixedTransformView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CompositeXYProjector_ESTest extends CompositeXYProjector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<RandomAccessibleInterval<ShortType>> linkedList0 = new LinkedList<RandomAccessibleInterval<ShortType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(linkedList0);
      long[] longArray0 = new long[4];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList0 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList0.add(converter0);
      Converter<Object, ARGBType> converter1 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList0.add(converter1);
      CompositeXYProjector<Object> compositeXYProjector0 = null;
      try {
        compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, (IterableInterval<ARGBType>) null, arrayList0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected 1 converters but got 2
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BiConsumer<Localizable, Object> biConsumer0 = (BiConsumer<Localizable, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Supplier<ComplexPowerGLogFloatConverter<Unsigned128BitType>> supplier0 = (Supplier<ComplexPowerGLogFloatConverter<Unsigned128BitType>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      FunctionRandomAccessible<ComplexPowerGLogFloatConverter<Unsigned128BitType>> functionRandomAccessible0 = new FunctionRandomAccessible<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(9, biConsumer0, supplier0);
      long[] longArray0 = new long[4];
      IntervalView<ComplexPowerGLogFloatConverter<Unsigned128BitType>> intervalView0 = new IntervalView<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(functionRandomAccessible0, longArray0, longArray0);
      IterableRandomAccessibleInterval<ComplexPowerGLogFloatConverter<Unsigned128BitType>> iterableRandomAccessibleInterval0 = IterableRandomAccessibleInterval.create((RandomAccessibleInterval<ComplexPowerGLogFloatConverter<Unsigned128BitType>>) intervalView0);
      ArrayList<Converter<ComplexPowerGLogFloatConverter<Unsigned128BitType>, ARGBType>> arrayList0 = new ArrayList<Converter<ComplexPowerGLogFloatConverter<Unsigned128BitType>, ARGBType>>();
      CompositeXYProjector<ComplexPowerGLogFloatConverter<Unsigned128BitType>> compositeXYProjector0 = null;
      try {
        compositeXYProjector0 = new CompositeXYProjector<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(iterableRandomAccessibleInterval0, (IterableInterval<ARGBType>) null, arrayList0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected 1 converters but got 0
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IterableRandomAccessibleInterval<Object> iterableRandomAccessibleInterval0 = new IterableRandomAccessibleInterval<Object>(listImg0);
      ARGBType aRGBType0 = new ARGBType();
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray0, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(iterableRandomAccessibleInterval0, listImg1, arrayList1, (-2049));
      TranslationTransform translationTransform0 = new TranslationTransform(longArray0);
      MixedTransformView<Object> mixedTransformView0 = new MixedTransformView<Object>(iterableRandomAccessibleInterval0, translationTransform0);
      RandomAccess<Object> randomAccess0 = mixedTransformView0.randomAccess((Interval) iterableRandomAccessibleInterval0);
      Converter<Object, ARGBType> converter1 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      compositeXYProjector0.mapSingle(randomAccess0, converter1);
      assertTrue(compositeXYProjector0.isComposite());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IntArray intArray0 = new IntArray((int[]) null);
      ARGBType aRGBType0 = new ARGBType(intArray0);
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray0, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, listImg1, arrayList1, (-1));
      int int0 = compositeXYProjector0.updateCurrentArrays();
      assertEquals(1, int0);
      assertTrue(compositeXYProjector0.isComposite());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      Iterator<Object> iterator0 = treeSet0.iterator();
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, (IterableInterval<ARGBType>) null, arrayList1, (-1));
      PointSample<Object> pointSample0 = PointSample.wrap((Object) iterator0, longArray0);
      Converter<Object, ARGBType> converter1 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        compositeXYProjector0.mapSingle(pointSample0, converter1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      arrayList1.add((Converter<Object, ARGBType>) null);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, (IterableInterval<ARGBType>) null, arrayList1, (-6));
      // Undeclared exception!
      try { 
        compositeXYProjector0.map();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[6];
      ComplexPowerGLogFloatConverter<Unsigned128BitType> complexPowerGLogFloatConverter0 = new ComplexPowerGLogFloatConverter<Unsigned128BitType>();
      ListImg<ComplexPowerGLogFloatConverter<Unsigned128BitType>> listImg0 = new ListImg<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(longArray0, complexPowerGLogFloatConverter0);
      CompositeXYProjector<ComplexPowerGLogFloatConverter<Unsigned128BitType>> compositeXYProjector0 = null;
      try {
        compositeXYProjector0 = new CompositeXYProjector<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(listImg0, (IterableInterval<ARGBType>) null, (ArrayList<Converter<ComplexPowerGLogFloatConverter<Unsigned128BitType>, ARGBType>>) null, (-1039));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[11];
      ComplexPowerGLogFloatConverter<Unsigned128BitType> complexPowerGLogFloatConverter0 = new ComplexPowerGLogFloatConverter<Unsigned128BitType>();
      ListImg<ComplexPowerGLogFloatConverter<Unsigned128BitType>> listImg0 = new ListImg<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(longArray0, complexPowerGLogFloatConverter0);
      ArrayList<Converter<ComplexPowerGLogFloatConverter<Unsigned128BitType>, ARGBType>> arrayList0 = new ArrayList<Converter<ComplexPowerGLogFloatConverter<Unsigned128BitType>, ARGBType>>();
      CompositeXYProjector<ComplexPowerGLogFloatConverter<Unsigned128BitType>> compositeXYProjector0 = null;
      try {
        compositeXYProjector0 = new CompositeXYProjector<ComplexPowerGLogFloatConverter<Unsigned128BitType>>(listImg0, (IterableInterval<ARGBType>) null, arrayList0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IterableRandomAccessibleInterval<Object> iterableRandomAccessibleInterval0 = new IterableRandomAccessibleInterval<Object>(listImg0);
      IntArray intArray0 = new IntArray((int[]) null);
      ARGBType aRGBType0 = new ARGBType(intArray0);
      long[] longArray1 = new long[2];
      longArray1[0] = (long) (-1);
      longArray1[1] = (long) (-1);
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray1, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(iterableRandomAccessibleInterval0, listImg1, arrayList1, (-1));
      // Undeclared exception!
      try { 
        compositeXYProjector0.map();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IterableRandomAccessibleInterval<Object> iterableRandomAccessibleInterval0 = new IterableRandomAccessibleInterval<Object>(listImg0);
      ARGBType aRGBType0 = new ARGBType();
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray0, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(iterableRandomAccessibleInterval0, listImg1, arrayList1, (-2049));
      compositeXYProjector0.setComposite(false);
      // Undeclared exception!
      try { 
        compositeXYProjector0.updateCurrentArrays();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2049 out of bounds for length 11
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IterableRandomAccessibleInterval<Object> iterableRandomAccessibleInterval0 = new IterableRandomAccessibleInterval<Object>(listImg0);
      IntArray intArray0 = new IntArray((int[]) null);
      ARGBType aRGBType0 = new ARGBType(intArray0);
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray0, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(iterableRandomAccessibleInterval0, listImg1, arrayList1, 514);
      // Undeclared exception!
      try { 
        compositeXYProjector0.map();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 514 out of bounds for length 11
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IntArray intArray0 = new IntArray((int[]) null);
      ARGBType aRGBType0 = new ARGBType(intArray0);
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray0, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, listImg1, arrayList1, (-1));
      compositeXYProjector0.map();
      assertTrue(compositeXYProjector0.isComposite());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long[] longArray0 = new long[8];
      Stack<Object> stack0 = new Stack<Object>();
      ListImg<Object> listImg0 = new ListImg<Object>(stack0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList0 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList0.add(converter0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, (IterableInterval<ARGBType>) null, arrayList0, 670);
      boolean boolean0 = compositeXYProjector0.isComposite();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<Converter<ShortType, ARGBType>> arrayList0 = new ArrayList<Converter<ShortType, ARGBType>>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      long[] longArray0 = new long[11];
      ListImg<Object> listImg0 = new ListImg<Object>(treeSet0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList1 = new ArrayList<Converter<Object, ARGBType>>();
      Converter<Object, ARGBType> converter0 = (Converter<Object, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList1.add(converter0);
      IterableRandomAccessibleInterval<Object> iterableRandomAccessibleInterval0 = new IterableRandomAccessibleInterval<Object>(listImg0);
      ARGBType aRGBType0 = new ARGBType();
      ListImg<ARGBType> listImg1 = new ListImg<ARGBType>(longArray0, aRGBType0);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(iterableRandomAccessibleInterval0, listImg1, arrayList1, (-2049));
      assertTrue(compositeXYProjector0.isComposite());
      
      compositeXYProjector0.setComposite(false);
      boolean boolean0 = compositeXYProjector0.isComposite();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      long[] longArray0 = new long[1];
      ListImg<Object> listImg0 = new ListImg<Object>(stack0, longArray0);
      ArrayList<Converter<Object, ARGBType>> arrayList0 = new ArrayList<Converter<Object, ARGBType>>();
      arrayList0.add((Converter<Object, ARGBType>) null);
      CompositeXYProjector<Object> compositeXYProjector0 = new CompositeXYProjector<Object>(listImg0, (IterableInterval<ARGBType>) null, arrayList0, 1081);
      // Undeclared exception!
      try { 
        compositeXYProjector0.setComposite((-3359), true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -3359 out of bounds for length 1
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long[] longArray0 = new long[4];
      ComplexPowerGLogFloatConverter<BoolType> complexPowerGLogFloatConverter0 = new ComplexPowerGLogFloatConverter<BoolType>();
      ListImg<ComplexPowerGLogFloatConverter<BoolType>> listImg0 = new ListImg<ComplexPowerGLogFloatConverter<BoolType>>(longArray0, complexPowerGLogFloatConverter0);
      ArrayList<Converter<ComplexPowerGLogFloatConverter<BoolType>, ARGBType>> arrayList0 = new ArrayList<Converter<ComplexPowerGLogFloatConverter<BoolType>, ARGBType>>();
      Converter<ComplexPowerGLogFloatConverter<BoolType>, ARGBType> converter0 = (Converter<ComplexPowerGLogFloatConverter<BoolType>, ARGBType>) mock(Converter.class, new ViolatedAssumptionAnswer());
      arrayList0.add(converter0);
      CompositeXYProjector<ComplexPowerGLogFloatConverter<BoolType>> compositeXYProjector0 = new CompositeXYProjector<ComplexPowerGLogFloatConverter<BoolType>>(listImg0, (IterableInterval<ARGBType>) null, arrayList0, 9);
      // Undeclared exception!
      try { 
        compositeXYProjector0.isComposite(9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 9 out of bounds for length 1
         //
         verifyException("net.imglib2.display.projector.composite.CompositeXYProjector", e);
      }
  }
}
