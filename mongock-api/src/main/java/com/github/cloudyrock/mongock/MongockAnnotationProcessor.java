package com.github.cloudyrock.mongock;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;

public class MongockAnnotationProcessor implements AnnotationProcessor {

  public Collection<Class<? extends Annotation>> getChangeLogAnnotationClass() {
    return Collections.singletonList(ChangeLog.class);
  }

  @Override
  public boolean isChangeSetAnnotated(Method method) {
    return method.isAnnotationPresent(ChangeSet.class);
  }

  @Override
  public String getChangeLogOrder(Class<?> type) {
    return type.getAnnotation(ChangeLog.class).order();
  }

  public ChangeSetItem getChangeSet(Method method) {
    ChangeSet ann = method.getAnnotation(ChangeSet.class);
    return new ChangeSetItem(ann.id(), ann.author(), ann.order(), ann.runAlways(), ann.systemVersion(), ann.failFast(), method);
  }
}
