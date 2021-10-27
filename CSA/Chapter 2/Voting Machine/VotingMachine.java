/**
 * 
 * Last name: Shah
 * First name: Karan 
 * Student ID: 12094459
 * Period: 2
 * 
 * Implement a VotingMachine class that can be used for a simple election. Have
 * methods to clear the machine state, to vote for a Democrat, to vote for a
 * Republican, to vote for an independent to get the tallies for all three
 * parties. You will need the following:
 * 
 * 1. Instance variables for the democrat votes, republican votes and independent
 *    votes. 
 * 2. Constructors: There should be a default constructor that can create a
 *    brand new voting machine without any votes in it as well as a constructor
 *    that can accept initial votes for each of the three parties. Would there be
 *    any other constructors that could come in handy? 
 * 3. Getter methods for returning the number of votes of each party candidate. 
 *    The methods must be named getDemocratVotes, getRepublicanVotes, and getIndependentVotes. 
 * 4. Setter methods for changing the number of votes of each party candidate to given numbers.
 *    The methods must be named setDemocratVotes, setRepublicanVotes, and
 *     setIndependentVotes. 
 * 5. Methods that will increment the votes by 1. Call these methods voteDemocrat, voteRepublican, 
 *    and voteIndependent. 
 * 6. Overloaded methods, voteDemocrat, voteRepublican, and voteIndependent that will
 *    increment the votes by a given amount. The amount of votes to be incremented
 *    by will be passed in as parameters. 
 * 7. A method to clear all the votes. A method to calculate and return the total votes. 
 *    Call this method totalVotes. 
 * 8. Methods to calculate and return the percent democrat, republican and independent
 *    votes. Call the methods percentDemocrat, percentRepublican, and
 *    percentIndependent. These methods must call the totalVotes method rather than
 *    recalculating it. 
 * 9. A method to return a string to print the vote statistics. Call this method toString. The 
 *    information includes the total votes, percent democrat votes, percent republican votes, and 
 *    percent independent votes. This method must call the totalVotes, percentDemocrat, 
 *    percentRepublican , and percentIndependent method rather than recalculating all of the stats.
 *    
 * Here is a sample output:
 *
 * Democrats: 2
 * Republicans: 3
 * Independents: 1 
 * Total votes: 6
 * Percent Democrat Votes: 33.33333333333333 
 * Percent Republican Votes: 50.0
 * Percent Independent Votes: 16.666666666666664
 * 
 */
public class VotingMachine {
	//Your code goes here
	private int democratVotes;
	private int republicanVotes;
	private int independentVotes;
	
	/**
	 * Defualt Constructor
	 */
	public VotingMachine(){
	   democratVotes = 0;
	   republicanVotes = 0;
	   independentVotes = 0;
	   
	   
	}
	
	/**
	 * Constructor that accepts values for all parameters 
	 * @param democratVotes number of democrat votes
	 * @param republicanVotes int republican votes
	 * @param independentVotes int independent votes
	 */
	public VotingMachine(int democratVotes, int republicanVotes, int independentVotes){
	   this.democratVotes = democratVotes;
	   this.republicanVotes = republicanVotes;
	   this.independentVotes = independentVotes;
	}
	

	/**
	 * Getter method for number of Democrat votes
	 * @return democraticVotes int
	 */
	public int getDemocratVotes(){
	   return democratVotes;
	}
	
	/**
	 * Getter method for number of Republican votes
	 * @return republicanVotes int
	 */
	public int getRepublicanVotes(){
	   return republicanVotes;
	}
	
	/**
	 * Getter method for number of Independent votes
	 * @return independentVotes int
	 */
	public int getIndependentVotes(){
	   return independentVotes;
	}
	

	/**
     * Setter method for number of Democrat votes
     * @param newDemocratVotes int number of Democrat Votes
     */
	public void setDemocratVotes(int newDemocratVotes) {
	   democratVotes = newDemocratVotes;
	}

	/**
     * Setter method for number of Republican votes
     * @param newRepublicanVotes int number of Republican Votes
     */
	public void setRepublicanVotes(int newRepublicanVotes) {
	   republicanVotes = newRepublicanVotes;
	}

	/**
     * Setter method for number of Independent votes
     * @param newIndependentVotes int number of Indepdent Votes
     */
	public void setIndependentVotes(int newIndependentVotes) {
	   independentVotes = newIndependentVotes;
	}


	/**
	 * Adds one vote to democratVotes
     */
	public void voteDemocrat() {
	   democratVotes++;
	}

	/**
	 * Adds one vote to independentVotes
     */
	public void voteIndependent() {
	   independentVotes++;
	}

	/**
	 * Adds one vote to republicanVotes
     */
	public void voteRepublican() {
	   republicanVotes++;
	}

	
	/**
     * Adds givenAmount to Democrat votes
     * @param givenAmount int to add
     */
	public void voteDemocrat(int givenAmount) {
	   democratVotes += givenAmount;
	}
	/**
     * Adds givenAmount to Republican votes
     * @param givenAmount int to add
     */
	public void voteRepublican(int givenAmount) {
	   republicanVotes += givenAmount;
	}
	/**
     * Adds givenAmount to Indepdent votes
     * @param givenAmount int to add
     */
	public void voteIndependent(int givenAmount) {
	   independentVotes += givenAmount;
	}
	
	/**
     * Resets all 3 party votes to 0
     */
	public void clear() {
	   independentVotes = 0;
	   republicanVotes = 0;
	   democratVotes = 0;
	}
	
	/** Calculate and return total number of votes
     * @return int - total number of votes
     */
	public int totalVotes() {
	   return (democratVotes + republicanVotes + independentVotes);
	}


	/**
     * Calculate the percentage of Democrat votes
     * @return Double - Percent of Democrat votes
     */
	public double percentDemocrat() {
	   return (100.00 * democratVotes / totalVotes());
	}

	/**
     * Calculate the percentage of Republican votes
     * @return Double - Percentage of Republican votes
     */
	public double percentRepublican() {
	   return (100.00 * republicanVotes / totalVotes());
	}

	/**
     * Calculate the percentage of Indepdent votes
     * @return Double - Percentage of Independence votes
     */
	public double percentIndependent() {
	   return (100.00 * independentVotes / totalVotes());
	}


	/**
     * toString returns the percentage of each party's votes
     * the votes.
     * @return percetange of votes
     */
	public String toString() {
	   return ("Total Votes: " + totalVotes() 
	   	+ "\nPercent Democrat Votes: " + percentDemocrat()
	    	+ "\nPercent Republican Votes: " + percentRepublican()
	    	+ "\nPercent Independent Votes: " + percentIndependent());
	}
}
