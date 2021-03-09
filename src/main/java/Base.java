public interface Base
{
    //method with default code:
    default void show()
    {
        System.out.println("Interface Base");
    }

    //method declaration:
    void hello();
}
