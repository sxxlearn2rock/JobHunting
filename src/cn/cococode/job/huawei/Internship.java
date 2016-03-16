package cn.cococode.job.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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
	public static void main(String[] args) {
		new Internship().soda();
	}
}
