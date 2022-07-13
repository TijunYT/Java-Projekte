


public class ZeitBerechnung {
	byte daten;
	    short daten2;
	    int daten3;
	    long daten4;
	
	    //int min = Byte.MIN_VALUE;
	    //int min = Short.MIN_VALUE;
	    int min = Integer.MIN_VALUE;
	    //int min = Long.MIN_VALUE;
	
	    //int max = Byte.MAX_VALUE;
	    //int max = Short.MAX_VALUE;
	    int max = Integer.MAX_VALUE;
	    //int max = Long.MAX_VALUE;
	
	    //Startzeit
	    final long timeStart = System.nanoTime();
	
	    for(int i = min;i<=max;i++) {
	        for(int j = min;j<=max;j++) {
	            long a = i+j;
	        } 
	    }
	    //Endzeit
	    final long timeEnd = System.nanoTime();
	    long time = timeEnd - timeStart;
	    System.out.println("Dauer: " + time + " Nanosekunden");
	    //Byte:: 473800 Nanosekunden  0,0004738 Sekunden
	    //Short:: 1285461000 Nanosekunden  1,285461 Sekunden
	    //Integer:: dauert lange xD
	    //Long::
	}
}
