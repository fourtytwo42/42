/**
* This is a simulation of coin release schedule to see how many coins will be released
*  
*/
public class Release {
        public static long COIN = 100000000; // satoshi per coin
	
        /** constructor: run the simulation */
        public Release () {	
		long total = 0;
		boolean got42=false;
		for (int height=0; height<5000000; height++) {
			total = total+getBlockValue(height);
			if (height%100000==0) System.out.println(height+ "\t" + total + " - " + 42*COIN); // output total satoshi
			if (total >= 42*COIN & !got42) {
				System.out.println(height+"\t"+total); // output total satoshi and block height when we cross 42
				got42 = true;
			}
		}
	}
		

   	public long getBlockValue(int nHeight) {
		    long nSubsidy = (long)(0.000042 * COIN);
		    if(nHeight < 419)
		    {
		       nSubsidy = (long)(0.0000001 * COIN);
			}
		    if(nHeight >= 424242+42*42*42) //  498330 - time to start decreasing the reward
                    {
                       nSubsidy = (long)(0.000024 * COIN);
                        }    
		    if(nHeight >= 4242424-42*42*42*42) // 1130728
                    {
                       nSubsidy = (long)(0.0000042 * COIN);
                        }    
                    if(nHeight >= 4242424-2424242) // 1818182
                    {
                       nSubsidy = (long)(0.0000024 * COIN);
                        } 
		    if(nHeight >= 42*42*42*42-242424-42*42*42) // 2869272
                    {
                       nSubsidy = (long)(0.00000042 * COIN);
                        }    
		    if(nHeight >= 4242424-424242-424242+24242+4242-242+42+42+42+4.2+2.4) // 3422314.6 
				// we have 41.99999988 coins!  almost there
                    {
		       nSubsidy = (long)(0.0 * COIN);  // no more reward, only fees
                        }

		//  special blocks

		    if(nHeight == 1)
		    {
		       nSubsidy = (long)(0.42 * COIN);
			}
		    if(nHeight == 420) // yay its 420 :) Time for a smoke
		    {
		       nSubsidy = (long)(0.00042 * COIN);
			}
		    if(nHeight == 4242)
		    {
		       nSubsidy = (long)(0.00042 * COIN);
			}
		    if(nHeight == 42424)
		    {
		       nSubsidy = (long)(0.00042  * COIN);
			}
		    if(nHeight == 424242)
		    {
		       nSubsidy = (long)(0.00042  * COIN);
			} 
	            if(nHeight == 4242424)   // those last 12 satoshi.  didn't think i would forget them did you?  
			// in block 4242424 we have released all 42 42coins.  
		    {
		       nSubsidy = (long)(42-24-42/42-42/42-42/42-42/42-42/42-42/42);
			}
		    return nSubsidy;
		}

	public static final void main(String[] args) {
		Release r = new Release();
	}
}
