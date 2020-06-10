package classdesign.polymorphism4;

public class Egret {
        private String color;           //null
        public Egret() {
            this("white");
        }
        public Egret(String color) {
            this.color = color;              //?
        }
        public static void main(String[] args) {
            Egret e = new Egret();
            System.out.println("Color:" + e.color);
        }
    }

