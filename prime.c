/*
 prime.c
 By David Broman.
 Last modified: 2019-02-01 by Byon, modified is_prime function
*/


#include <stdio.h>

int is_prime(int n){
	int is_not_prime = 1;
	for(int i = 2; is_not_prime && i<n; i++){
		
		if(n%i == 0){
			is_not_prime=0;
		
		}
		
	}
	
  return is_not_prime;
}

int main(void){
  printf("%d\n", is_prime(11));  // 11 is a prime.      Should print 1.
  printf("%d\n", is_prime(383)); // 383 is a prime.     Should print 1.
  printf("%d\n", is_prime(987)); // 987 is not a prime. Should print 0.
}




















