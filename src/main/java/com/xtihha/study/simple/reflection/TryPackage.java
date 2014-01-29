package com.xtihha.study.simple.reflection;

public class TryPackage extends ClassLoader{

    @Override
    public Package[] getPackages() {
        Package []pkgs = super.getPackages();
        for(Package pkg : pkgs ) {
            System.out.println(pkg);
        }
        return pkgs;
    }
    public static void main(String[] args) {
//        TryPackage tp = new TryPackage();
//        tp.getPackages();
        
        System.out.println(System.getProperty("java.class.path"));
        System.getProperties().list(System.out);
    }

}
