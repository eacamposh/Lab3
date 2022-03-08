package chess;

import java.util.Objects;

public class Pawn extends Piece {

  private boolean promoted;
  private Piece newPiece;


  public Pawn(int value) {
    super();
  }

  public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
    super(value, isWhite);
    this.promoted = promoted;
    this.newPiece = newPiece;

  }

  public void promote(Piece newPiece) {

  }

  @Override
  public void move() {
    System.out.println("Forward 1");

  }

  @Override
  public String toString() {
    return "Pawn{" + "value=" + getValue() + "promoted=" + promoted + ", newPiece=" + newPiece
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pawn)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Pawn pawn = (Pawn) o;
    return promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
  }

}
