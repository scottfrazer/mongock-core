package io.changock.driver.mongo.v3.core.decorator;

import com.mongodb.CursorType;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Collation;
import io.changock.driver.mongo.v3.core.decorator.impl.FindIterableDecoratorImpl;
import org.bson.conversions.Bson;

import java.util.concurrent.TimeUnit;

/*
None of the methods in this class need to be re-wrapped in a interceptor because it's returning the instance
itself.
They neither need to be encapsulated with the invoker because they don't hit the database.
 */
public interface FindIterableDecorator<T> extends MongoIterableDecorator<T>, FindIterable<T> {

  @Override
  FindIterable<T> getImpl();

  @Override
  default FindIterable<T> filter(Bson filter) {
    return new FindIterableDecoratorImpl<>(getImpl().filter(filter), getInvoker());
  }

  @Override
  default FindIterable<T> limit(int limit) {
    return new FindIterableDecoratorImpl<>(getImpl().limit(limit), getInvoker());
  }

  @Override
  default FindIterable<T> skip(int skip) {
    return new FindIterableDecoratorImpl<>(getImpl().skip(skip), getInvoker());
  }

  @Override
  default FindIterable<T> maxTime(long maxTime, TimeUnit timeUnit) {
    return new FindIterableDecoratorImpl<>(getImpl().maxTime(maxTime, timeUnit), getInvoker());
  }

  @Override
  default FindIterable<T> maxAwaitTime(long maxAwaitTime, TimeUnit timeUnit) {
    return new FindIterableDecoratorImpl<>(getImpl().maxTime(maxAwaitTime, timeUnit), getInvoker());
  }

  @Override
  @Deprecated
  default FindIterable<T> modifiers(Bson modifiers) {
    return new FindIterableDecoratorImpl<>(getImpl().modifiers(modifiers), getInvoker());
  }

  @Override
  default FindIterable<T> projection(Bson projection) {
    return new FindIterableDecoratorImpl<>(getImpl().projection(projection), getInvoker());
  }

  @Override
  default FindIterable<T> sort(Bson sort) {
    return new FindIterableDecoratorImpl<>(getImpl().sort(sort), getInvoker());
  }

  @Override
  default FindIterable<T> noCursorTimeout(boolean noCursorTimeout) {
    return new FindIterableDecoratorImpl<>(getImpl().noCursorTimeout(noCursorTimeout), getInvoker());
  }

  @Override
  default FindIterable<T> oplogReplay(boolean oplogReplay) {
    return new FindIterableDecoratorImpl<>(getImpl().oplogReplay(oplogReplay), getInvoker());
  }

  @Override
  default FindIterable<T> partial(boolean partial) {
    return new FindIterableDecoratorImpl<>(getImpl().partial(partial), getInvoker());
  }

  @Override
  default FindIterable<T> cursorType(CursorType cursorType) {
    return new FindIterableDecoratorImpl<>(getImpl().cursorType(cursorType), getInvoker());
  }

  @Override
  default FindIterable<T> batchSize(int batchSize) {
    return new FindIterableDecoratorImpl<>(getImpl().batchSize(batchSize), getInvoker());
  }

  @Override
  default FindIterable<T> collation(Collation collation) {
    return new FindIterableDecoratorImpl<>(getImpl().collation(collation), getInvoker());
  }

  @Override
  default FindIterable<T> comment(String comment) {
    return new FindIterableDecoratorImpl<>(getImpl().comment(comment), getInvoker());
  }

  @Override
  default FindIterable<T> hint(Bson hint) {
    return new FindIterableDecoratorImpl<>(getImpl().hint(hint), getInvoker());
  }

  @Override
  default FindIterable<T> max(Bson max) {
    return new FindIterableDecoratorImpl<>(getImpl().max(max), getInvoker());
  }

  @Override
  default FindIterable<T> min(Bson min) {
    return new FindIterableDecoratorImpl<>(getImpl().min(min), getInvoker());
  }

  @Override
  default FindIterable<T> maxScan(long maxScan) {
    return new FindIterableDecoratorImpl<>(getImpl().maxScan(maxScan), getInvoker());
  }

  @Override
  default FindIterable<T> returnKey(boolean returnKey) {
    return new FindIterableDecoratorImpl<>(getImpl().returnKey(returnKey), getInvoker());
  }

  @Override
  default FindIterable<T> showRecordId(boolean showRecordId) {
    return new FindIterableDecoratorImpl<>(getImpl().showRecordId(showRecordId), getInvoker());
  }

  @Override
  default FindIterable<T> snapshot(boolean snapshot) {
    return new FindIterableDecoratorImpl<>(getImpl().snapshot(snapshot), getInvoker());
  }
}
