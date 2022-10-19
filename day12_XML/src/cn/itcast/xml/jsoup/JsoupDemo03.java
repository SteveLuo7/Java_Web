package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
//        Document document = Jsoup.parse(new File(path), "UTF-8");
//        Elements elements = document.getElementsByTag("name");
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        Elements id = document.getElementsByAttribute("id");
        System.out.println(id);

        Elements s001 = document.getElementsByAttributeValue("name","s001");
        System.out.println(s001);

        Element itcast = document.getElementById("itcast");
        System.out.println(itcast);

    }
}
