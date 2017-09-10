

/**
 * @author yuriitsap.
 */

/**
 * Sarah loves going to her favorite bakery, Zillycakes, with n dollars to buy cupcakes. Each
 * cupcake has a flat cost of c dollars, and the store has a promotion where the give you 1 free
 * cupcake for every m cupcake wrappers you trade in.
 *
 * For example, if m = 2 and Sarah has n = 4 dollars that she uses to buy 4 cupcakes at c = 1
 * dollar
 * apiece, she can trade in the 4 wrappers to buy 2 more cupcakes. now she has 2 more cupcake
 * wrappers that she can trade in for 1 more cupcake. Because she has only has 1 wrapper left at
 * this point and 1 < m, she was only able to eat a total of 7 cupcakes.
 *
 * Complete the maximumCupcakes(solve in mine case) function in your editor. It has 1 parameter: an
 * array of strings named trips. Each string in trips contains the following three space-separated
 * values:
 * 1. An integer, n denoting the amount of money Sarah can spend during her trip
 * 2. An integer, c denoting the cost of a cupcake in dollars
 * 3. An integer, m denoting the number of wrappers that can be traded in for one new cupcake
 *
 * For each trip to Zillycakes in trips, your function must print an integer denoting the maximum
 * number of cupcakes Sarah can eat on a new line.
 *
 * Constraints
 * 1 <= t <= 10^3
 * 2 <= n <= 10^5
 * 1 <= c <= n
 * 2 <= m <= n
 *
 * Sample Input
 *
 * I:
 * 3
 * 10 2 5
 * 12 4 4
 * 6 2 2
 *
 * II:
 * 2
 * 8 4 2
 * 7 2 3
 *
 * Sample Output
 *
 * I:
 * 6
 * 3
 * 5
 *
 * II:
 * 3
 * 4
 */
public class CupCakes {

    public void solve(String[] trips, boolean recursiveApproach) {
	for (String trip : trips) {
	    String[] input = trip.split(" ");
	    int dollars = Integer.valueOf(input[0]);
	    int cupcakePrice = Integer.valueOf(input[1]);
	    int wrappersPerCupcake = Integer.valueOf(input[2]);
	    // solution itself
	    if (recursiveApproach) {
		int cupcakes = dollars / cupcakePrice;
		cupcakes += countCupcakesPerTripRecursive(cupcakes, wrappersPerCupcake);
		System.out.println("Cupcakes count = " + cupcakes);
	    } else {
		countCupcakesPerTripIterativeApproach(dollars, cupcakePrice, wrappersPerCupcake);

	    }
	}

    }

    private void countCupcakesPerTripIterativeApproach(int dollars, int cupcakePrice,
	    int wrappersPerCupcake) {
	int cupcakesPerTrip = dollars / cupcakePrice;
	int cupcakeWrappers = cupcakesPerTrip;

	while (cupcakeWrappers / wrappersPerCupcake > 0) {
	    int additionalCupcakes = cupcakeWrappers / wrappersPerCupcake;
	    cupcakesPerTrip += additionalCupcakes;
	    cupcakeWrappers = (cupcakeWrappers % wrappersPerCupcake) + additionalCupcakes;
	}
	System.out.println("Cupcakes count = " + cupcakesPerTrip);
    }

    private int countCupcakesPerTripRecursive(int cupcakeWrappers,
	    int wrapperPerCupcake) {
	if (cupcakeWrappers / wrapperPerCupcake == 0) {
	    return 0;
	}

	int cupcakes = cupcakeWrappers / wrapperPerCupcake;
	cupcakeWrappers = (cupcakeWrappers % wrapperPerCupcake) + cupcakes;
	return cupcakes + countCupcakesPerTripRecursive(cupcakeWrappers,
		wrapperPerCupcake);
    }

    public static void main(String[] args) {
	new CupCakes().solve(new String[]{"10 2 5", "12 4 4", "6 2 2"}, true);
	new CupCakes().solve(new String[]{"8 4 2", "7 2 3"}, true);
    }

}
