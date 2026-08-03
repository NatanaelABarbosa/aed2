#include <stdio.h>
#include <string.h>

int calcular(cidade) {
	// caractere, contador
	// passo base: c[0]
	// passo recursivo: c[x] = "\0"
	

	if (c != "\0") {
		cont = calcular(cidade)+1;
	}
	
	return cont;
}

int main() {	
	char cidade[101];

	scanf("%[^\n]", cidade); getchar();
	while (strcmp(cidade, "FIM") != 0) { 
		printf("%ld\n", strlen(cidade));
		scanf("%[^\n]", cidade); getchar();
	}
	return 0;
}
