/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 15:08:24 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.InterpreterData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Arguments_ESTest extends Arguments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(176, "arguments", "arguments", false);
      String[] stringArray0 = new String[2];
      interpreterData0.argNames = stringArray0;
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1, "arguments", "arguments", false);
      String[] stringArray0 = new String[2];
      interpreterData0.argNames = stringArray0;
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}