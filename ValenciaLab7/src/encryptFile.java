/*
 * Name: Estefan Valencia
 * Project description: This program will encrypt any file at the users request and ask for an encryption key
 * Course: COSC 211, Winter 2021
 * Lab#: 7
 * Due date: 03/18/21 @ 4:50pm
 */

import java.io.*;
import java.util.*;
public class encryptFile {
		private static boolean repeat = false;
	
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t7");
		System.out.println("Due date:\t3-18-2021");
		
		//Initialize both DataInputStream and DataOutputStream
		DataInputStream inStream;
		DataOutputStream outStream;
		
		
		do {
			
		try {
			
			//ask the user for the file with the unencrypted text
			System.out.print("\nEnter an input file name: ");
			String fileName1 = input.next();
			inStream = new DataInputStream(new FileInputStream(fileName1));
			
			//ask the user which file they want the encrypted text to go
			System.out.print("Enter an output file name: ");
			String fileName2 = input.next();
			outStream = new DataOutputStream(new FileOutputStream(fileName2));
			
			//ask the user what they want the encryption key to be
			System.out.print("Enter an encryption key: ");
			int encryptKey = input.nextInt();
			
			//See how many bytes are readable for the input file
			int numBytesReadable = inStream.available();
			
			
			//Keep encrypting bytes until there are no more bytes to encrypt
			for(int i = 0; i < numBytesReadable; i++) {
				int oneByte = inStream.readByte() + encryptKey;
				outStream.writeByte(oneByte);
			}
			
			//close both streams
			inStream.close();
			outStream.close();
			
			repeat = false;
		} catch (FileNotFoundException e) {
			System.out.println("Wrong input file name. Please enter the correct file name.");
			repeat = true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}while(repeat == true);
		//Print to console that the file was encrypted successfully
		System.out.println("\nFile is encrypted successfully!");
		

	}

}

/**  Desired Output

UNECRYPTED FILE
Lab7.txt
I will encrypt this file using Caesar cipher
Caesar cipher is named after Julius Caesar, who used it in his
private correspondence 

Julius Caesar was a Roman general who played a major role in
establishing the Roman Empire

This is a type of substitution cipher
In substitution cipher a character from the plaintext is
replaced with another character.


ENCRYPTED FILE
Lab7E.txt
N%|nqq%jshw~uy%ymnx%knqj%zxnsl%Hfjxfw%hnumjwHfjxfw%hnumjw%nx%sfrji%fkyjw%Ozqnzx%Hfjxfw1%|mt%zxji%ny%ns%mnxuwn{fyj%htww
jxutsijshj%Ozqnzx%Hfjxfw%|fx%f%Wtrfs%ljsjwfq%|mt%uqf~ji%f%rfotw%wtqj%nsjxyfgqnxmnsl%ymj%Wtrfs%JrunwjYmnx%nx%f%y~
uj%tk%xzgxynyzynts%hnumjwNs%xzgxynyzynts%hnumjw%f%hmfwfhyjw%kwtr%ymj%uqfnsyj}y%nxwjuqfhji%|nym%fstymjw%hmfwfhyjw3


**/
