/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package szlab4_whitespaces;

/**
 *
 * @author Burgosz
 */
public class Coordinate {
   private int x;
   private int y;

   public Coordinate(int x, int y){
       this.x = x;
       this.y = y;
   }
   public int getX() {
       return x;
   }

   public int getY() {
       return y;
   }
   public void print(){
       System.out.println(x);
       System.out.println(y);
   }
   public void setX(int x){
       this.x = x;
   }
   public void setY(int y){
       this.y = y;
   }



}
