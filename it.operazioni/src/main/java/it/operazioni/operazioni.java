package it.operazioni;

public class operazioni {
	
	int a ;
	int b;



   public int numeriSomma(int a, int b)
   {
       int somma;
       
       somma = a+b;
       System.out.println(somma);
       return somma;
   }



	public int numeriSottrazione (int a , int b)
	{ int sottrazione;
	
	sottrazione= a-b;
	System.out.println(sottrazione);
	return sottrazione;
	
	}
	

	
	
		public int numeriMoltiplicazione (int a , int b)
		{ int moltiplicazione;
		
		moltiplicazione= a-b;
		System.out.println(moltiplicazione);
		return moltiplicazione;
		
		}

	
	 
		public int numeriDivisione (int a , int b)
		{ int divisione;
		if (b == 0){
		    throw new IllegalArgumentException("Impossibile dividere per zero");
		}
		divisione= a/b;
		
		
		System.out.println(divisione);
		return divisione;
		}
		
		

	
 
		public int numeriPotenza (int a , int b)
		{ int potenza;
		
		potenza=(int) Math.pow (a,b);
		System.out.println(potenza);
		return potenza;
		
		}

	
	
		public int numeriMedia (int a , int b)
		{ int media;
		
		media=(a+b)%2;
		System.out.println(media);
		return media;
		
		}
}
	
	
	
	






