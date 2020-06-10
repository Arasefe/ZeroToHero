package classdesign.abstraction3;
 public  class Encyclopedia extends Book{
        public  String material="CELLULOSE";
        public Encyclopedia(){
            super();
        }
        public String getMaterial(){
            return super.material;
        }
        public static void main(String[] args) {
            System.out.println(new Encyclopedia().getMaterial());

        }

    }
