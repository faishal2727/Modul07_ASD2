package QueueModul07;
public class antrianApp {
    public static void main(String[] args) {
        var antri = new Antrian(10);
        System.out.println("Muh.Faishal Rizal");
        antri.enQueue(40);
        antri.print();
        antri.enQueue(33);
        antri.print();
        System.out.println("nilai yang paling depan = "+antri.peekDepan());
        antri.enQueue(60);
        antri.print();
        System.out.println("yang diambil dari antrian = "+antri.deQueue());
        antri.print();
        System.out.println("yang diambil dari antrian = "+antri.deQueue());
        antri.print();
        antri.enQueue(54);
        antri.print();
        System.out.println("nilai yang paling depan = "+antri.peekDepan());
        
    }
  
}
