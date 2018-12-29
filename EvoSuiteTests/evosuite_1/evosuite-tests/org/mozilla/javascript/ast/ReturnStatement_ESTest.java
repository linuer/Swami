/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 16:33:28 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReturnStatement_ESTest extends ReturnStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      XmlLiteral xmlLiteral0 = new XmlLiteral((-2424), 15);
      returnStatement0.setReturnValue(xmlLiteral0);
      returnStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tRETURN -1 1\n-2424\t  XML -2423 15\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(4, returnStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      String string0 = returnStatement0.toSource((-1241));
      assertEquals("return;\n", string0);
      assertEquals("4", returnStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement(0, 1);
      assertEquals(4, returnStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement(3634);
      assertEquals("4", returnStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      returnStatement0.getReturnValue();
      assertEquals("4", returnStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Name name0 = new Name((-1), "l");
      ReturnStatement returnStatement0 = new ReturnStatement((-1), (-1), name0);
      String string0 = returnStatement0.toSource(0);
      assertEquals(1, name0.depth());
      assertEquals("return l;\n", string0);
  }
}