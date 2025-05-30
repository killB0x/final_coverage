/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 14:33:48 GMT 2022
 */

package ognl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;
import ognl.DefaultClassResolver;
import ognl.DefaultTypeConverter;
import ognl.MemberAccess;
import ognl.OgnlContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultTypeConverter_ESTest extends DefaultTypeConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      OgnlContext ognlContext0 = new OgnlContext(defaultClassResolver0, defaultTypeConverter0, memberAccess0);
      Class<Object> class0 = Object.class;
      Object object0 = defaultTypeConverter0.convertValue(ognlContext0, (Object) defaultClassResolver0, (Member) null, "_lastEvaluation", (Object) null, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      OgnlContext ognlContext0 = new OgnlContext(defaultClassResolver0, defaultTypeConverter0, memberAccess0);
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      Object object1 = defaultTypeConverter0.convertValue(ognlContext0, object0, class0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      OgnlContext ognlContext0 = new OgnlContext(memberAccess0, defaultClassResolver0, defaultTypeConverter0, (Map<Object, Object>) null);
      Object object0 = ognlContext0.put((Object) null, ognlContext0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        defaultTypeConverter0.convertValue(ognlContext0, object0, (Member) null, "ognl.DefaultTypeConverter", (Object) ognlContext0, (Class<?>) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ognl.OgnlContext@0000000003\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      Object object0 = new Object();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        defaultTypeConverter0.convertValue((OgnlContext) null, object0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang.Object@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      OgnlContext ognlContext0 = new OgnlContext(defaultClassResolver0, defaultTypeConverter0, memberAccess0);
      Object object0 = new Object();
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        defaultTypeConverter0.convertValue(ognlContext0, object0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to convert type java.lang.Object of java.lang.Object@25839d62 to type of java.lang.annotation.Annotation
         //
         verifyException("ognl.OgnlOps", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      OgnlContext ognlContext0 = new OgnlContext(defaultClassResolver0, defaultTypeConverter0, memberAccess0);
      Class<Object> class0 = Object.class;
      Object object0 = defaultTypeConverter0.convertValue(ognlContext0, (Object) null, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultTypeConverter defaultTypeConverter0 = new DefaultTypeConverter();
      MemberAccess memberAccess0 = mock(MemberAccess.class, new ViolatedAssumptionAnswer());
      DefaultClassResolver defaultClassResolver0 = new DefaultClassResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      OgnlContext ognlContext0 = new OgnlContext(memberAccess0, defaultClassResolver0, defaultTypeConverter0, hashMap0);
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Object object1 = defaultTypeConverter0.convertValue(ognlContext0, object0, (Member) null, "_lastEvaluation", object0, class0);
      assertSame(object0, object1);
  }
}
