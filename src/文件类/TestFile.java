package 文件类;

import java.io.File;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("/home/puppet/WorkSpace/IdeaProjects/");
        System.out.println(file);
//        file.renameTo(new File(""))
        System.out.println(System.getProperty("user.dir"));

        System.out.println("File是否存在：" + file.exists());
        System.out.println("File是否是目录：" + file.isDirectory());
        System.out.println("File是否是文件：" + file.isFile());
        System.out.println("File最后修改时间：" + new Date(file.lastModified()));
        System.out.println("File的大小：" + file.length());
        System.out.println("File的文件名：" + file.getName());
        System.out.println("File的目录路径：" + file.getAbsolutePath());

        File f = new File("/home/puppet/WorkSpace/file");
        boolean flag = f.mkdirs();
        //mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        //mkdirs();//目录结构中有一个不存在也没关系；创建整个目录树
        System.out.println(flag);
    }
}
