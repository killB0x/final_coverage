/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:43:22 GMT 2022
 */

package com.noenv.wiremongo.command.index;

import org.junit.Test;
import static org.junit.Assert.*;
import com.noenv.wiremongo.command.index.DropIndexCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DropIndexCommand_ESTest extends DropIndexCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DropIndexCommand dropIndexCommand0 = new DropIndexCommand("F.n*Wt", "F.n*Wt");
      String string0 = dropIndexCommand0.getName();
      assertEquals("F.n*Wt", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DropIndexCommand dropIndexCommand0 = new DropIndexCommand("", "");
      String string0 = dropIndexCommand0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DropIndexCommand dropIndexCommand0 = new DropIndexCommand("dropIndex", (String) null);
      String string0 = dropIndexCommand0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DropIndexCommand dropIndexCommand0 = new DropIndexCommand("dropIndex", (String) null);
      String string0 = dropIndexCommand0.toString();
      assertEquals("method: dropIndex, collection: dropIndex, name: null", string0);
  }
}
