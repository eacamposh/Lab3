package chess;

public class Rook extends Piece {


  public Rook() {
    super.setValue(5);

  }

  @Override
  public void move() {
    System.out.println("Horizontally or vertically");
  }

  @Override
  public String toString() {
    return "Rook{" + "value=" + getValue() + '}';
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
}
