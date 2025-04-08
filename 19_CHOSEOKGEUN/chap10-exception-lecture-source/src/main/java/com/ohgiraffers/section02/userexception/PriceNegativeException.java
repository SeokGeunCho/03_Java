package com.ohgiraffers.section02.userexception;

<<<<<<< HEAD
public class PriceNegativeException extends Throwable {
    public PriceNegativeException(String message) {
=======
public class PriceNegativeException extends NegativeException {
    public PriceNegativeException(String message) {
        super(message);
>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7
    }
}
