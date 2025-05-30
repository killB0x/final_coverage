/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:14:36 GMT 2022
 */

package io.github.rcarlosdasilva.kits.convert.primitive;

import org.junit.Test;
import static org.junit.Assert.*;
import io.github.rcarlosdasilva.kits.convert.primitive.CharacterConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharacterConverter_ESTest extends CharacterConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Character character0 = Character.valueOf('6');
      Character character1 = characterConverter0.convert((Object) character0, character0);
      assertEquals('6', (char)character1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Character character0 = Character.valueOf('6');
      Character character1 = characterConverter0.convert((Object) character0);
      assertEquals('6', (char)character1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Character character0 = characterConverter0.convert((Object) null);
      assertEquals(' ', (char)character0);
      
      Object object0 = new Object();
      Character character1 = characterConverter0.convert(object0, character0);
      assertEquals('j', (char)character1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Character character0 = characterConverter0.convert((Object) null);
      Character character1 = characterConverter0.convert((Object) character0, character0);
      assertEquals(' ', (char)character1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Character character0 = characterConverter0.convert((Object) characterConverter0);
      Character character1 = characterConverter0.convert((Object) character0);
      assertEquals('i', (char)character1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Character character0 = characterConverter0.convert((Object) null, (Character) null);
      assertNull(character0);
  }
}
