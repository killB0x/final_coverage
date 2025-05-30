/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 10:56:08 GMT 2022
 */

package jetbrick.template.parser.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jetbrick.template.JetContext;
import jetbrick.template.parser.support.TypedKlass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypedKlass_ESTest extends TypedKlass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass[] typedKlassArray0 = new TypedKlass[3];
      TypedKlass typedKlass0 = TypedKlass.create(class0, typedKlassArray0);
      TypedKlass[] typedKlassArray1 = typedKlass0.getTypeArgs();
      assertEquals(3, typedKlassArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.JetForStatus;
      Class<?> class0 = typedKlass0.getKlass();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.VOID;
      Class<?> class0 = typedKlass0.getKlass();
      TypedKlass typedKlass1 = TypedKlass.create(class0, typedKlass0.EMPTY_TYPE_ARGS);
      assertSame(typedKlass1, typedKlass0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.VOID;
      Class<?> class0 = typedKlass0.getKlass();
      TypedKlass typedKlass1 = TypedKlass.create(class0);
      assertSame(typedKlass1, typedKlass0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.NULL;
      // Undeclared exception!
      try { 
        typedKlass0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.parser.support.TypedKlass", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.JetContext;
      String string0 = typedKlass0.getSource();
      assertEquals("jetbrick.template.JetContext", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.VOID;
      boolean boolean0 = typedKlass0.isPrimitive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.WildcharTypedKlass;
      boolean boolean0 = typedKlass0.isPrimitive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.NULL;
      boolean boolean0 = typedKlass0.isPrimitive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TypedKlass[] typedKlassArray0 = new TypedKlass[0];
      TypedKlass typedKlass0 = TypedKlass.create((Class<?>) null, typedKlassArray0);
      assertFalse(typedKlass0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass[] typedKlassArray0 = new TypedKlass[1];
      TypedKlass typedKlass0 = TypedKlass.WildcharTypedKlass;
      typedKlassArray0[0] = typedKlass0;
      TypedKlass typedKlass1 = TypedKlass.create(class0, typedKlassArray0);
      String string0 = typedKlass1.getSource();
      assertEquals("jetbrick.template.JetContext<?>", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass[] typedKlassArray0 = new TypedKlass[3];
      TypedKlass typedKlass0 = TypedKlass.create(class0);
      typedKlassArray0[0] = typedKlass0;
      typedKlassArray0[1] = typedKlassArray0[0];
      typedKlassArray0[2] = typedKlassArray0[1];
      TypedKlass typedKlass1 = TypedKlass.create(class0, typedKlassArray0);
      String string0 = typedKlass1.getSource();
      assertNotSame(typedKlass1, typedKlass0);
      assertEquals("jetbrick.template.JetContext<jetbrick.template.JetContext,jetbrick.template.JetContext,jetbrick.template.JetContext>", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass typedKlass0 = TypedKlass.create(class0);
      TypedKlass typedKlass1 = typedKlass0.asUnboxedTypedKlass();
      assertNull(typedKlass1);
      assertFalse(typedKlass0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.NULL;
      TypedKlass typedKlass1 = typedKlass0.asUnboxedTypedKlass();
      assertNull(typedKlass1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass typedKlass0 = TypedKlass.create(class0);
      TypedKlass typedKlass1 = typedKlass0.asBoxedTypedKlass();
      assertSame(typedKlass1, typedKlass0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass[] typedKlassArray0 = new TypedKlass[3];
      TypedKlass typedKlass0 = TypedKlass.create(class0, typedKlassArray0);
      // Undeclared exception!
      try { 
        typedKlass0.getSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.parser.support.TypedKlass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass typedKlass0 = TypedKlass.create(class0, (TypedKlass[]) null);
      assertFalse(typedKlass0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TypedKlass typedKlass0 = TypedKlass.VOID;
      TypedKlass typedKlass1 = typedKlass0.asBoxedTypedKlass();
      Class<?> class0 = typedKlass1.getKlass();
      assertNull(class0);
      assertNotSame(typedKlass0, typedKlass1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass[] typedKlassArray0 = new TypedKlass[3];
      TypedKlass typedKlass0 = TypedKlass.create(class0);
      typedKlassArray0[0] = typedKlass0;
      TypedKlass[] typedKlassArray1 = typedKlassArray0[0].getTypeArgs();
      assertNotSame(typedKlassArray0, typedKlassArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<JetContext> class0 = JetContext.class;
      TypedKlass typedKlass0 = TypedKlass.create(class0);
      String string0 = typedKlass0.JetContext.toString();
      assertEquals("jetbrick.template.JetContext", string0);
      assertFalse(typedKlass0.isPrimitive());
  }
}
