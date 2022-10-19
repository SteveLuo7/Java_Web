package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo04 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo04.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");

        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());

        Element student = document.getElementsByTag("student").get(0);
        Elements name = student.getElementsByTag("name");
        System.out.println("==================");
        System.out.println(name.size());
    }
}
