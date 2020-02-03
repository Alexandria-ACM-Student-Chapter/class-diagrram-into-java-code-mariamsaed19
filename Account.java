package assignment;

public class Account {
private int balance=0;
private String name , id;
public Account(String id, String name) {
	this.id=id;
	this.name=name;
}
public Account(String id, String name , int balance) {
	this.id= id;
	this.name= name;
	this.balance= balance;
}
public String getID() {
	return id;
}
public String getName() {
	return name;
}
public int getBalance() {
	return balance;
}
public int credit(int amount) {
	balance=balance+amount;
	return balance;
}
public int debit(int amount) {
	if(amount<=balance) {
		balance=balance-amount;
	}
	else {
		System.out.println("Amount exceeded balance\n");
	}
	return balance;
}
public int transferTo(Account another,int amount) {
	if(amount<=balance) {
		balance=balance-amount;
		another.balance =another.balance+ amount;
	}
	else {
		System.out.println("Amount exceeded balance\n");
	}
	return this.balance;
}
public String toString() {
	return("Account[id="+this.getID()+",name="+this.getName()+",balance="+this.getBalance()+"]");
}


	public static void main(String[] args) {

	}

}
