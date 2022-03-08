package chess;

public class Knight extends Piece {

  public Knight() {
    super.setValue(2);
  }

  @Override
  public void move() {
    System.out.println("Like an L");

  }

  @Override
  public String toString() {
    return "Knight{" + "value=" + getValue() + '}';
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
}
