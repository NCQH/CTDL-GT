import java.lang.Math.*;
public class GreatCircle {
    public static void main(String[] args) {
        if (args.length == 4) {
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);

            double delta = y1 - y2;
            double p1 = Math.cos(x2) * Math.sin(delta);
            double p2 = Math.cos(x1) * Math.sin(x2) - Math.sin(x1) * Math.cos(x2) * Math.cos(delta);
            double p3 = Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(delta);
            double distance = 60 * Math.atan2(Math.sqrt(p1*p1 + p2*p2), p3);

            System.out.println("Distance: " + distance);
        } else {
            System.out.println("There is no argument");
        }
    }
}
