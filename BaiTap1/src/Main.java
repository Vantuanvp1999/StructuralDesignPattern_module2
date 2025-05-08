import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Downloader downloader = new FileDownloaderProxy();

        System.out.print("Enter file URL: ");
        String url = scanner.nextLine();

        System.out.print("Enter destination path (e.g., output.txt): ");
        String destination = scanner.nextLine();

        downloader.download(url, destination);
        scanner.close();
    }
}