/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:28:19 GMT 2022
 */

package jp.co.yahoo.yosegi.blockindex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.List;
import jp.co.yahoo.yosegi.blockindex.BooleanBlockIndex;
import jp.co.yahoo.yosegi.blockindex.LongRangeBlockIndex;
import jp.co.yahoo.yosegi.message.objects.BooleanObj;
import jp.co.yahoo.yosegi.message.objects.ByteObj;
import jp.co.yahoo.yosegi.message.objects.DoubleObj;
import jp.co.yahoo.yosegi.message.objects.FloatObj;
import jp.co.yahoo.yosegi.message.objects.IntegerObj;
import jp.co.yahoo.yosegi.message.objects.LongObj;
import jp.co.yahoo.yosegi.message.objects.NullObj;
import jp.co.yahoo.yosegi.message.objects.PrimitiveObject;
import jp.co.yahoo.yosegi.message.objects.StringObj;
import jp.co.yahoo.yosegi.message.objects.Utf8BytesLinkObj;
import jp.co.yahoo.yosegi.spread.column.filter.IFilter;
import jp.co.yahoo.yosegi.spread.column.filter.NumberFilter;
import jp.co.yahoo.yosegi.spread.column.filter.NumberFilterType;
import jp.co.yahoo.yosegi.spread.column.filter.NumberRangeFilter;
import jp.co.yahoo.yosegi.spread.column.filter.RangeStringCompareFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LongRangeBlockIndex_ESTest extends LongRangeBlockIndex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LongObj longObj0 = new LongObj(2920L);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2920L, 9223372036854775807L);
      NumberFilterType numberFilterType0 = NumberFilterType.GE;
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, longObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(2920L, longRangeBlockIndex0.getMin());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LongObj longObj0 = new LongObj(2920L);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2920L, 2920L);
      NumberFilterType numberFilterType0 = NumberFilterType.GT;
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, longObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(2920L, longRangeBlockIndex0.getMin());
      assertNotNull(list0);
      assertEquals(2920L, longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LongObj longObj0 = new LongObj(2920L);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2920L, 9223372036854775807L);
      NumberFilterType numberFilterType0 = NumberFilterType.LE;
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, longObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(2920L, longRangeBlockIndex0.getMin());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberFilterType numberFilterType0 = NumberFilterType.LT;
      LongObj longObj0 = new LongObj(769L);
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, longObj0);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(769L, (-2580L));
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals((-2580L), longRangeBlockIndex0.getMax());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LongObj longObj0 = new LongObj(2920L);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2920L, 3331L);
      NumberFilterType numberFilterType0 = NumberFilterType.EQUAL;
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, longObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(2920L, longRangeBlockIndex0.getMin());
      assertNull(list0);
      assertEquals(3331L, longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2147483647L, (-3124L));
      LongRangeBlockIndex longRangeBlockIndex1 = (LongRangeBlockIndex)longRangeBlockIndex0.getNewInstance();
      boolean boolean0 = longRangeBlockIndex0.merge(longRangeBlockIndex1);
      assertTrue(boolean0);
      assertEquals(9223372036854775807L, longRangeBlockIndex1.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex1.getMax());
      assertEquals((-3124L), longRangeBlockIndex0.getMax());
      assertEquals(2147483647L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2147483647L, (-3124L));
      byte[] byteArray0 = longRangeBlockIndex0.toBinary();
      longRangeBlockIndex0.setFromBinary(byteArray0, (-745), 0);
      assertEquals(16, longRangeBlockIndex0.getBinarySize());
      assertEquals(2147483647L, longRangeBlockIndex0.getMin());
      assertEquals((-3124L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      StringObj stringObj0 = new StringObj();
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(false, stringObj0, false, stringObj0, false);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.GE;
      PrimitiveObject primitiveObject0 = NullObj.getInstance();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, primitiveObject0);
      longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(0L, 0L);
      long long0 = longRangeBlockIndex0.getMin();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-4322L), 9223372036854775807L);
      long long0 = longRangeBlockIndex0.getMin();
      assertEquals((-4322L), long0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(0L, 0L);
      long long0 = longRangeBlockIndex0.getMax();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(1422L, 1422L);
      long long0 = longRangeBlockIndex0.getMax();
      assertEquals(1422L, longRangeBlockIndex0.getMin());
      assertEquals(1422L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        longRangeBlockIndex0.setFromBinary(byteArray0, (-2116805309), (-2116805309));
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.LE;
      byte[] byteArray0 = new byte[0];
      Utf8BytesLinkObj utf8BytesLinkObj0 = new Utf8BytesLinkObj(byteArray0, 2147483645, 2147483645);
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, utf8BytesLinkObj0);
      // Undeclared exception!
      try { 
        longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      // Undeclared exception!
      try { 
        longRangeBlockIndex0.getBlockSpreadIndex((IFilter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.blockindex.LongRangeBlockIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2147483647L, (-3124L));
      long long0 = longRangeBlockIndex0.getMin();
      assertEquals(2147483647L, long0);
      assertEquals((-3124L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(2147483647L, (-3124L));
      long long0 = longRangeBlockIndex0.getMax();
      assertEquals((-3124L), long0);
      assertEquals(2147483647L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-4322L), 9223372036854775807L);
      int int0 = longRangeBlockIndex0.getBinarySize();
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
      assertEquals((-4322L), longRangeBlockIndex0.getMin());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-1296L), (-1296L));
      IntegerObj integerObj0 = new IntegerObj(2146902304);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(false, integerObj0, false, integerObj0, false);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals((-1296L), longRangeBlockIndex0.getMin());
      assertEquals((-1296L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      BooleanObj booleanObj0 = new BooleanObj(false);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(false, booleanObj0, false, booleanObj0, false);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      LongObj longObj0 = new LongObj(9223372036854775807L);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(longObj0, false, longObj0, true);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      BooleanObj booleanObj0 = new BooleanObj(false);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(false, booleanObj0, false, booleanObj0, true);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-128L), 784L);
      BooleanObj booleanObj0 = new BooleanObj(false);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(booleanObj0, false, booleanObj0, true);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertNull(list0);
      assertEquals(784L, longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-2147483648L), 1954L);
      IntegerObj integerObj0 = new IntegerObj((-1060));
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(false, integerObj0, true, integerObj0, false);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertNull(list0);
      assertEquals(1954L, longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      ByteObj byteObj0 = new ByteObj();
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(byteObj0, true, byteObj0, false);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      LongObj longObj0 = new LongObj(9223372036854775797L);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(longObj0, true, longObj0, true);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      BooleanObj booleanObj0 = new BooleanObj(true);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(booleanObj0, true, booleanObj0, true);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-128L), (-128L));
      IntegerObj integerObj0 = new IntegerObj(2);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(integerObj0, true, integerObj0, false);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals((-128L), longRangeBlockIndex0.getMin());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(9223372036854775807L, 9223372036854775807L);
      DoubleObj doubleObj0 = new DoubleObj(9223372036854775807L);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(doubleObj0, true, doubleObj0, true);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      BooleanObj booleanObj0 = new BooleanObj(true);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(true, booleanObj0, true, booleanObj0, true);
      longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.GE;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertNotNull(list0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LongObj longObj0 = new LongObj(2920L);
      NumberFilterType numberFilterType0 = NumberFilterType.GT;
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, longObj0);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(32767L, 9223372036854775807L);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertNull(list0);
      assertEquals(32767L, longRangeBlockIndex0.getMin());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.LE;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.LT;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertNotNull(list0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-847L), (-847L));
      NumberFilterType numberFilterType0 = NumberFilterType.EQUAL;
      FloatObj floatObj0 = new FloatObj((-847L));
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, floatObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals((-847L), longRangeBlockIndex0.getMax());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.EQUAL;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.NOT_EQUAL;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-847L), (-847L));
      NumberFilterType numberFilterType0 = NumberFilterType.GE;
      FloatObj floatObj0 = new FloatObj((-847L));
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, floatObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertNull(list0);
      assertEquals((-847L), longRangeBlockIndex0.getMax());
      assertEquals((-847L), longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      NumberFilterType numberFilterType0 = NumberFilterType.GT;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-547L), 9223372036854775807L);
      NumberFilterType numberFilterType0 = NumberFilterType.LT;
      BooleanObj booleanObj0 = new BooleanObj(true);
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, booleanObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-1062L), (-1062L));
      NumberFilterType numberFilterType0 = NumberFilterType.EQUAL;
      BooleanObj booleanObj0 = new BooleanObj(true);
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, booleanObj0);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertEquals((-1062L), longRangeBlockIndex0.getMin());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-4322L), 9223372036854775807L);
      RangeStringCompareFilter rangeStringCompareFilter0 = new RangeStringCompareFilter(",`!B&gHr(jnF", false, "jp.co.yahoo.yosegi.blockindex.LongRangeBlockIndex min=-4322 max=9223372036854775807", false);
      longRangeBlockIndex0.getBlockSpreadIndex(rangeStringCompareFilter0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
      assertEquals((-4322L), longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-1L), 1757L);
      BooleanObj booleanObj0 = new BooleanObj(false);
      NumberRangeFilter numberRangeFilter0 = new NumberRangeFilter(booleanObj0, false, booleanObj0, false);
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberRangeFilter0);
      assertNull(list0);
      assertEquals((-1L), longRangeBlockIndex0.getMin());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NumberFilterType numberFilterType0 = NumberFilterType.LE;
      ByteObj byteObj0 = new ByteObj();
      NumberFilter numberFilter0 = new NumberFilter(numberFilterType0, byteObj0);
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-4171L), (-4171L));
      List<Integer> list0 = longRangeBlockIndex0.getBlockSpreadIndex(numberFilter0);
      assertNull(list0);
      assertEquals((-4171L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      LongRangeBlockIndex longRangeBlockIndex1 = new LongRangeBlockIndex(2085L, 2085L);
      boolean boolean0 = longRangeBlockIndex0.merge(longRangeBlockIndex1);
      assertEquals(2085L, longRangeBlockIndex0.getMax());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      BooleanBlockIndex booleanBlockIndex0 = new BooleanBlockIndex();
      boolean boolean0 = longRangeBlockIndex0.merge(booleanBlockIndex0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      // Undeclared exception!
      try { 
        longRangeBlockIndex0.setFromBinary((byte[]) null, 1030, 1030);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      LongRangeBlockIndex longRangeBlockIndex1 = (LongRangeBlockIndex)longRangeBlockIndex0.clone();
      assertEquals(9223372036854775807L, longRangeBlockIndex1.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex1.getMax());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex();
      boolean boolean0 = longRangeBlockIndex0.merge(longRangeBlockIndex0);
      assertTrue(boolean0);
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals((-9223372036854775808L), longRangeBlockIndex0.getMax());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex((-4322L), 9223372036854775807L);
      String string0 = longRangeBlockIndex0.toString();
      assertEquals("jp.co.yahoo.yosegi.blockindex.LongRangeBlockIndex min=-4322 max=9223372036854775807", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LongRangeBlockIndex longRangeBlockIndex0 = new LongRangeBlockIndex(9223372036854775807L, 9223372036854775807L);
      longRangeBlockIndex0.getBlockIndexType();
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMin());
      assertEquals(9223372036854775807L, longRangeBlockIndex0.getMax());
  }
}
