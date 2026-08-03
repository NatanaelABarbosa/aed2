#include <stdio.h>
#include <string.h>

int calcular(int cont, char * cidade) {
	// caractere, contador
	// passo base: c[0]
	// passo recursivo: c[x] = "\0"
 char c = cidade[cont];

	if (c != "\0") {
	    calcular(cont+1, cidade)
	}
	
	return cont;
}

int main() {	
	char cidade[101];

	scanf("%[^\n]", cidade); getchar();
	while (strcmp(cidade, "FIM") != 0) { 
		printf("%ld\n", calcular(0, cidade));
		scanf("%[^\n]", cidade); getchar();
	}
	return 0;
}
