/*Gymnastics judging. A gymnast's score is determined by a panel
 of 6 judges who each decide a score between 0.0 and 10.0. The
 final score is determined by discarding the high and low scores,
 and averaging the remaining 4. Write a program GymnasticsScorer.java
 that takes 6 real command line inputs representing the 6 scores
 and prints their average, after throwing out the high and low scores.*/

public class GymnasticsScorer{
	public static void main (String[]args){
	
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double d = Double.parseDouble(args[3]);
	double e = Double.parseDouble(args[4]);
	double f = Double.parseDouble(args[5]);
	
	double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min (e,f)))));
	double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.min (e,f)))));
		
	double sum = a+b+c+d+e+f-min-max;
	double average=sum/4;
	System.out.println("AVERAGE SCORE IS: " + average);
	
	}
 }
 