/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 00:17:44 GMT 2022
 */

package org.lombrozo.bunny.consumer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.concurrent.BlockingDeque;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.lombrozo.bunny.connection.Connection;
import org.lombrozo.bunny.connection.TestChannel;
import org.lombrozo.bunny.connection.TestConnection;
import org.lombrozo.bunny.consumer.ResponsibleQueueConsumer;
import org.lombrozo.bunny.domain.queue.Queue;
import org.lombrozo.bunny.function.ConsumerHandler;
import org.lombrozo.bunny.function.Handler;
import org.lombrozo.bunny.message.Message;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResponsibleQueueConsumer_ESTest extends ResponsibleQueueConsumer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, BlockingDeque<Message>> hashMap0 = new HashMap<String, BlockingDeque<Message>>();
      TestChannel testChannel0 = new TestChannel(hashMap0);
      TestConnection testConnection0 = new TestConnection(testChannel0);
      ResponsibleQueueConsumer responsibleQueueConsumer0 = new ResponsibleQueueConsumer((Queue) null, testConnection0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Connection.Fake connection_Fake0 = new Connection.Fake();
      ResponsibleQueueConsumer responsibleQueueConsumer0 = new ResponsibleQueueConsumer((String) null, connection_Fake0);
      Consumer<Message> consumer0 = (Consumer<Message>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      ConsumerHandler consumerHandler0 = new ConsumerHandler(consumer0);
      responsibleQueueConsumer0.subscribe(consumerHandler0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TestConnection testConnection0 = new TestConnection();
      ResponsibleQueueConsumer responsibleQueueConsumer0 = new ResponsibleQueueConsumer("M2,3.']) FJi!h@", testConnection0);
      Handler.Echo handler_Echo0 = new Handler.Echo();
      // Undeclared exception!
      try { 
        responsibleQueueConsumer0.subscribe(handler_Echo0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/rabbitmq/client/DefaultConsumer
         //
         verifyException("org.lombrozo.bunny.domain.queue.NamedQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ResponsibleQueueConsumer responsibleQueueConsumer0 = new ResponsibleQueueConsumer("+_1nku]Ji$%j95>", (Connection) null);
      // Undeclared exception!
      try { 
        responsibleQueueConsumer0.subscribe((Handler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.lombrozo.bunny.domain.queue.NamedQueue", e);
      }
  }
}
