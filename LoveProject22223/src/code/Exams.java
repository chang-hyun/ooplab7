package code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exams {

	private int ExamNum;
	public ArrayList<String> pro = new ArrayList<String>();
	public ArrayList<String> cho = new ArrayList<String>();
	public ArrayList<String> ans = new ArrayList<String>();

	public Exams(int num) //1번문제, 2번문제 호출
	{
		getExam();
		ExamNum = num;
	}

	protected String getProblem() {
		String str = null;
		int temp = 4 * (ExamNum-1);
		str = pro.get(temp);
		return str;
	} // 문제를 빼오는 기능

	protected ArrayList<String> getChoice() {
		ArrayList<String> arr = new ArrayList<String>(4);
		int start = 4 * (ExamNum-1);
		int end = ExamNum * 5;
		for(int i = start; i < end; i++)
			arr.add(cho.get(i));
		return arr;
	} // 선택지만 빼오는 기능

	protected int getAnswer() {
		int temp = 0;
		temp = Integer.parseInt(ans.get((ExamNum - 1)));
		return temp;
	} // 답 빼오는 기능

	private void getExam() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("Problem.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("Answer.txt"));

			// FileReader("Problem.txt"));
			for (int i = 0; true; i++) {
				String line = br.readLine();
				String line2 = br2.readLine();
				if (line == null)
					break;
				if (i % 5 == 0) {
					pro.add(line);
					//P++;
				} else
					cho.add(line);
				ans.add(line2);
			}
			br.close();
			br2.close();
		} catch (IOException a) {
			System.out.println("Can't Read");
		}
	}
}
