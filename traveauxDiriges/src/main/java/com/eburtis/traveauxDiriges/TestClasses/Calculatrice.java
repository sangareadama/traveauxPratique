package com.eburtis.traveauxDiriges.TestClasses;

public class Calculatrice {
    public Calculatrice() {
        // TODO Auto-generated constructor stub
    }

    public Double addition(double nbre1, double nbre2) {
        // TODO Auto-generated method stub
        double result;
        result= nbre1+nbre2;
        return result;
    }

    public Double soustraction(double nbre1, double nbre2) {
        // TODO Auto-generated method stub
        double result;
        result= nbre1-nbre2;
        return result;
    }

    public Double multiplication(double nbre1, double nbre2) {
        double result;
        result= nbre1*nbre2;
        return result;
    }

    public Double division(double nbre1, double nbre2) {
        double result = 0;
        if (nbre2!=0){
            result= nbre1/nbre2;
        }
        return result;
    }

    public Double carre(double nbre1){
        double result=nbre1*nbre1;
        return result;
    }

    public Double identiteRemarquable(double a,double b){
       double a2=carre(a);
       double b2=carre(b);
       double ax2=multiplication(2,a);
       double result= addition(addition(a2,multiplication(ax2,b)),b2);

       return result;
    }

    /*
     * public Double quadratique(double a, double b,double c) {
     *
     * double discr = b * b - 4 * a * c;
     *
     * double x, x1, x2,i;
     *
     * if (discr > 0) {
     *
     *
     * x1 = (-b + Math.sqrt(discr)) / (2 * a);
     *
     * x2 = (-b - Math.sqrt(discr)) / (2 * a);
     *
     * System.out.println("Deux solutions r�elles : "+ x1 +" ou "+ x2); } else if
     * (discr < 0) { discr = -discr; x = -b / (2 * a); i = Math.sqrt(discr) / (2 *
     * a); System.out.println("Deux solutions imaginaires : "+ x +i+" ou "+ x+i);
     *
     * } else { x = (-b + Math.sqrt(discr)) / (2 * a);
     * System.out.println("Une seule solution: " +x); }
     *
     * // TODO Auto-generated method stub return discr; }
     */
}
