/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 07 20:40:19 GMT 2022
 */

package org.dynjs.runtime;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ThreadContextManager_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.dynjs.runtime.ThreadContextManager"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ThreadContextManager_ESTest_scaffolding.class.getClassLoader() ,
      "org.dynjs.runtime.VariableValues",
      "org.dynjs.runtime.GlobalContext",
      "org.dynjs.runtime.SourceProvider",
      "org.dynjs.runtime.JSProgram",
      "org.dynjs.runtime.DynJS",
      "org.dynjs.runtime.Types$Undefined",
      "org.dynjs.runtime.JSCallable",
      "org.dynjs.runtime.DynamicClassLoader",
      "org.dynjs.runtime.builtins.types.error.StackElement",
      "org.dynjs.runtime.Types$Null",
      "org.dynjs.runtime.Arguments",
      "org.dynjs.runtime.LexicalEnvironment",
      "org.dynjs.compiler.CompilationContext",
      "org.dynjs.exception.DynJSException",
      "org.dynjs.debugger.Debugger",
      "org.dynjs.Config",
      "org.dynjs.runtime.ExecutionContext",
      "org.dynjs.runtime.ExternalIndexedData",
      "org.dynjs.runtime.DynObject",
      "org.dynjs.parser.Statement",
      "org.dynjs.runtime.InitializationListener",
      "org.dynjs.runtime.NameEnumerator",
      "org.dynjs.runtime.ThreadContextManager",
      "org.dynjs.runtime.ObjectEnvironmentRecord",
      "org.dynjs.runtime.JSCode",
      "org.dynjs.Clock",
      "org.dynjs.exception.ThrowException",
      "org.dynjs.runtime.EnvironmentRecord",
      "org.dynjs.runtime.JSObject",
      "org.dynjs.runtime.BasicBlock",
      "org.dynjs.runtime.JSFunction",
      "org.dynjs.runtime.Reference",
      "org.dynjs.runtime.PropertyDescriptor",
      "org.dynjs.runtime.BlockManager",
      "org.dynjs.runtime.BlockManager$Entry",
      "org.dynjs.compiler.JSCompiler",
      "org.dynjs.runtime.Completion",
      "org.dynjs.runtime.Types"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ThreadContextManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.dynjs.runtime.ThreadContextManager",
      "org.dynjs.runtime.util.SafePropertyAccessor",
      "org.dynjs.cli.Options$Category",
      "org.dynjs.Config$CompileMode",
      "org.dynjs.cli.Options",
      "org.dynjs.runtime.DynJS",
      "org.dynjs.debugger.Debugger",
      "org.dynjs.debugger.ReferenceManager",
      "org.dynjs.debugger.Debugger$StepAction",
      "org.dynjs.Config",
      "org.dynjs.SystemClock",
      "org.dynjs.runtime.ExecutionContext",
      "org.dynjs.runtime.LexicalEnvironment",
      "org.dynjs.runtime.ObjectEnvironmentRecord",
      "org.dynjs.runtime.NullProgram",
      "org.dynjs.runtime.GlobalContext",
      "org.dynjs.runtime.DynObject",
      "org.dynjs.runtime.AbstractFunction",
      "org.dynjs.runtime.AbstractNativeFunction",
      "org.dynjs.runtime.builtins.ThrowTypeError",
      "org.dynjs.runtime.Types$Undefined",
      "org.dynjs.runtime.Types$Null",
      "org.dynjs.runtime.Types",
      "org.dynjs.runtime.PropertyDescriptor",
      "org.dynjs.runtime.builtins.types.AbstractBuiltinType",
      "org.dynjs.runtime.builtins.types.BuiltinObject",
      "org.dynjs.runtime.builtins.types.BuiltinFunction",
      "org.dynjs.runtime.builtins.types.BuiltinFunction$1",
      "org.dynjs.runtime.builtins.types.BuiltinBoolean",
      "org.dynjs.runtime.PrimitiveDynObject",
      "org.dynjs.runtime.builtins.types.bool.DynBoolean",
      "org.dynjs.runtime.builtins.types.BuiltinNumber",
      "org.dynjs.runtime.builtins.types.number.DynNumber",
      "org.dynjs.runtime.builtins.types.BuiltinArray",
      "org.dynjs.runtime.DynArray",
      "org.dynjs.runtime.builtins.types.BuiltinString",
      "org.dynjs.runtime.builtins.types.string.DynString",
      "org.dynjs.runtime.builtins.types.BuiltinRegExp",
      "org.dynjs.parser.ast.AbstractExpression",
      "org.dynjs.parser.ast.AbstractUnaryOperatorExpression",
      "org.dynjs.parser.ast.DeleteOpExpression",
      "org.dynjs.parser.ast.AbstractBinaryExpression",
      "org.dynjs.parser.ast.EqualityOperatorExpression",
      "org.dynjs.runtime.Reference",
      "org.dynjs.parser.ast.BaseExpression",
      "org.dynjs.parser.ast.NumberLiteralExpression",
      "org.dynjs.parser.ast.FloatingNumberExpression",
      "org.dynjs.parser.ast.DotExpression",
      "org.dynjs.parser.ast.AbstractStatement",
      "org.dynjs.parser.ast.BlockStatement",
      "org.dynjs.parser.ast.ProgramTree",
      "org.dynjs.parser.ast.CatchClause",
      "org.dynjs.parser.ast.BaseStatement",
      "org.dynjs.parser.ast.TryStatement",
      "org.dynjs.compiler.DefaultCompilationContext",
      "org.dynjs.parser.js.Token",
      "org.dynjs.parser.ast.IntegerNumberExpression",
      "org.dynjs.parser.ast.ArrayLiteralExpression",
      "org.dynjs.parser.ast.FunctionCallExpression",
      "org.dynjs.parser.ast.EmptyStatement",
      "org.dynjs.parser.ast.DebuggerStatement",
      "org.dynjs.runtime.Completion",
      "org.dynjs.runtime.Completion$Type",
      "org.dynjs.runtime.BasicBlockDelegate",
      "org.dynjs.runtime.BlockManager",
      "org.dynjs.compiler.JSCompiler",
      "org.dynjs.parser.ast.PostOpExpression",
      "org.dynjs.parser.ast.ExpressionStatement",
      "org.dynjs.parser.ast.NullLiteralExpression",
      "org.dynjs.parser.ast.BitwiseExpression",
      "org.dynjs.parser.ast.TernaryExpression",
      "org.dynjs.parser.ast.MultiplicativeExpression",
      "org.dynjs.runtime.VariableValues",
      "org.dynjs.parser.ast.CompoundAssignmentExpression",
      "org.dynjs.parser.ast.TypeOfOpExpression",
      "org.dynjs.parser.ast.OfOperatorExpression",
      "org.dynjs.parser.ast.Parameter",
      "org.dynjs.parser.ast.FunctionDescriptor",
      "org.dynjs.parser.ast.FunctionDeclaration",
      "org.dynjs.runtime.DeclarativeEnvironmentRecord",
      "org.dynjs.parser.ast.UnaryMinusExpression",
      "org.dynjs.runtime.ArgSetter",
      "org.dynjs.parser.ast.InstanceofExpression",
      "org.dynjs.parser.ast.StringLiteralExpression",
      "org.dynjs.parser.ast.RegexpLiteralExpression",
      "org.dynjs.parser.ast.RegexpLiteralExpression$RegexpLiteralExpressionParser",
      "org.dynjs.exception.DynJSException",
      "org.dynjs.parser.js.ParserException",
      "org.dynjs.parser.js.SyntaxError",
      "org.dynjs.parser.ast.VariableDeclaration",
      "org.dynjs.parser.ast.AbstractIteratingStatement",
      "org.dynjs.parser.ast.AbstractForInStatement",
      "org.dynjs.parser.ast.ForVarDeclInStatement",
      "org.dynjs.parser.ast.PreOpExpression",
      "org.dynjs.parser.ast.FunctionExpression",
      "org.dynjs.parser.ast.NewOperatorExpression",
      "org.dynjs.runtime.Arguments",
      "org.dynjs.parser.ast.InOperatorExpression",
      "org.dynjs.parser.ast.BooleanLiteralExpression",
      "org.dynjs.parser.ast.AdditiveExpression",
      "org.dynjs.parser.ast.BitwiseInversionOperatorExpression",
      "org.dynjs.runtime.ArgGetter",
      "org.dynjs.parser.ast.StrictEqualityOperatorExpression",
      "org.dynjs.parser.ast.WithStatement",
      "org.dynjs.parser.ast.BreakStatement",
      "org.dynjs.parser.ast.ThisExpression",
      "org.dynjs.parser.ast.SwitchStatement",
      "org.dynjs.parser.ast.WhileStatement",
      "org.dynjs.parser.ast.ObjectLiteralExpression",
      "org.dynjs.parser.ast.ForExprOfStatement",
      "org.dynjs.parser.ast.ContinueStatement",
      "org.dynjs.parser.ast.ReturnStatement",
      "org.dynjs.parser.ast.DoWhileStatement",
      "org.dynjs.parser.ast.IdentifierReferenceExpression",
      "org.dynjs.parser.ast.LogicalExpression",
      "org.dynjs.runtime.interp.InterpretingVisitorFactory",
      "org.dynjs.parser.ast.RelationalExpression",
      "org.dynjs.parser.ast.AbstractForStatement",
      "org.dynjs.parser.ast.ForVarDeclStatement",
      "org.dynjs.parser.ast.UnaryPlusExpression",
      "org.dynjs.parser.ast.IfStatement",
      "org.dynjs.parser.ast.AssignmentExpression",
      "org.dynjs.compiler.jit.JITBasicBlockCompiler$1",
      "org.dynjs.compiler.jit.JITBasicBlockCompiler",
      "org.dynjs.compiler.bytecode.AbstractBytecodeCompiler",
      "org.dynjs.compiler.bytecode.BytecodeBasicBlockCompiler",
      "org.dynjs.runtime.NameEnumerator",
      "org.dynjs.runtime.builtins.types.error.StackElement"
    );
  }
}
