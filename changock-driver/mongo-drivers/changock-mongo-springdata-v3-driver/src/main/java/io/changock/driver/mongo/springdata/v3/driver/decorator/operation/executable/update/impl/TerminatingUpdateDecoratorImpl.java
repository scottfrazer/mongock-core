package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.update.TerminatingUpdateDecorator;
import io.changock.driver.api.lock.guard.decorator.DecoratorBase;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableUpdateOperation;

public class TerminatingUpdateDecoratorImpl<T> extends DecoratorBase<ExecutableUpdateOperation.TerminatingUpdate<T>> implements TerminatingUpdateDecorator<T> {
  public TerminatingUpdateDecoratorImpl(ExecutableUpdateOperation.TerminatingUpdate<T> impl, LockGuardInvoker invoker) {
    super(impl, invoker);
  }
}