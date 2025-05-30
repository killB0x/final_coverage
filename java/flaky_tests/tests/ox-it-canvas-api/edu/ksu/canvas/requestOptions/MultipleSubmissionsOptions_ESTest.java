/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 11:12:57 GMT 2022
 */

package edu.ksu.canvas.requestOptions;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultipleSubmissionsOptions_ESTest extends MultipleSubmissionsOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("/-/u^*f", (Integer) null, hashMap0);
      Boolean boolean0 = Boolean.TRUE;
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.createStudentSubmissionOption("/-/u^*f", "", boolean0, (Boolean) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", "uz");
      assertEquals("/-/u^*f", multipleSubmissionsOptions_StudentSubmissionOption0.getTextComment());
      assertEquals("", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertEquals("uz", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentType());
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer((-2479));
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("ps o", integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Map<String, MultipleSubmissionsOptions.StudentSubmissionOption> map0 = multipleSubmissionsOptions0.getStudentSubmissionOptionMap();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", integer0, hashMap0);
      Boolean boolean0 = Boolean.FALSE;
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions$StudentSubmissionOption", (String) null, boolean0, (Boolean) null, "", "edu.ksu.canvas.requestOptions.BaseOptions");
      hashMap0.put("", multipleSubmissionsOptions_StudentSubmissionOption0);
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions$StudentSubmissionOption", multipleSubmissionsOptions_StudentSubmissionOption0.getTextComment());
      assertEquals("edu.ksu.canvas.requestOptions.BaseOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentType());
      assertEquals("", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
      
      Map<String, MultipleSubmissionsOptions.StudentSubmissionOption> map0 = multipleSubmissionsOptions0.getStudentSubmissionOptionMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("/-/u^*f", (Integer) null, hashMap0);
      String string0 = multipleSubmissionsOptions0.getObjectId();
      assertEquals("/-/u^*f", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(136);
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", integer0, hashMap0);
      String string0 = multipleSubmissionsOptions0.getObjectId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(136);
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", integer0, hashMap0);
      Integer integer1 = multipleSubmissionsOptions0.getAssignmentId();
      assertEquals(136, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("/-/u^*f", (Integer) null, hashMap0);
      Integer integer0 = multipleSubmissionsOptions0.getAssignmentId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-1821));
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Integer integer1 = multipleSubmissionsOptions0.getAssignmentId();
      assertEquals((-1821), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      multipleSubmissionsOptions_StudentSubmissionOption0.setTextComment("");
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertEquals("+M;aTI4udmWRG", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("xX%FDvn+", (Integer) null, hashMap0);
      Boolean boolean0 = Boolean.valueOf(false);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.createStudentSubmissionOption("", "", boolean0, boolean0, "xX%FDvn+", "xX%FDvn+");
      multipleSubmissionsOptions_StudentSubmissionOption0.getGroupComment();
      assertEquals("", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertEquals("", multipleSubmissionsOptions_StudentSubmissionOption0.getTextComment());
      assertEquals("xX%FDvn+", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentType());
      assertEquals("xX%FDvn+", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("p", integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.TRUE;
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.createStudentSubmissionOption("?U7fPnx", "p", boolean0, boolean0, (String) null, (String) null);
      multipleSubmissionsOptions_StudentSubmissionOption0.getExcuse();
      assertEquals("p", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertEquals("?U7fPnx", multipleSubmissionsOptions_StudentSubmissionOption0.getTextComment());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", (Integer) null, hashMap0);
      Boolean boolean0 = Boolean.valueOf("");
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption("", "", boolean0, boolean0, "3cs15+%De.7eV[{", "");
      assertEquals("3cs15+%De.7eV[{", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
      
      multipleSubmissionsOptions_StudentSubmissionOption0.setMediaCommentId("");
      assertEquals("", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      multipleSubmissionsOptions_StudentSubmissionOption0.setMediaCommentType("");
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertEquals("+M;aTI4udmWRG", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      multipleSubmissionsOptions_StudentSubmissionOption0.setGroupComment(boolean0);
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertEquals("+M;aTI4udmWRG", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      multipleSubmissionsOptions_StudentSubmissionOption0.setExcuse(boolean0);
      assertEquals("+M;aTI4udmWRG", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      String string0 = multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId();
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      assertNotNull(string0);
      assertEquals("+M;aTI4udmWRG", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("p", integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.TRUE;
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.createStudentSubmissionOption("?U7fPnx", "p", boolean0, boolean0, (String) null, (String) null);
      String string0 = multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade();
      assertEquals("p", string0);
      assertNotNull(string0);
      assertEquals("?U7fPnx", multipleSubmissionsOptions_StudentSubmissionOption0.getTextComment());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
      
      multipleSubmissionsOptions_StudentSubmissionOption0.setPostedGrade("bkx $p0PNkt,)");
      assertEquals("+M;aTI4udmWRG", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      Boolean boolean0 = Boolean.valueOf(true);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.new StudentSubmissionOption((String) null, "edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", boolean0, boolean0, "+M;aTI4udmWRG", (String) null);
      String string0 = multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentType();
      assertNull(string0);
      assertEquals("+M;aTI4udmWRG", multipleSubmissionsOptions_StudentSubmissionOption0.getMediaCommentId());
      assertEquals("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions", multipleSubmissionsOptions_StudentSubmissionOption0.getPostedGrade());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", integer0, hashMap0);
      Integer integer1 = multipleSubmissionsOptions0.getAssignmentId();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", (Integer) null, hashMap0);
      multipleSubmissionsOptions0.setObjectId("");
      assertNull(multipleSubmissionsOptions0.getAssignmentId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("6aGR`C9E^%Dz;_IUC]", (Integer) null, hashMap0);
      multipleSubmissionsOptions0.setStudentSubmissionOptionMap(hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      multipleSubmissionsOptions0.setAssignmentId(integer0);
      assertNull(multipleSubmissionsOptions0.getObjectId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions((String) null, integer0, (Map<String, MultipleSubmissionsOptions.StudentSubmissionOption>) null);
      String string0 = multipleSubmissionsOptions0.getObjectId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("", (Integer) null, hashMap0);
      Boolean boolean0 = Boolean.valueOf(false);
      MultipleSubmissionsOptions.StudentSubmissionOption multipleSubmissionsOptions_StudentSubmissionOption0 = multipleSubmissionsOptions0.createStudentSubmissionOption("", "", boolean0, boolean0, "", "");
      String string0 = multipleSubmissionsOptions_StudentSubmissionOption0.getTextComment();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption> hashMap0 = new HashMap<String, MultipleSubmissionsOptions.StudentSubmissionOption>();
      MultipleSubmissionsOptions multipleSubmissionsOptions0 = new MultipleSubmissionsOptions("edu.ksu.canvas.requestOptions.MultipleSubmissionsOptions$StudentSubmissionOption", (Integer) null, hashMap0);
      Map<String, MultipleSubmissionsOptions.StudentSubmissionOption> map0 = multipleSubmissionsOptions0.getStudentSubmissionOptionMap();
      assertEquals(0, map0.size());
  }
}
