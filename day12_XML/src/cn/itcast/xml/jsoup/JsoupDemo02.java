package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
//        Document document = Jsoup.parse(new File(path), "UTF-8");
//        Elements elements = document.getElementsByTag("name");
//
//        System.out.println(document);
//        String str = "<!--?xml version=\"1.0\" encoding=\"UTF-8\" ?-->\n" +
//                "<html>\n" +
//                " <head></head>\n" +
//                " <body>\n" +
//                "  <student> \n" +
//                "   <student number=\"s001\"> \n" +
//                "    <name>\n" +
//                "     zhangsan\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     18\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     male\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "   <student number=\"s002\"> \n" +
//                "    <name>\n" +
//                "     lisi\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     18\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     female\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "  </student>\n" +
//                " </body>\n" +
//                "</html>";
//
//
//       Document document =  Jsoup.parse(str);
//
//        System.out.println(document);
        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509");
        Document d = Jsoup.parse(url, 5000);
        System.out.println(d);


    }
}
