public class Main {
    public static void main(String[] args) {
        Minheap heap = new Minheap(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        heap.insert(30);
        heap.insert(2);

        System.out.println("Heap atual:");
        heap.printHeap();
        System.out.println("\nMenor elemento extraído: ");
        System.out.println(heap.extractMin());
        System.out.println("\nHeap após Extract-Min:");
        heap.printHeap();
    }
}
