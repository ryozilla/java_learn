package train.t10;

/*
 * 判断后缀名
 * 设计一个方法，根据传入的文件名字符串判断该文件是不是MP4格式。
 * */
public class Complex3 {
    public static void main(String[] args) {
        String fileName = "studySource.mp4";
        System.out.println(isMP4(fileName));
    }

    protected static boolean isMP4(String file) {
        String suffix = file.substring(file.indexOf("."));
        if (suffix.equals(".mp4") || suffix.equals(".MP4")) {
            return true;
        }
        return false;
    }
}
