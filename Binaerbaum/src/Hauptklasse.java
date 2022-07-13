import java.util.Random;
import java.util.Scanner;

public class Hauptklasse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinTree binTree = new BinTree();
		int action = 0;

		binTree.newNode(20);
		binTree.newNode(42);
		binTree.newNode(1);
		binTree.newNode(19);
		binTree.newNode(70);
		binTree.newNode(56);
		binTree.newNode(43);
		binTree.newNode(90);
		binTree.newNode(87);
		binTree.newNode(25);
		binTree.newNode(71);
		binTree.newNode(69);
		binTree.newNode(11);
		binTree.newNode(23);
		binTree.newNode(65);
		
		while (true) {
			System.out.println("Möchten Sie eine Zahl hinzufügem(1)");
			System.out.println("In Postorder ausgeben lassen(2)");
			System.out.println("In PreOrder ausgeben lassen(3)");
			System.out.println("In InOrder ausgeben lasen(4)");
			System.out.println("Oder ein Element löschen(5)?: ");
			
			try {
				action = Integer.parseInt(sc.next());
			} catch (Exception e) {
				System.out.println("Ungültige Eingabe!");
			}
			

			switch (action) {
			case 1:
				int insNum = 0;
				System.out.print("Eingabe Zahl in den Baum: ");
				try {
					insNum  = Integer.parseInt(sc.next());
				} catch (Exception e) {
					System.out.println("Ungültige Eingabe!");
					break;
				}
				binTree.newNode(insNum);
				break;
			case 2:
				binTree.ausgabePostOrder();
				//empty println for new row
				System.out.println();
				break;
			case 3:
				binTree.ausgabePreOrder();
				//empty println for new row
				System.out.println();
				break;
			case 4:
				binTree.ausgabeInOrder();
				//empty println for new row
				System.out.println();
				break;
			case 5:
				System.out.print("Eingabe zu löschende Zahl aus dem Baum: ");
				int delNum = 0;
				try {
					delNum  = Integer.parseInt(sc.next());
				} catch (Exception e) {
					System.out.println("Ungültige Eingabe!");
					break;
				}
				// create random number to randomize left/right delete
				Random rdm = new Random();
				int rdmZahl = rdm.nextInt(1);
				binTree.deleteNode(delNum, rdmZahl);
				break;
			default:
				break;

			}
		}

	}
}
