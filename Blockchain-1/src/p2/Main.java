package p2;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
public class Main{
/**
 * Hash = digital signature
 * Each block will have : List of transactions ,Previous Hash   Hash
 *  
 * */
	ArrayList<Block> blockchain = new ArrayList<>();

 public static void main(String[] args){
		String[] genesisTransactions = {"Hacker1 sent 200 bitcoins to Hacker2","Hacker2 sent 409 bitcoins to Hacker3"};
		String[] Transactions1 = {"Haker3 sent 230 bitcoins to Hacker1","Hacker2 sent 43 bitcoins to Hacker3","I sent 23 ethereums to Me"};
	Block genesisBlock =  new Block(0,genesisTransactions);
	
	System.out.println(genesisBlock.getBlockHash());

Block Block1 =  new Block(0,Transactions1);
	
	System.out.println(Block1.getBlockHash());

}
}
