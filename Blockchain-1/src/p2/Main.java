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
		String[] genesisTransactions = {"Shubhang sent 200 bitcoins to Shreyas","Shreyas sent 409 bitcoins to Shubhang"};
		String[] Transactions1 = {"Vivek sent 230 bitcoins to Bhavana","Bhavana sent 43 bitcoins to Shubhang","I sent 23 ethereums to Me"};
	Block genesisBlock =  new Block(0,genesisTransactions);
	
	System.out.println(genesisBlock.getBlockHash());

Block Block1 =  new Block(0,Transactions1);
	
	System.out.println(Block1.getBlockHash());

}
}
