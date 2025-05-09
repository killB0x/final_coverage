/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 16:22:26 GMT 2022
 */

package eu.kartoffelquadrat.asyncrestlib;

import org.junit.Test;
import static org.junit.Assert.*;
import eu.kartoffelquadrat.asyncrestlib.BroadcastContent;
import eu.kartoffelquadrat.asyncrestlib.IdentityTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IdentityTransformer_ESTest extends IdentityTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdentityTransformer<BroadcastContent> identityTransformer0 = new IdentityTransformer<BroadcastContent>();
      BroadcastContent broadcastContent0 = identityTransformer0.transform((BroadcastContent) null, "");
      assertNull(broadcastContent0);
  }
}
