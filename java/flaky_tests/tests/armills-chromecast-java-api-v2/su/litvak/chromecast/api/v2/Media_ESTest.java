/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 27 19:18:54 GMT 2022
 */

package su.litvak.chromecast.api.v2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import su.litvak.chromecast.api.v2.Media;
import su.litvak.chromecast.api.v2.Track;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Media_ESTest extends Media_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("metadataType", object0);
      Media media0 = new Media("2Waem", "studio", (Double) null, (Media.StreamType) null, (Map<String, Object>) null, hashMap0, (Map<String, Object>) null, (List<Track>) null);
      // Undeclared exception!
      try { 
        media0.getMetadataType();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')
         //
         verifyException("su.litvak.chromecast.api.v2.Media", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Media.StreamType media_StreamType0 = Media.StreamType.NONE;
      Media media0 = new Media("TEXT", "studio", (Double) null, media_StreamType0);
      Double double0 = new Double(0.0);
      Media media1 = new Media("title", "1J-", double0, media_StreamType0);
      boolean boolean0 = media0.equals(media1);
      assertFalse(boolean0);
      assertFalse(media1.equals((Object)media0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double double0 = new Double((-143.727523384218));
      Media.StreamType media_StreamType0 = Media.StreamType.NONE;
      Media media0 = new Media("albumName", "albumName", double0, media_StreamType0);
      Media media1 = new Media("broadcastDate", "trackNumber", double0, media0.streamType, (Map<String, Object>) null, (Map<String, Object>) null, (Map<String, Object>) null, (List<Track>) null);
      boolean boolean0 = media1.equals(media0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Media.StreamType media_StreamType0 = Media.StreamType.LIVE;
      Media media0 = new Media("trackNumber", "episodeNumber", (Double) null, media_StreamType0, (Map<String, Object>) null, (Map<String, Object>) null, (Map<String, Object>) null, (List<Track>) null);
      Media media1 = new Media("artist", "%\u0006(|i<,|F}5e(+;0?", (Double) null, media_StreamType0, (Map<String, Object>) null, (Map<String, Object>) null, (Map<String, Object>) null, (List<Track>) null);
      boolean boolean0 = media1.equals(media0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Media media0 = new Media("Kn^lZ[6", "Kn^lZ[6");
      Media.StreamType media_StreamType0 = Media.StreamType.live;
      Media media1 = new Media("$VALUES", "Kn^lZ[6", (Double) null, media_StreamType0);
      boolean boolean0 = media0.equals(media1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Media media0 = new Media("Kn^lZ[6", "Kn^lZ[6");
      Media.StreamType media_StreamType0 = Media.StreamType.live;
      Media media1 = new Media("2aRMy{PY1J$S", "Kn^lZ[6", (Double) null, media_StreamType0);
      // Undeclared exception!
      try { 
        media1.equals(media0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("su.litvak.chromecast.api.v2.Media", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Media media0 = new Media((String) null, (String) null);
      Media media1 = new Media((String) null, "metadataType", (Double) null, (Media.StreamType) null);
      boolean boolean0 = media0.equals(media1);
      assertTrue(boolean0);
      assertTrue(media1.equals((Object)media0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Media media0 = new Media((String) null, (String) null);
      Media media1 = new Media("locationLatitude", "trackNumber", (Double) null, (Media.StreamType) null, (Map<String, Object>) null, (Map<String, Object>) null, (Map<String, Object>) null, (List<Track>) null);
      boolean boolean0 = media0.equals(media1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Media media0 = new Media("Kn^lZ[6", "Kn^lZ[6");
      Media media1 = new Media("Kn^lZ[6", "Kn^lZ[6");
      boolean boolean0 = media1.equals(media0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Media media0 = new Media("KnlZ[6", "KnlZ[6");
      boolean boolean0 = media0.equals(media0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Media media0 = new Media("XIzAK5z[8b?m`", "Track{id: %d, type: %s}");
      boolean boolean0 = media0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Media media0 = new Media("XIzAK5z[8b?m`", "Track{id: %d, type: %s}");
      Object object0 = new Object();
      boolean boolean0 = media0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = hashMap0.put("glT<", "locationName");
      hashMap0.put("metadataType", object0);
      Media media0 = new Media("2Waem", "studio", (Double) null, (Media.StreamType) null, (Map<String, Object>) null, hashMap0, (Map<String, Object>) null, (List<Track>) null);
      // Undeclared exception!
      try { 
        media0.getMetadataType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("su.litvak.chromecast.api.v2.Media", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Media media0 = new Media("2Waem", "studio", (Double) null, (Media.StreamType) null, (Map<String, Object>) null, hashMap0, (Map<String, Object>) null, (List<Track>) null);
      Media.MetadataType media_MetadataType0 = media0.getMetadataType();
      assertEquals(Media.MetadataType.GENERIC, media_MetadataType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Media media0 = new Media("XIzAK5z[8b?m`", "Track{id: %d, type: %s}");
      Media.MetadataType media_MetadataType0 = media0.getMetadataType();
      assertEquals(Media.MetadataType.GENERIC, media_MetadataType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Media.StreamType media_StreamType0 = Media.StreamType.BUFFERED;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      LinkedList<Track> linkedList0 = new LinkedList<Track>();
      Media media0 = new Media("", "su.litvak.chromecast.api.v2.Track$TrackType", double0, media_StreamType0, hashMap0, hashMap0, hashMap0, linkedList0);
      assertEquals(Media.MetadataType.GENERIC, media0.getMetadataType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Media media0 = new Media("XIzAK5z[8b?m`", "Track{id: %d, type: %s}");
      media0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Media media0 = new Media("XIzAK5z[8b?m`", "Track{id: %d, type: %s}");
      String string0 = media0.toString();
      assertEquals("Media{url: XIzAK5z[8b?m`, contentType: Track{id: %d, type: %s}, duration: null}", string0);
  }
}
