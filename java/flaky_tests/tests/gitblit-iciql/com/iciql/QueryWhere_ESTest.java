/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 11:11:24 GMT 2022
 */

package com.iciql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iciql.CompareType;
import com.iciql.NestedConditions;
import com.iciql.Query;
import com.iciql.QueryWhere;
import com.iciql.SubQuery;
import com.iciql.ValueCount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueryWhere_ESTest extends QueryWhere_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Byte byte0 = new Byte((byte) (-59));
      // Undeclared exception!
      try { 
        queryWhere0.selectFirst(byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy(989L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        queryWhere0.replaceView(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.limit(1849L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.andOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((-2512));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((ValueCount<Byte>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderByNullsFirst(queryWhere0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy((short)2521);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderByDescNullsLast((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderByDescNullsFirst(queryWhere0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.getSQL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy(3247.94);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and((byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.selectCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.selectFirst();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Class<Byte> class0 = Byte.class;
      // Undeclared exception!
      try { 
        queryWhere0.createView(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      CompareType compareType0 = CompareType.AT_MOST;
      // Undeclared exception!
      try { 
        queryWhere0.toSQL(false, compareType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.toSQL(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.offset((-3583L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or(0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery((double) (-62L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Byte byte0 = new Byte((byte)0);
      ValueCount<Byte> valueCount0 = new ValueCount<Byte>(byte0, (byte)0);
      SubQuery<Byte, ValueCount<Byte>> subQuery0 = queryWhere0.subQuery(valueCount0);
      assertNotNull(subQuery0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and((NestedConditions.Or<Byte>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery((-1045));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery((short)1020);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.selectDistinct();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Byte byte0 = new Byte((byte)0);
      // Undeclared exception!
      try { 
        queryWhere0.selectDistinct(byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        queryWhere0.groupBy(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and((double) (byte)42);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy((short) (-668));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderByDesc((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and((NestedConditions.And<Byte>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.selectCount((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      CompareType compareType0 = CompareType.AT_MOST;
      // Undeclared exception!
      try { 
        queryWhere0.select(compareType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy(6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery(9.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and((short)289);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Byte byte0 = new Byte((byte)39);
      // Undeclared exception!
      try { 
        queryWhere0.selectCountDesc(byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        queryWhere0.orderBy(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy(4337);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.toSQL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.delete();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((NestedConditions.Or<Byte>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.update();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy(2535.558F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy((byte) (-33));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and(0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy(5166.0503F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((short)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy((byte) (-33));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderByNullsLast(queryWhere0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and(1631L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.subQuery((byte) (-51));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.groupBy((-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((byte)25);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.orderBy(905L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.and(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      QueryWhere<Byte> queryWhere0 = new QueryWhere<Byte>((Query<Byte>) null);
      // Undeclared exception!
      try { 
        queryWhere0.or((NestedConditions.And<Byte>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryWhere", e);
      }
  }
}
