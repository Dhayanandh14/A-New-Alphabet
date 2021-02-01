#include <iostream>
using namespace std;
 int main() {
    string a;
    getline(cin ,a);
    for(int i=0;i<a.length();i++){
      if(a[i]=='a' || a[i]=='A'){
        cout<<("@");
      }
      else if(a[i]=='b' || a[i]=='B'){
        cout<<("8");
      }
      else  if(a[i]=='c' || a[i]=='C'){
        cout<<("(");
      }
      else if(a[i]=='d' || a[i]=='D'){
        cout<<("|)");
      }
      else  if(a[i]=='e' || a[i]=='E'){
        cout<<("3");
      }
      else  if(a[i]=='f' || a[i]=='F'){
        cout<<("#");
      }
      else  if(a[i]=='g' || a[i]=='G'){
        cout<<("6");
      }
      else  if(a[i]=='h' || a[i]=='H'){
        cout<<("[-]");
      }
      else if(a[i]=='i' || a[i]=='I'){
        cout<<("|");
      }
      else  if(a[i]=='j' || a[i]=='J'){
        cout<<("_|");
      }
      else  if(a[i]=='k' || a[i]=='K'){
        cout<<("|<");
      }
      else if(a[i]=='l' || a[i]=='L'){
        cout<<("1");
      }
      else  if(a[i]=='m' || a[i]=='M'){
        cout<<("[]\\/[]");//[]\/[]
      }
      else  if(a[i]=='n' || a[i]=='N'){
        cout<<("[]\\[]");
      }
      else  if(a[i]=='o' || a[i]=='O'){
        cout<<("0");
      }
      else  if(a[i]=='p' || a[i]=='P'){
        cout<<("|D");
      }
      else  if(a[i]=='q' || a[i]=='Q'){
        cout<<("(,)");
      }
      else  if(a[i]=='r' || a[i]=='R'){
        cout<<("|Z");
      }
      else  if(a[i]=='s' || a[i]=='S'){
        cout<<("$");
      }
      else  if(a[i]=='t' || a[i]=='T'){
        cout<<("']['");
      }
      else  if(a[i]=='u' || a[i]=='U'){
        cout<<("|_|");
      }
      else  if(a[i]=='v' || a[i]=='V'){
        cout<<("\\/");//\/
      }
      else  if(a[i]=='w' || a[i]=='W'){
        cout<<("\\/\\/");//\/\/
      }
      else  if(a[i]=='x' || a[i]=='X'){
        cout<<("}{");
      }
      else  if(a[i]=='y' || a[i]=='Y'){
        cout<<("`/");
      }
      else  if(a[i]=='z' || a[i]=='Z'){
        cout<<("2");
      }
      else{
        cout<<(a[i]);
      }
    

    }
}