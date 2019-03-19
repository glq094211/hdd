package com.hdd.util;


import java.lang.annotation.Repeatable;

@Repeatable(MyAnnotations.class)
@interface MyAnnotation {
    String hero() default "invoker";
}


@interface MyAnnotations {
    MyAnnotation [] value();
}
