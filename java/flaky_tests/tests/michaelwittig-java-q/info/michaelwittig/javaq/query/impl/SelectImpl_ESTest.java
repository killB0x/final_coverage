/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 20:24:34 GMT 2022
 */

package info.michaelwittig.javaq.query.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import info.michaelwittig.javaq.query.Select;
import info.michaelwittig.javaq.query.Table;
import info.michaelwittig.javaq.query.column.Column;
import info.michaelwittig.javaq.query.column.impl.SymbolColumn;
import info.michaelwittig.javaq.query.column.impl.TimeColumn;
import info.michaelwittig.javaq.query.filter.Filter;
import info.michaelwittig.javaq.query.group.Group;
import info.michaelwittig.javaq.query.impl.SelectImpl;
import info.michaelwittig.javaq.query.type.impl.TypeSymbol;
import info.michaelwittig.javaq.query.value.Value;
import info.michaelwittig.javaq.query.value.impl.SymbolValue;
import info.michaelwittig.javaq.query.value.impl.TimeValue;
import java.sql.Time;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SelectImpl_ESTest extends SelectImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl((Table) null);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Table table0 = select0.getTable();
      assertNull(table0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      SymbolColumn symbolColumn0 = new SymbolColumn("access");
      Select.Sort.Direction select_Sort_Direction0 = Select.Sort.Direction.descending;
      selectImpl_SelectBuilderImpl0.order(select_Sort_Direction0, symbolColumn0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Select.Sort select_Sort0 = select0.getSortColmn();
      assertNotNull(select_Sort0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      selectImpl_SelectBuilderImpl0.start(0);
      Integer integer0 = select0.getRowNumber();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      selectImpl_SelectBuilderImpl0.start(866);
      Integer integer0 = select0.getRowNumber();
      assertEquals(866, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      selectImpl_SelectBuilderImpl0.start((-1));
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Integer integer0 = select0.getRowNumber();
      assertEquals((-1), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      selectImpl_SelectBuilderImpl0.limit(0);
      Integer integer0 = select0.getNumberOfRows();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      selectImpl_SelectBuilderImpl0.limit(2689);
      Integer integer0 = select0.getNumberOfRows();
      assertEquals(2689, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      selectImpl_SelectBuilderImpl0.limit((-2403));
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Integer integer0 = select0.getNumberOfRows();
      assertEquals((-2403), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      TimeColumn timeColumn0 = new TimeColumn(" where ");
      Group group0 = timeColumn0.group();
      selectImpl_SelectBuilderImpl0.group(group0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      List<Group> list0 = select0.getGroups();
      assertTrue(list0.contains(group0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      SymbolColumn symbolColumn0 = new SymbolColumn((String) null);
      selectImpl_SelectBuilderImpl0.column(symbolColumn0);
      List<Column<?>> list0 = select0.getColumns();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("'Jp'ET9Yvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      SymbolColumn symbolColumn0 = new SymbolColumn("'Jp'ET9Yvvz");
      selectImpl_SelectBuilderImpl0.column(symbolColumn0);
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select 'Jp'ET9Yvvz from 'Jp'ET9Yvvz", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("'Jp'ET9Yvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      TimeColumn timeColumn0 = new TimeColumn("info.michaelwittig.javaq.query.column.impl.AggregateColumnImpl");
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalTime localTime0 = MockLocalTime.now((ZoneId) zoneOffset0);
      Time time0 = Time.valueOf(localTime0);
      TimeValue timeValue0 = TimeValue.from(time0);
      Group group0 = timeColumn0.xbar(timeValue0);
      selectImpl_SelectBuilderImpl0.group(group0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select by 14:21:21.000 xbar info.michaelwittig.javaq.query.column.impl.AggregateColumnImpl from 'Jp'ET9Yvvz", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("Jp'EYvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      SymbolColumn symbolColumn0 = new SymbolColumn("Jp'EYvvz");
      SymbolValue symbolValue0 = SymbolValue.from("Jp'EYvvz");
      Filter filter0 = symbolColumn0.filterEqualTo((Value<String, TypeSymbol>) symbolValue0);
      selectImpl_SelectBuilderImpl0.filter(filter0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select from Jp'EYvvz where Jp'EYvvz=`Jp'EYvvz", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("JS'Evvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      selectImpl_SelectBuilderImpl0.filter((Filter) null);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      // Undeclared exception!
      try { 
        ((SelectImpl) select0).toQ();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.impl.SelectImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("'Jp'ET9Yvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      selectImpl_SelectBuilderImpl0.limit(2689);
      selectImpl_SelectBuilderImpl0.start(0);
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select[0 2689] from 'Jp'ET9Yvvz", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("'Jp'ET9Yvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      selectImpl_SelectBuilderImpl0.limit((-2403));
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      SymbolColumn symbolColumn0 = new SymbolColumn((String) null);
      Select.Sort.Direction select_Sort_Direction0 = Select.Sort.Direction.descending;
      selectImpl_SelectBuilderImpl0.order(select_Sort_Direction0, symbolColumn0);
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select[-2403;>null] from 'Jp'ET9Yvvz", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("'Jp'ET9Yvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      selectImpl_SelectBuilderImpl0.limit(2689);
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select[2689] from 'Jp'ET9Yvvz", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn("'Jp'ET9Yvvz").when(table0).toQ();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      SymbolColumn symbolColumn0 = new SymbolColumn((String) null);
      Select.Sort.Direction select_Sort_Direction0 = Select.Sort.Direction.descending;
      selectImpl_SelectBuilderImpl0.order(select_Sort_Direction0, symbolColumn0);
      String string0 = ((SelectImpl) select0).toQ();
      assertEquals("select[>null] from 'Jp'ET9Yvvz", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Integer integer0 = select0.getNumberOfRows();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Integer integer0 = select0.getRowNumber();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      List<Filter> list0 = select0.getFilters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      List<Group> list0 = select0.getGroups();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      List<Column<?>> list0 = select0.getColumns();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Select.Sort select_Sort0 = select0.getSortColmn();
      assertNull(select_Sort0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Table table0 = mock(Table.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(table0).toString();
      SelectImpl.SelectBuilderImpl selectImpl_SelectBuilderImpl0 = new SelectImpl.SelectBuilderImpl(table0);
      Select select0 = selectImpl_SelectBuilderImpl0.build();
      Table table1 = select0.getTable();
      assertNull(table1.getName());
  }
}
