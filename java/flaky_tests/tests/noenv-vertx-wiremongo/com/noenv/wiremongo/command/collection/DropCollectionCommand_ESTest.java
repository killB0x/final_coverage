/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:44:48 GMT 2022
 */

package com.noenv.wiremongo.command.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import com.noenv.wiremongo.command.collection.DropCollectionCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DropCollectionCommand_ESTest extends DropCollectionCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DropCollectionCommand dropCollectionCommand0 = new DropCollectionCommand("2?Le(){76O");
      assertEquals("2?Le(){76O", dropCollectionCommand0.getCollection());
  }
}
