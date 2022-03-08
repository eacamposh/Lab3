package chess;

public class King extends Piece {


  public King() {
    super.setValue(1000);

  }

  @Override
  public void move() {
    System.out.println("One square");

  }


  @Override
  public String toString() {
    return "King{" + "value=" + getValue() + '}';
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
}
