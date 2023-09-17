#include <stdio.h>

int main (){

    int celcius;
    
    float  fahrenheit = 0;

    printf("Digite quantos graus atualmente, em Celcius:");
    scanf("%d", &celcius);

    fahrenheit = ((9 * celcius) / 5) + 32;

    printf("%d" "° Celcius. /n", celcius);
    printf("%f" "° fahrenheit /n", fahrenheit);


return 0;
}