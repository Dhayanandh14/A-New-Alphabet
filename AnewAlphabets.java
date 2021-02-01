import java.util.*;
class AnewAlphabets {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String n=kbd.nextLine();
    for(int i=0;i<n.length();i++){
      if(n.charAt(i)=='a' || n.charAt(i)=='A'){
        System.out.print("@");
      }
      else if(n.charAt(i)=='b' || n.charAt(i)=='B'){
        System.out.print("8");
      }
      else if(n.charAt(i)=='c' || n.charAt(i)=='C'){
        System.out.print("(");
      }
      else if(n.charAt(i)=='d' || n.charAt(i)=='D'){
        System.out.print("|)");
      }
      else if(n.charAt(i)=='e' || n.charAt(i)=='E'){
        System.out.print("3");
      }
      else if(n.charAt(i)=='f' || n.charAt(i)=='F'){
        System.out.print("#");
      }
      else if(n.charAt(i)=='g' || n.charAt(i)=='G'){
        System.out.print("6");
      }
      else if(n.charAt(i)=='h' || n.charAt(i)=='H'){
        System.out.print("[-]");
      }
      else if(n.charAt(i)=='i' || n.charAt(i)=='I'){
        System.out.print("|");
      }
      else if(n.charAt(i)=='j' || n.charAt(i)=='J'){
        System.out.print("_|");
      }
      else if(n.charAt(i)=='k' || n.charAt(i)=='K'){
        System.out.print("|<");
      }
      else if(n.charAt(i)=='l' || n.charAt(i)=='L'){
        System.out.print("1");
      }
      else if(n.charAt(i)=='m' || n.charAt(i)=='M'){
        System.out.print("[]\\/[]");//[]\/[]
      }
      else if(n.charAt(i)=='n' || n.charAt(i)=='N'){
        System.out.print("[]\\[]");
      }
      else if(n.charAt(i)=='o' || n.charAt(i)=='O'){
        System.out.print("0");
      }
      else if(n.charAt(i)=='p' || n.charAt(i)=='P'){
        System.out.print("|D");
      }
      else if(n.charAt(i)=='q' || n.charAt(i)=='Q'){
        System.out.print("(,)");
      }
      else if(n.charAt(i)=='r' || n.charAt(i)=='R'){
        System.out.print("|Z");
      }
      else if(n.charAt(i)=='s' || n.charAt(i)=='S'){
        System.out.print("$");
      }
      else if(n.charAt(i)=='t' || n.charAt(i)=='T'){
        System.out.print("']['");
      }
      else if(n.charAt(i)=='u' || n.charAt(i)=='U'){
        System.out.print("|_|");
      }
      else if(n.charAt(i)=='v' || n.charAt(i)=='V'){
        System.out.print("\\/");//\/
      }
      else if(n.charAt(i)=='w' || n.charAt(i)=='W'){
        System.out.print("\\/\\/");//\/\/
      }
      else if(n.charAt(i)=='x' || n.charAt(i)=='X'){
        System.out.print("}{");
      }
      else if(n.charAt(i)=='y' || n.charAt(i)=='Y'){
        System.out.print("`/");
      }
      else if(n.charAt(i)=='z' || n.charAt(i)=='Z'){
        System.out.print("2");
      }
      else{
        System.out.print(n.charAt(i));
      }
     

    }
  }
}