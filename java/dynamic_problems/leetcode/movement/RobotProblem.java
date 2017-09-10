

/**
 * @author yuriitsap.
 *
 * https://leetcode.com/problems/judge-route-circle/description/
 */

public class RobotProblem {

    public boolean judgeCircle(String moves) {
	char[] movementArray = moves.toCharArray();
	int horizontalMoves = 0, verticalMoves = 0;
	for (int i = 0; i < movementArray.length; i++) {
	    switch (movementArray[i]) {
		case 'U':
		    verticalMoves++;
		    break;
		case 'D':
		    verticalMoves--;
		    break;
		case 'L':
		    horizontalMoves++;
		    break;
		case 'R':
		    horizontalMoves--;
		    break;
	    }
	}
	return horizontalMoves == 0 && verticalMoves == 0;
    }

    public static void main(String[] args){
        System.out.print(new RobotProblem().judgeCircle("UD"));
    }

}
