package com.clase_3;

public class clase3 {


    public static void main(String[] args) {
        String[] nombres = {"Geronimo", "Matias", "Francisco", "Lucia"};
        System.out.println(concat(nombres));
    }
    public static String concat(String[] strArray){
        StringBuilder res = new StringBuilder();
        for (String str: strArray){
            str += " ";
            res.append(str);
        }
        return res.toString();
    }
}
