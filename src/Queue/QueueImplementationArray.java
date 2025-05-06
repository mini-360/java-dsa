package Queue;

/* Array Implementation of queue */
public class QueueImplementationArray {
    public static class queue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int x) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = x;
            } else {
                arr[r + 1] = x;
                r++;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[f];
            f++;
            size--;
            return val;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        public int poll() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[f];
            f++;
            size--;
            return val;
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(10);
        q.add(11);
        q.add(13);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
