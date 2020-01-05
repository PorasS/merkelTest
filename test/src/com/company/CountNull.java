package com.company;

public class CountNull {


    int counter=0;
    public void countNullNode(BNode temp){
        if(temp!=null){
            if(temp.getLeft()==null&&temp.getRight()==null){
                  return;
            }
            if(temp.getLeft()==null||temp.getRight()==null){
                System.out.println("at node "+temp.getData()+" node is not present");
                counter++;
            }
            countNullNode(temp.getLeft());
            countNullNode(temp.getRight());
        }
    }

    public int noOfNullNodes(){
        return counter;
    }
}
