#include <stdio.h>

int main()
{
	int num, anterior = 0, posterior = 0;
	
	printf("Digite um valor \n");
	scanf("%d", &num);
	
	anterior = num -1;
	posterior = num +1;
	
	printf("O numero anterior eh: %d \n", anterior);
	printf("O numero digitado foi: %d \n", num);
	printf("O numero posterior eh: %d \n", posterior);
	
	return 0;
}	