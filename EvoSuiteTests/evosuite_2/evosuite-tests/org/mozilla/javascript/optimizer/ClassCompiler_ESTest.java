/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 07:23:12 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.optimizer.ClassCompiler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassCompiler_ESTest extends ClassCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      classCompiler0.setMainMethodClass("#qOjy.J0llo#qOjy.J0llo");
      assertEquals("#qOjy.J0llo#qOjy.J0llo", classCompiler0.getMainMethodClass());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      String string0 = classCompiler0.getMainMethodClass();
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      classCompiler0.getCompilerEnv();
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Class<String> class0 = String.class;
      classCompiler0.setTargetExtends(class0);
      Object[] objectArray0 = classCompiler0.compileToClassFiles("org.mozilla.javascript.optimizer.OptRuntime", "org.mozilla.javascript.optimizer.OptRuntime", 46, "org.mozilla.javascript.optimizer.OptRuntime");
      assertEquals(4, objectArray0.length);
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 16);
      classCompiler0.setTargetImplements(classArray0);
      // Undeclared exception!
      try { 
        classCompiler0.compileToClassFiles("re,addapDterWOObjct", "re,addapDterWOObjct", 168, "re,addapDterWOObjct");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ClassCompiler classCompiler0 = new ClassCompiler(compilerEnvirons0);
      Object[] objectArray0 = classCompiler0.compileToClassFiles("re,addapDterWOObjct", "re,addapDterWOObjct", 168, "re,addapDterWOObjct");
      assertEquals(2, objectArray0.length);
      assertEquals("org.mozilla.javascript.optimizer.OptRuntime", classCompiler0.getMainMethodClass());
  }
}
