/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 21:32:45 GMT 2022
 */

package org.mountcloud.graphql.response;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mountcloud.graphql.response.DefaultGraphqlResponse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultGraphqlResponse_ESTest extends DefaultGraphqlResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultGraphqlResponse defaultGraphqlResponse0 = new DefaultGraphqlResponse();
      defaultGraphqlResponse0.putIfAbsent((Object) null, (Object) null);
      Map map0 = defaultGraphqlResponse0.getData();
      assertSame(defaultGraphqlResponse0, map0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultGraphqlResponse defaultGraphqlResponse0 = new DefaultGraphqlResponse();
      Map map0 = defaultGraphqlResponse0.getData();
      assertEquals(0, map0.size());
  }
}
