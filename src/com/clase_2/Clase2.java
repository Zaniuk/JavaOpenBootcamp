package com.clase_2;

public class Clase2 {
    static double precioConIva(double precio){
        return precio + (precio * 21 / 100);
    }
    public static void main(String[] args) {
        System.out.println(precioConIva(1200d));
    }
}
