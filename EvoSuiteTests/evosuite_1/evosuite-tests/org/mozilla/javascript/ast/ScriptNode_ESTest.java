/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:23:50 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.RegExpLiteral;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.Symbol;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptNode_ESTest extends ScriptNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      XmlString xmlString0 = new XmlString(2);
      scriptNode0.addChildrenToFront(xmlString0);
      StringBuilder stringBuilder0 = new StringBuilder(4);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      scriptNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tSCRIPT -1 1\n2\tXML 2 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(155);
      String string0 = scriptNode0.debugPrint();
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals("155\tSCRIPT 155 1\n", string0);
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals(0, scriptNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      List<Symbol> list0 = scriptNode0.getSymbols();
      scriptNode0.setSymbols(list0);
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals(137, scriptNode0.getType());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(0, scriptNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(1, (Name) null);
      functionNode0.setSourceName("dG kJSivBlA\":+A?s({");
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(155);
      scriptNode0.setInStrictMode(false);
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertFalse(scriptNode0.isInStrictMode());
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setEndLineno(5);
      assertEquals(5, functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1281));
      scriptNode0.setEncodedSourceStart((-1281));
      assertEquals((-1281), scriptNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1281));
      scriptNode0.setEncodedSourceEnd((-253));
      assertEquals((-253), scriptNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.setEncodedSourceBounds(77, 77);
      assertEquals(77, scriptNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1015));
      scriptNode0.setEncodedSource("pc~&Ci+h");
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals(137, scriptNode0.getType());
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      StringBuffer stringBuffer0 = new StringBuffer(4);
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      functionNode0.setCompilerData(astNode_DebugPrintVisitor0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(19, 27);
      // Undeclared exception!
      try { 
        functionNode0.setCompilerData(expressionStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(155);
      scriptNode0.setBaseLineno(4);
      assertEquals(4, scriptNode0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1015));
      scriptNode0.isInStrictMode();
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals("137", scriptNode0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.getSourceName();
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      // Undeclared exception!
      try { 
        scriptNode0.getRegexpString((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(106);
      // Undeclared exception!
      try { 
        scriptNode0.getRegexpFlags(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getRegexpCount();
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, int0);
      assertEquals(0, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.flattenSymbolTable(true);
      // Undeclared exception!
      try { 
        scriptNode0.getParamOrVarName(77);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 77
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      int int0 = scriptNode0.getParamCount();
      assertEquals(0, int0);
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals("137", scriptNode0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.flattenSymbolTable(true);
      scriptNode0.getParamAndVarNames();
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals(137, scriptNode0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(155);
      // Undeclared exception!
      try { 
        scriptNode0.getParamAndVarCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.flattenSymbolTable(false);
      scriptNode0.getParamAndVarConst();
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals(137, scriptNode0.getType());
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1015));
      String string0 = scriptNode0.getNextTempName();
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals("$0", string0);
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      scriptNode0.flattenSymbolTable(false);
      Name name0 = new Name(5);
      name0.setScope(scriptNode0);
      int int0 = scriptNode0.getIndexForNameNode(name0);
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), int0);
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(137, scriptNode0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      List<FunctionNode> list0 = functionNode0.getFunctions();
      assertEquals((-1), functionNode0.getEndLineno());
      assertNotNull(list0);
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode();
      int int0 = scriptNode0.getEndLineno();
      assertEquals((-1), int0);
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(0, scriptNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1015));
      int int0 = scriptNode0.getEncodedSourceStart();
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals(137, scriptNode0.getType());
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getEncodedSourceEnd();
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), int0);
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1281));
      scriptNode0.getEncodedSource();
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals("137", scriptNode0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(0);
      functionNode0.getCompilerData();
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEndLineno());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals(0, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode((-1015));
      int int0 = scriptNode0.getBaseLineno();
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), int0);
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(155);
      Symbol symbol0 = new Symbol();
      symbol0.setContainingTable(scriptNode0);
      Scope.joinScopes(scriptNode0, scriptNode0);
      scriptNode0.addSymbol(symbol0);
      scriptNode0.flattenSymbolTable(false);
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScriptNode scriptNode0 = new ScriptNode(155);
      scriptNode0.flattenSymbolTable(false);
      scriptNode0.getParamAndVarCount();
      assertEquals((-1), scriptNode0.getEndLineno());
      assertEquals((-1), scriptNode0.getEncodedSourceStart());
      assertEquals(0, scriptNode0.getParamCount());
      assertEquals("137", scriptNode0.toString());
      assertEquals((-1), scriptNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      Symbol symbol0 = new Symbol(88, "{r6");
      functionNode0.addSymbol(symbol0);
      assertEquals(1, functionNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      functionNode0.addRegExp(regExpLiteral0);
      assertEquals(0, functionNode0.getParamCount());
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
      assertEquals((-1), functionNode0.getEncodedSourceStart());
      assertEquals((-1), functionNode0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.addFunction(functionNode0);
      assertEquals(1, functionNode0.getFunctionCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      // Undeclared exception!
      try { 
        astRoot0.getFunctionNode((-2240));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }
}