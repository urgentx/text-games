#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const int MAX_INPUT = 10;

struct Car{
	int engine_condition;
	int wheel_pressure;
	};

void carWorkshop(){  
	    
	printf("Car workshop.");
	struct Car Car1; //declare struct of type Car
	Car1.engine_condition = 50;
	Car1.wheel_pressure = 19;
}

int main(int argc, char *argv[]){ 
  
	char *spacer = "\n\n\n";
	char input[MAX_INPUT];
	char input2[MAX_INPUT];

	printf("%s", spacer); //spacer
	printf("Oi. Start doing some work!");
	printf("%s", spacer); //spacer

	fgets(input, MAX_INPUT, stdin);

	printf("%s", spacer); //spacer
	printf("Choose 1 of the 3 things to fix:\n\n1.Car\n\n2.Computer\n\n3.Knife");
	printf("%s", spacer); //spacer
	
	
	fgets(input2, MAX_INPUT, stdin);
	
	printf("%s", spacer); //spacer
	
	

	if(strstr(input2, "1") || strstr(input2, "car")){
	  carWorkshop();
	} 


	printf("%s", spacer); //spacer

	return 0;
}


