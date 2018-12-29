/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:17:05 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SwitchCase_ESTest extends SwitchCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      EmptyStatement emptyStatement0 = new EmptyStatement((-186));
      switchCase0.addStatement(emptyStatement0);
      StringBuilder stringBuilder0 = new StringBuilder(27);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchCase0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tCASE -1 -184\n-186\t  EMPTY -185 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-184), switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      XmlLiteral xmlLiteral0 = new XmlLiteral(0);
      switchCase0.setExpression(xmlLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchCase0.visit(astNode_DebugPrintVisitor0);
      assertFalse(switchCase0.isDefault());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(492);
      SwitchCase switchCase1 = new SwitchCase(2);
      switchCase0.addStatement(switchCase1);
      switchCase0.toSource(20);
      assertEquals((-489), switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(0);
      NumberLiteral numberLiteral0 = new NumberLiteral(27);
      switchCase0.setExpression(numberLiteral0);
      switchCase0.toSource(24);
      assertFalse(switchCase0.isDefault());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(0, 0);
      switchCase0.toSource(2640);
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(1, (-4990));
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      InfixExpression infixExpression0 = new InfixExpression((-1965));
      linkedList0.add((AstNode) infixExpression0);
      switchCase0.setStatements(linkedList0);
      assertEquals((-1965), switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(1, (-4990));
      boolean boolean0 = switchCase0.isDefault();
      assertTrue(boolean0);
      assertEquals(116, switchCase0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(0, 0);
      switchCase0.getExpression();
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(0, 0);
      CatchClause catchClause0 = new CatchClause(0);
      switchCase0.addStatement(catchClause0);
      List<AstNode> list0 = FunctionCall.NO_ARGS;
      switchCase0.setStatements(list0);
      assertEquals(1, switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      switchCase0.getStatements();
      assertEquals("116", switchCase0.toString());
  }
}