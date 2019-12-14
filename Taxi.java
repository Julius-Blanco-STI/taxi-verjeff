package javaapplication4;
public class Taxi {
    private int x = 0;
private int y = 0;
private String platenumber = null;
private int dest_x = 0;
private int dest_y = 0;

public Taxi(String i) {
platenumber = i;
}

public void book (int dest_x, int dest_y) {
this.dest_x = dest_x;
this.dest_y = dest_y;
}
public void run(String run) {
for(int i = 0; i < run.length(); i++) {
   if (run.charAt(i)=='l') {
    x--;
   }
   else if (run.charAt(i)=='d') {
    y--;
   }
   else if (run.charAt(i)=='r') {
    x++;
   }
   else if (run.charAt(i)=='u') {
    y++;
   }
}
}
public void printCurrentLocation() {
   System.out.println(x + "," + y);  
    }
public boolean reachedDestination() {
if (x == dest_x && y == dest_y) {
return true;
}
else {
return false;
}
}


}