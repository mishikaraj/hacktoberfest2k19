#include<conio.h>
#include <stdio.h>
#include<stdio.h>
int incr(int);
int decr(int);

int main()
{
    int num,ch;
    printf("enter the  two digit number of your choice");
    scanf("%d",&num);
    while(n<3)
        int res,fin;
            res=decr(num);
            fin=decr(res);
            printf("the decremented number is %d\n",fin);
            break;
    printf("This is the following menu options\n");
    printf("----------1.Choose here for incrementing the number-----------------\n");
    printf("----------2.Choose here for decrementing the number-------------------\n");
    printf("----------3.EXIT THE PROGRAM----------------------------\n");
    printf("enter the choice");
    scanf("%d",&ch);
    
    switch(ch) {
        case 1: {
            int res,fin;
            res=incr(num);
            fin=incr(res);
            printf("the incremented number is %d\n",res);
            break;
        }
        case 2:{
            int res,fin;
            res=decr(num);
            fin=decr(res);
            printf("the decremented number is %d\n",fin);
            break;
            
        }
        case 3:{
            return 0;
        }
    }
    }
    return 0;
    }       
int incr(int x)
{
     x=x+1;
     return x;
}
int decr(int x)
{
    x=x-1;
    return x;
}


