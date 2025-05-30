/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:06:51 GMT 2022
 */

package net.imglib2.type.label;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.basictypeaccess.LongAccess;
import net.imglib2.img.basictypeaccess.array.DirtyLongArray;
import net.imglib2.img.basictypeaccess.nio.LongBufferAccess;
import net.imglib2.img.cell.Cell;
import net.imglib2.img.cell.CellGrid;
import net.imglib2.img.cell.LazyCellImg;
import net.imglib2.type.NativeTypeFactory;
import net.imglib2.type.PrimitiveType;
import net.imglib2.type.label.BasePairBitType;
import net.imglib2.type.logic.BitType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasePairBitType_ESTest extends BasePairBitType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      basePairBitType0.set(basePairBitType0);
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar('^');
      assertEquals(BasePairBitType.Base.N, basePairBitType_Base0);
      
      BasePairBitType basePairBitType0 = new BasePairBitType(basePairBitType_Base0);
      basePairBitType0.compareTo(basePairBitType0);
      assertEquals('N', basePairBitType_Base0.getChar());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.G;
      BasePairBitType basePairBitType1 = new BasePairBitType(basePairBitType_Base0);
      int int0 = basePairBitType1.compareTo(basePairBitType0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.G;
      BasePairBitType basePairBitType1 = new BasePairBitType(basePairBitType_Base0);
      int int0 = basePairBitType0.compareTo(basePairBitType1);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.gap;
      BasePairBitType basePairBitType0 = new BasePairBitType(basePairBitType_Base0);
      byte byte0 = basePairBitType0.baseToValue();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        basePairBitType0.valueEquals(basePairBitType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        basePairBitType1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.C;
      // Undeclared exception!
      try { 
        basePairBitType1.set(basePairBitType_Base0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        basePairBitType1.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        basePairBitType1.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        basePairBitType1.complement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType.Base basePairBitType_Base0 = basePairBitType0.get();
      assertEquals('N', basePairBitType_Base0.getChar());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      boolean boolean0 = basePairBitType0.valueEquals(basePairBitType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.T;
      BasePairBitType basePairBitType1 = new BasePairBitType(basePairBitType_Base0);
      boolean boolean0 = basePairBitType0.valueEquals(basePairBitType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.U;
      basePairBitType0.set(basePairBitType_Base0);
      basePairBitType0.complement();
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.C;
      BasePairBitType basePairBitType0 = new BasePairBitType(basePairBitType_Base0);
      basePairBitType0.complement();
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.G;
      BasePairBitType basePairBitType0 = new BasePairBitType(basePairBitType_Base0);
      basePairBitType0.complement();
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.T;
      BasePairBitType basePairBitType0 = new BasePairBitType(basePairBitType_Base0);
      basePairBitType0.complement();
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      basePairBitType0.complement();
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.A;
      BasePairBitType basePairBitType0 = new BasePairBitType(basePairBitType_Base0);
      basePairBitType0.complement();
      assertEquals(0, basePairBitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar('U');
      assertEquals(BasePairBitType.Base.U, basePairBitType_Base0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar('T');
      assertEquals(BasePairBitType.Base.T, basePairBitType_Base0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar('G');
      assertEquals(BasePairBitType.Base.G, basePairBitType_Base0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar('A');
      assertEquals(BasePairBitType.Base.A, basePairBitType_Base0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar('C');
      assertEquals(BasePairBitType.Base.C, basePairBitType_Base0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.fromChar(' ');
      assertEquals(BasePairBitType.Base.gap, basePairBitType_Base0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasePairBitType.Base basePairBitType_Base0 = BasePairBitType.Base.U;
      char char0 = basePairBitType_Base0.getChar();
      assertEquals('U', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      NativeTypeFactory<BasePairBitType, LongAccess> nativeTypeFactory0 = basePairBitType0.getNativeTypeFactory();
      assertEquals(PrimitiveType.LONG, nativeTypeFactory0.getPrimitiveType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.copy();
      assertEquals(0, basePairBitType1.getIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      // Undeclared exception!
      try { 
        basePairBitType0.set((BasePairBitType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.label.BasePairBitType", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      String string0 = basePairBitType0.toString();
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      byte byte0 = basePairBitType0.baseToValue();
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      BasePairBitType basePairBitType1 = basePairBitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        basePairBitType1.baseToValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.AbstractBit64Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[] longArray0 = new long[8];
      int[] intArray0 = new int[8];
      intArray0[0] = 40;
      intArray0[1] = 1675;
      intArray0[2] = 32;
      intArray0[3] = (-2856);
      intArray0[4] = 10;
      intArray0[5] = (-647);
      intArray0[6] = (-1850);
      intArray0[7] = 2179;
      CellGrid cellGrid0 = new CellGrid(longArray0, intArray0);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess();
      BitType bitType0 = new BitType(longBufferAccess0);
      LazyCellImg.Get<Cell<DirtyLongArray>> lazyCellImg_Get0 = (LazyCellImg.Get<Cell<DirtyLongArray>>) mock(LazyCellImg.Get.class, new ViolatedAssumptionAnswer());
      LazyCellImg<BitType, DirtyLongArray> lazyCellImg0 = new LazyCellImg<BitType, DirtyLongArray>(cellGrid0, bitType0, lazyCellImg_Get0);
      BasePairBitType basePairBitType0 = new BasePairBitType(lazyCellImg0);
      BasePairBitType basePairBitType1 = basePairBitType0.createVariable();
      assertNotSame(basePairBitType1, basePairBitType0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasePairBitType basePairBitType0 = new BasePairBitType();
      // Undeclared exception!
      try { 
        basePairBitType0.compareTo((BasePairBitType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.label.BasePairBitType", e);
      }
  }
}
