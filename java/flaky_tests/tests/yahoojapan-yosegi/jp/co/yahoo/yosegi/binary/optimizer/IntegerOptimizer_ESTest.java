/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:14:38 GMT 2022
 */

package jp.co.yahoo.yosegi.binary.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.co.yahoo.yosegi.binary.ColumnBinaryMakerConfig;
import jp.co.yahoo.yosegi.binary.optimizer.IntegerOptimizer;
import jp.co.yahoo.yosegi.config.Configuration;
import jp.co.yahoo.yosegi.spread.analyzer.ByteColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.FloatColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.IntegerColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.LongColumnAnalizeResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IntegerOptimizer_ESTest extends IntegerOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      LongColumnAnalizeResult longColumnAnalizeResult0 = new LongColumnAnalizeResult("jp.co.yahoo.yosegi.blocfind.LongRangeBlockIndex", (-6), false, (-6), (-6), (-6), (-6), (-6), (-6), (-6));
      IntegerOptimizer integerOptimizer0 = new IntegerOptimizer(columnBinaryMakerConfig0.param);
      ColumnBinaryMakerConfig columnBinaryMakerConfig1 = integerOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, longColumnAnalizeResult0);
      assertNotSame(columnBinaryMakerConfig1, columnBinaryMakerConfig0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      IntegerOptimizer integerOptimizer0 = new IntegerOptimizer(configuration0);
      IntegerColumnAnalizeResult integerColumnAnalizeResult0 = new IntegerColumnAnalizeResult("", 0, false, (byte)0, 0, 2183, 2031, 0, (byte)0, 0);
      // Undeclared exception!
      try { 
        integerOptimizer0.getColumnBinaryMakerConfig((ColumnBinaryMakerConfig) null, integerColumnAnalizeResult0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.ColumnBinaryMakerConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LongColumnAnalizeResult longColumnAnalizeResult0 = new LongColumnAnalizeResult("x]-", 457, false, (-29), Integer.MAX_VALUE, 43, Integer.MAX_VALUE, 0L, 3, (-1269));
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      IntegerOptimizer integerOptimizer0 = new IntegerOptimizer(columnBinaryMakerConfig0.param);
      // Undeclared exception!
      try { 
        integerOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, longColumnAnalizeResult0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jp.co.yahoo.yosegi.binary.optimizer.IntegerOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      ByteColumnAnalizeResult byteColumnAnalizeResult0 = new ByteColumnAnalizeResult("Sn(x`i,?ylI7O&97_I", 453, true, (-1), (byte) (-28), 1010, (byte) (-1), (byte) (-28), (byte) (-1), 0);
      IntegerOptimizer integerOptimizer0 = new IntegerOptimizer(columnBinaryMakerConfig0.param);
      ColumnBinaryMakerConfig columnBinaryMakerConfig1 = integerOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, byteColumnAnalizeResult0);
      assertNotSame(columnBinaryMakerConfig1, columnBinaryMakerConfig0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LongColumnAnalizeResult longColumnAnalizeResult0 = new LongColumnAnalizeResult("C_", 3, false, (-29), Integer.MAX_VALUE, (short)1237, Integer.MAX_VALUE, (-29), (-29), (-29));
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      IntegerOptimizer integerOptimizer0 = new IntegerOptimizer(columnBinaryMakerConfig0.param);
      ColumnBinaryMakerConfig columnBinaryMakerConfig1 = integerOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, longColumnAnalizeResult0);
      assertNotSame(columnBinaryMakerConfig1, columnBinaryMakerConfig0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      IntegerOptimizer integerOptimizer0 = new IntegerOptimizer(columnBinaryMakerConfig0.param);
      FloatColumnAnalizeResult floatColumnAnalizeResult0 = new FloatColumnAnalizeResult("uyCe[tRdn:jD*|mgO#>", 246, false, 246, 246, 246, 246, 246);
      // Undeclared exception!
      try { 
        integerOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, floatColumnAnalizeResult0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // This method is not supported.
         //
         verifyException("jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizeResult", e);
      }
  }
}
