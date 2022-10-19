package cn.itcast.annotation;

public @interface MyAnno {
    int show1();
    String show02();

    Person per();
    MyAnno2 anno2() ;

    String[] str();
}
