package chess;

public class Bishop extends Piece {


  public Bishop() {
    super.setValue(3);
  }

  @Override
  public void move() {
    System.out.println("Diagonally");

  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

}
