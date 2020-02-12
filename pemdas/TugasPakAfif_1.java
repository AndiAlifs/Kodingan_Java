class TugasPakAfif_1
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3};
    int temp;

    System.out.println( "Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    // Melakukan perulangan agar nilai array val dengan index selanjutnya ditukar
    // apabila leih kecil dibanding nilai array val di index sebelumnya
 	  for(int i=0; i<val.length; i++) {
	    	for(int j=0; j<val.length-1; j++) {
	    		if (val[j+1] > val[j]) {
	    			temp = val[j];
	    			val[j] = val[j+1];
	    			val[j+1] = temp;
	    		}
	    	}
	    }



    System.out.println( "Reversed Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}
