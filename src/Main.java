public class Main {
    public static void main(String args[])
    {
        Count count = new Count();
        try
        {
            while(count.getMyThread().isAlive())
            {
                System.out.println("Chuoi chinh ton tai khi chuoi con hoat dong");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Chuoi chinh bi gian doan");
        }
        System.out.println("Luong chay chinh da ket thuc" );
    }
}
