/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:27:35 GMT 2022
 */

package org.xson.tangyuan.sharding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.ognl.vars.VariableVo;
import org.xson.tangyuan.sharding.RandomShardingHandler;
import org.xson.tangyuan.sharding.ShardingArgVo;
import org.xson.tangyuan.sharding.ShardingDefVo;
import org.xson.tangyuan.sharding.ShardingResult;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RandomShardingHandler_ESTest extends RandomShardingHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomShardingHandler randomShardingHandler0 = new RandomShardingHandler();
      ShardingDefVo.ShardingMode shardingDefVo_ShardingMode0 = ShardingDefVo.ShardingMode.RANDOM;
      VariableVo[] variableVoArray0 = new VariableVo[9];
      ShardingDefVo shardingDefVo0 = new ShardingDefVo(".+VtAy`t0", ".+VtAy`t0", shardingDefVo_ShardingMode0, (-973), (-973), (-808), variableVoArray0, true, randomShardingHandler0, (-973), true, true, ".+VtAy`t0");
      ShardingArgVo.ShardingTemplate shardingArgVo_ShardingTemplate0 = ShardingArgVo.ShardingTemplate.DI;
      ShardingArgVo shardingArgVo0 = new ShardingArgVo((String) null, shardingArgVo_ShardingTemplate0, variableVoArray0, shardingDefVo0);
      ShardingResult shardingResult0 = randomShardingHandler0.selectDataSourceAndTable(shardingDefVo0, shardingArgVo0, shardingArgVo0);
      assertEquals(".+VtAy`t0.-97", shardingResult0.getDataSource());
      assertEquals("94381", shardingResult0.getTable());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomShardingHandler randomShardingHandler0 = new RandomShardingHandler();
      ShardingDefVo.ShardingMode shardingDefVo_ShardingMode0 = ShardingDefVo.ShardingMode.RANDOM;
      VariableVo[] variableVoArray0 = new VariableVo[4];
      ShardingDefVo shardingDefVo0 = new ShardingDefVo("", "", shardingDefVo_ShardingMode0, 992, 992, 992, variableVoArray0, false, randomShardingHandler0, 992, false, false, "GU^v,P#~e>8) TvA]");
      ShardingArgVo.ShardingTemplate shardingArgVo_ShardingTemplate0 = ShardingArgVo.ShardingTemplate.D;
      ShardingArgVo shardingArgVo0 = new ShardingArgVo((String) null, shardingArgVo_ShardingTemplate0, variableVoArray0, shardingDefVo0);
      ShardingResult shardingResult0 = randomShardingHandler0.selectDataSourceAndTable(shardingDefVo0, shardingArgVo0, shardingDefVo_ShardingMode0);
      assertEquals("", shardingResult0.getTable());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomShardingHandler randomShardingHandler0 = new RandomShardingHandler();
      ShardingDefVo.ShardingMode shardingDefVo_ShardingMode0 = ShardingDefVo.ShardingMode.RANDOM;
      VariableVo[] variableVoArray0 = new VariableVo[0];
      ShardingDefVo shardingDefVo0 = new ShardingDefVo("org.xson.tangyuan.sharding.RandomShardingHandler", "org.xson.tangyuan.sharding.RandomShardingHandler", shardingDefVo_ShardingMode0, 0, 0, 0, variableVoArray0, true, randomShardingHandler0, 0, true, true, "org.xson.tangyuan.sharding.RandomShardingHandler");
      // Undeclared exception!
      try { 
        randomShardingHandler0.selectDataSourceAndTable(shardingDefVo0, (ShardingArgVo) null, "org.xson.tangyuan.sharding.RandomShardingHandler");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.sharding.AbstractShardingHandler", e);
      }
  }
}
