package ex2;

public class Market2 {
	public float computeVAT(Constants.CLIENT_TYPE productType, float initialPrice, int timeSpent)
	  {
	    float finalPrice = 0;
	    float value = (timeSpent > Constants.PRODUCT_TIME_LIMIT) ? (float)30/100 : (float)timeSpent/100; 
	    if (Constants.CLIENT_TYPE.NEW_CLIENT == productType)
	    {
	    	finalPrice = initialPrice;
	    }
	    else if (productType == Constants.CLIENT_TYPE.REGUALAR_CLIENT)
	    {
	    	finalPrice = (initialPrice - (0.1f * initialPrice)) - value * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPE.FREQUENT_CLIENT)
	    {
	    	finalPrice = (initialPrice - (0.25f * initialPrice)) - value * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == Constants.CLIENT_TYPE.EMAG_GENIUS)
	    {
	    	finalPrice = (initialPrice - (0.35f * initialPrice)) - value * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalPrice;
	  }
}
