import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String fileURL, String destination) {
        try {
            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);

            try (InputStream input = connection.getInputStream();
                 FileOutputStream output = new FileOutputStream(destination)) {

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }

                System.out.println("Download completed: " + destination);
            }
        } catch (IOException e) {
            System.out.println("Download failed: " + e.getMessage());
        }}
}
