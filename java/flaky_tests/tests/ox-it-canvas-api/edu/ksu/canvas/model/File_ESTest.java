/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 10:48:24 GMT 2022
 */

package edu.ksu.canvas.model;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ksu.canvas.model.File;
import java.time.Instant;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class File_ESTest extends File_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = new File();
      file0.setUuid("NO/WQ^S;W?9[xec");
      String string0 = file0.getUuid();
      assertEquals("NO/WQ^S;W?9[xec", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = new File();
      file0.setUrl("NIJ]zec)P.:l:");
      String string0 = file0.getUrl();
      assertEquals("NIJ]zec)P.:l:", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = MockInstant.ofEpochSecond(0L, 0L);
      file0.setUpdatedAt(instant0);
      Instant instant1 = file0.getUpdatedAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = MockInstant.ofEpochSecond(0L, 0L);
      file0.setUnlockAt(instant0);
      Instant instant1 = file0.getUnlockAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = new File();
      file0.setThumbnailUrl("P&{GQc");
      String string0 = file0.getThumbnailUrl();
      assertEquals("P&{GQc", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = new File();
      file0.setThumbnailUrl("");
      String string0 = file0.getThumbnailUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = new File();
      Long long0 = new Long(0L);
      file0.setSize(long0);
      Long long1 = file0.getSize();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = new File();
      Long long0 = new Long(3253L);
      file0.setSize(long0);
      Long long1 = file0.getSize();
      assertEquals(3253L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = new File();
      Long long0 = new Long((-1L));
      file0.setSize(long0);
      Long long1 = file0.getSize();
      assertEquals((-1L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = new File();
      file0.setPreviewUrl("");
      String string0 = file0.getPreviewUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = MockInstant.ofEpochMilli(348L);
      file0.setModifiedAt(instant0);
      Instant instant1 = file0.getModifiedAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = new File();
      file0.setMimeClass("c\"LP8<yA?KX`Te*#>+");
      String string0 = file0.getMimeClass();
      assertEquals("c\"LP8<yA?KX`Te*#>+", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = new File();
      file0.setMimeClass("");
      String string0 = file0.getMimeClass();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = new File();
      file0.setMediaEntryId("~");
      String string0 = file0.getMediaEntryId();
      assertEquals("~", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = new File();
      file0.setMediaEntryId("");
      String string0 = file0.getMediaEntryId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = Boolean.TRUE;
      file0.setLockedForUser(boolean0);
      Boolean boolean1 = file0.getLockedForUser();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = Boolean.valueOf(false);
      file0.setLockedForUser(boolean0);
      Boolean boolean1 = file0.getLockedForUser();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = Boolean.valueOf(false);
      file0.setLocked(boolean0);
      Boolean boolean1 = file0.getLocked();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = MockInstant.ofEpochSecond((-1L), (-1L));
      file0.setLockAt(instant0);
      Instant instant1 = file0.getLockAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = new Integer(156);
      file0.setId(integer0);
      Integer integer1 = file0.getId();
      assertEquals(156, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = new Integer((-662));
      file0.setId(integer0);
      Integer integer1 = file0.getId();
      assertEquals((-662), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = Boolean.valueOf(false);
      file0.setHidden(boolean0);
      Boolean boolean1 = file0.getHidden();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = new Integer(0);
      file0.setFolderId(integer0);
      Integer integer1 = file0.getFolderId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = new Integer(1);
      file0.setFolderId(integer0);
      Integer integer1 = file0.getFolderId();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = new Integer((-1));
      file0.setFolderId(integer0);
      Integer integer1 = file0.getFolderId();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      File file0 = new File();
      file0.setFilename("H3#");
      String string0 = file0.getFilename();
      assertEquals("H3#", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      File file0 = new File();
      file0.setFilename("");
      String string0 = file0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      File file0 = new File();
      file0.setDisplayName("nvG|pT]f3%");
      String string0 = file0.getDisplayName();
      assertEquals("nvG|pT]f3%", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      File file0 = new File();
      file0.setDisplayName("");
      String string0 = file0.getDisplayName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = MockInstant.ofEpochMilli((-1L));
      file0.setCreatedAt(instant0);
      Instant instant1 = file0.getCreatedAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = Boolean.TRUE;
      file0.setLocked(boolean0);
      Boolean boolean1 = file0.getLocked();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = file0.getLockAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = file0.getUnlockAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getThumbnailUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getPreviewUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = file0.getLocked();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = file0.getId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = file0.getCreatedAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      File file0 = new File();
      file0.setUuid("");
      String string0 = file0.getUuid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = new Integer(0);
      file0.setId(integer0);
      Integer integer1 = file0.getId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = file0.getModifiedAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      File file0 = new File();
      file0.setPreviewUrl("{R~/]qY,9");
      String string0 = file0.getPreviewUrl();
      assertEquals("{R~/]qY,9", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getDisplayName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = file0.getLockedForUser();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      File file0 = new File();
      Long long0 = file0.getSize();
      file0.setSize(long0);
      assertNull(file0.getUrl());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getMimeClass();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = file0.getHidden();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getMediaEntryId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      File file0 = new File();
      Instant instant0 = file0.getUpdatedAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      File file0 = new File();
      file0.setUrl("");
      String string0 = file0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      File file0 = new File();
      Integer integer0 = file0.getFolderId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      File file0 = new File();
      String string0 = file0.getUuid();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      File file0 = new File();
      Boolean boolean0 = Boolean.valueOf(true);
      file0.setHidden(boolean0);
      Boolean boolean1 = file0.getHidden();
      assertTrue(boolean1);
  }
}
