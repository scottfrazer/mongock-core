package io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.mapreduce.impl;

import io.changock.driver.mongo.springdata.v3.driver.decorator.operation.executable.mapreduce.MapReduceWithProjectionDecorator;
import io.changock.driver.api.lock.guard.invoker.LockGuardInvoker;
import org.springframework.data.mongodb.core.ExecutableMapReduceOperation;

public class MapReduceWithProjectionDecoratorImpl<T> implements MapReduceWithProjectionDecorator<T> {

    private final ExecutableMapReduceOperation.MapReduceWithProjection<T> impl;
    private final LockGuardInvoker invoker;

    public MapReduceWithProjectionDecoratorImpl(ExecutableMapReduceOperation.MapReduceWithProjection<T> impl, LockGuardInvoker lockGuardInvoker)  {
        this.impl = impl;
        this.invoker = lockGuardInvoker;
    }
    @Override
    public LockGuardInvoker getInvoker() {
        return invoker;
    }

    @Override
    public ExecutableMapReduceOperation.MapReduceWithProjection<T> getImpl() {
        return impl;
    }
}