import java.net.MalformedURLException;

public class FileDownloaderProxy implements Downloader {
    private static final String FIREFOX_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/117.0";

    @Override
    public void download(String fileURL, String destination) {
        FileDownloader realDownloader = new FileDownloader(FIREFOX_USER_AGENT);
        realDownloader.download(fileURL, destination);
    }
}
