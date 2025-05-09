/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 23:29:08 GMT 2022
 */

package be.shad.tsqb.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import be.shad.tsqb.query.JoinType;
import be.shad.tsqb.query.TypeSafeQueryInternal;
import be.shad.tsqb.query.TypeSafeQueryMultiJoin;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeSafeQueryMultiJoin_ESTest extends TypeSafeQueryMultiJoin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JoinType joinType0 = JoinType.Inner;
      TypeSafeQueryMultiJoin typeSafeQueryMultiJoin0 = new TypeSafeQueryMultiJoin((TypeSafeQueryInternal) null, joinType0);
      // Undeclared exception!
      try { 
        typeSafeQueryMultiJoin0.join((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.query.TypeSafeQueryMultiJoin", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JoinType joinType0 = JoinType.Inner;
      TypeSafeQueryMultiJoin typeSafeQueryMultiJoin0 = new TypeSafeQueryMultiJoin((TypeSafeQueryInternal) null, joinType0);
      // Undeclared exception!
      try { 
        typeSafeQueryMultiJoin0.join((Collection<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.query.TypeSafeQueryMultiJoin", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JoinType joinType0 = JoinType.Inner;
      TypeSafeQueryMultiJoin typeSafeQueryMultiJoin0 = new TypeSafeQueryMultiJoin((TypeSafeQueryInternal) null, joinType0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        typeSafeQueryMultiJoin0.join((Map<Integer, Integer>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.query.TypeSafeQueryMultiJoin", e);
      }
  }
}
