/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:04:48 GMT 2022
 */

package net.named_data.jndn.security.pib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import net.named_data.jndn.Name;
import net.named_data.jndn.security.pib.Pib;
import net.named_data.jndn.security.pib.PibIdentity;
import net.named_data.jndn.security.pib.PibIdentityContainer;
import net.named_data.jndn.security.pib.PibImpl;
import net.named_data.jndn.security.pib.PibMemory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Pib_ESTest extends Pib_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pib.Error pib_Error0 = new Pib.Error("JdqkkVFd");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib((String) null, (String) null, pibMemory0);
      String string0 = pib0.getScheme();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("encodeControlResponse is not implemented", "encodeControlResponse is not implemented", pibMemory0);
      String string0 = pib0.getScheme();
      assertEquals("encodeControlResponse is not implemented", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("", "!", pibMemory0);
      Name name0 = new Name("!");
      pib0.setDefaultIdentity_(name0);
      pib0.getIdentity(name0);
      assertEquals("", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("hH9'X$HX2x'&", "hH9'X$HX2x'&", pibMemory0);
      Name.Component[] name_ComponentArray0 = new Name.Component[0];
      Name name0 = new Name(name_ComponentArray0);
      pib0.addIdentity_(name0);
      PibIdentityContainer pibIdentityContainer0 = pib0.getIdentities_();
      assertEquals(1, pibIdentityContainer0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib((String) null, (String) null, pibMemory0);
      // Undeclared exception!
      try { 
        pib0.setTpmLocator((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib(":", ":", pibMemory0);
      Name name0 = new Name();
      pib0.setDefaultIdentity_(name0);
      Pib pib1 = new Pib("<=,5wB*~JW!Sl4T9u8", ":", pibMemory0);
      pib0.setTpmLocator("Okfw>E/qh5kn^)X!Q");
      try { 
        pib1.setDefaultIdentity_(name0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Identity / does not exist
         //
         verifyException("net.named_data.jndn.security.pib.detail.PibIdentityImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("?63sB?zriTm4|.", "?63sB?zriTm4|.", pibMemory0);
      // Undeclared exception!
      try { 
        pib0.setDefaultIdentity_((Name) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("?zh\"w9:B$Fb~'$A~e", "?zh\"w9:B$Fb~'$A~e", pibMemory0);
      Name name0 = new Name("hH9'X$HX2x'&");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(808);
      pibMemory0.addKey(name0, name0, byteBuffer0);
      // Undeclared exception!
      try { 
        pib0.setDefaultIdentity_(name0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key name `/hH9%27X%24HX2x%27%26` does not follow the naming conventions
         //
         verifyException("net.named_data.jndn.security.pib.PibKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("/", "/", pibMemory0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ArrayList<Object> arrayList0 = new ArrayList<Object>(linkedList0);
      arrayList0.add((Object) pib0);
      Name name0 = new Name(arrayList0);
      // Undeclared exception!
      try { 
        pib0.setDefaultIdentity_(name0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.security.pib.Pib cannot be cast to class net.named_data.jndn.Name$Component (net.named_data.jndn.security.pib.Pib and net.named_data.jndn.Name$Component are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2af178d8)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("hH9'X$HX2x'&", "hH9'X$HX2x'&", pibMemory0);
      Name name0 = new Name("hH9'X$HX2x'&");
      pib0.addIdentity_(name0);
      // Undeclared exception!
      try { 
        pib0.removeIdentity_((Name) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.security.pib.PibMemory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("+", "!", pibMemory0);
      Name name0 = new Name("!");
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(254);
      pibMemory0.addKey(name0, name0, byteBuffer0);
      // Undeclared exception!
      try { 
        pib0.removeIdentity_(name0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key name `/%21` does not follow the naming conventions
         //
         verifyException("net.named_data.jndn.security.pib.PibKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("/", "/", pibMemory0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(106);
      arrayList0.add(integer0);
      Name name0 = new Name(arrayList0);
      // Undeclared exception!
      try { 
        pib0.removeIdentity_(name0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Integer cannot be cast to class net.named_data.jndn.Name$Component (java.lang.Integer is in module java.base of loader 'bootstrap'; net.named_data.jndn.Name$Component is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2af178d8)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("/", "/", pibMemory0);
      pibMemory0.setTpmLocator((String) null);
      // Undeclared exception!
      try { 
        pib0.getTpmLocator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("LINK", "LINK", pibMemory0);
      // Undeclared exception!
      try { 
        pib0.getIdentity((Name) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("axe7V)T", "axe7V)T", pibMemory0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      Name name0 = new Name(arrayList0);
      // Undeclared exception!
      try { 
        pib0.getIdentity(name0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class net.named_data.jndn.Name$Component (java.lang.Object is in module java.base of loader 'bootstrap'; net.named_data.jndn.Name$Component is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2af178d8)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("rC3~YoXuf(J[oEWs", "rC3~YoXuf(J[oEWs", pibMemory0);
      Name name0 = new Name("hH9'X$HX2x'&");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(808);
      pibMemory0.addKey(name0, name0, byteBuffer0);
      // Undeclared exception!
      try { 
        pib0.getDefaultIdentity();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key name `/hH9%27X%24HX2x%27%26` does not follow the naming conventions
         //
         verifyException("net.named_data.jndn.security.pib.PibKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("hEY\"AMr]", "hEY\"AMr]", pibMemory0);
      // Undeclared exception!
      try { 
        pib0.addIdentity_((Name) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Name name0 = new Name("V@&7z^rUU-,J0r");
      Charset charset0 = Charset.defaultCharset();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "V@&7z^rUU-,J0r");
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      pibMemory0.addKey(name0, name0, byteBuffer0);
      Pib pib0 = new Pib("ELEE FROM keys", "ELEE FROM keys", pibMemory0);
      // Undeclared exception!
      try { 
        pib0.addIdentity_(name0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key name `/V%40%267z%5ErUU-%2CJ0r` does not follow the naming conventions
         //
         verifyException("net.named_data.jndn.security.pib.PibKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      Name name0 = new Name(arrayList0);
      Pib pib0 = new Pib("axe7V)T", "axe7V)T", pibMemory0);
      // Undeclared exception!
      try { 
        pib0.addIdentity_(name0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class net.named_data.jndn.Name$Component (java.lang.Object is in module java.base of loader 'bootstrap'; net.named_data.jndn.Name$Component is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2af178d8)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Pib pib0 = null;
      try {
        pib0 = new Pib(":", ":", (PibImpl) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // The pibImpl is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("user.home", "net.named_data.jndn.security.pib.Pib$Error", pibMemory0);
      pib0.reset_();
      assertEquals("user.home", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib(":", "!", pibMemory0);
      Name name0 = new Name("!");
      pib0.setDefaultIdentity_(name0);
      Name name1 = name0.getSuccessor();
      pib0.removeIdentity_(name1);
      assertEquals(":", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib(":", "!", pibMemory0);
      Name name0 = new Name("!");
      pib0.setDefaultIdentity_(name0);
      pib0.removeIdentity_(name0);
      assertEquals(":", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("rC3~YoXuf(J[oEWs", "rC3~YoXuf(J[oEWs", pibMemory0);
      try { 
        pib0.getDefaultIdentity();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No default identity
         //
         verifyException("net.named_data.jndn.security.pib.PibMemory", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("net.named_data.jndn.GenericSignature", "3!", pibMemory0);
      Name name0 = new Name("3!");
      PibIdentity pibIdentity0 = pib0.setDefaultIdentity_(name0);
      PibIdentity pibIdentity1 = pib0.getDefaultIdentity();
      assertSame(pibIdentity1, pibIdentity0);
      assertEquals("net.named_data.jndn.GenericSignature", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib(":ZO>7O;", ":ZO>7O;", pibMemory0);
      try { 
        pib0.getTpmLocator();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // TPM info does not exist
         //
         verifyException("net.named_data.jndn.security.pib.Pib", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib(":", "!", pibMemory0);
      pib0.setTpmLocator("!");
      pib0.setTpmLocator("!");
      assertEquals(":", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("", "/", pibMemory0);
      pib0.setTpmLocator("<=,5wB*~JW!Sl4T9u8");
      assertEquals("<=,5wB*~JW!Sl4T9u8", pibMemory0.getTpmLocator());
      
      pib0.getTpmLocator();
      assertEquals("", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("hH9'X$HX2^'&", "hH9'X$HX2^'&", pibMemory0);
      String string0 = pib0.getPibLocator();
      assertEquals("hH9'X$HX2^'&:hH9'X$HX2^'&", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("", "/", pibMemory0);
      pib0.getIdentities_();
      assertEquals("", pib0.getScheme());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("", "/", pibMemory0);
      Name name0 = new Name();
      pib0.setDefaultIdentity_(name0);
      Pib pib1 = new Pib("<=,5wB*~JW!Sl4T9u8", "/", pibMemory0);
      pib0.setTpmLocator("Okfw>E/qh5kn^)X!Q");
      try { 
        pib1.addIdentity_(name0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Identity / does not exist
         //
         verifyException("net.named_data.jndn.security.pib.detail.PibIdentityImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib("", "!", pibMemory0);
      String string0 = pib0.getScheme();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PibMemory pibMemory0 = new PibMemory();
      Pib pib0 = new Pib(":", "!", pibMemory0);
      Name name0 = new Name("!");
      try { 
        pib0.getIdentity(name0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Identity /%21 does not exist
         //
         verifyException("net.named_data.jndn.security.pib.detail.PibIdentityImpl", e);
      }
  }
}
