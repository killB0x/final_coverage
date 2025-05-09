/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:13:37 GMT 2022
 */

package jp.co.yahoo.yosegi.binary.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import jp.co.yahoo.yosegi.binary.ColumnBinaryMakerConfig;
import jp.co.yahoo.yosegi.binary.optimizer.DoubleOptimizer;
import jp.co.yahoo.yosegi.config.Configuration;
import jp.co.yahoo.yosegi.spread.analyzer.FloatColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.SpreadColumnAnalizeResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DoubleOptimizer_ESTest extends DoubleOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      DoubleOptimizer doubleOptimizer0 = new DoubleOptimizer(columnBinaryMakerConfig0.param);
      // Undeclared exception!
      try { 
        doubleOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, (IColumnAnalizeResult) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.optimizer.DoubleOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      FloatColumnAnalizeResult floatColumnAnalizeResult0 = new FloatColumnAnalizeResult("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayLongColumnBinaryMaker$1", 72, false, 72, 72, 3, 72, 72);
      DoubleOptimizer doubleOptimizer0 = new DoubleOptimizer(columnBinaryMakerConfig0.param);
      ColumnBinaryMakerConfig columnBinaryMakerConfig1 = doubleOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, floatColumnAnalizeResult0);
      assertNotSame(columnBinaryMakerConfig1, columnBinaryMakerConfig0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DoubleOptimizer doubleOptimizer0 = new DoubleOptimizer(configuration0);
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      LinkedList<IColumnAnalizeResult> linkedList0 = new LinkedList<IColumnAnalizeResult>();
      SpreadColumnAnalizeResult spreadColumnAnalizeResult0 = new SpreadColumnAnalizeResult("a-:1peE+c", 0, 0, linkedList0);
      ColumnBinaryMakerConfig columnBinaryMakerConfig1 = doubleOptimizer0.getColumnBinaryMakerConfig(columnBinaryMakerConfig0, spreadColumnAnalizeResult0);
      assertNotSame(columnBinaryMakerConfig1, columnBinaryMakerConfig0);
  }
}
