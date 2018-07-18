class PassA 
{
    public static void main(String [] args) 
    {
        PassA p = new PassA();
        p.start();
    }

    void start() 
    {
        int[] b1 = {1,2,3};
        int[] b2 = fix(b1);
        System.out.println((b1[0]+b1[1]+b1[2]) + " " + (b2[0]+b2[1]+b2[2]));
    }

    int[] fix(int[] b1) 
    {
        b1[1] = 5;
        return b1;
    }
}