/*
 * Name: Estefan Valencia
 * Project description: This program will decrypt any encrypted file using the encryption key that they put in
 * Course: COSC 211, Winter 2021
 * Lab#: 7
 * Due date: 03/18/21 @ 4:50pm
 */

import java.io.*;
import java.util.*;
public class decryptFile {
		private static boolean repeat = false;
	public static void main(String[] args) {
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
			
			//ask the user for the encrypted file
			System.out.print("\nEnter an input (or encrypted) file name: ");
			String fileName1 = input.next();
			inStream = new DataInputStream(new FileInputStream(fileName1));
			
			//ask the user for the file where they want the decrypted text to be written to
			System.out.print("Enter an output (or unencrypted) file name: ");
			String fileName2 = input.next();
			outStream = new DataOutputStream(new FileOutputStream(fileName2));
			
			//ask the user for the encryption key
			System.out.print("Enter the encryption key: ");
			int encryptKey = input.nextInt();
			
			// see how many bytes we can read
			int numBytesReadable = inStream.available();
			
			//The loop will keep decrypting each byte until there are no more bytes to decrypt
			for(int i = 0; i < numBytesReadable; i++) {
				int oneByte = inStream.readByte() - encryptKey;
				outStream.writeByte(oneByte);
			}
			
			//Close each stream
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
		
		//Print to console that the file was decrypted successfully
		System.out.println("\nFile was decrypted successfully!");
		
	}

}

/**  Desired Output

ENCRYPTED FILE
Lab7E.txt
N%|nqq%jshw~uy%ymnx%knqj%zxnsl%Hfjxfw%hnumjwHfjxfw%hnumjw%nx%sfrji%fkyjw%Ozqnzx%Hfjxfw1%|mt%zxji%ny%ns%mnxuwn{fyj%htww
jxutsijshj%Ozqnzx%Hfjxfw%|fx%f%Wtrfs%ljsjwfq%|mt%uqf~ji%f%rfotw%wtqj%nsjxyfgqnxmnsl%ymj%Wtrfs%JrunwjYmnx%nx%f%y~
uj%tk%xzgxynyzynts%hnumjwNs%xzgxynyzynts%hnumjw%f%hmfwfhyjw%kwtr%ymj%uqfnsyj}y%nxwjuqfhji%|nym%fstymjw%hmfwfhyjw3


UNENCRYPTED FILE
I will encrypt this file using Caesar cipher
Caesar cipher is named after Julius Caesar, who used it in his
private correspondence 

Julius Caesar was a Roman general who played a major role in
establishing the Roman Empire

This is a type of substitution cipher
In substitution cipher a character from the plaintext is
replaced with another character.


**/