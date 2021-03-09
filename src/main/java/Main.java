public class Main
{
    public static void main(String[] args)
    {
        //Create object anonymous class
        //Description method for interface
        Base obj= () -> System.out.println("Object Anonymous Class");//finish instruction create object anonymous class

        //Call methods from an object, created from an anonymous class
        obj.show();
        obj.hello();

        //Create anonymous abject anonymous class and call
        // them from this method object showAll(), described in the anonymous class
        new Base()
        {
            //Description method from interface
            @Override
            public void hello()
            {
                System.out.println("Anonymous object");
            }
            //Description new method
            void showAll()
            {
                hello();
                show();
            }
        }.showAll();//Call method

    }
}
