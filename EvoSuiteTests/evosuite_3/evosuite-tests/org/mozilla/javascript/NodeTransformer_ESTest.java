/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 01:29:51 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.NodeTransformer;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTransformer_ESTest extends NodeTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode(124);
      PropertyGet propertyGet0 = new PropertyGet(5, 2);
      scriptNode0.addChildToFront(propertyGet0);
      Name name0 = new Name((-1570));
      name0.addChildAfter(scriptNode0, propertyGet0);
      name0.addChild(scriptNode0);
      AstRoot astRoot0 = new AstRoot(159);
      Node node0 = nodeTransformer0.visitLet(false, name0, astRoot0, scriptNode0);
      // Undeclared exception!
      try { 
        nodeTransformer0.visitLet(false, name0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode(124);
      PropertyGet propertyGet0 = new PropertyGet(8, 2);
      scriptNode0.addChildToFront(propertyGet0);
      Name name0 = new Name((-1570));
      name0.addChildAfter(scriptNode0, propertyGet0);
      name0.addChild(scriptNode0);
      AstRoot astRoot0 = new AstRoot(159);
      Node node0 = nodeTransformer0.visitLet(false, name0, astRoot0, scriptNode0);
      // Undeclared exception!
      try { 
        nodeTransformer0.visitLet(true, name0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      FunctionNode functionNode0 = new FunctionNode();
      Name name0 = new Name((-2880), 19, "hl#TO5W(Fp}C-T_k}h5");
      functionNode0.addChildToFront(name0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, true, compilerEnvirons0);
      assertEquals(1, Node.END_DROPS_OFF);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ReturnStatement returnStatement0 = new ReturnStatement();
      scriptNode0.addChildToFront(returnStatement0);
      returnStatement0.setType(8);
      nodeTransformer0.transform(scriptNode0, true, compilerEnvirons0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      FunctionNode functionNode0 = new FunctionNode((-1306));
      NewExpression newExpression0 = new NewExpression(18, 23);
      functionNode0.addChildrenToFront(newExpression0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, false, compilerEnvirons0);
      assertEquals(2, FunctionNode.FUNCTION_EXPRESSION);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      FunctionNode functionNode0 = new FunctionNode((-1306));
      FunctionCall functionCall0 = new FunctionCall(15, 135);
      functionNode0.addChildrenToFront(functionCall0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, true, compilerEnvirons0);
      assertEquals(2, Node.END_RETURNS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      FunctionNode functionNode0 = new FunctionNode();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      functionNode0.setIsGenerator();
      ReturnStatement returnStatement0 = new ReturnStatement();
      functionNode0.addChildToFront(returnStatement0);
      nodeTransformer0.transform((ScriptNode) functionNode0, true, compilerEnvirons0);
      assertFalse(functionNode0.isSetterMethod());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode(123);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      PropertyGet propertyGet0 = new PropertyGet(8, 2);
      scriptNode0.addChildToFront(propertyGet0);
      Name name0 = new Name((-1570));
      name0.addChildAfter(scriptNode0, propertyGet0);
      XmlString xmlString0 = new XmlString();
      xmlString0.addChildAfter(scriptNode0, propertyGet0);
      nodeTransformer0.visitLet(true, scriptNode0, name0, scriptNode0);
      // Undeclared exception!
      nodeTransformer0.transform(scriptNode0, false, compilerEnvirons0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ReturnStatement returnStatement0 = new ReturnStatement(27, 4);
      scriptNode0.addChildToFront(returnStatement0);
      returnStatement0.setType(131);
      // Undeclared exception!
      try { 
        nodeTransformer0.transform(scriptNode0, false, compilerEnvirons0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.ReturnStatement cannot be cast to org.mozilla.javascript.ast.Jump
         //
         verifyException("org.mozilla.javascript.NodeTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode(123);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      PropertyGet propertyGet0 = new PropertyGet(8, 2);
      scriptNode0.addChildToFront(propertyGet0);
      Name name0 = new Name((-1570));
      name0.addChildAfter(scriptNode0, propertyGet0);
      XmlString xmlString0 = new XmlString();
      xmlString0.addChildAfter(scriptNode0, propertyGet0);
      nodeTransformer0.visitLet(false, scriptNode0, name0, scriptNode0);
      // Undeclared exception!
      nodeTransformer0.transform(scriptNode0, false, compilerEnvirons0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Name name0 = new Name((-1570));
      AstRoot astRoot0 = new AstRoot(132);
      FunctionNode functionNode0 = new FunctionNode(4, name0);
      astRoot0.addFunction(functionNode0);
      nodeTransformer0.transform((ScriptNode) astRoot0, false, compilerEnvirons0);
      assertEquals(23, Node.DESTRUCTURING_PARAMS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      FunctionNode functionNode0 = new FunctionNode();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, compilerEnvirons0);
      assertEquals((-1), functionNode0.getEncodedSourceEnd());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      ScriptNode scriptNode0 = new ScriptNode(123);
      PropertyGet propertyGet0 = new PropertyGet(8, 2);
      scriptNode0.addChildToFront(propertyGet0);
      Name name0 = new Name((-1570));
      name0.addChildAfter(scriptNode0, propertyGet0);
      XmlString xmlString0 = new XmlString();
      xmlString0.addChildAfter(scriptNode0, propertyGet0);
      nodeTransformer0.visitLet(false, scriptNode0, (Node) null, scriptNode0);
      assertEquals("130", scriptNode0.toString());
      assertEquals(130, scriptNode0.getType());
  }
}