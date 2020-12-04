/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author meltem koc
 */
public class NoCancellationYouMustPayException extends Exception{
        private static final long serialVersionUID = 300348531700817723L;

	public NoCancellationYouMustPayException() {
		super("You need to pay");
	}
    
}
