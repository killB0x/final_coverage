/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 14:12:08 GMT 2022
 */

package ognl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import ognl.DefaultClassResolver;
import ognl.DefaultTypeConverter;
import ognl.MemberAccess;
import ognl.NoSuchPropertyException;
import ognl.OgnlContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NoSuchPropertyException_ESTest extends NoSuchPropertyException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      OgnlContext ognlContext0 = new OgnlContext(memberAccess0, defaultClassResolver0, defaultTypeConverter0, (Map<Object, Object>) null);
      Class<Object> class0 = defaultClassResolver0.classForName("ognl.NoSuchPropertyException", ognlContext0);
      Object object0 = new Object();
      NoSuchPropertyException noSuchPropertyException0 = null;
      try {
        noSuchPropertyException0 = new NoSuchPropertyException(class0, object0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      String string0 = NoSuchPropertyException.getReason(object0, object1);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NoSuchPropertyException noSuchPropertyException0 = null;
      try {
        noSuchPropertyException0 = new NoSuchPropertyException((Object) null, (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NoSuchPropertyException noSuchPropertyException0 = null;
      try {
        noSuchPropertyException0 = new NoSuchPropertyException((Object) null, (Object) null, (Throwable) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }
}
