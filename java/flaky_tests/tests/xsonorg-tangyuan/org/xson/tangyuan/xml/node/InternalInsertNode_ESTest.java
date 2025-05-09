/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:54:05 GMT 2022
 */

package org.xson.tangyuan.xml.node;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.cache.vo.CacheCleanVo;
import org.xson.tangyuan.cache.vo.CacheVo;
import org.xson.tangyuan.executor.ServiceContext;
import org.xson.tangyuan.xml.node.DynamicTextNode;
import org.xson.tangyuan.xml.node.InternalInsertNode;
import org.xson.tangyuan.xml.node.SqlNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InternalInsertNode_ESTest extends InternalInsertNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      CacheCleanVo cacheCleanVo0 = new CacheCleanVo((CacheVo) null, "", stringArray0, "");
      InternalInsertNode internalInsertNode0 = new InternalInsertNode("", "", "", (SqlNode) null, cacheCleanVo0);
      assertFalse(internalInsertNode0.isSimple());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicTextNode dynamicTextNode0 = new DynamicTextNode("HsIGJ,");
      InternalInsertNode internalInsertNode0 = new InternalInsertNode("HsIGJ,", "HsIGJ,", "HsIGJ,", dynamicTextNode0, (CacheCleanVo) null);
      try { 
        internalInsertNode0.execute((ServiceContext) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xson.tangyuan.xml.node.InternalInsertNode", e);
      }
  }
}
