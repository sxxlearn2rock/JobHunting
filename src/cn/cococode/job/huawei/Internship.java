package cn.cococode.job.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Internship {
	public void soda(){
		Scanner scanner = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		while (scanner.hasNext()){
			int i = scanner.nextInt();
			if (i == 0) {
				break;
			}else {
				input.add(i);
				scanner.nextLine();
			}
		}
		
		for (Integer num : input) {
			int b = num;
			int count = 0;
			while (b > 2){
				count += (b / 3);
				b = (b / 3) + (b % 3);
			}
			if (b == 2) {
				count++;
			}
			res.add(count);
			System.out.println(count);
		}
	}

    public static void mingming(){
        Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        s.nextLine();
        boolean[] barrel = new boolean[1001];
        for(int i = 0; i < barrel.length; ++i) barrel[i] = false;
        for(int i = 0; i < N; ++i){
            barrel[s.nextInt()] = true;
            s.nextLine();
        }
        for(int i = 1; i < 1001; ++i){
            if(barrel[i] == true) System.out.println(i);
        }        
        
    }
	
    public void toHex(){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        
        char[] arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for(int i = 2; i < arr.length; ++i){
        	if (arr[i] >= '0' && arr[i] <= '9' ) {
				res = res * 16 +  (arr[i] - '0');
			}else if (arr[i] >= 'A' && arr[i] <= 'F' ) {
				res = res * 16 +  (arr[i] - 'A' +10);
			}
        }
        System.out.println(res);
    }
    
	public static void main(String[] args) {
		new Internship().toHex();;
	}
}
