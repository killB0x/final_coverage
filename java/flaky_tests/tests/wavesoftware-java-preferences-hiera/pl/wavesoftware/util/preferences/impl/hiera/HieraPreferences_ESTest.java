/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 14:33:36 GMT 2022
 */

package pl.wavesoftware.util.preferences.impl.hiera;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.prefs.MockPreferences;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences;
import pl.wavesoftware.util.preferences.impl.hiera.HieraPreferencesFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HieraPreferences_ESTest extends HieraPreferences_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      assertEquals("/", hieraPreferences0.absolutePath());
      
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      assertEquals("", hieraPreferences0.name());
      
      Preferences preferences0 = MockPreferences.systemRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.childSpi("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal name: empty string
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<[QN;l@L5[");
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      hieraPreferences0.syncSpi();
      String string0 = "HIERA_OVERWRITES";
      hieraPreferences0.getSpi(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      HieraPreferences.Order hieraPreferences_Order0 = HieraPreferences.Order.DEFAULT_PREFS_OVERWRITES;
      HieraPreferencesFactory.setDefaultOrder(hieraPreferences_Order0);
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi("j\"szfMfMU%rT@Tp");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      HieraPreferences.Order hieraPreferences_Order0 = HieraPreferences.Order.DEFAULT_PREFS_OVERWRITES;
      HieraPreferencesFactory.setDefaultOrder(hieraPreferences_Order0);
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      String string0 = "Ur@ix5x";
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi(string0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.putSpi("q-AybtCX+P;t=h>", "q-AybtCX+P;t=h>");
      assertEquals("", hieraPreferences0.name());
      
      hieraPreferences0.getLastException();
      String[] stringArray0 = hieraPreferences0.keysSpi();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Class<Object> class0 = Object.class;
      Preferences preferences0 = MockPreferences.userNodeForPackage(class0);
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.removeNodeSpi();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Node already removed.
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      String string0 = "p";
      hieraPreferences0.removeSpi("p");
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)84;
      byteArray0[0] = byte0;
      hieraPreferences0.putByteArray(string0, byteArray0);
      String string1 = "T^l8xyvF;Rr";
      hieraPreferences0.getSpi(string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      String string0 = null;
      // Undeclared exception!
      try { 
        hieraPreferences0.putSpi("q-AybtCX+P;t=h>", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      String string0 = "|O<]";
      FileSystemHandling.shouldAllThrowIOExceptions();
      hieraPreferences0.putSpi(string0, string0);
      hieraPreferences0.getSpi(string0);
      String string1 = "HIERA_OVERWRITES";
      HieraPreferences.Order.valueOf(string1);
      hieraPreferences0.removeSpi(string1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.putSpi("aX`cO}?K4*", "aX`cO}?K4*");
      hieraPreferences0.removeSpi("pl.wavesoftware.util.preferences.impl.hiera.KeyNotFoundException");
      assertEquals("/", hieraPreferences0.absolutePath());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.removeNodeSpi();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Can't remove the root!
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.sync();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Node has been removed
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.putSpi("aX`cO}?K4*", "aX`cO}?K4*");
      hieraPreferences0.putSpi("q-AybtCX+P;t=h>", "q-AybtCX+P;t=h>");
      assertEquals("/", hieraPreferences0.absolutePath());
      
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi("s{?VeBv|oTg");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi("r");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      hieraPreferences0.childrenNamesSpi();
      hieraPreferences0.removeNodeSpi();
      hieraPreferences0.keysSpi();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences0);
      hieraPreferences0.flush();
      String string0 = "";
      hieraPreferences0.getSpi(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.childSpi((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.putSpi("Hiira error", "");
      hieraPreferences0.putSpi("", "aX`acO}?K*");
      assertEquals("", hieraPreferences0.name());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.removeSpi("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.removeSpi("r<");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      String[] stringArray0 = hieraPreferences0.keys();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      HieraPreferences hieraPreferences1 = new HieraPreferences(hieraPreferences0, "java.util.prefs.FileSystemPreferencesFactory");
      hieraPreferences1.setSystemDefaultPreferences(hieraPreferences0);
      // Undeclared exception!
      try { 
        hieraPreferences1.keysSpi();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      HieraPreferences hieraPreferences1 = null;
      try {
        hieraPreferences1 = new HieraPreferences(hieraPreferences0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      String string0 = "ATbS6)9>jJgW";
      HieraPreferences hieraPreferences1 = new HieraPreferences(hieraPreferences0, "ATbS6)9>jJgW");
      HieraPreferences.Order hieraPreferences_Order0 = HieraPreferences.Order.DEFAULT_PREFS_OVERWRITES;
      HieraPreferencesFactory.setDefaultOrder(hieraPreferences_Order0);
      hieraPreferences0.setSystemDefaultPreferences(hieraPreferences1);
      // Undeclared exception!
      try { 
        hieraPreferences1.get("@m.z}S;'9F}/.9", "@m.z}S;'9F}/.9");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      HieraPreferences.Order hieraPreferences_Order0 = HieraPreferences.Order.DEFAULT_PREFS_OVERWRITES;
      HieraPreferencesFactory.setDefaultOrder(hieraPreferences_Order0);
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi("DEFAULT_PREFS_OVERWRITES");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.syncSpi();
      assertEquals("", hieraPreferences0.name());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.sync();
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi("gyPJpo8Z-G<C");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.getSpi("y#E#~F`,cUWrT=;");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      String string0 = "";
      HieraPreferences.Order hieraPreferences_Order0 = HieraPreferences.Order.HIERA_OVERWRITES;
      HieraPreferencesFactory.setDefaultOrder(hieraPreferences_Order0);
      // Undeclared exception!
      try { 
        hieraPreferences0.getBoolean("", false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/cache/CacheLoader
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      HieraPreferences hieraPreferences1 = null;
      try {
        hieraPreferences1 = new HieraPreferences(hieraPreferences0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal name: empty string
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      BackingStoreException backingStoreException0 = hieraPreferences0.getLastException();
      assertNull(backingStoreException0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.keysSpi();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.putSpi("Fv\"O)[10", "Fv\"O)[10");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.putInt("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences$Order", 120);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.putSpi("aX`cO}?K4*", "aX`cO}?K4*");
      hieraPreferences0.putSpi("q-AybtCX+P;t=h>", "q-AybtCX+P;t=h>");
      // Undeclared exception!
      try { 
        hieraPreferences0.removeNodeSpi();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Can't remove the root!
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.removeNodeSpi();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.childrenNamesSpi();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.putSpi("aX`cO}?K4*", "aX`cO}?K4*");
      hieraPreferences0.putSpi("q-AybtCX+P;t=h>", "q-AybtCX+P;t=h>");
      String[] stringArray0 = hieraPreferences0.childrenNamesSpi();
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.childrenNames();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          HieraPreferences.Order.values();
          HieraPreferences.Order.values();
          HieraPreferences hieraPreferences0 = new HieraPreferences();
          String string0 = " a~";
          PreferenceChangeListener preferenceChangeListener0 = mock(PreferenceChangeListener.class, new ViolatedAssumptionAnswer());
          hieraPreferences0.addPreferenceChangeListener(preferenceChangeListener0);
          HieraPreferences hieraPreferences1 = new HieraPreferences(hieraPreferences0, " a~");
          Class<Object> class0 = Object.class;
          // Undeclared exception!
          try { 
            Preferences.systemNodeForPackage(class0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"preferences\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.prefs/java.util.prefs.Preferences.systemRoot(Preferences.java:471)
             // java.prefs/java.util.prefs.Preferences.systemNodeForPackage(Preferences.java:415)
             // java.base/jdk.internal.reflect.GeneratedMethodAccessor47.invoke(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.base/java.lang.reflect.Method.invoke(Method.java:566)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
             // java.base/java.lang.Thread.run(Thread.java:829)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      Preferences preferences0 = MockPreferences.userRoot();
      hieraPreferences0.setSystemDefaultPreferences(preferences0);
      hieraPreferences0.flushSpi();
      hieraPreferences0.putSpi("", "");
      assertEquals("/", hieraPreferences0.absolutePath());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          HieraPreferences hieraPreferences0 = new HieraPreferences();
          Preferences preferences0 = MockPreferences.userRoot();
          hieraPreferences0.setSystemDefaultPreferences(preferences0);
          hieraPreferences0.putSpi("aX`cO}?K4*", "aX`cO}?K4*");
          hieraPreferences0.putSpi("q-AybtCX+P;t=h>", "q-AybtCX+P;t=h>");
          AbstractPreferences abstractPreferences0 = hieraPreferences0.childSpi("q-AybtCX+P;t=h>");
          assertEquals("q-AybtCX+P;t=h>", abstractPreferences0.name());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      hieraPreferences0.flushSpi();
      assertEquals("/", hieraPreferences0.absolutePath());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      String string0 = "HjKm^";
      hieraPreferences0.flushSpi();
      // Undeclared exception!
      try { 
        hieraPreferences0.childSpi("HjKm^");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HieraPreferences hieraPreferences0 = new HieraPreferences();
      // Undeclared exception!
      try { 
        hieraPreferences0.childSpi("1=+G-ki8^\"W");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported by Hiera.
         //
         verifyException("pl.wavesoftware.util.preferences.impl.hiera.HieraPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          HieraPreferences hieraPreferences0 = new HieraPreferences();
          String string0 = "";
          boolean boolean0 = true;
          // Undeclared exception!
          try { 
            Preferences.userRoot();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"preferences\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.prefs/java.util.prefs.Preferences.userRoot(Preferences.java:455)
             // java.base/jdk.internal.reflect.GeneratedMethodAccessor39.invoke(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.base/java.lang.reflect.Method.invoke(Method.java:566)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
             // java.base/java.lang.Thread.run(Thread.java:829)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
