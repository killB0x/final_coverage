/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 23:56:04 GMT 2022
 */

package be.shad.tsqb.restrictions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import be.shad.tsqb.data.TypeSafeQueryProxyData;
import be.shad.tsqb.query.JoinType;
import be.shad.tsqb.query.TypeSafeQuery;
import be.shad.tsqb.query.TypeSafeQueryInternal;
import be.shad.tsqb.query.TypeSafeSubQuery;
import be.shad.tsqb.restrictions.ContinuedRestrictionChainable;
import be.shad.tsqb.restrictions.OnGoingBooleanRestriction;
import be.shad.tsqb.restrictions.OnGoingDateRestriction;
import be.shad.tsqb.restrictions.OnGoingEnumRestriction;
import be.shad.tsqb.restrictions.OnGoingLocalDateRestriction;
import be.shad.tsqb.restrictions.OnGoingNumberRestriction;
import be.shad.tsqb.restrictions.OnGoingObjectRestriction;
import be.shad.tsqb.restrictions.OnGoingObjectRestrictionImpl;
import be.shad.tsqb.restrictions.OnGoingTextRestriction;
import be.shad.tsqb.restrictions.RestrictionNodeType;
import be.shad.tsqb.restrictions.RestrictionsGroup;
import be.shad.tsqb.restrictions.RestrictionsGroupImpl;
import be.shad.tsqb.restrictions.RestrictionsGroupInternal;
import be.shad.tsqb.values.DirectTypeSafeValue;
import be.shad.tsqb.values.TypeSafeValue;
import java.time.LocalDate;
import java.time.format.ResolverStyle;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RestrictionChainableImpl_ESTest extends RestrictionChainableImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RestrictionsGroup.RestrictionsGroupBracketsPolicy restrictionsGroup_RestrictionsGroupBracketsPolicy0 = RestrictionsGroup.RestrictionsGroupBracketsPolicy.Never;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null, restrictionsGroup_RestrictionsGroupBracketsPolicy0);
      OnGoingTextRestriction onGoingTextRestriction0 = restrictionsGroupImpl0.andString((TypeSafeValue<String>) null);
      assertNotNull(onGoingTextRestriction0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingObjectRestriction<Object> onGoingObjectRestriction0 = onGoingObjectRestrictionImpl0.and((TypeSafeValue<Object>) null);
      assertNotNull(onGoingObjectRestriction0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      MockDate mockDate0 = new MockDate((-1435), (-2155), (-2155), (-2155), (-1435));
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.or((Date) mockDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      Byte byte0 = Byte.valueOf((byte) (-87));
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.or((Number) byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      Boolean boolean0 = Boolean.valueOf("xg66kC<5lz3jxcrhT");
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.or(boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and(localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.or((ContinuedRestrictionChainable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionChainableImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingDateRestriction onGoingDateRestriction0 = onGoingObjectRestrictionImpl0.orDate((TypeSafeValue<Date>) null);
      assertNotNull(onGoingDateRestriction0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingObjectRestriction<Object> onGoingObjectRestriction0 = onGoingObjectRestrictionImpl0.or((TypeSafeValue<Object>) null);
      assertNotNull(onGoingObjectRestriction0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.andNotExists((TypeSafeSubQuery<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingNumberRestriction onGoingNumberRestriction0 = onGoingObjectRestrictionImpl0.andNumber((TypeSafeValue<Short>) null);
      assertNotNull(onGoingNumberRestriction0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.or(":XaDp_;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      Long long0 = Long.valueOf((-1L));
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and((Number) long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      MockDate mockDate0 = new MockDate(475L);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and((Date) mockDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and("50|1EONmcawC_a");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingDateRestriction onGoingDateRestriction0 = onGoingObjectRestrictionImpl0.andDate((TypeSafeValue<Date>) null);
      assertNotNull(onGoingDateRestriction0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionChainableImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and((Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      DirectTypeSafeValue<Boolean> directTypeSafeValue0 = new DirectTypeSafeValue<Boolean>((TypeSafeQuery) null, boolean0);
      OnGoingBooleanRestriction onGoingBooleanRestriction0 = onGoingObjectRestrictionImpl0.andBoolean(directTypeSafeValue0);
      assertNotNull(onGoingBooleanRestriction0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingBooleanRestriction onGoingBooleanRestriction0 = onGoingObjectRestrictionImpl0.orBoolean((TypeSafeValue<Boolean>) null);
      assertNotNull(onGoingBooleanRestriction0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingLocalDateRestriction onGoingLocalDateRestriction0 = onGoingObjectRestrictionImpl0.andLocalDate((TypeSafeValue<LocalDate>) null);
      assertNotNull(onGoingLocalDateRestriction0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      ResolverStyle resolverStyle0 = ResolverStyle.SMART;
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and(resolverStyle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.and((ContinuedRestrictionChainable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionChainableImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      OnGoingEnumRestriction<JoinType> onGoingEnumRestriction0 = onGoingObjectRestrictionImpl0.andEnum((TypeSafeValue<JoinType>) null);
      assertNotNull(onGoingEnumRestriction0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingObjectRestrictionImpl<Date> onGoingObjectRestrictionImpl0 = new OnGoingObjectRestrictionImpl<Date>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<Date>) null);
      // Undeclared exception!
      try { 
        onGoingObjectRestrictionImpl0.andExists((TypeSafeSubQuery<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }
}
