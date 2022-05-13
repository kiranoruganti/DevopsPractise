abstract class place
{
    int l,b;
    place(int x,int y)
{
    l=x;
    b=y;
}
abstract int area();
}
class rectangle extends place{

    rectangle(int x,int y)
    {
        super(x,y);
    }
    int area()
    {
        System.out.println("area of rectangle is");
        return l*b;
    }
}
class triangle extends place
{
    triangle(int x,int y)
{
    super(x,y);
    
}
int area()
{
    System.out.println("area of triangle is");
    return(l*b)/2;
}
class abstractuse
{
    public static void main(String args[])
    {
        rectangle r=new rectangle(5,5);
        triangle t=new triangle(5,5);
        place p;
        p=r;
        System.out.println(p.area());
        p=t;
        System.out.println(p.area());
    }
}

}