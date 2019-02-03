/*
 print-prime.c
 By David Broman.
 Last modified: 2015-09-15
 This file is in the public domain.
*/


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define COLUMNS 6



void print_number(int n){
	
	printf("\t%d",n);
}


void print_sieves(int n){
  // Should print out all prime numbers less than 'n'
  // with the following formatting. Note that
  // the number of columns is stated in the define
  // COLUMNS
  int *A = malloc(n*sizeof(int)+sizeof(int)); 
  int max = (int) sqrt(n) ;
  A[0]=0;
  A[1]=0;
  for(int i = 2; i<=n;i++){
	  A[i]=1;
  }
  for(int i = 2; i<=max;i++){
	  
		if(A[i]){
			for(int j =0; (i*i+i*j)<=n;j++){
				A[i*i+j*i]=0;
			}
			
		}
	}
	for(int i =2, j= 0; i<=n; i++){
		if(A[i]){
			print_number(i);
			if(++j==6){
				j=0;
				printf("\n");
			}
		}
	}
	
	free(A);

  printf("\n");
}


























// 'argc' contains the number of program arguments, and
// 'argv' is an array of char pointers, where each
// char pointer points to a null-terminated string.
int main(int argc, char *argv[]){
  if(argc == 2)
    print_sieves(atoi(argv[1]));
  else
    printf("Please state an interger number.\n");
  return 0;
}

 


















