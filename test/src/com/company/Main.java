package com.company;

import java.util.Scanner;

public class Main {

    static BNode root=null;
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        if(root==null){
            System.out.println("enter a no in Btree");
            int num=s.nextInt();
            root =new BNode();
            root.setData(num);
        }

        BNode temp=root;

        int choice=0;
        while(choice!=4){
            System.out.println("Enter your choice:");
            System.out.println("1:InsertLeft\n"+"2:InsertRight\n"+"3:PrintTree\n"+"4:Exit"+"\n"+"5:FindHorizontalDistance"+"\n"+"6:CountNullNodes");
            choice=s.nextInt();
            switch (choice){
                case 1:
                    new Main().insertLeft(temp);
                    break;

                case 2:
                    new Main().insertRight(temp);
                    break;

                case 3:
                    new Main().printData(temp);
                    break;

                case 4:
                    choice=4;
                    break;

                case 5:
                    HorizontalDist hd= new HorizontalDist();
                    hd.insertInArray(temp);
                    hd.printArray();
                    System.out.println("Find horizontal Dist");
                    System.out.println("Enter Num1");
                    int num1=s.nextInt();
                    System.out.println("Enter Num2");
                    int num2=s.nextInt();
                    System.out.println("Distance between "+num1+" & "+num2+" is "+hd.horiDist(num1,num2));
                    break;

                case 6:
                    CountNull cn =new CountNull();
                    cn.countNullNode(temp);
                    System.out.println("Total no null nodes are "+cn.noOfNullNodes());
                    break;
            }

        }

    }

    public void printData(BNode temp){
        if(temp==null){
           return;
        }
        printData(temp.getLeft());
        System.out.print(" "+temp.getData());
        printData(temp.getRight());
    }

    public void insertLeft(BNode temp){
        int num=0;
        int choice=0;
        if(temp.getLeft()==null){
            System.out.println("Enter a number in Binary Tree");
            num=s.nextInt();
            BNode node =new BNode();
            node.setData(num);
            temp.setLeft(node);
        }else{
            while(choice!=5){
                System.out.println("1:InsertLeftOf"+temp.getData()+"\n"+"2:InsertRightOf"+temp.getData()+"\n"+"3:MoveLeftOf"+temp.getData()+"\n"+"4:MoveRightOf"+temp.getData()+"\n"+"5:Exit");
                choice=s.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter a number in Binary Tree");
                        num=s.nextInt();
                        BNode node =new BNode();
                        node.setData(num);
                        temp.setLeft(node);
                        return;

                    case 2:
                        System.out.println("Enter a number in Binary Tree");
                        num=s.nextInt();
                        BNode node2 =new BNode();
                        node2.setData(num);
                        temp.setRight(node2);
                        return;

                    case 3:
                        if(temp.getLeft()!=null){
                            temp=temp.getLeft();
                        }else{
                            System.out.println("Nothing to go further, insert other choice");
                        }
                        break;

                    case 4:
                        if(temp.getRight()!=null){
                            temp=temp.getRight();
                        }else{
                            System.out.println("Nothing to go further, insert other choice");
                        }
                        break;

                    case 5:
                        choice=5;
                        break;
                }
            }
        }
    }

    public void insertRight(BNode temp){
        int num=0;
        int choice=0;
        if(temp.getRight()==null){
            System.out.println("Enter a number in Binary Tree");
            num=s.nextInt();
            BNode node =new BNode();
            node.setData(num);
            temp.setRight(node);
        }else{
            while(choice!=5){
                System.out.println("1:InsertLeftOf"+temp.getData()+"\n"+"2:InsertRightOf"+temp.getData()+"\n"+"3:MoveLeftOf"+temp.getData()+"\n"+"4:MoveRightOf"+temp.getData()+"\n"+"5:Exit");
                choice=s.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter a number in Binary Tree");
                        num=s.nextInt();
                        BNode node =new BNode();
                        node.setData(num);
                        temp.setLeft(node);
                        return;

                    case 2:
                        System.out.println("Enter a number in Binary Tree");
                        num=s.nextInt();
                        BNode node2 =new BNode();
                        node2.setData(num);
                        temp.setRight(node2);
                        return;

                    case 3:
                        temp=temp.getLeft();
                        break;

                    case 4:
                        temp=temp.getRight();
                        break;

                    case 5:
                        choice=5;
                        break;
                }
            }
        }
    }
}
