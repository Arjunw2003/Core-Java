package com.mul;

class Demo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called");
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d = null;

        System.gc();
    }
}