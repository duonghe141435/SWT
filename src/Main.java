
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bookm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start point: ");
        int start = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the end point: ");
        int end = scanner.nextInt();

        System.out.println(graph.isEdge(start, end));
    }
}
