
public class StarPart{

public static void main(String[] args){

int num = 10;


for(int row = 1; row <= 10; row++){

	for(int column = 1; column <= row; column++){

	System.out.print('*');

}
	System.out.println();

	}
	
	
for(int row = 10; row >= 1; row--){
	
	for(int column =1; column <= row; column++){

	System.out.print('*');
}

	System.out.println();

	}

	
for(int row = 1; row <= 10; row++){
	for(int column = 1; column < row; column++){
		System.out.print(' ');
	}
	for(int column = row; column <= 10; column++){
		System.out.print('*');
	}
        System.out.println();
     }
    
for(int row = 1; row <= 10; row++){

	for(int column = row; column < row; column++){
		System.out.print(' ');
	}
	for(int column = 1; column <= row; column++){
		System.out.print('*');
	}
	System.out.println();
    }
   








}



  
}