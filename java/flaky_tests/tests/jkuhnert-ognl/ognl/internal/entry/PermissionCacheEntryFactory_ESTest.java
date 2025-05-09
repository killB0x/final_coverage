/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 14:15:52 GMT 2022
 */

package ognl.internal.entry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ognl.internal.entry.PermissionCacheEntry;
import ognl.internal.entry.PermissionCacheEntryFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PermissionCacheEntryFactory_ESTest extends PermissionCacheEntryFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PermissionCacheEntryFactory permissionCacheEntryFactory0 = new PermissionCacheEntryFactory();
      // Undeclared exception!
      try { 
        permissionCacheEntryFactory0.create((PermissionCacheEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ognl.internal.entry.PermissionCacheEntryFactory", e);
      }
  }
}
