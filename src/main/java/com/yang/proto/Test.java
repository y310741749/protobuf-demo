package com.yang.proto;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Demo1.Person person = Demo1.Person.newBuilder().setId(1).setEmail("a.163.com").setName("小明").build();
        person.writeTo(new FileOutputStream("d:/prototbuf.data"));
    }
}
