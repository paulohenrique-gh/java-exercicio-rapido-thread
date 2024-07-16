public class Main {
    public static void main(String[] args) {
        DownloadTask downloadFile1 = new DownloadTask("File 1");
        DownloadTask downloadFile2 = new DownloadTask("File 2");
        DownloadTask downloadFile3 = new DownloadTask("File 3");
        DownloadTask downloadFile4 = new DownloadTask("File 4");

        downloadFile1.start();
        downloadFile2.start();
        downloadFile3.start();
        downloadFile4.start();

        try {
            downloadFile1.join();
            downloadFile2.join();
            downloadFile3.join();
            downloadFile4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All files have been downloaded");
    }
}
