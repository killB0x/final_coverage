/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 23:55:21 GMT 2022
 */

package be.shad.tsqb.query;

import org.junit.Test;
import static org.junit.Assert.*;
import be.shad.tsqb.query.JoinType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JoinType_ESTest extends JoinType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JoinType[] joinTypeArray0 = JoinType.values();
      assertEquals(7, joinTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JoinType joinType0 = JoinType.valueOf("Fetch");
      JoinType joinType1 = joinType0.getJoinType();
      assertSame(joinType1, joinType0);
  }
}
