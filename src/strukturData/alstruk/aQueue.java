package strukturData.alstruk;

public class aQueue {
    String[] kamus = new String[5];
    int front = 0;
    int rear = 0;

    boolean isFull() {
        if (rear == kamus.length) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpety() {
        if (rear == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enQueue(String data) {
        if (isFull()) {
            System.out.println("Antrian Penuh");
        } else {
            kamus[rear] = data;
            rear++;
        }
        System.out.println("Data Berhasil ditambahkan");
    }

    void deQueue() {

        if (isEmpety()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            String removeQueue = kamus[front];

            for (int i = 0; i < rear; i++) {
                kamus[i] = kamus[i + 1];
            }
            rear--;
            System.out.println("Data Berhasil di hapus");

        }
    }

    void display() {
        for (int i = 0; i < kamus.length; i++) {
            System.out.println(kamus[i]);
        }
    }

    public static void main(String[] args) {
        aQueue kamusADueue = new aQueue();

        kamusADueue.enQueue("Data ke-" + 1);
        kamusADueue.enQueue("Data ke-" + 2);

        kamusADueue.display();

        kamusADueue.deQueue();

        System.out.println("========");

        kamusADueue.display();
    }
}
