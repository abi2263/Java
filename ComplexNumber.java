class Complex {
    int real,imag;

    //Constructor
    Complex() {}

    Complex(int tempReal, int tempImag) {
        real = tempReal;
        imag = tempImag;
    }

    Complex add(Complex a, Complex b) {
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }

    Complex sub(Complex a, Complex b) {
        Complex c = new Complex();
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        return c;
    }

    void printComplexNum(){
        System.out.println("Complex Number: "+real+" + "+imag+"i ");
    }
}

public class ComplexNumber {
    public static void main(String[] args) {

        Complex c1=new Complex(7,10);
        c1.printComplexNum();
        Complex c2=new Complex(5,4);
        c2.printComplexNum();

        Complex c3=new Complex();
        c3=c3.add(c1,c2);
        System.out.print("\nSum of ");
        c3.printComplexNum();

        Complex c4=new Complex();
        c4=c4.sub(c1,c2);
        System.out.print("Difference of ");
        c4.printComplexNum();
    }
}
