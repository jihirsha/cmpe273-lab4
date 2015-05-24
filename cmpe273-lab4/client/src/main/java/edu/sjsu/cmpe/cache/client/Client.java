package edu.sjsu.cmpe.cache.client;

public class Client {

	
    public static void main(String[] args) throws Exception {
    	 
    	 String valueFirst = "a", valueSecond = "b";
    	 System.out.println("Starting Cache Client...");
         System.out.println("Starting step 1..!!!");
         
         CRDTClient crdt = new CRDTClient();
         crdt.put(1, valueFirst);
         Thread.sleep(30000);

    	 System.out.println("Step 1 Ended");
         System.out.println("Starting step 2..!!!");
         crdt.update(1, valueSecond);
         Thread.sleep(30000);
         
         System.out.println("Step 2 Ended");
         System.out.println("Starting step 3..!!!");
         
         crdt.get(1);
         crdt.updateValues(1, valueSecond);
         Thread.sleep(30000);
         System.out.println("Post Update!!");
         crdt.get(1);
         System.out.println("Step 3 Ended");
         System.out.println("Cache Client already exist!!!");
        
    }
    
    
    

}
