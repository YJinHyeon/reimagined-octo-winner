package day8_array;

public class Starbucks {

	public static void main(String[] args) {
		int[] coffee = {12,33,44,55,66,77,55};
		
        int sum =coffee[0]+coffee[1]+coffee[2]+coffee[3]+coffee[4]+coffee[5]+coffee[6];
        sum =0;
        for(int i =0; i<coffee.length;i++);{
        	sum= sum+coffee[i];
        }
        System.out.println("sum ="+ sum+"잔");
        
	}

}
