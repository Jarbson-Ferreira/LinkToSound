package service;

import org.springframework.stereotype.Service;
import util.DownloaderUtil;

@SuppressWarnings("CallToPrintStackTrace")
@Service
public class DownloadService {
    
    public static String downloadAudio(String url) {
        if (url == null || url.isEmpty()) {
            return "url is invalid";
        }
        try {
            return DownloaderUtil.downloadFromUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error when processing the URL.";
        }
    }
}
