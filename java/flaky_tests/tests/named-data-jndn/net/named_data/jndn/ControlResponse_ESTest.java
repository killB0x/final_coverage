/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:32:43 GMT 2022
 */

package net.named_data.jndn;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import net.named_data.jndn.ControlParameters;
import net.named_data.jndn.ControlResponse;
import net.named_data.jndn.Data;
import net.named_data.jndn.DelegationSet;
import net.named_data.jndn.encoding.WireFormat;
import net.named_data.jndn.util.Blob;
import net.named_data.jndn.util.SignedBlob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ControlResponse_ESTest extends ControlResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      controlResponse0.setStatusCode(877);
      WireFormat wireFormat0 = WireFormat.getDefaultWireFormat();
      controlResponse0.wireEncode(wireFormat0);
      assertEquals(877, controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      controlResponse0.setStatusCode(0);
      controlResponse0.setStatusText("Ns!nXCe#w");
      assertEquals("Ns!nXCe#w", controlResponse0.getStatusText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      controlResponse0.setStatusCode(45);
      controlResponse0.setStatusText("qWwby5s{w48$\" 7");
      assertEquals(45, controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      controlResponse0.setStatusCode((-656));
      assertEquals((-656), controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      assertEquals((-1), controlResponse0.getStatusCode());
      
      controlResponse0.setStatusCode(0);
      controlResponse0.setBodyAsControlParameters((ControlParameters) null);
      assertEquals(0, controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlParameters controlParameters0 = new ControlParameters();
      controlResponse0.setStatusCode(835);
      controlResponse0.setBodyAsControlParameters(controlParameters0);
      assertEquals(835, controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlResponse controlResponse1 = controlResponse0.setStatusText("encodeData is not impleented");
      String string0 = controlResponse1.getStatusText();
      assertEquals("encodeData is not impleented", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlResponse controlResponse1 = controlResponse0.setStatusCode(122);
      int int0 = controlResponse1.getStatusCode();
      assertEquals(122, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlParameters controlParameters0 = new ControlParameters();
      ControlResponse controlResponse1 = controlResponse0.setBodyAsControlParameters(controlParameters0);
      controlResponse1.getBodyAsControlParameters();
      assertEquals((-1), controlResponse1.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = new WireFormat();
      // Undeclared exception!
      try { 
        controlResponse0.wireEncode(wireFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // encodeControlResponse is not implemented
         //
         verifyException("net.named_data.jndn.encoding.WireFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = WireFormat.getDefaultWireFormat();
      // Undeclared exception!
      try { 
        controlResponse0.wireEncode(wireFormat0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // TLV integer value may not be negative
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = new WireFormat();
      WireFormat.setDefaultWireFormat(wireFormat0);
      // Undeclared exception!
      try { 
        controlResponse0.wireEncode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // encodeControlResponse is not implemented
         //
         verifyException("net.named_data.jndn.encoding.WireFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      // Undeclared exception!
      try { 
        controlResponse0.wireEncode();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // TLV integer value may not be negative
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = WireFormat.getDefaultWireFormat();
      DelegationSet delegationSet0 = new DelegationSet();
      Blob blob0 = wireFormat0.encodeDelegationSet(delegationSet0);
      try { 
        controlResponse0.wireDecode(blob0, wireFormat0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Read past the end of the input
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      Blob blob0 = new Blob();
      WireFormat wireFormat0 = new WireFormat();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode(blob0, wireFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // decodeControlResponse is not implemented
         //
         verifyException("net.named_data.jndn.encoding.WireFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      Blob blob0 = new Blob();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode(blob0, (WireFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.ControlResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      Data data0 = new Data();
      SignedBlob signedBlob0 = data0.wireEncode();
      try { 
        controlResponse0.wireDecode((Blob) signedBlob0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Did not get the expected TLV type
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = new WireFormat();
      WireFormat.setDefaultWireFormat(wireFormat0);
      Blob blob0 = new Blob();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode(blob0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // decodeControlResponse is not implemented
         //
         verifyException("net.named_data.jndn.encoding.WireFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      Blob blob0 = new Blob();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode(blob0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(725);
      WireFormat wireFormat0 = WireFormat.getDefaultWireFormat();
      try { 
        controlResponse0.wireDecode(byteBuffer0, wireFormat0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Did not get the expected TLV type
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode((ByteBuffer) null, (WireFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.ControlResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = new WireFormat();
      WireFormat.setDefaultWireFormat(wireFormat0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode(byteBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // decodeControlResponse is not implemented
         //
         verifyException("net.named_data.jndn.encoding.WireFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ControlResponse controlResponse0 = null;
      try {
        controlResponse0 = new ControlResponse((ControlResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.ControlResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      controlResponse0.getStatusText();
      assertEquals((-1), controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      // Undeclared exception!
      try { 
        controlResponse0.wireEncode((WireFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.ControlResponse", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      controlResponse0.getBodyAsControlParameters();
      assertEquals((-1), controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      WireFormat wireFormat0 = new WireFormat();
      // Undeclared exception!
      try { 
        controlResponse0.wireDecode((ByteBuffer) null, wireFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // decodeControlResponse is not implemented
         //
         verifyException("net.named_data.jndn.encoding.WireFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlResponse controlResponse1 = controlResponse0.setStatusText((String) null);
      assertEquals((-1), controlResponse1.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlResponse controlResponse1 = new ControlResponse(controlResponse0);
      assertEquals((-1), controlResponse1.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ControlParameters controlParameters0 = new ControlParameters();
      controlResponse0.setBodyAsControlParameters(controlParameters0);
      ControlResponse controlResponse1 = new ControlResponse(controlResponse0);
      assertEquals((-1), controlResponse1.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      assertEquals((-1), controlResponse0.getStatusCode());
      
      ControlResponse controlResponse1 = controlResponse0.setStatusCode(1);
      Blob blob0 = controlResponse0.wireEncode();
      controlResponse1.wireDecode(blob0);
      assertEquals(1, controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      assertEquals((-1), controlResponse0.getStatusCode());
      
      controlResponse0.setStatusCode(1);
      Blob blob0 = controlResponse0.wireEncode();
      WireFormat wireFormat0 = WireFormat.getDefaultWireFormat();
      controlResponse0.wireDecode(blob0, wireFormat0);
      assertEquals(1, controlResponse0.getStatusCode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      try { 
        controlResponse0.wireDecode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Read past the end of the input
         //
         verifyException("net.named_data.jndn.encoding.tlv.TlvDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      assertEquals((-1), controlResponse0.getStatusCode());
      
      controlResponse0.setStatusCode(0);
      int int0 = controlResponse0.getStatusCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ControlResponse controlResponse0 = new ControlResponse();
      int int0 = controlResponse0.getStatusCode();
      assertEquals((-1), int0);
  }
}
