/**
 *1. Write a function for arithmetic operators(+,-,*,/)
 *2.Write a method for increment and decrement operators(++, --)
 *3. Program to equal operator and not equal operators 
 *4. Write a program to find the two numbers equal or not. 
 *5. Programs on Logical AND,OR operator and Logical NOT 
 *6. Program for relational operators (<,<==, >, >==)
 * 7. Print the smaller and larger number
 */
package operators;
public class Operators 
{ 
    int h=5; 
    int m=2;
    String n;
    public void arithematicoperators(){
    
        System.out.println("Addition of two numbers:"+(h+m));
        System.out.println("Subtraction of two numbers:"+(h-m));
        System.out.println("Division of two numbers:"+(h/m));
        System.out.println("Multiplication of two numbers:"+(h*m));
    }
    public void idoperators(){
        System.out.println("Preincrement of h:"+(++h));
        System.out.println("Postincrement of m:"+(m++));
        System.out.println("Predecrement of h:"+(--h));
        System.out.println("Postdecrement of m:"+(m--));
    }
    public void equalornot(){ 
        int l=5;
        if(l==h){
           System.out.println("The numbers are equal"); 
        }
        else{
            System.out.println("The numbers are not equal");
        }
        
    }
    public void logicalop(){ 
        int m=6;
        System.out.println("Logical AND:"+(h<m&&m>this.m));//here this.m represents the value of m in the function
        System.out.println("Logical OR:"+(h<m||m>this.m));
        System.out.println("Logical NOT:"+!(h<m&&m>this.m));
    }
    public void relational(){
        System.out.println("h value is:"+h+" "+"m value is:"+m);
        System.out.println("Equal to operator(h==m):"+(h==m));
        System.out.println("Not equal to operator(h!=m):"+(h!=m));
        System.out.println("Greater than (h>m):"+(h>m));
        System.out.println("Less than (h<m):"+(h<m));
        System.out.println("Greater than or equal to(h>=m):"+(h>=m));
        System.out.println("Less than or equal to (h<=m):"+(h<=m));
        n=(h>m)?"h="+h+"is large number and m="+m+" is small number":"m="+m+" is large number and h="+h+" is small number";
        System.out.println(n);
    }
    public static void main(String[] args) 
    {
       Operators obj=new Operators(); 
       obj.arithematicoperators();
       obj.idoperators();
       obj.equalornot();
       obj.logicalop();
       obj.relational();
    }
    
}
