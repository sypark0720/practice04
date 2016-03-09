package prob2;

public class Money {
	
	//field
	private int amount;
	
	//constructor
    public Money(int amount) {
        this.amount = amount;
    }
    
    //method
    public Money add( Money money ) {
    	Money a = new Money(this.amount);
    	a.amount += money.amount; 
    	return a;
    }
    public Money minus( Money money ) {
    	Money a = new Money(this.amount);
    	a.amount -= money.amount; 
    	return a;
    }
    public Money multiply( Money money ) {
    	Money a = new Money(this.amount);
    	a.amount *= money.amount; 
    	return a;
    }
    public Money devide( Money money ) {
    	Money a = new Money(this.amount);
    	a.amount /= money.amount; 
    	return a;
    }
    //hashCode&equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
}
