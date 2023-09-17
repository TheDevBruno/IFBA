    #include <stdio.h>

int main(){

    int num1, num2, num3, media = 0;

    printf("Digite o valor 1: ");
    scanf("%d", &num1);
    
    printf("Digite o valor 2: ");
    scanf("%d", &num2);

    printf("Digite o valor 3: ");
    scanf("%d", &num3);

    media = (num1 + num2 + num3) / 3;

    printf("A media eh: %d", media);    


return 0;
}