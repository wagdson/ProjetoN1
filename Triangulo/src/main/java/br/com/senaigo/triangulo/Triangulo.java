package br.com.senaigo.triangulo;

import javax.print.attribute.standard.RequestingUserName;

public class Triangulo {
	
	private int a;
	private int b;
	private int c;
	public Triangulo(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public boolean isTriangulo(){
		
		if (a==0 ||b == 0 || c==0)
			return false;
		
		if(a == b && a ==c )
			return true;
		
		if(a>b && a>c || a>b && a == c){
			if(b+c > a){
				return true;
			}	
		}
		 if(b>a && b>c || a==b && b>c  || b>a && b==c){
			if(a+c > b){
				return true;
			}	
		}
		if (c>a && c>b ){
			if(a+b > c){
				return true;
			}
		}
	
		
		return false;
	}
	
public String tipoDeTriangulo(){
	if(!isTriangulo()){
		return "";
	}
	if(a != b && b != c && a != c){
		return "escaleno";
	}
	
	if(a == b && b == c && a == c){
		return "equilatero";
	}
	
	return "isosceles";
}

	

}
