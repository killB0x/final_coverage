/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 17:50:55 GMT 2022
 */

package tel.schich.automata.input;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tel.schich.automata.input.CharBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharBuffer_ESTest extends CharBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('T');
      charBuffer0.advance();
      charBuffer0.checkpoint();
      CharBuffer.Checkpoint charBuffer_Checkpoint0 = charBuffer0.checkpoint();
      charBuffer_Checkpoint0.restore();
      assertFalse(charBuffer0.isEmpty());
      assertEquals(0, charBuffer0.readable());
      assertFalse(charBuffer0.hasReadableElements());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('(');
      charBuffer0.advance();
      boolean boolean0 = charBuffer0.hasReadableElements();
      assertEquals(1, charBuffer0.size());
      assertEquals(0, charBuffer0.readable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('T');
      charBuffer0.offer('q');
      char char0 = charBuffer0.peekAhead(1);
      assertEquals(2, charBuffer0.size());
      assertEquals('q', char0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('T');
      charBuffer0.offer('T');
      charBuffer0.advance();
      assertEquals(2, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('T');
      charBuffer0.advance();
      CharBuffer.Checkpoint charBuffer_Checkpoint0 = charBuffer0.checkpoint();
      charBuffer_Checkpoint0.jumpBack();
      assertEquals(0, charBuffer0.readable());
      assertFalse(charBuffer0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer(']');
      charBuffer0.advance();
      CharBuffer.Checkpoint charBuffer_Checkpoint0 = charBuffer0.checkpoint();
      charBuffer_Checkpoint0.drop();
      assertEquals(0, charBuffer0.readable());
      assertFalse(charBuffer0.isEmpty());
      assertFalse(charBuffer0.hasReadableElements());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      assertTrue(charBuffer0.isEmpty());
      
      charBuffer0.offer('T');
      int int0 = charBuffer0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('(');
      charBuffer0.advance();
      int int0 = charBuffer0.readable();
      assertEquals(1, charBuffer0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('z');
      charBuffer0.advance();
      charBuffer0.offer('T');
      int int0 = charBuffer0.readable();
      assertEquals(2, charBuffer0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      assertTrue(charBuffer0.isEmpty());
      
      charBuffer0.offer('(');
      char char0 = charBuffer0.peekAhead((-4284));
      assertEquals(1, charBuffer0.size());
      assertEquals('(', char0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      assertTrue(charBuffer0.isEmpty());
      
      charBuffer0.offer('3');
      char char0 = charBuffer0.peekAhead((-4284));
      assertEquals(1, charBuffer0.size());
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('(');
      charBuffer0.advance();
      char char0 = charBuffer0.current();
      assertFalse(charBuffer0.isEmpty());
      assertEquals(0, charBuffer0.readable());
      assertEquals('(', char0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('4');
      charBuffer0.advance();
      char char0 = charBuffer0.current();
      assertEquals(1, charBuffer0.size());
      assertEquals(0, charBuffer0.readable());
      assertEquals('4', char0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('z');
      charBuffer0.advance();
      char char0 = charBuffer0.current();
      assertEquals(0, charBuffer0.readable());
      assertEquals(1, charBuffer0.size());
      assertEquals('z', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      // Undeclared exception!
      try { 
        charBuffer0.removeLast();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The queue is empty!
         //
         verifyException("tel.schich.automata.input.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      // Undeclared exception!
      try { 
        charBuffer0.peekAhead(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tel.schich.automata.input.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('@');
      // Undeclared exception!
      try { 
        charBuffer0.current();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tel.schich.automata.input.CharBuffer$Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      // Undeclared exception!
      try { 
        charBuffer0.advance();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The queue is empty!
         //
         verifyException("tel.schich.automata.input.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('e');
      charBuffer0.offer('e');
      charBuffer0.removeLast();
      assertEquals(1, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      int int0 = charBuffer0.readable();
      assertEquals((-1), int0);
      assertEquals(0, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      int int0 = charBuffer0.size();
      assertEquals(0, int0);
      assertEquals((-1), charBuffer0.readable());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('^');
      charBuffer0.advance();
      charBuffer0.checkpoint();
      charBuffer0.offer('^');
      charBuffer0.toString();
      assertTrue(charBuffer0.hasReadableElements());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('T');
      charBuffer0.advance();
      charBuffer0.offer('T');
      charBuffer0.toString();
      assertEquals(2, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('T');
      charBuffer0.offer('T');
      charBuffer0.toString();
      assertEquals(2, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      String string0 = charBuffer0.toString();
      assertEquals("[]", string0);
      assertTrue(charBuffer0.isEmpty());
      assertEquals((-1), charBuffer0.readable());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      assertEquals(0, charBuffer0.size());
      
      charBuffer0.offer('T');
      boolean boolean0 = charBuffer0.isEmpty();
      assertEquals(1, charBuffer0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('F');
      charBuffer0.advance();
      charBuffer0.offer('F');
      boolean boolean0 = charBuffer0.hasReadableElements();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      assertTrue(charBuffer0.isEmpty());
      
      charBuffer0.offer('e');
      charBuffer0.removeLast();
      assertEquals(1, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('N');
      charBuffer0.offer('N');
      // Undeclared exception!
      try { 
        charBuffer0.peekAhead('N');
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // The n was to big, reached the end of the buffered input
         //
         verifyException("tel.schich.automata.input.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('p');
      charBuffer0.advance();
      // Undeclared exception!
      try { 
        charBuffer0.advance();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Nothing to advance to!
         //
         verifyException("tel.schich.automata.input.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('&');
      charBuffer0.advance();
      charBuffer0.checkpoint();
      charBuffer0.offer('&');
      charBuffer0.advance();
      assertEquals(2, charBuffer0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      charBuffer0.offer('f');
      charBuffer0.advance();
      charBuffer0.offer('f');
      charBuffer0.offer('f');
      charBuffer0.advance();
      assertTrue(charBuffer0.hasReadableElements());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      boolean boolean0 = charBuffer0.isEmpty();
      assertEquals((-1), charBuffer0.readable());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      // Undeclared exception!
      try { 
        charBuffer0.checkpoint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tel.schich.automata.input.CharBuffer$Checkpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      // Undeclared exception!
      try { 
        charBuffer0.current();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The queue is empty!
         //
         verifyException("tel.schich.automata.input.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharBuffer charBuffer0 = new CharBuffer();
      boolean boolean0 = charBuffer0.hasReadableElements();
      assertFalse(boolean0);
      assertEquals((-1), charBuffer0.readable());
      assertEquals(0, charBuffer0.size());
  }
}
