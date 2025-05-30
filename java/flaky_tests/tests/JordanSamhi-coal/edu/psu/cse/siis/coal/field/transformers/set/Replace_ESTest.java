/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 14:42:48 GMT 2022
 */

package edu.psu.cse.siis.coal.field.transformers.set;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.psu.cse.siis.coal.field.transformers.set.Replace;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Replace_ESTest extends Replace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Replace replace0 = new Replace((Object) null);
      Set<Object> set0 = replace0.add;
      replace0.remove = set0;
      Replace replace1 = new Replace(replace0.remove);
      assertFalse(replace1.equals((Object)replace0));
  }
}
