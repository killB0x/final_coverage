/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 11:11:20 GMT 2022
 */

package org.scale7.networking.security;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.scale7.networking.security.WSSEUsernameToken;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WSSEUsernameToken_ESTest extends WSSEUsernameToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        WSSEUsernameToken.authenticateUsernameToken(".{,_*,,K%P", "-!88O", (-678), (-678));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.getUsernameFromToken(".B{,_*,,K%P");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WSSEUsernameToken.getUsernameFromToken("{N,,*,,%");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, (-1511), (int) (byte) (-109));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, 0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, 0, 1363);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      MockDate mockDate0 = new MockDate(1852, 25, 1852, (-1), (-1), 0);
      wSSEUsernameToken0._created = (Date) mockDate0;
      mockDate0.setTime(0);
      boolean boolean0 = wSSEUsernameToken0.isTimestampValid(2436, 2436);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1392409284279L);
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, 2959, 2959);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      // Undeclared exception!
      try { 
        wSSEUsernameToken0.isTimestampValid(1920, 1924);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      boolean boolean0 = wSSEUsernameToken0.parseFrom(".{,_*,,K%P");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      boolean boolean0 = wSSEUsernameToken0.parseFrom("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      MockDate mockDate0 = new MockDate(1852, 25, 1852, (-1), (-1), 0);
      wSSEUsernameToken0._created = (Date) mockDate0;
      boolean boolean0 = wSSEUsernameToken0.isTimestampValid(2436, 2436);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      wSSEUsernameToken0.setUsername("$+V!VP{O](}9&6");
      String string0 = wSSEUsernameToken0.getUsername();
      assertEquals("$+V!VP{O](}9&6", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      MockDate mockDate0 = new MockDate();
      wSSEUsernameToken0.setCreated(mockDate0);
      Date date0 = wSSEUsernameToken0.getCreated();
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      // Undeclared exception!
      try { 
        wSSEUsernameToken0.parseFrom((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.isValidUsername((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.isTimestampValid((Date) null, (-2769), (-2769));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      wSSEUsernameToken0._nonce = "";
      MockDate mockDate0 = new MockDate((-1L));
      wSSEUsernameToken0.setCreated(mockDate0);
      // Undeclared exception!
      try { 
        wSSEUsernameToken0.isSignatureValid("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.getUsernameFromToken((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3509), 8, 8);
      // Undeclared exception!
      try { 
        WSSEUsernameToken.generateUsernameTokenHash("", mockDate0, "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        WSSEUsernameToken.generateUsernameToken("\", PasswordDigest=\"", "\", PasswordDigest=\"", mockDate0, "\", PasswordDigest=\"");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.generatePasswordHash("\", PasswoPrdDigest=\"");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        WSSEUsernameToken.authenticateUsernameToken((String) null, (String) null, (-568), (-568));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Boolean boolean0 = WSSEUsernameToken.isValidUsername("\u0000");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Boolean boolean0 = WSSEUsernameToken.isValidUsername("Wn( Tn6=16");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, 1941, 1941);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.base64Encode((byte[]) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        WSSEUsernameToken.generateUsernameTokenHash("", (Date) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        WSSEUsernameToken.generateUsernameToken("\u0000", "\u0000", mockDate0, "\u0000");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1392409284275L);
      try { 
        WSSEUsernameToken.generateUsernameToken("81yjWWawE", (String) null, mockDate0, "{`5Z=YDM$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = WSSEUsernameToken.authenticateUsernameToken("\", PasswoPrdDigest=\"", "\", PasswoPrdDigest=\"", (-11), (-11));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      try { 
        WSSEUsernameToken.authenticateUsernameToken("Q_,,,K_BTP", "Q_,,,K_BTP", (-2145970241), (-2145970241));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WSSEUsernameToken.getUsernameFromToken("G2R2k!#A, ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.getUsernameFromToken(",_*,,K%P");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2959, 2959, 2959, 2959, 2959);
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, 2959, 2959);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1392409284275L);
      boolean boolean0 = WSSEUsernameToken.isTimestampValid((Date) mockDate0, (-2120640133), 2145255967);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      wSSEUsernameToken0._created = null;
      MockDate mockDate0 = new MockDate();
      wSSEUsernameToken0._created = (Date) mockDate0;
      boolean boolean0 = wSSEUsernameToken0.isTimestampValid(1142, 1142);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      boolean boolean0 = wSSEUsernameToken0.parseFrom("n,/,,Z4-,K<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      boolean boolean0 = wSSEUsernameToken0.parseFrom(",_*,,K%P");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        WSSEUsernameToken.generateNonce();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      Date date0 = wSSEUsernameToken0.getCreated();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      String string0 = wSSEUsernameToken0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        WSSEUsernameToken.generatePasswordHash((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.scale7.networking.security.WSSEUsernameToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      wSSEUsernameToken0.setUsername("");
      String string0 = wSSEUsernameToken0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      WSSEUsernameToken wSSEUsernameToken0 = new WSSEUsernameToken();
      boolean boolean0 = wSSEUsernameToken0.isSignatureValid("");
      assertFalse(boolean0);
  }
}
