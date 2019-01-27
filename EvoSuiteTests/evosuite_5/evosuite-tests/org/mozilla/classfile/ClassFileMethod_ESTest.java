/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 06:39:54 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassFileMethod_ESTest extends ClassFileMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassFileMethod classFileMethod0 = new ClassFileMethod("org.mozilla.classfile.ClassFileMethod", (short)0, "", (short)1253, (short)1253);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        classFileMethod0.write(byteArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassFileMethod classFileMethod0 = new ClassFileMethod("", (short)635, "", (short)635, (short)635);
      // Undeclared exception!
      try { 
        classFileMethod0.getWriteSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassFileMethod classFileMethod0 = new ClassFileMethod("sBfT1hzh`", (short)0, "sBfT1hzh`", (short)0, (short)0);
      String string0 = classFileMethod0.getType();
      assertEquals("sBfT1hzh`", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassFileMethod classFileMethod0 = new ClassFileMethod("E+5[b5@_i^vI", (short)0, "E+5[b5@_i^vI", (short)0, (short)0);
      String string0 = classFileMethod0.getName();
      assertEquals("E+5[b5@_i^vI", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassFileMethod classFileMethod0 = new ClassFileMethod("E[>@3ZuVwGi?&.~M", (short) (-1), "E[>@3ZuVwGi?&.~M", (short) (-1), (short)1905);
      short short0 = classFileMethod0.getFlags();
      assertEquals((short)1905, short0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassFileMethod classFileMethod0 = new ClassFileMethod("Too big stack: ", (short)0, "", (short) (-638), (short) (-638));
      byte[] byteArray0 = new byte[0];
      classFileMethod0.setCodeAttribute(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }
}
