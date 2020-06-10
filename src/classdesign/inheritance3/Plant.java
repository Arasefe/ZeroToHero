package classdesign.inheritance3;

 interface Plant {
     default String grow(){
         return "Grow";
     }
}
interface Living{
     public default String grow(){
         return "Growing";
     }
}
class Tree implements Plant, Living{
     public String grow(int height){
         return"Super growing";
     }
    @Override
    public String grow() {
        return "Super growing";
    }

    public static void main(String[] args) {
        Plant p=new Tree();
        System.out.println(p.grow());
    }


}
