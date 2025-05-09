/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:15:16 GMT 2022
 */

package uk.ziglio.construct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.MappingAdapter;
import uk.ziglio.construct.core.Construct;
import uk.ziglio.construct.core.PassClass;
import uk.ziglio.construct.core.Range;
import uk.ziglio.construct.core.Value;
import uk.ziglio.construct.lib.Containers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MappingAdapter_ESTest extends MappingAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Value<Integer> value0 = new Value<Integer>();
      Range<Value<Integer>> range0 = new Range<Value<Integer>>(1100, (-1842), value0);
      Integer[] integerArray0 = new Integer[8];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.reverse();
      MappingAdapter mappingAdapter0 = new MappingAdapter(range0, containers_Container0, containers_Container1, range0.FLAG_DYNAMIC, range0.FLAG_DYNAMIC);
      Object object0 = mappingAdapter0.decode(integerArray0[3], containers_Container1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      Integer[] integerArray0 = new Integer[4];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.clone();
      Object object0 = new Object();
      MappingAdapter mappingAdapter0 = new MappingAdapter(passClass0, containers_Container1, containers_Container0, integerArray0[1], object0);
      // Undeclared exception!
      try { 
        mappingAdapter0.decode(mappingAdapter0.FLAG_EMBED, containers_Container0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no encoding mapping for 4
         //
         verifyException("uk.ziglio.construct.MappingAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Value<Integer> value0 = new Value<Integer>();
      Range<Value<Integer>> range0 = new Range<Value<Integer>>(1100, (-1842), value0);
      Integer[] integerArray0 = new Integer[8];
      integerArray0[2] = (Integer) 2;
      integerArray0[3] = (Integer) 2;
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.reverse();
      MappingAdapter mappingAdapter0 = new MappingAdapter(range0, containers_Container0, containers_Container1, value0.FLAG_NESTING, value0.FLAG_NESTING);
      Object object0 = mappingAdapter0.encode(value0.conflags, containers_Container1);
      assertNotNull(object0);
      assertEquals(2, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      Integer[] integerArray0 = new Integer[4];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      Containers.Container containers_Container1 = containers_Container0.clone();
      Object object0 = new Object();
      MappingAdapter mappingAdapter0 = new MappingAdapter(passClass0, containers_Container1, containers_Container0, integerArray0[1], object0);
      Object object1 = mappingAdapter0.encode(mappingAdapter0.conflags, containers_Container1);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      MappingAdapter mappingAdapter0 = new MappingAdapter(passClass0, (Containers.Container) null, (Containers.Container) null, (Object) null, (Object) null);
      // Undeclared exception!
      try { 
        mappingAdapter0.encode((Object) null, (Containers.Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.MappingAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PassClass passClass0 = PassClass.getInstance();
      MappingAdapter mappingAdapter0 = new MappingAdapter(passClass0, (Containers.Container) null, (Containers.Container) null, (Object) null, (Object) null);
      // Undeclared exception!
      try { 
        mappingAdapter0.decode(passClass0, (Containers.Container) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.MappingAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Value<Integer> value0 = new Value<Integer>();
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      MappingAdapter mappingAdapter0 = null;
      try {
        mappingAdapter0 = new MappingAdapter((Construct) null, containers_Container0, containers_Container0, value0, value0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.core.Subconstruct", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Value<Integer> value0 = new Value<Integer>();
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      PassClass passClass0 = PassClass.getInstance();
      MappingAdapter mappingAdapter0 = new MappingAdapter(passClass0, containers_Container0, containers_Container0, value0, passClass0);
      Value value1 = (Value)mappingAdapter0.decode(mappingAdapter0.conflags, containers_Container0);
      assertNotNull(value1);
      assertEquals(2, value1.conflags);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Value<Integer> value0 = new Value<Integer>();
      Integer[] integerArray0 = new Integer[2];
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      MappingAdapter mappingAdapter0 = new MappingAdapter(value0, containers_Container0, containers_Container0, integerArray0[1], (Object) null);
      // Undeclared exception!
      try { 
        mappingAdapter0.encode(value0.conflags, containers_Container0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no encoding mapping for 2
         //
         verifyException("uk.ziglio.construct.MappingAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Value<Integer> value0 = new Value<Integer>();
      Range<Value<Integer>> range0 = new Range<Value<Integer>>(1100, (-1842), value0);
      Integer[] integerArray0 = new Integer[8];
      integerArray0[4] = (Integer) 8;
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      MappingAdapter mappingAdapter0 = new MappingAdapter(range0, containers_Container0, containers_Container0, value0.FLAG_EMBED, value0.FLAG_COPY_CONTEXT);
      Object object0 = mappingAdapter0.encode(value0.FLAG_NESTING, containers_Container0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer[] integerArray0 = new Integer[2];
      Value<Integer> value0 = new Value<Integer>();
      Containers.Container containers_Container0 = new Containers.Container(integerArray0);
      PassClass passClass0 = PassClass.getInstance();
      MappingAdapter mappingAdapter0 = new MappingAdapter(passClass0, containers_Container0, containers_Container0, value0, passClass0);
      Object object0 = mappingAdapter0.encode(passClass0.FLAG_EMBED, containers_Container0);
      assertEquals(4, object0);
  }
}
