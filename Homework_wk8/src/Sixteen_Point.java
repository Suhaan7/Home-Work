public class Sixteen_Point {
        int x, y;
        public Sixteen_Point(){//First distance
        }
        public Sixteen_Point(int x,int y){   //Second distance
            this.x = x;
            this.y=y;
        }
        public int getX(){ return this.x=x;}
        public int getY(){return this.y=y;}
        public int setX(int x ){return this.x = x;}
    public int setY(int y){return this.y= y;}
        public double distance(){
            return Math.sqrt ((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));}
           public double distance(int x, int y) {
            return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));}

        public double distance(Sixteen_Point Second){
            return Math.sqrt((Second.getX()-this.x)*(Second.getX()-this.x)+(Second.getY()-this.y)*(Second.getY()-this.y));}

        public static void main(String[] args) {
            Sixteen_Point first = new Sixteen_Point(6, 5);
            Sixteen_Point second = new Sixteen_Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
           Sixteen_Point point = new Sixteen_Point();
            System.out.println("distance()= " + point.distance());
        }}

