public class Quicksort {

    public static int[] ZahlenArray = { 3, 1, 2, 0 };

    public int[] sortieren(int a, int b) {
        int c;
        if (a < b) {
            c = sortiertausch(a, b);
        	System.out.println("Sortiertausch vollständig");
            sortieren(a, c);
        	System.out.println("Sortieren 1 vollständig");
            sortieren(c + 1, b);
        	System.out.println("Sortieren 2 vollständig");
        }
        return ZahlenArray;
    }

    int sortiertausch(int a, int b) {

        int d = ZahlenArray[(a + b) / 2];
        int e = a - 1;
        int f = b + 1;
        while (true) {
            do {
                e++;
            } while (ZahlenArray[e] < d);

            do {
                f--;
            } while (ZahlenArray[f] > d);

            if (e < f) { // Tauscht die Zahlen
                int k = ZahlenArray[e];
                ZahlenArray[e] = ZahlenArray[f];
                ZahlenArray[f] = k;
            } else {
                return f;
            }
        }
    }

    public static void main(String[] args) {
        Quicksort qs = new Quicksort();
        int[] SortiertesArray = qs.sortieren(0, ZahlenArray.length - 1);
        
        // Anzeige
        for (int i = 0; i < SortiertesArray.length; i++) {
            System.out.println(i + 1 + ":	" + SortiertesArray[i]);
        }
    }
}