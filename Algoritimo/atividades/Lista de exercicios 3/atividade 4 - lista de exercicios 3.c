#include <stdio.h>

int main (){

    float celcius, fahrenheit = 0;

    printf("Digite quantos graus atualmente, em Celcius: ");
    scanf("%f", &celcius);

    fahrenheit = ((9 * celcius) / 5) + 32;

    printf("%.2f Celcius \n", celcius);
    printf("%.2f fahrenheit", fahrenheit);


return 0;
}
