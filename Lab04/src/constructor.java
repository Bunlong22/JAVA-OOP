public class constructor {
    public static class monekey {
        private String name;
        //b. Method member and constructor:

//        public monekey(String _name) {
//
//            name = _name;
//        }

        public void cry() {

            System.out.println(name + " is crying Wooh! Wooh!");
        }

        public static void main(String[] args) {
            monekey c = new monekey();
            System.out.println(c.name);
            //  c.name="Kiki";
            c.cry();
        }
    }
}

