package chess;

/**
 * @author Eduardo Campos
 */

public abstract class Piece {

  private int value;
  private boolean isWhite;

  public Piece() {
  }

  public Piece(int value, boolean isWhite) {
    this.value = value;
    this.isWhite = isWhite;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public boolean isWhite() {
    return isWhite;
  }

  public void setWhite(boolean white) {
    isWhite = white;
  }

  public abstract void move();


  @Override
  public String toString() {
    return "Piece{" + "field=" + value + ", isWhite=" + isWhite + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Piece)) {
      return false;
    }
    Piece piece = (Piece) o;
    return value == piece.value && isWhite == piece.isWhite;
  }


}
