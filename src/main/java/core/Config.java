package core;

public class Config {
    public static String projectLocation = "C:\\Users\\julia\\dev\\DP\\SERVER";
    public static String storageLocation = projectLocation + "storage\\";
    public static String uploadDir = storageLocation + "tmp";
    public static String ffmpegLocation = projectLocation + "vendor\\ffmpeg.exe";

    public static String apacheUploadDir = "C:\\wamp64\\www\\AndroidFileUpload\\uploads";


    public static String dbName = "postgres";
    public static String dbVideoTable = "videoDB.Videos";
    public static String dbUserTable = "videoDB.Users";
    public static String dbUser = "postgres";
    public static String dbPass = "p";

    public static String hashMethod = "md5";


}
