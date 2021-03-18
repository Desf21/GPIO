package triangle;

import triangle.Triangle;
import triangle.TriangleType;

/**
 * Mutant permettant de vérifier que les tests détectent 
 * le cas du point.
 * 
 * @author Camille Constant
 *
 */

public class TriangleMutant9 extends Triangle{

	public TriangleMutant9(int a, int b, int c) {
		super(a,b,c);
	}

	@Override
	public TriangleType getType() {
		int[] cotes = super.getCotes();
		int coteA = cotes[0];
		int coteB = cotes[1];
		int coteC = cotes[2];
		
		TriangleType triangle = TriangleType.NON_TRIANGLE;

		boolean estTriangle = (coteA <= coteB + coteC) && (coteB <= coteA + coteC) && (coteC <= coteA + coteB);

		if (estTriangle) {
			if ((coteA == coteB) && (coteA == coteC)) {
				triangle = TriangleType.EQUILATERAL;
			} else if (((coteA == coteB) || (coteA == coteC) || (coteB == coteC))) {
				triangle = TriangleType.ISOCELE;
			} else {
				triangle = TriangleType.SCALENE;
			}
		}

		return triangle;
	}
	
}
