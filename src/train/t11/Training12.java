package train.t11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 检查计算机是否联网
 * 使用 Java 代码检查计算机是否联网(提示：ping命令)
 * */
public class Training12 {
    static Runtime runtime = Runtime.getRuntime();

    public static void main(String[] args) {
        //获取本机ip地址
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            //cmd Ping 指定的主机。
            String code = "ping " + ip;
            runCode(code);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    protected static void runCode(String code) {
        try {
            //获取进程对象
            Process process = runtime.exec(code);
            //获取进程的字节输入流
            InputStream inputStream = process.getInputStream();
            //将字节输入流转换为字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "GBK"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
