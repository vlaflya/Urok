package com.company;

public class drob {
    int num;
    int denum;
    public drob(int i, int i1) {
        num = i;
        denum = i1;
    }


    public String toStringSimpled() {
        if(num%denum ==0)
            return String.valueOf((num/denum));
        else if (num > denum)
            return (String)(num/denum + " + " + num%denum + "/" + denum);
        else
            return (String)(num+"/"+denum);
    }

    @Override
    public String toString(){
        return (num+"/"+denum);
    }


    public drob mult(drob dr2){
        return new drob(num*dr2.num,denum*dr2.denum).simple();
    }

    public drob sep(drob dr2){
        return new drob(num*dr2.denum,denum*dr2.num).simple();
    }

    public drob min(drob dr2){
        return new drob(num*dr2.denum- dr2.num*denum,denum*dr2.denum).simple();
    }

    public drob plus(drob dr2){
        return new drob(num*dr2.denum+ dr2.num*denum,denum*dr2.denum).simple();
    }

    public double toDouble(){
        return (double)num/(double)denum;
    }

    public drob simple(){
        int a = num;
        int b = (denum>0?denum:denum*-1);
        while (a!=0 && b!=0){
        if (a > b)
            a = a % b;
        else
            b = b % a;}
        a = (a<0?a*-1:a);
        b = (b<0?b*-1:b);
        if(a==0&& b==0)
            a =1;
        if(denum < 0 && num < 0){
            return new drob(num/(b+a)*-1,denum/(b+a)*-1);
        }
        else
            return new drob(denum>0?(num / (b+a)):(num / (b+a)*-1),denum>0?(denum / (b+a)):(denum / (b+a)*-1));
    }

}
