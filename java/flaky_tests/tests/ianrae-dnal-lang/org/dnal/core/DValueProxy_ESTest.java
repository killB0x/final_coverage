/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:34:43 GMT 2022
 */

package org.dnal.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.dnal.core.DStructHelper;
import org.dnal.core.DType;
import org.dnal.core.DValue;
import org.dnal.core.DValueImpl;
import org.dnal.core.DValueProxy;
import org.dnal.core.Shape;
import org.dnal.core.ValidationState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DValueProxy_ESTest extends DValueProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      ValidationState validationState0 = ValidationState.VALID;
      dValueImpl0.changeValidState(validationState0);
      boolean boolean0 = dValueProxy0.isValid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.setFutureValue(true);
      boolean boolean0 = dValueProxy0.isFutureValue();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = Shape.STRUCT;
      DType dType0 = new DType(shape0, "GHqS", (DType) null);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, dType0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      ValidationState validationState0 = dValueProxy0.getValState();
      assertEquals(ValidationState.UNKNOWN, validationState0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Shape shape0 = Shape.STRUCT;
      DType dType0 = new DType(shape0, "/{]K]d", (DType) null);
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, dValueProxy0);
      DValueProxy dValueProxy1 = new DValueProxy(dValueImpl0);
      DType dType1 = dValueProxy1.getType();
      assertEquals(0, dType1.getBitIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = Shape.MAP;
      DType dType0 = mock(DType.class, new ViolatedAssumptionAnswer());
      DType dType1 = new DType(shape0, (String) null, dType0);
      DValueImpl dValueImpl0 = new DValueImpl(dType1, dType1);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      DType dType2 = dValueProxy0.getType();
      assertNull(dType2.getPackageName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = Shape.LIST;
      DType dType0 = new DType(shape0, "org.dnal.core.ValidationState", (DType) null);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, dType0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      DType dType1 = dValueProxy0.getType();
      assertEquals("org.dnal.core.ValidationState", dType1.getCompleteName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = Shape.ANY;
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((DType) null, (DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      dValueProxy0.getType();
      DType dType0 = new DType(shape0, "Dd[><P\"6*v$A3", (DType) null);
      DValue dValue1 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(dType0, (DType) null).when(dValue1).getType();
      DValueProxy dValueProxy1 = new DValueProxy(dValue1);
      DType dType1 = dValueProxy1.getType();
      assertNull(dType1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Shape shape0 = Shape.BOOLEAN;
      DType dType0 = new DType(shape0, "zqe8x?j +=6zE]4rni", (DType) null);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, "zqe8x?j +=6zE]4rni");
      dValueImpl0.setPersistenceId(dType0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      DType dType1 = (DType)dValueProxy0.getPersistenceId();
      assertFalse(dType1.isListShape());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(dValue0).getObject();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      Object object0 = dValueProxy0.getObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((DStructHelper) null).when(dValue0).asStruct();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      DStructHelper dStructHelper0 = dValueProxy0.asStruct();
      assertNull(dStructHelper0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Shape shape0 = Shape.LONG;
      DType dType0 = mock(DType.class, new ViolatedAssumptionAnswer());
      DType dType1 = new DType(shape0, "w&Z(h_&hq,8-b(", dType0);
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dValue0).asString();
      doReturn(dType1).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      String string0 = dValueProxy0.asString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Shape shape0 = Shape.LONG;
      DType dType0 = mock(DType.class, new ViolatedAssumptionAnswer());
      DType dType1 = new DType(shape0, "w&Z(h_&hq,8-b(", dType0);
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(dValue0).asNumber();
      doReturn(dType1).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      double double0 = dValueProxy0.asNumber();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Shape shape0 = Shape.LIST;
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(dValue0).asMap();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      Map<String, DValue> map0 = dValueProxy0.asMap();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((long)927).when(dValue0).asLong();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      long long0 = dValueProxy0.asLong();
      assertEquals(927L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.asStruct();
      DValueImpl dValueImpl1 = new DValueImpl((DType) null, (Object) null);
      dValueProxy0.getType();
      ValidationState validationState0 = ValidationState.VALID;
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(dValue0).asList();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy1 = new DValueProxy(dValue0);
      List<DValue> list0 = dValueProxy1.asList();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dValue0).asInt();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      int int0 = dValueProxy0.asInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ValidationState validationState0 = ValidationState.VALID;
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dValue0).asInt();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, dValueProxy0);
      DValueProxy dValueProxy1 = new DValueProxy(dValueImpl0);
      dValueProxy1.getObject();
      int int0 = dValueProxy0.asInt();
      assertEquals(927, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((-186)).when(dValue0).asInt();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      int int0 = dValueProxy0.asInt();
      assertEquals((-186), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(dValue0).asBoolean();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      boolean boolean0 = dValueProxy0.asBoolean();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(dValue0).asBoolean();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, dValueProxy0);
      DValueProxy dValueProxy1 = new DValueProxy(dValueImpl0);
      DValueProxy dValueProxy2 = (DValueProxy)dValueProxy1.getObject();
      boolean boolean0 = dValueProxy2.asBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = Shape.BOOLEAN;
      DType dType0 = new DType(shape0, ",xRu=}eBh\"3>\"", (DType) null);
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl(dType0, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.getValState();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      Object object0 = new Object();
      dValueProxy0.forceObject(object0);
      // Undeclared exception!
      try { 
        dValueProxy0.getValState();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class org.dnal.core.DValue (java.lang.Object is in module java.base of loader 'bootstrap'; org.dnal.core.DValue is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      Object object0 = new Object();
      dValueProxy0.forceObject(object0);
      // Undeclared exception!
      try { 
        dValueProxy0.getType();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class org.dnal.core.DValue (java.lang.Object is in module java.base of loader 'bootstrap'; org.dnal.core.DValue is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.getPersistenceId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Shape shape0 = Shape.BOOLEAN;
      DType dType0 = new DType(shape0, "zqe8x?j +=6zE]4rni", (DType) null);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, "zqe8x?j +=6zE]4rni");
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject(dType0);
      // Undeclared exception!
      try { 
        dValueProxy0.getPersistenceId();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.dnal.core.DType cannot be cast to class org.dnal.core.DValue (org.dnal.core.DType and org.dnal.core.DValue are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.getObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      Object object0 = new Object();
      dValueProxy0.forceObject(object0);
      // Undeclared exception!
      try { 
        dValueProxy0.getObject();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class org.dnal.core.DValue (java.lang.Object is in module java.base of loader 'bootstrap'; org.dnal.core.DValue is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      ValidationState validationState0 = ValidationState.VALID;
      // Undeclared exception!
      try { 
        dValueProxy0.changeValidState(validationState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      ValidationState validationState0 = ValidationState.INVALID;
      Object object0 = new Object();
      dValueProxy0.forceObject(object0);
      // Undeclared exception!
      try { 
        dValueProxy0.changeValidState(validationState0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class org.dnal.core.DValueImpl (java.lang.Object is in module java.base of loader 'bootstrap'; org.dnal.core.DValueImpl is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.asStruct();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      ValidationState validationState0 = ValidationState.VALID;
      dValueProxy0.forceObject(validationState0);
      // Undeclared exception!
      try { 
        dValueProxy0.asStruct();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.dnal.core.ValidationState cannot be cast to class org.dnal.core.DValue (org.dnal.core.ValidationState and org.dnal.core.DValue are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Shape shape0 = Shape.LIST;
      DType dType0 = new DType(shape0, "", (DType) null);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, "");
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject("");
      // Undeclared exception!
      try { 
        dValueProxy0.asString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class org.dnal.core.DValue (java.lang.String is in module java.base of loader 'bootstrap'; org.dnal.core.DValue is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asNumber();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.asMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asMap();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.util.Map (java.lang.Object and java.util.Map are in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asLong();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asLong();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Long (java.lang.Object and java.lang.Long are in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.asList();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Shape shape0 = Shape.LIST;
      DType dType0 = new DType(shape0, "org.dnal.core.ValidationState", (DType) null);
      DValueImpl dValueImpl0 = new DValueImpl(dType0, dType0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asList();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.dnal.core.DType cannot be cast to class java.util.List (org.dnal.core.DType is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4be91503; java.util.List is in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asInt();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      dValueProxy0.forceObject((Object) null);
      // Undeclared exception!
      try { 
        dValueProxy0.asDate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asDate();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.util.Date (java.lang.Object and java.util.Date are in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asBoolean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DValueProxy dValueProxy0 = null;
      try {
        dValueProxy0 = new DValueProxy((DValue) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.core.DValueProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = Shape.LONG;
      DType dType0 = mock(DType.class, new ViolatedAssumptionAnswer());
      DType dType1 = new DType(shape0, "w&Z(h_&hq,8-b(", dType0);
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl(dType1, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      String string0 = dValueProxy0.asString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = Shape.LONG;
      DType dType0 = mock(DType.class, new ViolatedAssumptionAnswer());
      DType dType1 = new DType(shape0, "w&Z(h_&hq,8-b(", dType0);
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl(dType1, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asNumber();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Double (java.lang.Object and java.lang.Double are in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dValue0).asLong();
      doReturn((DType) null).when(dValue0).getType();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      long long0 = dValueProxy0.asLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      boolean boolean0 = dValueProxy0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      ValidationState validationState0 = ValidationState.INVALID;
      dValueProxy0.changeValidState(validationState0);
      assertFalse(dValueProxy0.isFutureValue());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      Date date0 = dValueProxy0.asDate();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      Object object0 = dValueProxy0.getPersistenceId();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      boolean boolean0 = dValueProxy0.isFutureValue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asInt();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Long (java.lang.Object and java.lang.Long are in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, (Object) null);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      DStructHelper dStructHelper0 = dValueProxy0.asStruct();
      assertNotNull(dStructHelper0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      DValueImpl dValueImpl0 = new DValueImpl((DType) null, object0);
      DValueProxy dValueProxy0 = new DValueProxy(dValueImpl0);
      // Undeclared exception!
      try { 
        dValueProxy0.asBoolean();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')
         //
         verifyException("org.dnal.core.DValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DValue dValue0 = mock(DValue.class, new ViolatedAssumptionAnswer());
      doReturn((DType) null).when(dValue0).getType();
      doReturn((ValidationState) null).when(dValue0).getValState();
      DValueProxy dValueProxy0 = new DValueProxy(dValue0);
      dValueProxy0.getValState();
  }
}
