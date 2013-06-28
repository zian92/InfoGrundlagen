package g04_C.a43;

/**
 *  Testklasse zu Aufgabe 43 / Blatt 11 / Sommersemester 2013
 */
public class TreeTest {


    /**
     *  Erzeugt aus einem Feld, das die Inorder-Traversierung eines
     *  Binaerbaums B speichert, und einem Feld, das die Postorder-
     *  Traversierung von B speichert, eine Baumdarstellung von B.
     *  @param inorder Feld, das die Inorder-Traversierung von B speichert.
     *  @param postorder Feld, das die Postorder-Traversierung von B speichert.
     *  @return Baumdarstellung von B.
     */
    public BinaryTree<Character> createTree(Character[] inorder, Character[] postorder) {

	//  Der Einfachheit halber darf angenommen werden, dass die
	//  Eingabe-Parameter gueltig sind.

	/*
	  Hier Loesung einfuegen.
	*/

	return null;

    }

    public void run() {

	boolean passed = true;

	//  Beispielbaum aus Aufgabeteil (a)
	Character[] inorder1   = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	Character[] postorder1 = {'A', 'C', 'E', 'D', 'B', 'G', 'I', 'H', 'F'};
	BinaryTree<Character> r1 = createTree(inorder1, postorder1);

	passed = passed && r1.balancedParenthesesRepresentation().equals("(F(B(A)(D(C)(E)))(H(G)(I)))");
	
	//  Baum mit genau einem Knoten.
	Character[] inorder2   = {'A'};
	Character[] postorder2 = {'A'};
	BinaryTree<Character> r2 = createTree(inorder2, postorder2);

	passed = passed && r2.balancedParenthesesRepresentation().equals("(A)");

	//  Lineare Liste (nach links) mit je einem Knoten nach rechts (-> strikt)
	Character[] inorder3   = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	Character[] postorder3 = {'A', 'C', 'B', 'E', 'D', 'G', 'F', 'I', 'H'};
	BinaryTree<Character> r3 = createTree(inorder3, postorder3);

	passed = passed && r3.balancedParenthesesRepresentation().equals("(H(F(D(B(A)(C))(E))(G))(I))");

	//  Lineare Liste (nach rechts) mit je einem Knoten nach links (-> strikt)
	Character[] inorder4   = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	Character[] postorder4 = {'A', 'C', 'E', 'G', 'I', 'H', 'F', 'D', 'B'};
	BinaryTree<Character> r4 = createTree(inorder4, postorder4);

	passed = passed && r4.balancedParenthesesRepresentation().equals("(B(A)(D(C)(F(E)(H(G)(I)))))");

	//  Zick-Zack-Liste (links-rechts)
	Character[] inorder5   = {'A', 'B', 'C', 'D', 'E', 'F'};
	Character[] postorder5 = {'B', 'D', 'C', 'A', 'F', 'E'};
	BinaryTree<Character> r5 = createTree(inorder5, postorder5);

	passed = passed && r5.balancedParenthesesRepresentation().equals("(E(A(C(B)(D)))(F))");

	//  Vollstaendiger Binaerbaum
	Character[] inorder6   = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
	Character[] postorder6 = {'A', 'C', 'B', 'E', 'G', 'F', 'D'};
	BinaryTree<Character> r6 = createTree(inorder6, postorder6);

	passed = passed && r6.balancedParenthesesRepresentation().equals("(D(B(A)(C))(F(E)(G)))");

	if (passed) {
	    System.out.println("Es wurden alle Tests bestanden.");
	}
	else {
	    System.out.println("Es wurden nicht alle Tests bestanden.");
	}

    }

    public static void main(String[] Aufrufparameter) {

	TreeTest tt = new TreeTest();
	tt.run();

    }

}

