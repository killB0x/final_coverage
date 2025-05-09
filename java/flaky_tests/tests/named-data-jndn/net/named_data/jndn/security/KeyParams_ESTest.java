/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:38:25 GMT 2022
 */

package net.named_data.jndn.security;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.named_data.jndn.ComponentType;
import net.named_data.jndn.Name;
import net.named_data.jndn.security.KeyIdType;
import net.named_data.jndn.security.KeyParams;
import net.named_data.jndn.security.KeyType;
import net.named_data.jndn.util.Blob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KeyParams_ESTest extends KeyParams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Name.Component name_Component0 = Name.Component.fromNumberWithMarker(256L, 1);
      KeyParams keyParams0 = new KeyParams((KeyType) null, name_Component0);
      keyParams0.getKeyType();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyType keyType0 = KeyType.EC;
      Name.Component name_Component0 = Name.Component.fromNumber((-569L));
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      KeyType keyType1 = keyParams0.getKeyType();
      assertEquals(KeyType.EC, keyType1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyParams keyParams0 = new KeyParams((KeyType) null, (KeyIdType) null);
      keyParams0.getKeyIdType();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyType keyType0 = KeyType.RSA;
      byte[] byteArray0 = new byte[3];
      Name.Component name_Component0 = new Name.Component(byteArray0);
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      keyParams0.setKeyId((Name.Component) null);
      Name.Component name_Component1 = keyParams0.getKeyId();
      assertNull(name_Component1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ComponentType componentType0 = ComponentType.PARAMETERS_SHA256_DIGEST;
      Name.Component name_Component0 = new Name.Component(byteArray0, componentType0, (-650));
      KeyType keyType0 = KeyType.RSA;
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      Name.Component name_Component1 = keyParams0.getKeyId();
      assertTrue(name_Component1.isParametersSha256Digest());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyType keyType0 = KeyType.AES;
      KeyIdType keyIdType0 = KeyIdType.RANDOM;
      KeyParams keyParams0 = new KeyParams(keyType0, keyIdType0);
      ComponentType componentType0 = ComponentType.IMPLICIT_SHA256_DIGEST;
      Name.Component name_Component0 = Name.Component.fromNumber((-1570L), componentType0);
      keyParams0.setKeyId(name_Component0);
      Name.Component name_Component1 = keyParams0.getKeyId();
      assertFalse(name_Component1.isGeneric());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyType keyType0 = KeyType.EC;
      int[] intArray0 = new int[1];
      Blob blob0 = new Blob(intArray0);
      ComponentType componentType0 = ComponentType.OTHER_CODE;
      Name.Component name_Component0 = new Name.Component(blob0, componentType0, (byte)0);
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      Name.Component name_Component1 = keyParams0.getKeyId();
      assertEquals(ComponentType.OTHER_CODE, name_Component1.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyType keyType0 = KeyType.EC;
      KeyParams keyParams0 = null;
      try {
        keyParams0 = new KeyParams(keyType0, (Name.Component) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.security.KeyParams", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Name.Component name_Component0 = new Name.Component();
      KeyType keyType0 = KeyType.AES;
      KeyParams keyParams0 = null;
      try {
        keyParams0 = new KeyParams(keyType0, name_Component0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // KeyParams: keyId is empty
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyType keyType0 = KeyType.RSA;
      KeyIdType keyIdType0 = KeyIdType.USER_SPECIFIED;
      KeyParams keyParams0 = null;
      try {
        keyParams0 = new KeyParams(keyType0, keyIdType0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // KeyParams: KeyIdType is USER_SPECIFIED
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyType keyType0 = KeyType.EC;
      KeyIdType keyIdType0 = KeyIdType.SHA256;
      KeyParams keyParams0 = new KeyParams(keyType0, keyIdType0);
      ComponentType componentType0 = ComponentType.OTHER_CODE;
      Name.Component name_Component0 = Name.Component.fromNumber(1305L, componentType0, 3);
      keyParams0.setKeyId(name_Component0);
      Name.Component name_Component1 = keyParams0.getKeyId();
      assertEquals(ComponentType.OTHER_CODE, name_Component1.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyType keyType0 = KeyType.RSA;
      byte[] byteArray0 = new byte[3];
      Name.Component name_Component0 = new Name.Component(byteArray0);
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      KeyIdType keyIdType0 = keyParams0.getKeyIdType();
      assertEquals(KeyIdType.USER_SPECIFIED, keyIdType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyType keyType0 = KeyType.RSA;
      byte[] byteArray0 = new byte[3];
      Name.Component name_Component0 = new Name.Component(byteArray0);
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      KeyType keyType1 = keyParams0.getKeyType();
      assertSame(keyType1, keyType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyType keyType0 = KeyType.RSA;
      byte[] byteArray0 = new byte[3];
      Name.Component name_Component0 = new Name.Component(byteArray0);
      KeyParams keyParams0 = new KeyParams(keyType0, name_Component0);
      Name.Component name_Component1 = keyParams0.getKeyId();
      assertTrue(name_Component1.isGeneric());
  }
}
