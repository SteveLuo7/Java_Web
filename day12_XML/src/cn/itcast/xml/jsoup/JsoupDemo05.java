package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo05 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo05.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        Elements name = document.select("name");
        System.out.println(name);
        System.out.println("=======================");

        Elements itcast = document.select("#itcast");
        System.out.println(itcast);
        System.out.println("============================");


        Elements select = document.select("student[number='s001']");
        System.out.println(select);
        System.out.println("========================");

        Elements select2 = document.select("student[number='s001'] > age");
        System.out.println(select2);
    }
}
