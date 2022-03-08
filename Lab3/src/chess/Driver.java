package chess;

import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {

    ArrayList<Piece> pieces = new ArrayList<Piece>();
    Queen queen = new Queen();
    Knight knight = new Knight();
    Pawn p1 = new Pawn(1, true, true, queen);
    Pawn p2 = new Pawn(1, true, false, null);
    Pawn p3 = new Pawn(1, false, true, queen);
    Pawn p4 = new Pawn(1, false, true, queen);
    Pawn p5 = new Pawn(1, true, true, knight);
    pieces.add(p1);
    pieces.add(p2);
    pieces.add(p3);
    pieces.add(p4);
    pieces.add(p5);

    p1.equals(p2);
    p1.equals(p4);
    p1.equals(p5);
    p2.equals(p3);
    p4.equals(p5);

    for (Piece ps : pieces) {
      ps.move();
    }
  }

}
