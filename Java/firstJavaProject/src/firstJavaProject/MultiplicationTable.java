package firstJavaProject;

public class MultiplicationTable {
void print(int n){
	print(n, 2, 9);
	}
void print(int n,int from,int to){
	for(int i=from;i<=to;i++) {
		System.out.printf("%d * %d = %d",n,i,n*i).println();
	}
}
}
