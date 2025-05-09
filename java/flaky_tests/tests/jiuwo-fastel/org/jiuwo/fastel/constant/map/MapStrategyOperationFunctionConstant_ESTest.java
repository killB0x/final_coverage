/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:07:28 GMT 2022
 */

package org.jiuwo.fastel.constant.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiuwo.fastel.constant.map.MapStrategyOperationFunctionConstant;
import org.jiuwo.fastel.contract.enums.ExpressionEnum;
import org.jiuwo.fastel.util.function.OperationStrategyFunction;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MapStrategyOperationFunctionConstant_ESTest extends MapStrategyOperationFunctionConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Map<ExpressionEnum.Token, Function<OperationStrategyFunction, Object>> map0 = MapStrategyOperationFunctionConstant.getInstance();
      Map<ExpressionEnum.Token, Function<OperationStrategyFunction, Object>> map1 = MapStrategyOperationFunctionConstant.getInstance();
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MapStrategyOperationFunctionConstant mapStrategyOperationFunctionConstant0 = new MapStrategyOperationFunctionConstant();
  }
}
