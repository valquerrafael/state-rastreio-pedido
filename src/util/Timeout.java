package util;

public abstract class Timeout {

    public static void timeout() {
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
