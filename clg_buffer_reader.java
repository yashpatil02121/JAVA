package com.company;
import java.io.*;
public class clg_buffer_reader {
    public static void main(String[] args) {
        StringBuffer br = new StringBuffer("Yash Patil");
        System.out.println(br);
        br.append(" YP");
        System.out.println(br);
        br.replace(10,13," PY");
        System.out.println(br);
        br.delete(10,13);
        System.out.println(br);
        System.out.println(br.capacity());
        br.ensureCapacity(10);
        br.reverse();
        System.out.println(br);


    }
}
