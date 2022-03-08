package chess;

public class Queen extends Piece {


  public Queen() {
    super.setValue(9);

  }

  @Override
  public void move() {
    System.out.println("Like bishop and rook");
  }

  @Override
  public String toString() {
    return "Queen{" + "value=" + getValue() + '}';
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
}
