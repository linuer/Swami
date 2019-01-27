/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 05:10:15 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ConstantPool;
import org.mozilla.classfile.TypeInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeInfo_ESTest extends TypeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(8, (-713), constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.javascript.ObjArray", "org.mozilla.javascript.ObjArray", "org.mozilla.javascript.ObjArray");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(1031, (short)16, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.merge((short)1, (short)4, (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between int and long
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 3;
      // Undeclared exception!
      try { 
        TypeInfo.print(intArray0, 3, intArray0, 26888, (ConstantPool) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.merge(2, 1542, (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between float and uninitialized_this
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[7];
      TypeInfo.print(intArray0, intArray0, (ConstantPool) null);
      assertEquals(7, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.javascript.ObjArray", "org.mozilla.javascript.ObjArray", "org.mozilla.javascript.ObjArray");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(5, 1, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between null and int
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.javascript.ObjArray", "org.mozilla.javascript.ObjArray", "org.mozilla.javascript.ObjArray");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      constantPool0.addConstant((short)16);
      TypeInfo.fromType("org.mozilla.javascript.ObjArray", constantPool0);
      constantPool0.addConstant("org/mozilla/classfile/ConstantEntry");
      int int0 = TypeInfo.merge(1031, 775, constantPool0);
      assertEquals(1799, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("n*B7eN", "n*B7eN", "n*B7eN");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.fromType("n*B7eN", constantPool0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(519, 7, constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("n*B7eN", "n*B7eN", "n*B7eN");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge(5, 7, constantPool0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("z", "z", "z");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge((short)1024, (short)4, constantPool0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("z", "z", "z");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge(233, 233, constantPool0);
      assertEquals(233, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = TypeInfo.isTwoWords((-469));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("z", "z", "z");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.getPayloadAsType((short)32, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // expecting object type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("in*|B7e|N", "_66+01eU]", "Y:OX<");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      constantPool0.addFieldRef("org.mozilla.classfile.ConstantEntry", "_l", "Code");
      TypeInfo.fromType("_66+01eU]", constantPool0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(1031, 2055, constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class '_66+01eU].class' should be in target project, but could not be found!
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("in*|B7e|N", "in*|B7e|N", "in*|B7e|N");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      constantPool0.addConstant((short)16);
      int int0 = TypeInfo.fromType("in*|B7e|N", constantPool0);
      assertEquals(775, int0);
      
      constantPool0.addConstant("java/lang/Object");
      int int1 = TypeInfo.merge(1031, 775, constantPool0);
      assertEquals(1031, int1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      int int0 = TypeInfo.fromType("J", constantPool0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("F", "F", "F");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("F", constantPool0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("D", "D", "D");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("D", constantPool0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("S", constantPool0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("A", "A", "A");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.fromType("A", constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = TypeInfo.UNINITIALIZED_VARIABLE(105);
      assertEquals(26888, int0);
  }
}
