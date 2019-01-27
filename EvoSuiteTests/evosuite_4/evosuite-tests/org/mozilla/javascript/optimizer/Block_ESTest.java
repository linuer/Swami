/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:33:33 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.optimizer.Block;
import org.mozilla.javascript.optimizer.OptFunctionNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Block_ESTest extends Block_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      GeneratorExpression generatorExpression0 = new GeneratorExpression(21);
      expressionStatement0.setType(55);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) optFunctionNode0.fnode;
      nodeArray0[1] = (Node) expressionStatement0;
      nodeArray0[2] = (Node) generatorExpression0;
      nodeArray0[3] = (Node) generatorExpression0;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.ExpressionStatement cannot be cast to org.mozilla.javascript.ast.Name
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(false);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ReturnStatement returnStatement0 = new ReturnStatement(25, 1);
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      ObjectProperty objectProperty0 = new ObjectProperty();
      XmlPropRef xmlPropRef0 = new XmlPropRef(11, 5);
      objectProperty0.addChildToFront(xmlPropRef0);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) objectProperty0;
      nodeArray0[1] = (Node) returnStatement0;
      nodeArray0[2] = (Node) generatorExpression0;
      objectProperty0.setOperator(157);
      nodeArray0[3] = (Node) optFunctionNode0.fnode;
      nodeArray0[4] = (Node) functionNode0;
      nodeArray0[5] = (Node) functionNode0;
      NumberLiteral numberLiteral0 = new NumberLiteral();
      nodeArray0[6] = (Node) numberLiteral0;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Block", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      ObjectProperty objectProperty0 = new ObjectProperty();
      XmlPropRef xmlPropRef0 = new XmlPropRef(11, 5);
      objectProperty0.addChildToFront(xmlPropRef0);
      objectProperty0.setOperator(107);
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = (Node) expressionStatement0;
      nodeArray0[1] = (Node) xmlPropRef0;
      nodeArray0[2] = (Node) functionNode0;
      nodeArray0[3] = (Node) functionNode0;
      nodeArray0[4] = (Node) objectProperty0;
      nodeArray0[5] = (Node) optFunctionNode0.fnode;
      Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      Node[] nodeArray0 = new Node[1];
      Jump jump0 = new Jump(18, expressionStatement0, 7);
      nodeArray0[0] = (Node) jump0;
      Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
      assertFalse(optFunctionNode0.isTargetOfDirectCall());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(18, 22);
      ReturnStatement returnStatement0 = new ReturnStatement();
      Node[] nodeArray0 = new Node[7];
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      nodeArray0[0] = (Node) generatorExpression0;
      nodeArray0[1] = (Node) expressionStatement0;
      nodeArray0[2] = (Node) returnStatement0;
      generatorExpression0.setType(6);
      nodeArray0[3] = (Node) functionNode0;
      ObjectProperty objectProperty0 = new ObjectProperty();
      nodeArray0[4] = (Node) objectProperty0;
      nodeArray0[5] = (Node) functionNode0;
      nodeArray0[6] = (Node) returnStatement0;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Block", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      Node node0 = Node.newTarget();
      LetNode letNode0 = new LetNode(18);
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = node0;
      nodeArray0[1] = (Node) letNode0;
      nodeArray0[2] = node0;
      nodeArray0[3] = (Node) letNode0;
      nodeArray0[4] = node0;
      nodeArray0[5] = (Node) letNode0;
      Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
      assertEquals(6, nodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(false);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      GeneratorExpression generatorExpression0 = new GeneratorExpression();
      Node node0 = expressionStatement0.setType(7);
      Node node1 = Node.newTarget();
      Node[] nodeArray0 = new Node[11];
      nodeArray0[1] = (Node) generatorExpression0;
      nodeArray0[2] = node0;
      nodeArray0[0] = node1;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Block", e);
      }
  }
}
