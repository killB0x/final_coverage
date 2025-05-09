/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 23:01:18 GMT 2022
 */

package be.shad.tsqb.restrictions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import be.shad.tsqb.data.TypeSafeQueryProxyData;
import be.shad.tsqb.query.TypeSafeQuery;
import be.shad.tsqb.query.TypeSafeQueryInternal;
import be.shad.tsqb.restrictions.OnGoingTextRestriction;
import be.shad.tsqb.restrictions.OnGoingTextRestrictionImpl;
import be.shad.tsqb.restrictions.RestrictionNodeType;
import be.shad.tsqb.restrictions.RestrictionsGroup;
import be.shad.tsqb.restrictions.RestrictionsGroupImpl;
import be.shad.tsqb.restrictions.RestrictionsGroupInternal;
import be.shad.tsqb.restrictions.predicate.IgnoreDirectEmptyStringPredicate;
import be.shad.tsqb.restrictions.predicate.IgnoreDirectNullPredicate;
import be.shad.tsqb.restrictions.predicate.IgnoreNeverPredicate;
import be.shad.tsqb.restrictions.predicate.RestrictionPredicate;
import be.shad.tsqb.values.CaseTypeSafeValue;
import be.shad.tsqb.values.CoalesceTypeSafeValue;
import be.shad.tsqb.values.CollectionTypeSafeValue;
import be.shad.tsqb.values.DirectTypeSafeStringValue;
import be.shad.tsqb.values.DirectTypeSafeValue;
import be.shad.tsqb.values.ProjectionTypeSafeValue;
import be.shad.tsqb.values.TypeSafeValue;
import be.shad.tsqb.values.WrappedTypeSafeValue;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OnGoingTextRestrictionImpl_ESTest extends OnGoingTextRestrictionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, caseTypeSafeValue0);
      CaseTypeSafeValue<String> caseTypeSafeValue1 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.gte((TypeSafeValue<String>) caseTypeSafeValue1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, caseTypeSafeValue0);
      ProjectionTypeSafeValue<String> projectionTypeSafeValue0 = new ProjectionTypeSafeValue<String>((TypeSafeQuery) null, class0, "-MnPnBw8");
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.lte((TypeSafeValue<String>) projectionTypeSafeValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RestrictionsGroup.RestrictionsGroupBracketsPolicy restrictionsGroup_RestrictionsGroupBracketsPolicy0 = RestrictionsGroup.RestrictionsGroupBracketsPolicy.Always;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null, restrictionsGroup_RestrictionsGroupBracketsPolicy0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      DirectTypeSafeValue<String> directTypeSafeValue0 = new DirectTypeSafeValue<String>((TypeSafeQuery) null, "");
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.gt((TypeSafeValue<String>) directTypeSafeValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RestrictionsGroup.RestrictionsGroupBracketsPolicy restrictionsGroup_RestrictionsGroupBracketsPolicy0 = RestrictionsGroup.RestrictionsGroupBracketsPolicy.Always;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null, restrictionsGroup_RestrictionsGroupBracketsPolicy0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "C;p");
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.lt((TypeSafeValue<String>) directTypeSafeStringValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null);
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      WrappedTypeSafeValue<String> wrappedTypeSafeValue0 = new WrappedTypeSafeValue<String>((TypeSafeQuery) null, "Z8YGtBhN<k=M", class0, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.notLike((TypeSafeValue<String>) wrappedTypeSafeValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RestrictionsGroup.RestrictionsGroupBracketsPolicy restrictionsGroup_RestrictionsGroupBracketsPolicy0 = RestrictionsGroup.RestrictionsGroupBracketsPolicy.Always;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null, restrictionsGroup_RestrictionsGroupBracketsPolicy0);
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      Locale locale0 = Locale.CANADA_FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Integer integer0 = Integer.getInteger("hcP^*}(ln)9S(^l$", (-305));
      CollectionTypeSafeValue<String> collectionTypeSafeValue0 = new CollectionTypeSafeValue<String>((TypeSafeQuery) null, class0, set0, integer0);
      CoalesceTypeSafeValue<String> coalesceTypeSafeValue0 = new CoalesceTypeSafeValue<String>((TypeSafeQuery) null, collectionTypeSafeValue0);
      OnGoingTextRestriction onGoingTextRestriction0 = onGoingTextRestrictionImpl0.createOriginalOnGoingRestriction(restrictionNodeType0, coalesceTypeSafeValue0);
      assertNotSame(onGoingTextRestrictionImpl0, onGoingTextRestriction0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.endsWith();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.contains();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RestrictionsGroup.RestrictionsGroupBracketsPolicy restrictionsGroup_RestrictionsGroupBracketsPolicy0 = RestrictionsGroup.RestrictionsGroupBracketsPolicy.Always;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null, restrictionsGroup_RestrictionsGroupBracketsPolicy0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, directTypeSafeStringValue0);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = onGoingTextRestrictionImpl0.createDummyDirectValue();
      assertEquals("", directTypeSafeStringValue1.getPostfix());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl1 = onGoingTextRestrictionImpl0.createContinuedOnGoingRestriction(restrictionNodeType0, (TypeSafeValue<String>) null);
      assertNotSame(onGoingTextRestrictionImpl0, onGoingTextRestrictionImpl1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.createDummyDirectValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingTextRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      IgnoreDirectEmptyStringPredicate ignoreDirectEmptyStringPredicate0 = new IgnoreDirectEmptyStringPredicate();
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.contains("Yh=sDRMI_Z ", (RestrictionPredicate) ignoreDirectEmptyStringPredicate0);
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
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.startsWith("be.shad.tsqb.selection.SelectionValueTransformerException", (RestrictionPredicate) null);
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
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      IgnoreDirectNullPredicate ignoreDirectNullPredicate0 = new IgnoreDirectNullPredicate();
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.endsWith("", (RestrictionPredicate) ignoreDirectNullPredicate0);
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
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.startsWith((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingTextRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RestrictionsGroup.RestrictionsGroupBracketsPolicy restrictionsGroup_RestrictionsGroupBracketsPolicy0 = RestrictionsGroup.RestrictionsGroupBracketsPolicy.Always;
      RestrictionsGroupImpl restrictionsGroupImpl0 = new RestrictionsGroupImpl((TypeSafeQueryInternal) null, (TypeSafeQueryProxyData) null, restrictionsGroup_RestrictionsGroupBracketsPolicy0);
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      Class<String> class0 = String.class;
      CaseTypeSafeValue<String> caseTypeSafeValue0 = new CaseTypeSafeValue<String>((TypeSafeQuery) null, class0);
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl(restrictionsGroupImpl0, restrictionNodeType0, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.startsWith();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.like("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      Class<String> class0 = onGoingTextRestrictionImpl0.getSupportedValueClass();
      assertEquals(17, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.notIn((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      IgnoreDirectNullPredicate ignoreDirectNullPredicate0 = (IgnoreDirectNullPredicate)RestrictionPredicate.IGNORE_NULL;
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.like(",zc", (RestrictionPredicate) ignoreDirectNullPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.endsWith((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingTextRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.notLike("Like not supported for referenced value [", (RestrictionPredicate) null);
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
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.lt(")M&+O$ag");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.lte((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.gte((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.in((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.contains("r");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      IgnoreNeverPredicate ignoreNeverPredicate0 = new IgnoreNeverPredicate();
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.notIn((String[]) null, (RestrictionPredicate) ignoreNeverPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.gt("%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.notLike("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = null;
      try {
        onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, ";\u0003D{>mN6n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.like((TypeSafeValue<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.RestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingTextRestrictionImpl onGoingTextRestrictionImpl0 = new OnGoingTextRestrictionImpl((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<String>) null);
      String[] stringArray0 = new String[0];
      IgnoreDirectEmptyStringPredicate ignoreDirectEmptyStringPredicate0 = new IgnoreDirectEmptyStringPredicate();
      // Undeclared exception!
      try { 
        onGoingTextRestrictionImpl0.in(stringArray0, (RestrictionPredicate) ignoreDirectEmptyStringPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }
}
