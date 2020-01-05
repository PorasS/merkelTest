package com.company;

import java.util.Arrays;

public class HorizontalDist {
    int[] leftSubTreeArray =new int[10];
    int[] rightSubTreeArray =new int[10];
    int counterL=1;
    int counterR=1;

    public void insertInArray(BNode temp){
        leftSubTree(temp.getLeft());
        rightSubTree(temp.getRight());
    }

    public void leftSubTree(BNode temp){
        if(temp==null){
            return;
        }
        leftSubTreeArray[counterL]=temp.getData();
        counterL++;
        leftSubTree(temp.getLeft());
        leftSubTree(temp.getRight());
    }

    public void rightSubTree(BNode temp){
        if(temp==null){
            return;
        }
        rightSubTreeArray[counterR]=temp.getData();
        counterR++;
        rightSubTree(temp.getLeft());
        rightSubTree(temp.getRight());
    }

    public int search(int[] array, int num){
        for(int i=1;i<array.length;i++){
            if(array[i]==num){
                num=i;
//                break;
            }
        }
//        if(num/2==0){
//            num-=1;
//        }
        return num;
    }

    public int horiDist(int num1, int num2){
        num1=search(leftSubTreeArray,num1);
        num2=search(rightSubTreeArray,num1);
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public void printArray(){
        System.out.println("LeftSubTree"+Arrays.toString(leftSubTreeArray));
        System.out.println("RightSubTree"+Arrays.toString(rightSubTreeArray));
    }


}
