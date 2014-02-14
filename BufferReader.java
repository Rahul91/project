import java.io.*;
import java.util.*;
import java.lang.*;

class BufferReader
{
  public static void main(String args[])
  throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    String str;
    char[] name;
    int l,i;
    Formatter fmt=new Formatter();


    long a,b,c,d,e,f,g,h,x;
    long H1=0x6a09e667fbbcc908L;
    long H2=0xbb67ae8584caa73bL;
    long H3=0x3c6ef372fe94f82bL;
    long H4=0xa54ff53a5f1d36f1L;
    long H5=0x510e527fade682d1L;
    long H6=0x9b05688c2b3e6c1fL;
    long H7=0x1f83d9abfb41bd6bL;
    long H8=0x5be0cd19137e2179L;


    a=H1;
    b=H2;
    c=H3;
    d=H4;
    e=H5;
    f=H6;
    g=H7;
    h=H8;
  
    
//    System.out.println(fmt.format("%x \n%x \n%x \n%x \n%x \n%x \n%x \n%x", a, b, c, d, e, f, g, h));
    System.out.println("Enter the String :");
    str=br.readLine();
//    l=str.length();
    System.out.println("String:"+ str);
    name=str.toCharArray();
   /* for(i=0;i<=l;i++)
    {
     System.out.print(name[i]);
    }
   */
    System.out.print("Char : ");
    System.out.println(name);

//    fmt.format("Hash Code :%H %x", name, H1);
//    System.out.println(fmt);
//    fmt.format("Binary :%B", 2);
//    System.out.println(fmt);
    Ch(a,b,c);
    x=Maj(a,b,c);
    System.out.println(fmt.format("%x", x));
    Shift0(a);
    Shift1(e);
  }


public static void Ch(long a,long b,long c)
{
 long x,y,z,res;
 Formatter fmt=new Formatter();

 x=a;
 y=b;
 z=c;

 res=(x & y)^(~x & z);
 System.out.println(fmt.format("%x", res));
}


public static long Maj(long a, long b, long c)
{
 long res;
 
 res=(a & b)^(a & c)^(b & c);
 return res;
}


public static void Shift0(long a)
{
 long res;
 Formatter fmt= new Formatter();
 res=(((e >>> 28) | (e << (-28))) ^ ((e >>> 34) | (e << (-34))) ^ ((e >>> 39) | (e>> (-39))));
 System.out.println(fmt.format("%x", res));
}

public static void Shift1(long e)
{
 long res;
 Formatter fmt= new Formatter();
 res=(((e >>> 14) | (e << (-14))) ^ ((e >>> 18) | (e << (-18))) ^ ((e >>> 41) | (e>> (-41))));
 System.out.println(fmt.format("%x", res));
}
}




