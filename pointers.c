


#include <stdio.h>
#include <stdlib.h>

char* text1 = "This is a string.";
char* text2 = "Yet another thing.";
int list1[80];
int list2[80];
int count = 0;


void copycodes(char *t, int *l,int *count){
	int ct;
	while(1){
		ct = (int) *t;
		if(ct==0){
			break;
		}else{
			*l=ct;
			
			t=t+1;
			l=l+1;
			
			*count=*count+1;
		}
	}
}

void work(void){
	copycodes(text1, list1, &count);
	copycodes(text2, list2, &count);
}



void printlist(const int* lst){
  printf("ASCII codes and corresponding characters.\n");
  while(*lst != 0){
    printf("0x%03X '%c' ", *lst, (char)*lst);
    lst++;
  }
  printf("\n");
}

void endian_proof(const char* c){
  printf("\nEndian experiment: 0x%02x,0x%02x,0x%02x,0x%02x\n", 
         (int)*c,(int)*(c+1), (int)*(c+2), (int)*(c+3));
  
}

int main(void){
  work();

  printf("\nlist1: ");
  printlist(list1);
  printf("\nlist2: ");
  printlist(list2);
  printf("\nCount = %d\n", count);

  endian_proof((char*) &count);
  return(0);
}
