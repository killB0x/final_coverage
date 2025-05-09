/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 07:48:22 GMT 2022
 */

package com.galdosinc.glib.gml.coord;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.galdosinc.glib.gml.coord.CoordReader;
import com.galdosinc.glib.gml.coord.CoordinateTupleLinkedList;
import com.galdosinc.glib.gml.coord.CoordinateTupleList;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CoordReader_ESTest extends CoordReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      // Undeclared exception!
      try { 
        coordReader0.useCoordinateTupleList((CoordinateTupleList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      // Undeclared exception!
      try { 
        coordReader0.readSingleCoord((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      // Undeclared exception!
      try { 
        coordReader0.read((Element) null, Integer.MAX_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      try { 
        coordReader0.read(iIOMetadataNode0, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // gml:coord must have at least one coordinate <X>.
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("P)@24)'#dQ+lC.");
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      try { 
        coordReader0.readSingleCoord(iIOMetadataNode0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered unexpected child of gml:coord: P)@24)'#dQ+lC.
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("bN@E`j|]}%F)G^6");
      iIOMetadataNode0.setAttributeNS(">e7=.o+E\\gd=-Y", "!}nP", (String) null);
      Attr attr0 = iIOMetadataNode0.getAttributeNodeNS("com.galdosinc.glib.gml.coord.CoordinateTupleLinkedList", "!}nP");
      iIOMetadataNode0.appendChild(attr0);
      try { 
        coordReader0.readSingleCoord(iIOMetadataNode0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered unexpected child of gml:coord: !}nP
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("X");
      IIOMetadataNode iIOMetadataNode1 = (IIOMetadataNode)iIOMetadataNode0.appendChild(iIOMetadataNode0);
      try { 
        coordReader0.readSingleCoord(iIOMetadataNode1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered unexpected child of gml:coord: X
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      try { 
        coordReader0.read(iIOMetadataNode0, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot parser 0 gml:coord's
         //
         verifyException("com.galdosinc.glib.gml.coord.CoordReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CoordReader coordReader0 = new CoordReader();
      CoordinateTupleLinkedList coordinateTupleLinkedList0 = new CoordinateTupleLinkedList();
      coordReader0.useCoordinateTupleList(coordinateTupleLinkedList0);
      assertEquals(Integer.MAX_VALUE, CoordReader.SCAN_ALL);
  }
}
