/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 13:54:36 GMT 2022
 */

package ognl.security;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.AllPermission;
import java.security.Permission;
import ognl.security.OgnlSecurityManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OgnlSecurityManager_ESTest extends OgnlSecurityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OgnlSecurityManager ognlSecurityManager0 = new OgnlSecurityManager((SecurityManager) null);
      ognlSecurityManager0.checkPermission((Permission) null, (Object) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecurityManager securityManager0 = new SecurityManager();
      OgnlSecurityManager ognlSecurityManager0 = new OgnlSecurityManager(securityManager0);
      // Undeclared exception!
      try { 
        ognlSecurityManager0.checkPermission((Permission) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // permission can't be null
         //
         verifyException("java.security.AccessController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OgnlSecurityManager ognlSecurityManager0 = new OgnlSecurityManager((SecurityManager) null);
      try { 
        ognlSecurityManager0.leave((-824L));
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ognl.security.OgnlSecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecurityManager securityManager0 = new SecurityManager();
      OgnlSecurityManager ognlSecurityManager0 = new OgnlSecurityManager(securityManager0);
      Object object0 = ognlSecurityManager0.getSecurityContext();
      // Undeclared exception!
      try { 
        ognlSecurityManager0.checkPermission((Permission) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // permission can't be null
         //
         verifyException("java.security.AccessControlContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OgnlSecurityManager ognlSecurityManager0 = new OgnlSecurityManager((SecurityManager) null);
      AllPermission allPermission0 = new AllPermission("JG,N", "JG,N");
      ognlSecurityManager0.checkPermission((Permission) allPermission0);
      assertEquals("(\"java.security.AllPermission\" \"<all permissions>\" \"<all actions>\")", allPermission0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SecurityManager securityManager0 = new SecurityManager();
      OgnlSecurityManager ognlSecurityManager0 = new OgnlSecurityManager(securityManager0);
      Long long0 = ognlSecurityManager0.enter();
      assertNull(long0);
  }
}
