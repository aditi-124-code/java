public class QueueUsingArray {
    private int maxSize; 
    private int[] queueArray;
    private int front; 
    private int rear; 
    private int currentSize;

    public QueueUsingArray(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int value) {
        if (currentSize < maxSize) {
            rear = (rear + 1) % maxSize; 
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Enqueued: " + value);
        } else {
            System.out.println("Queue is full. Cannot enqueue.");
        }
    }

    public int dequeue() {
        if (currentSize > 0) {
            int dequeuedValue = queueArray[front];
            front = (front + 1) % maxSize; 
            currentSize--;
            System.out.println("Dequeued: " + dequeuedValue);
            return dequeuedValue;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }
}

