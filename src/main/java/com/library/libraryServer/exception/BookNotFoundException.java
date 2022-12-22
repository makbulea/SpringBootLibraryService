package com.library.libraryServer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException  extends RuntimeException{
    // Bu bi controller adviser.Exception u yakalayıp response ı ilgili classs a üretebilsin.
    // Direk exception dan extend etseydim thread ım burada ölecekti.Bundan sonraki işlemle yapılmayacaktı.
    //Runtime exception dan extend edildiğinde thred ölmüyor ve response extitiy üretebiliyorum.
    //Serviste exception fırlatacağım ve exception olsaydı burada sonlanacaktı.,
    //JVM e bir tane exception fırlatacağım ve general exception bunu yakalayıp resonse entity e çevirecek
    //Ve kullanıcıya bunu göstereceğim.
    public BookNotFoundException(String message) {
        super(message);
    }
}
