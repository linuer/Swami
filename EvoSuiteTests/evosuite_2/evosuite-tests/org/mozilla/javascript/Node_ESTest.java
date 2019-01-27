/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:17:43 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Block;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.ForLoop;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.KeywordLiteral;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.StringLiteral;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.TryStatement;
import org.mozilla.javascript.ast.XmlDotQuery;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(2);
      Node.NodeIterator node_NodeIterator0 = labeledStatement0.new NodeIterator();
      // Undeclared exception!
      try { 
        node_NodeIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // next() has not been called
         //
         verifyException("org.mozilla.javascript.Node$NodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(98);
      node0.addChildrenToBack(node0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      node0.forEach(consumer0);
      assertEquals(98, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef(0);
      AstRoot astRoot0 = new AstRoot(0);
      xmlPropRef0.toStringTree(astRoot0);
      assertEquals((-1), astRoot0.getLineno());
      assertEquals((-1), xmlPropRef0.getLineno());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(19, 1);
      String string0 = errorNode0.toString();
      assertEquals("-1", string0);
      assertEquals((-1), errorNode0.getLineno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newString((-418), "invalid label name");
      node0.setString("9u Qg;]0Ik'68K(");
      assertEquals((-1), node0.getLineno());
      assertEquals((-418), node0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery();
      AstRoot astRoot0 = new AstRoot(4);
      // Undeclared exception!
      try { 
        xmlDotQuery0.setScope(astRoot0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(122, "5gcP+ka,A3nVNW^", 122);
      assertEquals((-1), numberLiteral0.getLineno());
      assertEquals(122.0, numberLiteral0.getNumber(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(126);
      EmptyExpression emptyExpression0 = new EmptyExpression();
      node0.addChildToBack(emptyExpression0);
      node0.resetTargets();
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Yield yield0 = new Yield();
      // Undeclared exception!
      try { 
        yield0.resetTargets();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(131);
      node0.addChildrenToBack(node0);
      node0.addChildBefore(node0, node0);
      node0.replaceChildAfter(node0, node0);
      assertEquals("131", node0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(131);
      PropertyGet propertyGet0 = new PropertyGet(0, 5);
      node0.addChildrenToBack(propertyGet0);
      node0.addChildrenToBack(node0);
      assertTrue(node0.hasChildren());
      
      node0.replaceChild(node0, node0);
      assertEquals("131", node0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.putIntProp((-3356), (-3356));
      functionNode0.putProp((-3356), (Object) null);
      assertEquals((-1), functionNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      tryStatement0.putIntProp(605, (-843));
      tryStatement0.setJsDocNode((Comment) null);
      assertEquals((-1), tryStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Yield yield0 = new Yield();
      yield0.removeChildren();
      assertEquals((-1), yield0.getLineno());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(98);
      node0.first = node0;
      Node node1 = Node.newString(2, "v.d.R=R@=3");
      node0.addChildToFront(node1);
      node0.removeChild(node0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = Node.newString("f1'}8&jC`Eou/");
      Node.NodeIterator node_NodeIterator0 = node0.new NodeIterator();
      // Undeclared exception!
      try { 
        node_NodeIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Node$NodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      assertEquals((-1), node0.getLineno());
      assertEquals(0.0, node0.getDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      tryStatement0.putIntProp(605, (-843));
      tryStatement0.putProp(8, "FOR");
      assertEquals((-1), tryStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = new Node(90);
      node0.first = node0;
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      node0.first.addChildrenToBack(objectLiteral0);
      boolean boolean0 = node0.hasSideEffects();
      assertEquals(90, node0.getType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(90);
      boolean boolean0 = node0.hasSideEffects();
      assertTrue(boolean0);
      assertEquals(90, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = new Node(98);
      boolean boolean0 = node0.hasSideEffects();
      assertEquals((-1), node0.getLineno());
      assertEquals("98", node0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement(4, 16);
      ThrowStatement throwStatement0 = new ThrowStatement(1281, expressionStatement0);
      boolean boolean0 = throwStatement0.hasChildren();
      assertFalse(boolean0);
      assertEquals((-1), throwStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      // Undeclared exception!
      try { 
        tryStatement0.getString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        functionNode0.getScope();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.FunctionNode cannot be cast to org.mozilla.javascript.ast.Name
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Name name0 = new Name(22, 25, "Z");
      name0.getNext();
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = new Node(94);
      int int0 = node0.getLineno();
      assertEquals(94, node0.getType());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InfixExpression infixExpression0 = new InfixExpression(2016, 2016);
      infixExpression0.getLastChild();
      assertEquals((-1), infixExpression0.getLineno());
      assertEquals("-1", infixExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(163, 1, token_CommentType0, "R(6]A?;0+q!bIi");
      stringLiteral0.setJsDocNode(comment0);
      String string0 = stringLiteral0.getJsDoc();
      assertEquals((-1), stringLiteral0.getLineno());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement();
      throwStatement0.getJsDoc();
      assertEquals((-1), throwStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      Yield yield0 = new Yield(151, 24, xmlPropRef0);
      yield0.labelId(7);
      int int0 = yield0.labelId();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = new Node(94);
      node0.getFirstChild();
      assertEquals("94", node0.toString());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = Node.newTarget();
      assertEquals(132, node0.getType());
      
      node0.labelId(7);
      int int0 = node0.getExistingIntProp(15);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      InfixExpression infixExpression0 = new InfixExpression((-2779), tryStatement0, tryStatement0, (-650));
      // Undeclared exception!
      try { 
        infixExpression0.getDouble();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.InfixExpression cannot be cast to org.mozilla.javascript.ast.NumberLiteral
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      LabeledStatement labeledStatement0 = new LabeledStatement();
      returnStatement0.addChildToBack(labeledStatement0);
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(2, 27);
      // Undeclared exception!
      try { 
        returnStatement0.replaceChild(xmlMemberGet0, xmlMemberGet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = new Node(90);
      node0.first = node0;
      node0.removeChild(node0);
      assertFalse(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Block block0 = new Block();
      BreakStatement breakStatement0 = new BreakStatement();
      ForLoop forLoop0 = new ForLoop(13);
      breakStatement0.setJumpStatement(forLoop0);
      block0.addStatement(breakStatement0);
      boolean boolean0 = block0.hasConsistentReturnUsage();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Block block0 = new Block();
      Jump jump0 = new Jump(8);
      block0.addStatement(jump0);
      boolean boolean0 = block0.hasConsistentReturnUsage();
      assertTrue(block0.hasChildren());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Block block0 = new Block();
      SwitchStatement switchStatement0 = new SwitchStatement();
      block0.addStatement(switchStatement0);
      boolean boolean0 = block0.hasConsistentReturnUsage();
      assertTrue(block0.hasChildren());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Block block0 = new Block();
      Label label0 = new Label(26);
      block0.addStatement(label0);
      // Undeclared exception!
      try { 
        block0.hasConsistentReturnUsage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Block block0 = new Block();
      boolean boolean0 = block0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), block0.getLineno());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      LabeledStatement labeledStatement0 = new LabeledStatement();
      returnStatement0.addChildToBack(labeledStatement0);
      boolean boolean0 = returnStatement0.hasConsistentReturnUsage();
      assertTrue(returnStatement0.hasChildren());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ReturnStatement returnStatement0 = new ReturnStatement();
      boolean boolean0 = returnStatement0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), returnStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ThrowStatement throwStatement0 = new ThrowStatement();
      boolean boolean0 = throwStatement0.hasConsistentReturnUsage();
      assertEquals((-1), throwStatement0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Yield yield0 = new Yield();
      boolean boolean0 = yield0.hasConsistentReturnUsage();
      assertEquals((-1), yield0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(26, 0);
      ArrayComprehension arrayComprehension0 = new ArrayComprehension();
      labeledStatement0.addChildrenToBack(arrayComprehension0);
      boolean boolean0 = labeledStatement0.hasConsistentReturnUsage();
      assertTrue(labeledStatement0.hasChildren());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LabeledStatement labeledStatement0 = new LabeledStatement(26, 0);
      boolean boolean0 = labeledStatement0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), labeledStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = Node.newTarget();
      boolean boolean0 = node0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals(132, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(1281, (-1419));
      ExpressionStatement expressionStatement0 = new ExpressionStatement(4, 16);
      ThrowStatement throwStatement0 = new ThrowStatement(1281, expressionStatement0);
      throwStatement0.addChildrenToFront(keywordLiteral0);
      assertTrue(throwStatement0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = new Node(98);
      node0.addChildrenToBack(node0);
      node0.replaceChild(node0, node0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Yield yield0 = new Yield();
      Node node0 = new Node(682, yield0);
      assertTrue(node0.hasChildren());
      
      node0.addChildToBack(yield0);
      assertEquals("682", node0.toString());
      assertEquals((-1), yield0.getLineno());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Node node0 = new Node(98);
      node0.first = node0;
      Node node1 = Node.newString(2, "v.d.R=R@=3");
      node0.addChildToFront(node1);
      assertEquals(2, node1.getType());
      
      node0.addChildBefore(node0, node0);
      assertEquals(98, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Node node0 = new Node(131);
      node0.first = node0;
      Node node1 = Node.newString(2, "v.d.R=R@=3");
      node0.addChildBefore(node0, node0);
      CatchClause catchClause0 = new CatchClause();
      // Undeclared exception!
      try { 
        node1.addChildAfter(node0, catchClause0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // newChild had siblings in addChildAfter
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      KeywordLiteral keywordLiteral0 = new KeywordLiteral();
      ErrorNode errorNode0 = new ErrorNode();
      keywordLiteral0.addChildAfter(errorNode0, errorNode0);
      // Undeclared exception!
      try { 
        keywordLiteral0.addChildBefore(errorNode0, errorNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // newChild had siblings in addChildBefore
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Node node0 = Node.newTarget();
      Node node1 = new Node(6, node0, node0, node0, 1);
      // Undeclared exception!
      node1.addChildrenToBack(node0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression(874, 64);
      Node node0 = new Node(874, emptyExpression0, emptyExpression0);
      Node.NodeIterator node_NodeIterator0 = node0.new NodeIterator();
      assertTrue(node_NodeIterator0.hasNext());
      
      node_NodeIterator0.next();
      node_NodeIterator0.remove();
      node_NodeIterator0.remove();
      node_NodeIterator0.remove();
      assertFalse(node0.hasChildren());
      assertEquals("874", node0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(0, 0);
      Node node0 = new Node(1910, switchStatement0, 45);
      assertEquals(1910, node0.getType());
      assertEquals((-1), switchStatement0.getLineno());
      assertTrue(node0.hasChildren());
      assertEquals(45, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery();
      Node node0 = new Node(0, xmlDotQuery0);
      boolean boolean0 = node0.hasSideEffects();
      assertEquals((-1), node0.getLineno());
      assertTrue(node0.hasChildren());
      assertEquals("0", node0.toString());
      assertEquals((-1), xmlDotQuery0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Node node0 = new Node(3813, 3813);
      Node node1 = new Node(3813, node0, node0, 0);
      assertEquals(3813, node0.getType());
      assertEquals(3813, node0.getLineno());
      assertEquals(3813, node1.getType());
      assertEquals(0, node1.getLineno());
  }
}
