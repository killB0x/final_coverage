/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:04:10 GMT 2022
 */

package jp.co.yahoo.yosegi.binary.maker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.file.LinkOption;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import jp.co.yahoo.yosegi.binary.ColumnBinary;
import jp.co.yahoo.yosegi.binary.ColumnBinaryMakerConfig;
import jp.co.yahoo.yosegi.binary.ColumnBinaryMakerCustomConfigNode;
import jp.co.yahoo.yosegi.binary.CompressResultNode;
import jp.co.yahoo.yosegi.binary.maker.ConstantColumnBinaryMaker;
import jp.co.yahoo.yosegi.binary.maker.DictionaryRleStringColumnBinaryMaker;
import jp.co.yahoo.yosegi.binary.maker.DumpSpreadColumnBinaryMaker;
import jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker;
import jp.co.yahoo.yosegi.blockindex.BlockIndexNode;
import jp.co.yahoo.yosegi.compressor.DefaultCompressor;
import jp.co.yahoo.yosegi.compressor.ICompressor;
import jp.co.yahoo.yosegi.inmemory.ILoader;
import jp.co.yahoo.yosegi.inmemory.LoadType;
import jp.co.yahoo.yosegi.inmemory.YosegiConstLoader;
import jp.co.yahoo.yosegi.inmemory.YosegiDictionaryLoader;
import jp.co.yahoo.yosegi.inmemory.YosegiSpreadLoader;
import jp.co.yahoo.yosegi.message.objects.DoubleObj;
import jp.co.yahoo.yosegi.spread.analyzer.ArrayColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.StringColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.column.ArrowPrimitiveColumn;
import jp.co.yahoo.yosegi.spread.column.BooleanCell;
import jp.co.yahoo.yosegi.spread.column.ColumnType;
import jp.co.yahoo.yosegi.spread.column.IArrowPrimitiveConnector;
import jp.co.yahoo.yosegi.spread.column.ICell;
import jp.co.yahoo.yosegi.spread.column.IColumn;
import jp.co.yahoo.yosegi.spread.column.UnionColumn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OptimizedNullArrayDumpDoubleColumnBinaryMaker_ESTest extends OptimizedNullArrayDumpDoubleColumnBinaryMaker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Vector<IColumnAnalizeResult> vector0 = new Vector<IColumnAnalizeResult>();
      ArrayColumnAnalizeResult arrayColumnAnalizeResult0 = new ArrayColumnAnalizeResult("dv(61jQ?pk?7FA", 145, (-269), vector0);
      int int0 = optimizedNullArrayDumpDoubleColumnBinaryMaker0.calcBinarySize(arrayColumnAnalizeResult0);
      assertEquals(916, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnType columnType0 = ColumnType.NULL;
      ICell<Object, BooleanCell> iCell0 = (ICell<Object, BooleanCell>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType0).when(iCell0).getType();
      ICell<Object, Object> iCell1 = (ICell<Object, Object>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn((ColumnType) null).when(iCell1).getType();
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn(iCell0, iCell1).when(iArrowPrimitiveConnector0).get(anyInt() , any(jp.co.yahoo.yosegi.spread.column.ICell.class));
      doReturn(1560, 1560, 1560, 16, 0).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary((ColumnBinaryMakerConfig) null, (ColumnBinaryMakerCustomConfigNode) null, (CompressResultNode) null, arrowPrimitiveColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnType columnType0 = ColumnType.NULL;
      ICell<Object, Object> iCell0 = (ICell<Object, Object>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType0).when(iCell0).getType();
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn(iCell0).when(iArrowPrimitiveConnector0).get(anyInt() , any(jp.co.yahoo.yosegi.spread.column.ICell.class));
      doReturn(1560, 1560, 1560, (-3279), 0).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary((ColumnBinaryMakerConfig) null, (ColumnBinaryMakerCustomConfigNode) null, (CompressResultNode) null, arrowPrimitiveColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      StringColumnAnalizeResult stringColumnAnalizeResult0 = new StringColumnAnalizeResult("", 128, false, 128, (-138), 128, (-138), 136, 136, (-138), 128, 1508, 1260, (-163), 3303, (-138), "", "", 3303, 1260, 1260);
      int int0 = optimizedNullArrayDumpDoubleColumnBinaryMaker0.calcBinarySize(stringColumnAnalizeResult0);
      assertEquals((-1217), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary((ColumnBinaryMakerConfig) null, (ColumnBinaryMakerCustomConfigNode) null, (CompressResultNode) null, arrowPrimitiveColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnType columnType0 = ColumnType.NULL;
      ICell<LinkOption, Object> iCell0 = (ICell<LinkOption, Object>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType0).when(iCell0).getType();
      ICell<BooleanCell, BooleanCell> iCell1 = (ICell<BooleanCell, BooleanCell>) mock(ICell.class, new ViolatedAssumptionAnswer());
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn(iCell0, (ICell) null).when(iArrowPrimitiveConnector0).get(anyInt() , any(jp.co.yahoo.yosegi.spread.column.ICell.class));
      doReturn(1, 1, 62552633, 1, 62552633).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary((ColumnBinaryMakerConfig) null, (ColumnBinaryMakerCustomConfigNode) null, (CompressResultNode) null, arrowPrimitiveColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Vector<ColumnBinary> vector0 = new Vector<ColumnBinary>();
      BlockIndexNode blockIndexNode0 = new BlockIndexNode();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary("Ohu8h{X8", 643, vector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.setBlockIndexNode(blockIndexNode0, columnBinary0, 0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      BlockIndexNode blockIndexNode0 = new BlockIndexNode();
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.setBlockIndexNode(blockIndexNode0, (ColumnBinary) null, (-529));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      BlockIndexNode blockIndexNode0 = new BlockIndexNode();
      ColumnType columnType0 = ColumnType.FLOAT;
      byte[] byteArray0 = new byte[0];
      Stack<ColumnBinary> stack0 = new Stack<ColumnBinary>();
      ColumnBinary columnBinary0 = new ColumnBinary("", "", "", columnType0, (-16), 3392903, (-2047), (-2047), byteArray0, (-16), 3392903, stack0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.setBlockIndexNode(blockIndexNode0, columnBinary0, 1020);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load((ColumnBinary) null, (ILoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      DictionaryRleStringColumnBinaryMaker dictionaryRleStringColumnBinaryMaker0 = new DictionaryRleStringColumnBinaryMaker();
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      CompressResultNode compressResultNode0 = new CompressResultNode();
      HashMap<ColumnType, IColumn> hashMap0 = new HashMap<ColumnType, IColumn>();
      UnionColumn unionColumn0 = new UnionColumn("Loader type is not DICTIONARY.", hashMap0);
      ColumnBinary columnBinary0 = dictionaryRleStringColumnBinaryMaker0.toBinary(columnBinaryMakerConfig0, (ColumnBinaryMakerCustomConfigNode) null, compressResultNode0, unionColumn0);
      columnBinary0.setRepetitions((int[]) null, 0);
      YosegiDictionaryLoader yosegiDictionaryLoader0 = new YosegiDictionaryLoader(columnBinary0, 0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load(columnBinary0, yosegiDictionaryLoader0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Stack<ColumnBinary> stack0 = new Stack<ColumnBinary>();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary("double", 814, stack0);
      columnBinary0.binaryLength = 814;
      columnBinary0.setRepetitions((int[]) null, 814);
      YosegiDictionaryLoader yosegiDictionaryLoader0 = new YosegiDictionaryLoader(columnBinary0, 0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load(columnBinary0, yosegiDictionaryLoader0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.getLoadType((ColumnBinary) null, 1958052158);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.calcBinarySize((IColumnAnalizeResult) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Stack<ColumnBinary> stack0 = new Stack<ColumnBinary>();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary((String) null, 62552633, stack0);
      LoadType loadType0 = optimizedNullArrayDumpDoubleColumnBinaryMaker0.getLoadType(columnBinary0, (-1));
      ILoader<BooleanCell> iLoader0 = (ILoader<BooleanCell>) mock(ILoader.class, new ViolatedAssumptionAnswer());
      doReturn(loadType0).when(iLoader0).getLoaderType();
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load(columnBinary0, iLoader0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class jp.co.yahoo.yosegi.inmemory.ILoader$MockitoMock$16951968 cannot be cast to class jp.co.yahoo.yosegi.inmemory.ISequentialLoader (jp.co.yahoo.yosegi.inmemory.ILoader$MockitoMock$16951968 and jp.co.yahoo.yosegi.inmemory.ISequentialLoader are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @79e55ec4)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Stack<ColumnBinary> stack0 = new Stack<ColumnBinary>();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary("E&!TY_SPREAD", 10, stack0);
      columnBinary0.setRepetitions((int[]) null, (-1049));
      YosegiSpreadLoader yosegiSpreadLoader0 = new YosegiSpreadLoader(columnBinary0, 0);
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load(columnBinary0, yosegiSpreadLoader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Loader type is not DICTIONARY.
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Stack<ColumnBinary> stack0 = new Stack<ColumnBinary>();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary("double", 814, stack0);
      columnBinary0.setRepetitions((int[]) null, 814);
      YosegiDictionaryLoader yosegiDictionaryLoader0 = new YosegiDictionaryLoader(columnBinary0, 0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load(columnBinary0, yosegiDictionaryLoader0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -16
         //
         verifyException("jp.co.yahoo.yosegi.compressor.DefaultCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      Vector<ColumnBinary> vector0 = new Vector<ColumnBinary>();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary("", 1, vector0);
      YosegiDictionaryLoader yosegiDictionaryLoader0 = new YosegiDictionaryLoader(columnBinary0, 1);
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.load(columnBinary0, yosegiDictionaryLoader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Loader type is not SEQUENTIAL.
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnBinary columnBinary0 = DumpSpreadColumnBinaryMaker.createSpreadColumnBinary("|Dc?(", (-2968), (List<ColumnBinary>) null);
      columnBinary0.setRepetitions((int[]) null, 926);
      LoadType loadType0 = optimizedNullArrayDumpDoubleColumnBinaryMaker0.getLoadType(columnBinary0, (-2968));
      assertEquals(LoadType.DICTIONARY, loadType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnType columnType0 = ColumnType.FLOAT;
      ICell<Object, BooleanCell> iCell0 = (ICell<Object, BooleanCell>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType0).when(iCell0).getType();
      ColumnType columnType1 = ColumnType.NULL;
      ICell<BooleanCell, Object> iCell1 = (ICell<BooleanCell, Object>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType1).when(iCell1).getType();
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn(iCell0, iCell1).when(iArrowPrimitiveConnector0).get(anyInt() , any(jp.co.yahoo.yosegi.spread.column.ICell.class));
      doReturn(1560, 1560, 1560, 1560, 0).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary((ColumnBinaryMakerConfig) null, (ColumnBinaryMakerCustomConfigNode) null, (CompressResultNode) null, arrowPrimitiveColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnType columnType0 = ColumnType.FLOAT;
      ICell<Object, BooleanCell> iCell0 = (ICell<Object, BooleanCell>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType0).when(iCell0).getType();
      ColumnType columnType1 = ColumnType.NULL;
      ICell<BooleanCell, Object> iCell1 = (ICell<BooleanCell, Object>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn(columnType1).when(iCell1).getType();
      ICell<Object, Object> iCell2 = (ICell<Object, Object>) mock(ICell.class, new ViolatedAssumptionAnswer());
      doReturn((ColumnType) null).when(iCell2).getType();
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn(iCell0, iCell1, iCell2).when(iArrowPrimitiveConnector0).get(anyInt() , any(jp.co.yahoo.yosegi.spread.column.ICell.class));
      doReturn(1560, 1560, 1560, 1560, 1560).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary((ColumnBinaryMakerConfig) null, (ColumnBinaryMakerCustomConfigNode) null, (CompressResultNode) null, arrowPrimitiveColumn0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class jp.co.yahoo.yosegi.spread.column.ICell$MockitoMock$1203104558 cannot be cast to class jp.co.yahoo.yosegi.spread.column.PrimitiveCell (jp.co.yahoo.yosegi.spread.column.ICell$MockitoMock$1203104558 and jp.co.yahoo.yosegi.spread.column.PrimitiveCell are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @79e55ec4)
         //
         verifyException("jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      ColumnBinaryMakerCustomConfigNode columnBinaryMakerCustomConfigNode0 = new ColumnBinaryMakerCustomConfigNode("", columnBinaryMakerConfig0);
      CompressResultNode compressResultNode0 = new CompressResultNode();
      DoubleObj doubleObj0 = new DoubleObj(2135.0);
      ColumnBinary columnBinary0 = ConstantColumnBinaryMaker.createColumnBinary(doubleObj0, "", 3392903);
      YosegiConstLoader yosegiConstLoader0 = new YosegiConstLoader(columnBinary0, 946);
      IColumn iColumn0 = yosegiConstLoader0.build();
      // Undeclared exception!
      try { 
        optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary(columnBinaryMakerConfig0, columnBinaryMakerCustomConfigNode0, compressResultNode0, iColumn0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("java.util.zip.GZIPOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptimizedNullArrayDumpDoubleColumnBinaryMaker optimizedNullArrayDumpDoubleColumnBinaryMaker0 = new OptimizedNullArrayDumpDoubleColumnBinaryMaker();
      BlockIndexNode blockIndexNode0 = new BlockIndexNode();
      ColumnBinaryMakerConfig columnBinaryMakerConfig0 = new ColumnBinaryMakerConfig();
      DefaultCompressor defaultCompressor0 = new DefaultCompressor();
      columnBinaryMakerConfig0.compressorClass = (ICompressor) defaultCompressor0;
      ColumnBinaryMakerCustomConfigNode columnBinaryMakerCustomConfigNode0 = new ColumnBinaryMakerCustomConfigNode("RgNGE_BYmTE", columnBinaryMakerConfig0);
      IArrowPrimitiveConnector iArrowPrimitiveConnector0 = mock(IArrowPrimitiveConnector.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(iArrowPrimitiveConnector0).getColumnName();
      doReturn((ColumnType) null).when(iArrowPrimitiveConnector0).getColumnType();
      doReturn(0, 0, 0, 0, 0).when(iArrowPrimitiveConnector0).size();
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn(iArrowPrimitiveConnector0);
      CompressResultNode compressResultNode0 = new CompressResultNode();
      ColumnBinary columnBinary0 = optimizedNullArrayDumpDoubleColumnBinaryMaker0.toBinary(columnBinaryMakerConfig0, columnBinaryMakerCustomConfigNode0, compressResultNode0, arrowPrimitiveColumn0);
      optimizedNullArrayDumpDoubleColumnBinaryMaker0.setBlockIndexNode(blockIndexNode0, columnBinary0, 945);
      assertEquals(0, columnBinary0.loadSize);
  }
}
