/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 24 15:46:31 GMT 2022
 */

package org.sqlite.jdbc3;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JDBC3Statement_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.sqlite.jdbc3.JDBC3Statement"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JDBC3Statement_ESTest_scaffolding.class.getClassLoader() ,
      "org.sqlite.SQLiteConnection",
      "org.sqlite.SQLiteUpdateListener",
      "org.sqlite.core.NativeDB",
      "org.sqlite.date.DatePrinter",
      "org.sqlite.core.SafeStmtPtr$SafePtrLongFunction",
      "org.sqlite.SQLiteConfig$DatePrecision",
      "org.sqlite.jdbc4.JDBC4Statement",
      "org.sqlite.date.FastDateParser$3",
      "org.sqlite.date.FastDateParser$4",
      "org.sqlite.core.Codes",
      "org.sqlite.SQLiteConfig$TransactionMode",
      "org.sqlite.core.SafeStmtPtr",
      "org.sqlite.SQLiteOpenMode",
      "org.sqlite.ProgressHandler",
      "org.sqlite.SQLiteConfig$JournalMode",
      "org.sqlite.core.SafeStmtPtr$SafePtrIntFunction",
      "org.sqlite.jdbc3.JDBC3ResultSet",
      "org.sqlite.date.FastDateParser$ISO8601TimeZoneStrategy",
      "org.sqlite.SQLiteConfig$PragmaValue",
      "org.sqlite.core.SafeStmtPtr$SafePtrConsumer",
      "org.sqlite.jdbc3.JDBC3Statement$BackupObserver",
      "org.sqlite.SQLiteConfig$Pragma",
      "org.sqlite.Function",
      "org.sqlite.SQLiteException",
      "org.sqlite.date.FastDateFormat",
      "org.sqlite.date.FormatCache",
      "org.sqlite.date.FastDateParser$CopyQuotedStrategy",
      "org.sqlite.date.FastDateFormat$1",
      "org.sqlite.jdbc3.JDBC3Statement$SQLCallable",
      "org.sqlite.SQLiteConfig$Encoding",
      "org.sqlite.Collation",
      "org.sqlite.date.DateParser",
      "org.sqlite.date.FastDatePrinter",
      "org.sqlite.date.FastDatePrinter$TwoDigitMonthField",
      "org.sqlite.date.FastDatePrinter$Rule",
      "org.sqlite.SQLiteConfig$HexKeyMode",
      "org.sqlite.date.FastDateParser",
      "org.sqlite.core.DB$ProgressObserver",
      "org.sqlite.date.FastDatePrinter$NumberRule",
      "org.sqlite.SQLiteConfig$SynchronousMode",
      "org.sqlite.core.SafeStmtPtr$SafePtrFunction",
      "org.sqlite.jdbc4.JDBC4ResultSet",
      "org.sqlite.core.DB",
      "org.sqlite.SQLiteConfig$DateClass",
      "org.sqlite.SQLiteConnectionConfig",
      "org.sqlite.SQLiteConfig",
      "org.sqlite.SQLiteCommitListener",
      "org.sqlite.date.FastDatePrinter$CharacterLiteral",
      "org.sqlite.date.FastDateParser$Strategy",
      "org.sqlite.date.FastDatePrinter$PaddedNumberField",
      "org.sqlite.SQLiteConfig$TempStore",
      "org.sqlite.core.CoreStatement",
      "org.sqlite.core.CoreResultSet",
      "org.sqlite.BusyHandler",
      "org.sqlite.jdbc3.JDBC3Statement",
      "org.sqlite.date.FastDateParser$CaseInsensitiveTextStrategy",
      "org.sqlite.date.FastDateParser$1",
      "org.sqlite.SQLiteConfig$LockingMode",
      "org.sqlite.date.FormatCache$MultipartKey",
      "org.sqlite.date.FastDateParser$NumberStrategy",
      "org.sqlite.date.FastDateParser$2",
      "org.sqlite.core.SafeStmtPtr$SafePtrDoubleFunction",
      "org.sqlite.date.FastDateParser$TimeZoneStrategy",
      "org.sqlite.date.FastDatePrinter$TwoDigitNumberField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDBC3Statement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.sqlite.core.CoreStatement",
      "org.sqlite.jdbc3.JDBC3Statement",
      "org.sqlite.ExtendedCommand$BackupCommand",
      "org.sqlite.ExtendedCommand$RestoreCommand",
      "org.sqlite.SQLiteErrorCode",
      "org.sqlite.SQLiteConnection",
      "org.sqlite.jdbc3.JDBC3Connection",
      "org.sqlite.jdbc4.JDBC4Connection",
      "org.sqlite.SQLiteConfig$Encoding",
      "org.sqlite.SQLiteConfig$JournalMode",
      "org.sqlite.SQLiteConfig$LockingMode",
      "org.sqlite.SQLiteConfig$SynchronousMode",
      "org.sqlite.SQLiteConfig$TempStore",
      "org.sqlite.SQLiteConfig$DatePrecision",
      "org.sqlite.SQLiteConfig$DateClass",
      "org.sqlite.SQLiteConfig$HexKeyMode",
      "org.sqlite.SQLiteConfig$Pragma",
      "org.sqlite.SQLiteConfig",
      "org.sqlite.SQLiteOpenMode",
      "org.sqlite.SQLiteConnectionConfig",
      "org.sqlite.date.FormatCache",
      "org.sqlite.date.FastDateFormat$1",
      "org.sqlite.date.FastDateFormat",
      "org.sqlite.date.FormatCache$MultipartKey",
      "org.sqlite.date.FastDatePrinter",
      "org.sqlite.date.FastDatePrinter$PaddedNumberField",
      "org.sqlite.date.FastDatePrinter$CharacterLiteral",
      "org.sqlite.date.FastDatePrinter$TwoDigitMonthField",
      "org.sqlite.date.FastDatePrinter$TwoDigitNumberField",
      "org.sqlite.date.FastDateParser$Strategy",
      "org.sqlite.date.FastDateParser$NumberStrategy",
      "org.sqlite.date.FastDateParser$1",
      "org.sqlite.date.FastDateParser$2",
      "org.sqlite.date.FastDateParser$3",
      "org.sqlite.date.FastDateParser$4",
      "org.sqlite.date.FastDateParser$ISO8601TimeZoneStrategy",
      "org.sqlite.date.FastDateParser",
      "org.sqlite.date.FastDateParser$CopyQuotedStrategy",
      "org.sqlite.core.DB",
      "org.sqlite.core.NativeDB",
      "org.sqlite.SQLiteJDBCLoader",
      "org.sqlite.util.ProcessRunner",
      "org.sqlite.util.OSInfo",
      "org.sqlite.jdbc4.JDBC4Statement",
      "org.sqlite.core.CorePreparedStatement",
      "org.sqlite.jdbc3.JDBC3PreparedStatement",
      "org.sqlite.jdbc4.JDBC4PreparedStatement",
      "org.sqlite.core.CoreResultSet",
      "org.sqlite.jdbc3.JDBC3ResultSet",
      "org.sqlite.jdbc4.JDBC4ResultSet",
      "org.sqlite.jdbc3.JDBC3Statement$BackupObserver",
      "org.sqlite.core.SafeStmtPtr",
      "org.sqlite.Collation",
      "org.sqlite.SQLiteException",
      "org.sqlite.JDBC",
      "org.sqlite.Function",
      "org.sqlite.date.FastDatePrinter$TimeZoneNameRule",
      "org.sqlite.date.FastDatePrinter$TimeZoneDisplayKey",
      "org.sqlite.date.FastDatePrinter$StringLiteral",
      "org.sqlite.SQLiteConfig$TransactionMode"
    );
  }
}
