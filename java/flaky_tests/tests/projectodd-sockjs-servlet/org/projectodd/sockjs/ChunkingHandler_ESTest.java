/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 04:17:18 GMT 2022
 */

package org.projectodd.sockjs;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.projectodd.sockjs.ChunkingHandler;
import org.projectodd.sockjs.SockJsServer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChunkingHandler_ESTest extends ChunkingHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SockJsServer sockJsServer0 = new SockJsServer();
      ChunkingHandler chunkingHandler0 = new ChunkingHandler(sockJsServer0);
  }
}
