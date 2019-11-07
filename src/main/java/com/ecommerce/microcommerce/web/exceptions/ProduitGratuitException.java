/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author ds
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {

    public ProduitGratuitException(String message) {
        super(message);
    }
    
}
