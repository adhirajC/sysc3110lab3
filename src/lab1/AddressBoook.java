package lab1;

import java.util.ArrayList;



public class AddressBoook{
	private  ArrayList<BuddyInfo> AddressBoook = new ArrayList<BuddyInfo>();
		
 
	
	
	
	public static void main(String[] args) {
		
		
BuddyInfo buddy= new BuddyInfo("adhi","tonrot","838");
AddressBoook stuff= new AddressBoook();
System.out.println("hello!!");

stuff.addBuddy(buddy);
stuff.removeBuddy(0);
	}

public void removeBuddy(int index){
AddressBoook.remove(index);
}


public void addBuddy(BuddyInfo abuddy){
AddressBoook.add(abuddy);}
}


