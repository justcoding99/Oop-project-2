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
public class SorryWeDontHaveThatOneException extends Exception{
        private static final long serialVersionUID = -8933092524984073138L;

	public SorryWeDontHaveThatOneException() {
		super("No Vehicle available");
	}
    
}
