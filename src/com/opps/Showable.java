package com.opps;

interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
class TestNestedInterface1 implements Showable{

    @Override
    public void show() {
        System.out.println("Showing");
    }
}

class solution{
    public static void main(String args[]){
        Showable message=new TestNestedInterface1();
        message.show();
    }
}