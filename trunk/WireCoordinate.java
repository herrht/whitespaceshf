/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package szlab4_whitespaces;

/**
 *
 * @author Burgosz
 */
public class WireCoordinate extends Coordinate {

        private int x2;
        private int y2;



    WireCoordinate(int x, int y, int x2, int y2){
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setX2(int x2){
        this.x2 = x2;
    };
     public void setY2(int y2){
        this.y2 = y2;
    };

    public int getX2() {
        return x2;
    }
     public int getY2() {
        return y2;
    }
}
