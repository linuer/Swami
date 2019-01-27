/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 19:22:56 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.ShellConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShellConsole_ESTest extends ShellConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("8F!Vz?R{-", "0b");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      String string0 = shellConsole0.readLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("8F!Vz?R{-", "0b");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println("\n}");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 88);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) dataInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("8F!Vz?R{-", "0b");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.print("8F!Vz?R{-");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      File file0 = MockFile.createTempFile("jline.Completor", "xC.C$YS");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) bufferedInputStream0, (PrintStream) mockPrintStream0, charset0);
      InputStream inputStream0 = shellConsole0.getIn();
      assertSame(bufferedInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 11, 0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 12);
      MockPrintStream mockPrintStream0 = new MockPrintStream("_x");
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pushbackInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.flush();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((Scriptable) null, charset0);
      assertNull(shellConsole0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      File file0 = MockFile.createTempFile("pi=te", "pi=te");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("pi=te");
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      String string0 = shellConsole0.readLine("pi=te");
      assertNull(string0);
  }
}
