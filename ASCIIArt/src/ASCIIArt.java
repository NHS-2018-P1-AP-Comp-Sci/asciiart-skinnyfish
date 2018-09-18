
/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */
public class ASCIIArt {
	public static void main(String[] args) {
		drawTop();
		for (int i = 8;i>0;i--) {
			drawRow(i);
		}
		drawBottom();
		caption();
	}
	public static void drawRow(int row) {
		if (row%2==0) {
			for(int i = 0;i<3;i++) {
				drawLines(7,true);
			}
		}
		else {
			for(int i = 0;i<3;i++) {
				drawLines(7,false);
			}
		}
	}
	public static void drawLines(int length, Boolean space_in_front) {
		System.out.print("|");
		if (space_in_front) {
			for (int i = 0;i<length;i++) {
				System.out.print(" ");
			}
		}
		for (int i = 0;i<4;i++) {
			for (int j = 0;j<length;j++) {
				System.out.print("+");
			}
			if (i==3 && space_in_front) {
				break;
			}
			for (int k = 0;k<length;k++) {
				System.out.print(" ");
			}
		}
		System.out.print("|\n");
	}
	public static void drawTop() {
		System.out.println("|--------------------------------------------------------|");
		System.out.println("|   A      B      C      D      E      F      G      H   |");
		System.out.println("|--------------------------------------------------------|");

	}
	public static void drawBottom() {
		System.out.println("|--------------------------------------------------------|");
		System.out.println("|   A      B      C      D      E      F      G      H   |");
		System.out.println("|--------------------------------------------------------|");
	}
	public static void caption() {
		System.out.println("                         /|\\");
		System.out.println("                          |");
		System.out.println("                  This is a chessboard");
	}
}
