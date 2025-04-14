package util;

import java.io.IOException;

public class DownloaderUtil {
    private static final String DOWNLOAD_DIR = "src/main/java/com/example/LinkToSound/controller/downloaded-audios";

    public static String downloadFromUrl(String url) throws IOException, InterruptedException {
        String outputTemplate = "audio-%d".formatted(System.currentTimeMillis());
        ProcessBuilder builder = new ProcessBuilder("yt-dlp", "-x", "--audio-format", "mp3", "-o", DOWNLOAD_DIR + "/" + outputTemplate + ".%(ext)s", url);

        builder.inheritIO();
        Process process = builder.start();
        int exitCode = process.waitFor();

        if (exitCode == 0) {
            return outputTemplate + ".mp3";
        } else {
            throw new RuntimeException("Failed to download audio");
        }
    }
}