package lab1assignments;
import java.util.*;

public class FIFOtest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		FIFO fifo = new FIFO();
		int i;
		
		while(true) {
			System.out.println("Write 1 if you want to push a value you type in, write 0 if you want to clear the list otherwise it will pop and give you the value");
			i = in.nextInt();
			if(i == 1) {
				System.out.println("Write an integer to be pushed");
				fifo.PUSH(in.nextInt());
			}else if(i == 0){
				fifo.clear();
			}else {
				if(!fifo.isEmpty()) {
					System.out.println("You popped the element [" + fifo.POP() + "]");
				}else {
					fifo.POP();
				}
				
			}
		}
		
		

	}

}
