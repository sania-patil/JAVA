#include<stdio.h>
#include<string.h>

struct bank{
char customer_name[20];
int balance;
int pin_code;
char account_type;
char internet_facility;
};



int main(){
int i,n;
char internet_banking_facility[200];

struct bank customer[100];
printf("enter number of customers:");
scanf("%d",&n);

for(i=0;i<n;i++) {
printf("customer name:");
scanf("%s",customer[i].customer_name);
printf("account balance:");
scanf("%d",&customer[i].balance);
printf("pin code:");
scanf("%d",&customer[i].pin_code);
printf("account type :"); //saving,recurring,deposit
scanf("%s",&customer[i].account_type);

// type of customers
if((customer[i].balance )>1000000)
{
printf(" customer type:golden customers \n");
} else if((customer[i].balance )>500000 && (customer[i].balance)<1000000) {
printf("customer type:silver customers \n");
} else if ((customer[i].balance )>500000) {
printf("customer type:general customers \n");
}
// ) Display the list of customers availing the internet banking facility
printf("internet Facility available yes=a,no=b: \n");
scanf("%s",&customer[i].internet_facility);
if(  customer[i].internet_facility = "a")
{
  printf("customer name:%s\n",customer[i].customer_name);
        
 strcpy(internet_banking_facility, customer[i].customer_name);
}
}
}

