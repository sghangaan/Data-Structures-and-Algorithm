package ArrayImplementation;


/*
 *                 Pseudocode
 * 	START
		Get Student"s Average set to variable average
		If average is less than or equal to 75
			return "Failed"
		Else
			return "Passed"
		EndIf
		END
		
		-----------------createFile method (throws FileNotFoundException)-----------
		
		START
		Get Student Scores array set to variable student
		Get Student Remarks array set to variable studentRemark
		Initialize PrintWriter content into Student.txt (Inputs the data in the text file)
			Print Tabs
			For z=1 to quiz
				Print Quiz Column Header then double tabs
			EndFor
			Print Average and Remarks Column Header
			For a=0 to less than stud
				Print Student Number
				For b=0 to less than quiz plus 1
					Print Student Scores and Average
				EndFor
				Print Student Remarks
			End Fore
		Close PrintWriter content
		END
		
		-------------------update method (throws FileNotFoundException)---------------
		START
		Get Student Scores Array set to variable student
		Get Student Remarks Array set to variable studentRemark
		Initialize Scanner up
		If updated is falsePseudocode
		START
		Initialize Static variable (int stud, quiz; char update; boolean updated; DecimalFormat df)
		Initialize Scanner
		Print Create Gradebook Header
		Print "Number of Student"
		Scan stud (Number of students)
		Print "Number of Quizzes"
		Scan quiz (Number of Quizzes)
		Initialize 2-Dime array student with stud by quiz+1 size
		Initialize 1-Dime array studentRemark with stud size
		Initialize pass, fail to 0
		For y=0 to less than stud
			Print Student Number
			For x=0 to less than quiz
				Print Quiz Number
				Scan Quiz Score to array student with index x of y
			EndFor
			Compute Average (Calls method average) 
			Print Student's Average
			Get Student's Remarks (Calls method remarks)
			If studentRemark index y is "Failed"
				Increment fail
			Else
				Increment pass
			EndIf
		EndFor
		Print Number of Passing Students
		Print Number of Failed Students
		Try (Exception Handling and File Creation)
			Initialize file gradeBook
			Create Student.txt File
			If File created
				Print "File Created" with file name
				Input data in File (Call method createFile)
				Generate Update option (Call method update)
			Else
				Print "File already existed
				Generate Update option (Call method update)
			EndIF
		Catch IOException e
			Print "An Error Occured"
		EndTryCatch 
		END
		
		----------------METHODS
		
		------------average method----------------------
		START
		Get 2-dime array set to variable score
		Get number of quiz set to variable quiz
		Get student number to variable num
		Initialize double ave, sum to zero
		For a=0 to less than quiz
			Add sum with score index num and a
		EndFor
		Set ave to sum divided by quiz
		Return ave
		END
		
		--------------remarks method---------------------
		
			Print Update Existing Gradebook
		Else
			Print Update Further
		EndIf
		Scan char input set to variable update
		switch update
			case Y/y
				Change .txt file existing data (Calls change method)
				break
			case N/n
				Generate End Program Footer (Calls thanks method)
				break
		END
		
		---------------change Method-----------------------
		Get Student Scores Array set to variable student
		Get Student Remarks Array set to variable studentRemark
		Initialize int upStud, upQuiz, double upScore, and Scanner ch
		Print Update Gradebook Header
		Print "Input Student number"
		Scan next int set to variable upStud
		Decrement upStud
		Print Student Number
		For a=0 to less than quiz
			Print Quiz number with Score
		EndFor
		Print Average
		Print Remarks
		Print "Input quiz # to update
		Scan next Int set to variable upQuiz
		Decrement upQuiz
		Print "Enter updated grade"
		Scan next double set to variable upScore
		Set upScore to corresponding index in student array
		Set average to corresponding index in student array (Calls average method)
		Set remarks to corresponding index in studentRemarks array (Calls remarks method)
		Print Updated Student Grades Header
		Print Student Number
		For a=0 to less than quiz
			Print Quiz number with Score
		EndFor
		Print Average
		Print Remarks
		Initialize File update set Student.txt to update
		Delete Student.txt
		Create with updated arrays (Calls createFile method)
		Set updated to true
		Generate update option (Calls update method)
		END
		
		-----------------ENDOFPROGRAM Method--------------------------
		START
		Print End of Program Footer Top part
		Print Middle part with names of programmers
		Print Bottom part of program footer
		END	
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class GradeBook {
	static int stud, quiz;
	static char update;
	static boolean updated=false;
	static DecimalFormat df=new DecimalFormat("###.00");
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("\n|| ========[ Create GradeBook File ]========== || \n");
		
		System.out.print("Number of Students: ");
		stud=input.nextInt();
		
		System.out.print("Number of Quizzes: ");
		quiz=input.nextInt();
		
		double[][] student = new double[stud][quiz+1];
		String[] studentRemark = new String [stud];
		
		int pass=0 ,fail=0;
		for (int y=0; y<stud; y++) {
			System.out.println("\nStudent #"+(y+1));
			for (int x=0; x<quiz; x++) {
				System.out.print("Quiz #"+(x+1)+": ");
				student[y][x]=input.nextDouble();
			}
			student[y][quiz] = average(student,quiz,y);
			System.out.println("Average: "+df.format(student[y][quiz]));
			studentRemark[y] = remarks(student[y][quiz]);
			System.out.println("Remarks: "+remarks(average(student,quiz,y)));
			if (studentRemark[y]=="Failed") {
				fail++;
			} else {
				pass++;
			}
		}
		System.out.println();
		System.out.println("Number of student�s passed: "+pass);
		System.out.println("Number of student�s failed: "+fail);
		
		
		try {
			File gradeBook = new File("Student.txt");
			if (gradeBook.createNewFile()) {
				System.out.println("\nFile Created: "+gradeBook.getName());
				createFile(student,studentRemark);
				update(student,studentRemark);
			} else {
				System.out.println("\nFile already Existed");
				update(student,studentRemark);
				
			}
		} catch (IOException e) {
			System.out.println("An Error Occured");
		}
	}
	
	static double average(double[][] score, int quiz, int num) {
		double ave=0;
		double sum=0;
		
		for (int a=0; a<quiz; a++) {
			sum+=score[num][a];
		}
		ave=sum/quiz;
		
		return ave;
	}
	
	static String remarks(double average) {
		if (average<=75) {
			return "Failed";
		} else {
			return "Passed";
		}
	}
	
	static void createFile(double[][] student, String[] studentRemark) throws FileNotFoundException {
		PrintWriter content = new PrintWriter("Student.txt");
		
		content.print("\t\t");
		for (int z=1; z<=quiz; z++) {
			content.print("Quiz #"+z+"\t\t");
		}
		content.print("Average\t\tRemarks");
		for (int a=0; a<stud; a++) {
			content.print("\nStudent #"+(a+1)+"\t\t");
			for (int b=0; b<quiz+1; b++) {
				content.print(df.format(student[a][b])+"\t\t\t");
			}
			content.print(studentRemark[a]);
		}
		content.close();
	}
	
	static void update(double[][] student, String[] studentRemark) throws FileNotFoundException {
		Scanner up=new Scanner(System.in);
		if (updated==false) {
			System.out.print("\nDo you want to Update Existing Gradebook? [Y/N]: ");
		} else {
			System.out.print("\nDo you want to Update futher? [Y/N]: ");
		}
		update=up.next().charAt(0);
		
		switch (update) {
		case 'Y':
		case 'y':
			change(student,studentRemark);
			break;
		case 'N':
		case 'n':
			ENDOFPROGRAM();
			break;
		}
	}
	
	static void change(double[][] student, String[] studentRemark) throws FileNotFoundException {
		int upStud;
		int upQuiz;
		double upScore;
		Scanner ch=new Scanner(System.in);
		
		System.out.println("\n|| ===== [ Update GradeBook File ] ====== ||\n");
		
		System.out.print("Input Student Number to update: ");
		upStud=ch.nextInt();
		
		upStud-=1;
		System.out.println("\nStudent #"+(upStud+1)+"\n");
		for (int a=0; a<quiz; a++) {
			System.out.println("Quiz #"+(a+1)+": "+df.format(student[upStud][a]));
		}
		System.out.println("Average: "+df.format(student[upStud][quiz]));
		System.out.println("Remarks: "+studentRemark[upStud]);
		
		System.out.print("\nInput Quiz to update: ");
		upQuiz=ch.nextInt();
		upQuiz-=1;
		System.out.print("\nEnter updated grade for Quiz #"+(upQuiz+1)+": ");
		upScore=ch.nextDouble();
		student[upStud][upQuiz]=upScore;
		student[upStud][quiz] = average(student,quiz,upStud);
		studentRemark[upStud] = remarks(student[upStud][quiz]);
		
		System.out.println("\n#---Updated Student Grades---#\n");
		System.out.println("Student #"+upStud);
		for (int a=0; a<quiz; a++) {
			System.out.println("Quiz #"+(a+1)+": "+df.format(student[upStud][a]));
		}
		System.out.println("Average: "+df.format(student[upStud][quiz]));
		System.out.println("Remarks: "+studentRemark[upStud]);
		File update = new File("Student.txt");
		update.delete();
		createFile(student,studentRemark);
		updated=true;
		update(student,studentRemark);
		
	}
	
	static void ENDOFPROGRAM () {
		System.out.println("\n");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
	}
}
