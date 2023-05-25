// Calculadora em Linguagem C //

#include <stdio.h>
int subtracao (int a, int b)
{
    return a - b ;
}
   
int soma (int a, int b )
{
    return a + b  ;
}

int prod (int a, int b )
{
    return a * b ;
}
int resto (int a, int b)
{
    return a % b  ;
}

int divisao (int a, int b )
{
    if (b==0) return 0;
    return a / b ;
}
int main()
{
    int a=62, b=0 ;
    
    // Saída
    printf ("\nsoma= %d" , soma ( a, b ));
    printf ("\nSubtracao = %d", subtracao (a ,b));
    printf ("\ndivisao = %d", divisao (a ,b));
    printf ("\nprod = %d", prod (a ,b));
    printf ("\nresto = %d", resto (a ,b));              
    return 0;
}














