public class Count implements Runnable{
    private final Thread myThread;

    public Count() {
        myThread = new Thread(this, "Luong chay cua toi");
        System.out.println("Khoi tao luong cua toi" + myThread);
        myThread.start();
    }


    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("In so luong " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Luong cua toi bi gian doan");
        }
        System.out.println("Luong cua toi da ket thuc");
    }

}
