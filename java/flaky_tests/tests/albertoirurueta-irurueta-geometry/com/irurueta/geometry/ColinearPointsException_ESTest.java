/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:10:53 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.geometry.ColinearPointsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ColinearPointsException_ESTest extends ColinearPointsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable((String) null);
      ColinearPointsException colinearPointsException0 = new ColinearPointsException((String) null, mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColinearPointsException colinearPointsException0 = new ColinearPointsException((String) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColinearPointsException colinearPointsException0 = new ColinearPointsException();
      ColinearPointsException colinearPointsException1 = new ColinearPointsException(colinearPointsException0);
      assertFalse(colinearPointsException1.equals((Object)colinearPointsException0));
  }
}
