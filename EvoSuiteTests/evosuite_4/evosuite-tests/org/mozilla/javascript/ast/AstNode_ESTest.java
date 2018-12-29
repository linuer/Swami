/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:08:30 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.KeywordLiteral;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.TryStatement;
import org.mozilla.javascript.ast.UnaryExpression;
import org.mozilla.javascript.ast.XmlLiteral;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AstNode_ESTest extends AstNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(151);
      LinkedList<Comment> linkedList0 = new LinkedList<Comment>();
      Token.CommentType token_CommentType0 = Token.CommentType.HTML;
      Comment comment0 = new Comment(4, 16, token_CommentType0, (String) null);
      linkedList0.add(comment0);
      assertEquals(16, comment0.getLength());
      assertEquals(4, comment0.getPosition());
      
      TreeSet<Comment> treeSet0 = new TreeSet<Comment>(linkedList0);
      astRoot0.setComments(treeSet0);
      assertTrue(treeSet0.contains(comment0));
      assertEquals(151, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral();
      xmlLiteral0.toSource();
      assertEquals(1, xmlLiteral0.getLength());
      assertEquals((-1), xmlLiteral0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression(0);
      String string0 = unaryExpression0.shortName();
      assertEquals(0, unaryExpression0.getPosition());
      assertEquals("UnaryExpression", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      XmlPropRef xmlPropRef0 = new XmlPropRef(14);
      xmlPropRef0.parent = (AstNode) functionCall0;
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(functionCall0, xmlPropRef0, 15);
      assertEquals(1, functionCall0.depth());
      assertEquals(15, xmlPropRef0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(3636, 3636);
      NumberLiteral numberLiteral0 = new NumberLiteral(16, "Ce^#FS.Om9Vt", 0);
      arrayLiteral0.addElement(numberLiteral0);
      arrayLiteral0.addElement(numberLiteral0);
      assertEquals((-3620), numberLiteral0.getPosition());
      
      String string0 = arrayLiteral0.toSource(8);
      assertEquals("                [Ce^#FS.Om9Vt, Ce^#FS.Om9Vt]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = AstNode.operatorToString(26);
      assertEquals("!", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        AstNode.operatorToString(4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid operator: 4
         //
         verifyException("org.mozilla.javascript.ast.AstNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlString xmlString0 = new XmlString();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(xmlString0, false);
      boolean boolean0 = expressionStatement0.hasSideEffects();
      assertEquals(0, xmlString0.getPosition());
      assertEquals((-1), expressionStatement0.getAbsolutePosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(107, 107);
      Assignment assignment0 = new Assignment(1, 1, errorNode0, errorNode0);
      boolean boolean0 = assignment0.hasSideEffects();
      assertEquals(1, errorNode0.depth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      XmlPropRef xmlPropRef0 = new XmlPropRef(14);
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(functionCall0, xmlPropRef0, 15);
      xmlMemberGet0.setLineno(14);
      xmlMemberGet0.setTarget(xmlPropRef0);
      assertEquals(14, xmlMemberGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(107, 107);
      Assignment assignment0 = new Assignment(1, 1, errorNode0, errorNode0);
      errorNode0.getEnclosingScope();
      assertEquals(1, errorNode0.depth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall();
      XmlPropRef xmlPropRef0 = new XmlPropRef(14);
      xmlPropRef0.parent = (AstNode) functionCall0;
      xmlPropRef0.getEnclosingFunction();
      assertEquals(13, xmlPropRef0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral();
      keywordLiteral0.getAstRoot();
      assertEquals(1, keywordLiteral0.getLength());
      assertEquals((-1), keywordLiteral0.getAbsolutePosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(107, 107);
      Assignment assignment0 = new Assignment(1, 1, errorNode0, errorNode0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      errorNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals(1, errorNode0.depth());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Name name0 = new Name();
      String string0 = name0.debugPrint();
      assertEquals("-1\tNAME -1 1 null\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      ElementGet elementGet0 = new ElementGet();
      int int0 = tryStatement0.compareTo((AstNode) elementGet0);
      assertEquals(1, elementGet0.getLength());
      assertEquals((-1), elementGet0.getAbsolutePosition());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop(503, (-540));
      // Undeclared exception!
      try { 
        doLoop0.setLoop((Jump) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement();
      // Undeclared exception!
      try { 
        labeledStatement0.setLabels((List<Label>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // arg cannot be null
         //
         verifyException("org.mozilla.javascript.ast.AstNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(1378);
      ContinueStatement continueStatement0 = new ContinueStatement(0, (Name) null);
      tryStatement0.addChild(continueStatement0);
      assertEquals(1, continueStatement0.depth());
      assertEquals((-1378), continueStatement0.getPosition());
  }
}