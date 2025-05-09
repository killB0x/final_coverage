/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:07:14 GMT 2022
 */

package tel.schich.automata.input.source;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tel.schich.automata.input.CharacterStream;
import tel.schich.automata.input.source.CharSequenceSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharSequenceSource_ESTest extends CharSequenceSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      charSequenceSource0.read();
      charBuffer0.put('\u0000');
      try { 
        charSequenceSource0.read();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There are no more characters in this CharSequence!
         //
         verifyException("tel.schich.automata.input.source.CharSequenceSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      charBuffer0.put(charArray0);
      CharacterStream characterStream0 = charSequenceSource0.stream();
      assertFalse(characterStream0.hasNext());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '6';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      char char0 = charSequenceSource0.read();
      assertEquals('6', char0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'C';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      assertFalse(charSequenceSource0.isDepleted());
      
      char char0 = charSequenceSource0.read();
      assertEquals('C', char0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharSequenceSource charSequenceSource0 = new CharSequenceSource((CharSequence) null);
      // Undeclared exception!
      try { 
        charSequenceSource0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tel.schich.automata.input.source.CharSequenceSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(414);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer1);
      charBuffer0.append((CharSequence) charBuffer1);
      // Undeclared exception!
      try { 
        charSequenceSource0.read();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharSequenceSource charSequenceSource0 = new CharSequenceSource((CharSequence) null);
      // Undeclared exception!
      try { 
        charSequenceSource0.isDepleted();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tel.schich.automata.input.source.CharSequenceSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      boolean boolean0 = charSequenceSource0.isDepleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      CharacterStream characterStream0 = charSequenceSource0.stream();
      assertTrue(characterStream0.hasNext());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharSequenceSource charSequenceSource0 = new CharSequenceSource(charBuffer0);
      boolean boolean0 = charSequenceSource0.isDepleted();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharSequenceSource charSequenceSource0 = new CharSequenceSource((CharSequence) null);
      Iterator<Character> iterator0 = charSequenceSource0.iterator();
      assertNotNull(iterator0);
  }
}
