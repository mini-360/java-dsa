package Queue;

public class ArrayImplementationCircularQueue {
    public static class queue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int x) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is Full");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = x;
            } else if (rear < arr.length - 1) {
                arr[++rear] = x;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = x;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty");
            } else if (front == arr.length - 1) {
                int val = arr[front];
                front = 0;
                size--;
                return val;
            } else {
                int val = arr[front];
                front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            } else {
                if (front <= rear) {
                    for (int i = front; i <= rear; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
                if (rear < front) {
                    for (int i = front; i <= arr.length - 1; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    for (int j = 0; j <= rear; j++) {
                        System.out.print(arr[j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        queue q = new queue();
        q.display();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        System.out.println(q.size);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        q.add(5);
        q.display();
        q.add(10);
    }
}
