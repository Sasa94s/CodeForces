import java.util.ArrayList;
import java.util.Scanner;


public class PowerOfKnight {
	
	public static void main(String[] args) {
		//String input = "........\n........\n........\n..Q.....\n........\n........\n...N....\nK.......";
		
		Board b = new Board();
		//b.printBoard();
		String output = b.checkMate(b.possibleMoves(b.knightPosition()));
		System.out.println(output);
	}
}

class Board{
	final char KING = 'K';
	final char QUEEN = 'Q';
	final char KNIGHT = 'N';
	final char EMPTY = '.';
	char[][] list = new char[8][8];
	char[] xs = {'A','B','C','D','E','F','G','H'};
	char[] ys = {'8','7','6','5','4','3','2','1'};
	Board(){
		Scanner sc = new Scanner(System.in);
		String line;
		for (int i = 0; i < 8; i++) {
			line = sc.nextLine();
			for (int j = 0; j < 8; j++) 
				list[i][j] = line.charAt(j);
		}
		sc.close();
	}
	String knightPosition(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(list[i][j] == KNIGHT)
					return (String.valueOf(i)+","+String.valueOf(j));
			}
		}
		return null;
	}
	String kingPosition(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(list[i][j] == KING)
					return (String.valueOf(i)+","+String.valueOf(j));
			}
		}
		return null;
	}
	String queenPosition(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(list[i][j] == QUEEN)
					return (String.valueOf(i)+","+String.valueOf(j));
			}
		}
		return null;
	}
	ArrayList<String> possibleMoves(String position){
		int x = Integer.parseInt(position.substring(0, position.indexOf(",")));
		int y = Integer.parseInt(position.substring(position.indexOf(",")+1, position.length()));
		ArrayList<String> moves = new ArrayList<String>();
		
		if((x+2)<8 && (y+1)<8) 
			moves.add((x+2)+","+(y+1));
		if ((x+1)<8 && (y+2)<8)
			moves.add((x+1)+","+(y+2));
		if((x-2)<8 && (x-2)>=0 && (y+1)<8)
			moves.add((x-2)+","+(y+1));
		if ((x-1)<8 && (x-1)>=0 && (y+2)<8) 
			moves.add((x-1)+","+(y+2));
		if ((x+1)<8 && (y-2)<8 && (y-2)>=0) 
			moves.add((x+1)+","+(y-2));
		if ((x+2)<8 && (y-1)<8 && (y-1)>=0) 
			moves.add((x+2)+","+(y-1));
		if ((x-1)<8 && (x-1)>=0 && (y-2)<8 && (y-2)>=0) 
			moves.add((x-1)+","+(y-2));
		if ((x-2)<8 && (x-2)>=0 && (y-1)<8 && (y-1)>=0) 
			moves.add((x-2)+","+(y-1));
		return moves;
	}
	String checkMate(ArrayList<String> moves){
		//System.out.println(moves.toString());
		String position;
		int posX, posY;
		for (int i = 0; i < moves.size(); i++) {
			position = moves.get(i);
			posY = Integer.parseInt(position.substring(0, position.indexOf(",")));
			posX = Integer.parseInt(position.substring(position.indexOf(",")+1, position.length()));
			//System.out.println(posX+" "+posY);
			ArrayList<String> innerMoves = possibleMoves(position);
			int z=0;
			
			for (int j = 0; j < innerMoves.size(); j++) {
				if(innerMoves.get(j).equals(kingPosition()))
					z++;
				if(innerMoves.get(j).equals(queenPosition()))
					z++;
				if(z==2)
					return "YES "+ys[posY]+xs[posX];
				else 
					continue;
			}
			
		}
		return "NO";
	}
//	void printBoard(){
//		for (int i = 0; i < 8; i++) {
//				for (int j = 0; j < 8; j++) {
//					System.out.print(list[i][j]);
//				}
//				System.out.println();
//		}
//		System.out.println("KNIGHT:"+ys[Integer.parseInt(knightPosition().substring(0, knightPosition().indexOf(",")))]+xs[Integer.parseInt(knightPosition().substring(knightPosition().indexOf(",")+1, knightPosition().length()))]);
//		System.out.println("KING:"+ys[Integer.parseInt(kingPosition().substring(0, kingPosition().indexOf(",")))]+xs[Integer.parseInt(kingPosition().substring(kingPosition().indexOf(",")+1, kingPosition().length()))]);
//		System.out.println("QUEEN:"+ys[Integer.parseInt(queenPosition().substring(0, queenPosition().indexOf(",")))]+xs[Integer.parseInt(queenPosition().substring(queenPosition().indexOf(",")+1, queenPosition().length()))]);
//	}
}
