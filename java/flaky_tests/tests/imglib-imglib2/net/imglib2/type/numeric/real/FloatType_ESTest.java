/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:25:47 GMT 2022
 */

package net.imglib2.type.numeric.real;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.FloatBuffer;
import net.imglib2.img.NativeImg;
import net.imglib2.img.basictypeaccess.FloatAccess;
import net.imglib2.img.basictypeaccess.array.DirtyFloatArray;
import net.imglib2.img.basictypeaccess.nio.FloatBufferAccess;
import net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileFloatArray;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileFloatArray;
import net.imglib2.img.cell.Cell;
import net.imglib2.img.cell.CellGrid;
import net.imglib2.img.cell.LazyCellImg;
import net.imglib2.img.sparse.FloatNtree;
import net.imglib2.type.Index;
import net.imglib2.type.NativeTypeFactory;
import net.imglib2.type.PrimitiveType;
import net.imglib2.type.numeric.real.FloatType;
import net.imglib2.util.Fraction;
import net.imglib2.view.composite.RealComposite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FloatType_ESTest extends FloatType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FloatType floatType0 = new FloatType(0.5F);
      FloatType floatType1 = new FloatType();
      boolean boolean0 = floatType1.valueEquals(floatType0);
      assertFalse(floatType0.equals((Object)floatType1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.setOne();
      floatType0.sub(floatType0);
      assertEquals(0.0F, floatType0.getImaginaryFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = new FloatType((-835.7421F));
      floatType0.set(floatType1);
      floatType0.div(floatType1);
      assertEquals(0.0, floatType1.getImaginaryDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      float[] floatArray0 = new float[4];
      floatArray0[0] = (-200.0F);
      FloatBuffer floatBuffer0 = FloatBuffer.wrap(floatArray0);
      FloatBufferAccess floatBufferAccess0 = new FloatBufferAccess(floatBuffer0, false);
      FloatType floatType1 = new FloatType(floatBufferAccess0);
      floatType0.add(floatType1);
      assertTrue(floatType1.equals((Object)floatType0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.setComplexNumber(1247.3F, 0.0F);
      floatType0.mul((-1471.4));
      assertEquals(0.0F, floatType0.getImaginaryFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[3] = 1L;
      FloatNtree floatNtree0 = new FloatNtree(longArray0, longArray0, 808L);
      FloatType floatType0 = new FloatType(floatNtree0);
      floatType0.set(1.0F);
      assertEquals(0.0F, floatType0.getImaginaryFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      Index index0 = floatType0.index();
      assertEquals(0, index0.get());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FloatType floatType0 = new FloatType((-0.2020192F));
      floatType0.setZero();
      floatType0.pow(floatType0);
      float float0 = floatType0.getRealFloat();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FloatType floatType0 = new FloatType((-0.2020192F));
      floatType0.setZero();
      floatType0.pow(floatType0);
      floatType0.mul((-0.2020192F));
      float float0 = floatType0.getRealFloat();
      assertEquals((-0.2020192F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.setReal(541.0925F);
      double double0 = floatType0.getRealDouble();
      assertEquals(541.092529296875, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FloatType floatType0 = new FloatType((-1.0F));
      double double0 = floatType0.getRealDouble();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FloatType floatType0 = new FloatType((FloatAccess) null);
      NativeTypeFactory<FloatType, FloatAccess> nativeTypeFactory0 = floatType0.getNativeTypeFactory();
      assertEquals(PrimitiveType.FLOAT, nativeTypeFactory0.getPrimitiveType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      Fraction fraction0 = floatType0.getEntitiesPerPixel();
      assertEquals(1.0, fraction0.getRatio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      float float0 = floatType0.get();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FloatType floatType0 = new FloatType(0.0F);
      floatType0.setReal(1007.10266607);
      float float0 = floatType0.get();
      assertEquals(1007.10266F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DirtyFloatArray dirtyFloatArray0 = new DirtyFloatArray(2057);
      FloatType floatType0 = new FloatType(dirtyFloatArray0);
      floatType0.dec();
      float float0 = floatType0.get();
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FloatType floatType0 = new FloatType(0.0F);
      FloatType floatType1 = new FloatType();
      floatType1.inc();
      int int0 = floatType1.compareTo(floatType0);
      assertFalse(floatType1.equals((Object)floatType0));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        FloatType.wrapVector((float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      // Undeclared exception!
      try { 
        floatType0.valueEquals((FloatType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        floatType0.updateContainer(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.sub(floatType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FloatType floatType0 = new FloatType((FloatAccess) null);
      // Undeclared exception!
      try { 
        floatType0.setZero();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.setReal(1.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FloatType floatType0 = new FloatType((FloatAccess) null);
      // Undeclared exception!
      try { 
        floatType0.setReal(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.setOne();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType0.set(floatType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      DirtyVolatileFloatArray dirtyVolatileFloatArray0 = new DirtyVolatileFloatArray(0, true);
      FloatType floatType1 = new FloatType(dirtyVolatileFloatArray0);
      // Undeclared exception!
      try { 
        floatType0.set(floatType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractFloatArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FloatType floatType0 = new FloatType(3092.2712F);
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.set(3092.2712F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      // Undeclared exception!
      try { 
        floatType0.mul((FloatType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      float[] floatArray0 = new float[9];
      VolatileFloatArray volatileFloatArray0 = new VolatileFloatArray(floatArray0, false);
      FloatType floatType0 = new FloatType(volatileFloatArray0);
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.mul(1013.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FloatType floatType0 = new FloatType((-303.67047F));
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.inc();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.getRealFloat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.getRealDouble();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType0.equals((Object) floatType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FloatType floatType0 = new FloatType(0.0F);
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.dec();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      FloatType.createVector(1160703394);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType1.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FloatBuffer floatBuffer0 = FloatBuffer.allocate(0);
      FloatBufferAccess floatBufferAccess0 = new FloatBufferAccess(floatBuffer0);
      FloatType floatType0 = new FloatType(floatBufferAccess0);
      // Undeclared exception!
      try { 
        floatType0.copy();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType0.compareTo(floatType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = FloatType.equals(2863.7957F, 0.5F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = FloatType.equals(0.0F, 0.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FloatType floatType0 = new FloatType((NativeImg<?, ? extends FloatAccess>) null);
      // Undeclared exception!
      try { 
        floatType0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      boolean boolean0 = floatType0.valueEquals(floatType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      float[] floatArray0 = new float[6];
      RealComposite<FloatType> realComposite0 = FloatType.wrapVector(floatArray0);
      RealComposite<FloatType> realComposite1 = realComposite0.copy();
      assertEquals(6, realComposite1.numDimensions());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long[] longArray0 = new long[1];
      int[] intArray0 = new int[1];
      intArray0[0] = 1596;
      CellGrid cellGrid0 = new CellGrid(longArray0, intArray0);
      FloatType floatType0 = new FloatType(1596);
      LazyCellImg.Get<Cell<DirtyVolatileFloatArray>> lazyCellImg_Get0 = (LazyCellImg.Get<Cell<DirtyVolatileFloatArray>>) mock(LazyCellImg.Get.class, new ViolatedAssumptionAnswer());
      LazyCellImg<FloatType, DirtyVolatileFloatArray> lazyCellImg0 = new LazyCellImg<FloatType, DirtyVolatileFloatArray>(cellGrid0, floatType0, lazyCellImg_Get0);
      FloatType floatType1 = new FloatType(lazyCellImg0);
      float[] floatArray0 = new float[6];
      RealComposite<FloatType> realComposite0 = FloatType.wrapVector(floatArray0);
      // Undeclared exception!
      try { 
        floatType1.updateContainer(realComposite0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.imglib2.view.composite.RealComposite cannot be cast to class net.imglib2.img.cell.AbstractCellImg$CellImgSampler (net.imglib2.view.composite.RealComposite and net.imglib2.img.cell.AbstractCellImg$CellImgSampler are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @72c032b5)
         //
         verifyException("net.imglib2.img.cell.AbstractCellImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        floatType0.add(floatType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = new FloatType((-835.7421F));
      boolean boolean0 = floatType0.equals((Object) floatType1);
      assertFalse(boolean0);
      assertFalse(floatType1.equals((Object)floatType0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      double double0 = floatType0.getMinIncrement();
      assertEquals(1.401298464324817E-45, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.sub(floatType0);
      assertEquals(0.0F, floatType0.getImaginaryFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.createVariable();
      floatType1.sub(floatType0);
      assertTrue(floatType1.equals((Object)floatType0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.mul(floatType0);
      assertEquals(0.0F, floatType0.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      int int0 = floatType0.compareTo(floatType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      FloatType floatType1 = floatType0.copy();
      assertTrue(floatType1.equals((Object)floatType0));
      
      floatType1.setComplexNumber(1247.3F, 0.0F);
      boolean boolean0 = floatType1.valueEquals(floatType0);
      assertFalse(floatType1.equals((Object)floatType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      double double0 = floatType0.getRealDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      boolean boolean0 = floatType0.equals((Object) floatType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.setOne();
      floatType0.mul(floatType0);
      assertEquals(0.0F, floatType0.getImaginaryFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.dec();
      FloatType floatType1 = floatType0.createVariable();
      int int0 = floatType0.compareTo(floatType1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      double double0 = floatType0.getMinValue();
      assertEquals((-3.4028234663852886E38), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RealComposite<FloatType> realComposite0 = FloatType.createVector(1640);
      assertEquals(1640, realComposite0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FloatType floatType0 = new FloatType(3092.2712F);
      int int0 = floatType0.getBitsPerPixel();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      floatType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      double double0 = floatType0.getMaxValue();
      assertEquals(3.4028234663852886E38, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      float float0 = floatType0.getRealFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FloatType floatType0 = new FloatType((FloatAccess) null);
      // Undeclared exception!
      try { 
        floatType0.mul(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = new float[0];
      RealComposite<FloatType> realComposite0 = FloatType.wrapVector(floatArray0);
      assertEquals(0, realComposite0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FloatType floatType0 = new FloatType();
      // Undeclared exception!
      try { 
        floatType0.div((FloatType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.FloatType", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        FloatType.createVector((-378));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected only positive dimensions but got: [-378]
         //
         verifyException("net.imglib2.Dimensions", e);
      }
  }
}
