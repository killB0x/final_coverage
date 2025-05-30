/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 23:34:13 GMT 2022
 */

package be.shad.tsqb.restrictions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import be.shad.tsqb.query.TypeSafeQuery;
import be.shad.tsqb.restrictions.OnGoingEnumRestriction;
import be.shad.tsqb.restrictions.OnGoingEnumRestrictionImpl;
import be.shad.tsqb.restrictions.RestrictionNodeType;
import be.shad.tsqb.restrictions.RestrictionsGroupInternal;
import be.shad.tsqb.values.CaseTypeSafeValue;
import be.shad.tsqb.values.NullIfTypeSafeValue;
import be.shad.tsqb.values.TypeSafeValue;
import java.time.format.TextStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OnGoingEnumRestrictionImpl_ESTest extends OnGoingEnumRestrictionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.And;
      Class<TextStyle> class0 = TextStyle.class;
      CaseTypeSafeValue<TextStyle> caseTypeSafeValue0 = new CaseTypeSafeValue<TextStyle>((TypeSafeQuery) null, class0);
      NullIfTypeSafeValue<TextStyle> nullIfTypeSafeValue0 = new NullIfTypeSafeValue<TextStyle>((TypeSafeQuery) null, caseTypeSafeValue0, caseTypeSafeValue0);
      OnGoingEnumRestrictionImpl<TextStyle> onGoingEnumRestrictionImpl0 = new OnGoingEnumRestrictionImpl<TextStyle>((RestrictionsGroupInternal) null, restrictionNodeType0, nullIfTypeSafeValue0);
      OnGoingEnumRestriction<TextStyle> onGoingEnumRestriction0 = onGoingEnumRestrictionImpl0.createOriginalOnGoingRestriction(restrictionNodeType0, caseTypeSafeValue0);
      assertNotNull(onGoingEnumRestriction0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      Class<RestrictionNodeType> class0 = RestrictionNodeType.class;
      CaseTypeSafeValue<RestrictionNodeType> caseTypeSafeValue0 = new CaseTypeSafeValue<RestrictionNodeType>((TypeSafeQuery) null, class0);
      OnGoingEnumRestrictionImpl<RestrictionNodeType> onGoingEnumRestrictionImpl0 = new OnGoingEnumRestrictionImpl<RestrictionNodeType>((RestrictionsGroupInternal) null, restrictionNodeType0, caseTypeSafeValue0);
      Class<RestrictionNodeType> class1 = onGoingEnumRestrictionImpl0.getSupportedValueClass();
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingEnumRestrictionImpl<TextStyle> onGoingEnumRestrictionImpl0 = new OnGoingEnumRestrictionImpl<TextStyle>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<TextStyle>) null);
      OnGoingEnumRestrictionImpl<TextStyle> onGoingEnumRestrictionImpl1 = onGoingEnumRestrictionImpl0.createContinuedOnGoingRestriction(restrictionNodeType0, (TypeSafeValue<TextStyle>) null);
      assertNotSame(onGoingEnumRestrictionImpl0, onGoingEnumRestrictionImpl1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingEnumRestrictionImpl<RestrictionNodeType> onGoingEnumRestrictionImpl0 = null;
      try {
        onGoingEnumRestrictionImpl0 = new OnGoingEnumRestrictionImpl<RestrictionNodeType>((RestrictionsGroupInternal) null, restrictionNodeType0, restrictionNodeType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingRestrictionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RestrictionNodeType restrictionNodeType0 = RestrictionNodeType.Or;
      OnGoingEnumRestrictionImpl<TextStyle> onGoingEnumRestrictionImpl0 = new OnGoingEnumRestrictionImpl<TextStyle>((RestrictionsGroupInternal) null, restrictionNodeType0, (TypeSafeValue<TextStyle>) null);
      // Undeclared exception!
      try { 
        onGoingEnumRestrictionImpl0.getSupportedValueClass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.restrictions.OnGoingEnumRestrictionImpl", e);
      }
  }
}
