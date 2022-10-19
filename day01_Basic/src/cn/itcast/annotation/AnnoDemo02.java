package cn.itcast.annotation;

import java.util.Date;

/**
 *
 * @Override  检测标注的方法是否继承自父类
 * @Deprecaed 表示标注的该内容已过时
 * @SuppressWarning 压制警告 一般传递all
 */

@SuppressWarnings("all")
public class AnnoDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show01(){
        //方法有缺陷
    }

    public void demo() {
        show01();
        Date date = new Date();
        System.out.println(date.getDate());
    }


}
