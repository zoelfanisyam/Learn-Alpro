package strukturData.alstruk;

public class aStack {
    // Deklarasi Stack
    String[] data = new String[5];
    int top;

    boolean isFull() {
        if (top == data.length) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpety() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    void push(String data) {
        if (isFull()) {
            System.out.println("Data Penuh");
        } else {
            this.data[top] = data;
            top++;
        }
    }

    void pop() {
        if (isEmpety()) {
            System.out.println("Stack Kosong");
        } else {
            this.data[top - 1] = "";
            top--;
        }
    }

    void display() {
        if (isEmpety()) {
            System.out.println("Stack Kosong");
        } else {
            for (int i = (data.length - 1); i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        aStack data1 = new aStack();
        for (int i = 0; i <= 4; i++) {
            data1.push("Data ke-" + (i + 1));
        }
        data1.pop();
        data1.pop();
        data1.pop();
        data1.display();
    }
}
