package classdesign.abstraction3;

abstract class House {
    protected abstract Object getSpace();

}
abstract class Room extends House{
    abstract Object getSpace(Object list);

    }
    abstract  class Ballroom extends House{
    protected abstract Object getSpace();

        public static void main(String[] args) {
            System.out.println("Let's start the party");
        }
}
