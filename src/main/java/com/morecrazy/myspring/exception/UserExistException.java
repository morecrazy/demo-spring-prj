package com.morecrazy.myspring.exception;

public class UserExistException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7480885871778461502L;

	public UserExistException(String errorMsg)
    {
        super(errorMsg);
    }
}
