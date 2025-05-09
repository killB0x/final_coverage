/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:58:03 GMT 2022
 */

package jp.co.yahoo.yosegi.blockindex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import jp.co.yahoo.yosegi.blockindex.BlockIndexType;
import jp.co.yahoo.yosegi.blockindex.BooleanBlockIndex;
import jp.co.yahoo.yosegi.blockindex.IBlockIndex;
import jp.co.yahoo.yosegi.blockindex.ShortRangeBlockIndex;
import jp.co.yahoo.yosegi.blockindex.UnsupportedBlockIndex;
import jp.co.yahoo.yosegi.spread.column.filter.PerfectMatchStringFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnsupportedBlockIndex_ESTest extends UnsupportedBlockIndex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanBlockIndex booleanBlockIndex0 = new BooleanBlockIndex(false, false, false);
      // Undeclared exception!
      try { 
        booleanBlockIndex0.getBlockIndexType();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShortRangeBlockIndex shortRangeBlockIndex0 = new ShortRangeBlockIndex();
      // Undeclared exception!
      try { 
        shortRangeBlockIndex0.getBinarySize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = new UnsupportedBlockIndex();
      boolean boolean0 = unsupportedBlockIndex0.merge(unsupportedBlockIndex0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = new UnsupportedBlockIndex();
      IBlockIndex iBlockIndex0 = unsupportedBlockIndex0.getNewInstance();
      assertNotSame(unsupportedBlockIndex0, iBlockIndex0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = new UnsupportedBlockIndex();
      unsupportedBlockIndex0.setFromBinary((byte[]) null, 1292, Integer.MIN_VALUE);
      assertEquals(BlockIndexType.UNSUPPORTED, unsupportedBlockIndex0.getBlockIndexType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = (UnsupportedBlockIndex)UnsupportedBlockIndex.INSTANCE;
      byte[] byteArray0 = unsupportedBlockIndex0.toBinary();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = (UnsupportedBlockIndex)UnsupportedBlockIndex.INSTANCE;
      PerfectMatchStringFilter perfectMatchStringFilter0 = new PerfectMatchStringFilter("");
      List<Integer> list0 = unsupportedBlockIndex0.getBlockSpreadIndex(perfectMatchStringFilter0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = (UnsupportedBlockIndex)UnsupportedBlockIndex.INSTANCE;
      BlockIndexType blockIndexType0 = unsupportedBlockIndex0.getBlockIndexType();
      assertEquals(BlockIndexType.UNSUPPORTED, blockIndexType0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = new UnsupportedBlockIndex();
      IBlockIndex iBlockIndex0 = unsupportedBlockIndex0.clone();
      assertNotSame(unsupportedBlockIndex0, iBlockIndex0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UnsupportedBlockIndex unsupportedBlockIndex0 = new UnsupportedBlockIndex();
      int int0 = unsupportedBlockIndex0.getBinarySize();
      assertEquals(0, int0);
  }
}
