/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 17:31:15 GMT 2022
 */

package io.rocketbase.mail.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.rocketbase.mail.dto.EmailAttachment;
import io.rocketbase.mail.dto.Header;
import io.rocketbase.mail.dto.Message;
import io.rocketbase.mail.dto.TrackLinksType;
import io.rocketbase.mail.util.MessageJsonWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MessageJsonWriter_ESTest extends MessageJsonWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[8];
      MockFile mockFile0 = new MockFile("pf15C{/");
      EmailAttachment emailAttachment0 = new EmailAttachment((String) null, mockFile0);
      emailAttachmentArray0[0] = emailAttachment0;
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeAttachments(mockFileWriter0, false, emailAttachmentArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.nio.file.Files$FileTypeDetectors
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("HtmlOnly");
      messageJsonWriter0.writeComma(mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("C(j)RD9_\"G]z-", true);
      messageJsonWriter0.writeAttachments(mockFileWriter0, true, (EmailAttachment[]) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      boolean boolean0 = messageJsonWriter0.writeString((FileWriter) null, true, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("trackLinks", false);
      boolean boolean0 = messageJsonWriter0.writeBoolean(mockFileWriter0, false, "trackLinks", (Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      Message message0 = new Message("[Defq_%O", "XbkSa;:c6r3", "yJ.H-~=t!50I!ths", "yJ.H-~=t!50I!ths", "g:\"@spQfJ4evR");
      boolean boolean0 = messageJsonWriter0.handleMeta((FileWriter) null, false, message0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      Message message0 = new Message("[Defq_%O", "XbkSa;:c6r3", "yJ.H-~=t!50I!ths", "yJ.H-~=t!50I!ths", "g:\"@spQfJ4evR");
      boolean boolean0 = messageJsonWriter0.handleHeaders((FileWriter) null, false, message0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeString((FileWriter) null, false, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      mockFileWriter0.close();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeString(mockFileWriter0, false, "pf15C{/", "pf15C{/");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeMessageFile(message0, (EmailAttachment[]) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeFileContent((FileWriter) null, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      MockFile mockFile0 = new MockFile("pf15C{/");
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeFileContent(mockFileWriter0, mockFile0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFile mockFile0 = new MockFile("9AE8KU0CG&A", "9AE8KU0CG&A");
      MockFileWriter mockFileWriter0 = new MockFileWriter("9AE8KU0CG&A");
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeFileContent(mockFileWriter0, mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeComma((FileWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter(" x=od_x&F/PfzEyVP`?");
      mockFileWriter0.close();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeComma(mockFileWriter0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      Boolean boolean0 = Boolean.valueOf(", trackLinks=");
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeBoolean((FileWriter) null, true, ".json", boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      MockFileWriter mockFileWriter0 = new MockFileWriter(", from=");
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      mockFileWriter0.close();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeBoolean(mockFileWriter0, false, "", boolean0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[1];
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeAttachments((FileWriter) null, true, emailAttachmentArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFile mockFile0 = new MockFile("tag");
      EmailAttachment emailAttachment0 = new EmailAttachment("tag", mockFile0);
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[1];
      emailAttachmentArray0[0] = emailAttachment0;
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeAttachments(mockFileWriter0, false, emailAttachmentArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/io/JsonStringEncoder
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter(" x=od_x&F/PfzEyVP`?");
      mockFileWriter0.close();
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[8];
      try { 
        messageJsonWriter0.writeAttachments(mockFileWriter0, false, emailAttachmentArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("p`f15C{/");
      MockFile mockFile0 = new MockFile("p`f15C{/", "p`f15C{/");
      EmailAttachment emailAttachment0 = new EmailAttachment((String) null, mockFile0);
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[17];
      emailAttachmentArray0[0] = emailAttachment0;
      try { 
        messageJsonWriter0.writeAttachments(mockFileWriter0, false, emailAttachmentArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("RGw$LBMCWJ!Atx-&^#(");
      // Undeclared exception!
      try { 
        messageJsonWriter0.handleMeta(mockFileWriter0, false, (Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Boolean boolean0 = Boolean.TRUE;
      TrackLinksType trackLinksType0 = TrackLinksType.TEXT_ONLY;
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Message message0 = new Message("9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", "9AE8o1KU0CG&A", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      hashMap0.put("9AE8o1KU0CG&A", "cc");
      // Undeclared exception!
      try { 
        messageJsonWriter0.handleMeta((FileWriter) null, true, message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Boolean boolean0 = Boolean.TRUE;
      MockFileWriter mockFileWriter0 = new MockFileWriter("ContentType");
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_ONLY;
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      mockFileWriter0.close();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Message message0 = new Message("ContentType", "ContentType", "ContentType", "ContentType", "ContentType", "ContentType", "ContentType", "ContentType", "ContentType", "ContentType", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      hashMap0.put("ContentType", "ContentType");
      try { 
        messageJsonWriter0.handleMeta(mockFileWriter0, true, message0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("h6&')FdvpX[7");
      // Undeclared exception!
      try { 
        messageJsonWriter0.handleHeaders(mockFileWriter0, false, (Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      LinkedList<Map<String, String>> linkedList0 = new LinkedList<Map<String, String>>();
      Header header0 = new Header(">nj|", (String) null);
      LinkedList<Header> linkedList1 = new LinkedList<Header>();
      linkedList1.add(header0);
      Boolean boolean0 = Boolean.FALSE;
      TrackLinksType trackLinksType0 = TrackLinksType.TEXT_ONLY;
      HashMap<String, String> hashMap0 = new HashMap<String, String>(1, 1);
      Message message0 = new Message((String) null, "\"Content\": \"", ", trackLinks=", "", "U<X_AMaa$", "", "[XjX#!xX6", "", "", ", trackLinks=", linkedList1, linkedList0, boolean0, trackLinksType0, hashMap0);
      // Undeclared exception!
      try { 
        messageJsonWriter0.handleHeaders((FileWriter) null, true, message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Boolean boolean0 = Boolean.FALSE;
      MockFileWriter mockFileWriter0 = new MockFileWriter("XJr:q]{");
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_AND_TEXT;
      mockFileWriter0.close();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Header header0 = new Header("XJr:q]{", "XJr:q]{");
      linkedList0.add(header0);
      Message message0 = new Message("XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", "XJr:q]{", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      try { 
        messageJsonWriter0.handleHeaders(mockFileWriter0, true, message0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[8];
      MockFile mockFile0 = new MockFile("pf15C{/");
      EmailAttachment emailAttachment0 = new EmailAttachment((String) null, mockFile0);
      emailAttachmentArray0[0] = emailAttachment0;
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeAttachments(mockFileWriter0, true, emailAttachmentArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.nio.file.Files$FileTypeDetectors
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Message message0 = new Message();
      MockFileWriter mockFileWriter0 = new MockFileWriter(", from=");
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      File file0 = messageJsonWriter0.writeMessageFile(message0, (EmailAttachment[]) null);
      messageJsonWriter0.writeFileContent(mockFileWriter0, file0);
      assertEquals("/tmp/message0.json", file0.toString());
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("C(j)RD9_\"G]z-", true);
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = messageJsonWriter0.writeBoolean(mockFileWriter0, true, "io.rocketbase.mail.util.MessageJsonWriter", boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFile mockFile0 = new MockFile("HtmlOnly");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, true);
      Boolean boolean0 = Boolean.valueOf("io.rocketbase.mail.dto.Message$MessageBuilder");
      boolean boolean1 = messageJsonWriter0.writeBoolean(mockFileWriter0, true, (String) null, boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      boolean boolean0 = messageJsonWriter0.writeString((FileWriter) null, false, (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      Boolean boolean0 = Boolean.valueOf("pf15C{/");
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_ONLY;
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Header header0 = new Header();
      linkedList0.add(header0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Message message0 = new Message("YI JM3*)l^y;AQB)DT<", "]", "]", "", "dRm@*>Aw\"b=hg[AqS", " ]rJ2", "dRm@*>Aw\"b=hg[AqS", (String) null, "RP6J", "->Sptp4GeB}", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      hashMap0.put("2Io3IiZv1HUrC", "RP6J");
      boolean boolean1 = messageJsonWriter0.handleMeta(mockFileWriter0, false, message0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      Boolean boolean0 = Boolean.valueOf("pf15C{/");
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_ONLY;
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Header header0 = new Header("", "RP6J");
      linkedList0.add(header0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Message message0 = new Message("YI JM3*)l^y;AQB)DT<", "]", "]", "", "dRm@*>Aw\"b=hg[AqS", " ]rJ2", "dRm@*>Aw\"b=hg[AqS", (String) null, "RP6J", "->Sptp4GeB}", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      hashMap0.put("2Io3IiZv1HUrC", "RP6J");
      // Undeclared exception!
      try { 
        messageJsonWriter0.handleMeta(mockFileWriter0, false, message0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/io/JsonStringEncoder
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Message message0 = new Message();
      Boolean boolean0 = Boolean.FALSE;
      message0.setTrackOpens(boolean0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("TEXT_ONLY", "TEXT_ONLY");
      message0.setMetadata(hashMap0);
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeMessageFile(message0, (EmailAttachment[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[0];
      Message message0 = new Message();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      message0.setMetadata(hashMap0);
      File file0 = messageJsonWriter0.writeMessageFile(message0, emailAttachmentArray0);
      assertEquals("message0.json", file0.getName());
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      Boolean boolean0 = Boolean.valueOf("pf15C{/");
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_ONLY;
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Header header0 = new Header("", "RP6J");
      linkedList0.add(header0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Message message0 = new Message("YI JM3*)l^y;AQB)DT<", "]", "]", "", "dRm@*>Aw\"b=hg[AqS", " ]rJ2", "dRm@*>Aw\"b=hg[AqS", (String) null, "RP6J", "->Sptp4GeB}", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      hashMap0.put("2Io3IiZv1HUrC", "RP6J");
      // Undeclared exception!
      try { 
        messageJsonWriter0.handleHeaders(mockFileWriter0, false, message0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/io/JsonStringEncoder
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      Boolean boolean0 = Boolean.valueOf(true);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      LinkedList<Map<String, String>> linkedList1 = new LinkedList<Map<String, String>>();
      Header header0 = new Header((String) null, "");
      boolean boolean1 = linkedList0.add(header0);
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_ONLY;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Message message0 = new Message("", "'FTG4fd7!/", "2^a2v<=:giSe}W~)", "#Z};C81 `+8b-ljZ5iB", "", "cc", "Header(name=", (String) null, "cc", "{uI:*w", linkedList0, linkedList1, boolean0, trackLinksType0, hashMap0);
      boolean boolean2 = messageJsonWriter0.handleHeaders(mockFileWriter0, true, message0);
      assertTrue(boolean2 == boolean1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      Message message0 = new Message();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      message0.setHeaders(linkedList0);
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[0];
      File file0 = messageJsonWriter0.writeMessageFile(message0, emailAttachmentArray0);
      assertEquals("/tmp/message0.json", file0.toString());
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFile mockFile0 = new MockFile("G:[V-]Do1");
      EmailAttachment emailAttachment0 = new EmailAttachment((String) null, mockFile0);
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[4];
      emailAttachmentArray0[0] = emailAttachment0;
      Message message0 = new Message();
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeMessageFile(message0, emailAttachmentArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[0];
      Message message0 = new Message();
      TrackLinksType trackLinksType0 = TrackLinksType.HTML_AND_TEXT;
      message0.setTrackLinks(trackLinksType0);
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeMessageFile(message0, emailAttachmentArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/io/JsonStringEncoder
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      Message message0 = new Message();
      File file0 = messageJsonWriter0.writeMessageFile(message0, (EmailAttachment[]) null);
      MockFileWriter mockFileWriter0 = new MockFileWriter(file0);
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeString(mockFileWriter0, true, "GkzKz|F5$u;V\u0005C(UWg", "\": \"");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/io/JsonStringEncoder
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MessageJsonWriter messageJsonWriter0 = new MessageJsonWriter();
      MockFileWriter mockFileWriter0 = new MockFileWriter("pf15C{/");
      EmailAttachment[] emailAttachmentArray0 = new EmailAttachment[8];
      // Undeclared exception!
      try { 
        messageJsonWriter0.writeAttachments(mockFileWriter0, true, emailAttachmentArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.rocketbase.mail.util.MessageJsonWriter", e);
      }
  }
}
