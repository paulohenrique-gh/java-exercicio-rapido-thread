public class DownloadTask extends Thread {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Downloading " + this.fileName + "...");

        long multiplier = (long) (Math.random() * 10) + 1;

        try {
           Thread.sleep(1000L * multiplier);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.fileName + " downloaded in " + multiplier + " seconds");
    }
}
