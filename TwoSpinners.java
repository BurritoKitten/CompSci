public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
     	    int result=((int)(Math.random()*(max-min+1)))+min;
     	    //add code here
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    // add code here
        int playerSpin = spin(1, 10);
        int compSpin   = spin(2, 8);
        if (playerSpin > compSpin+1) System.out.println("You win! "+(playerSpin-compSpin)+" points");
        if (playerSpin == compSpin+1) System.out.println("You win! 1 point");
        if (playerSpin < compSpin-1) System.out.println("You lose. "+(playerSpin-compSpin)+" points");
        if (playerSpin == compSpin-1) System.out.println("You lose. 1 point");
        if (playerSpin == compSpin)
        {
            playerSpin += spin(1, 10);
            compSpin   += spin(2, 8);
            if (playerSpin > compSpin+1) System.out.println("You win! "+(playerSpin-compSpin)+" points");
            if (playerSpin == compSpin+1) System.out.println("You win! 1 point");
            if (playerSpin < compSpin-1) System.out.println("You lose. "+(playerSpin-compSpin)+" points");
            if (playerSpin == compSpin-1) System.out.println("You lose. 1 point");
            if (playerSpin == compSpin) System.out.println("Tie. 0 points");
        }
	}

 	public static void main(String[] args) {
     	TwoSpinners ds = new TwoSpinners();
     	for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
     	    ds.playRound();
 	    }
 	}
}