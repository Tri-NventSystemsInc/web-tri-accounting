package com.tri.erp.spring.commons.helpers;

import com.tri.erp.spring.reponse.CreateResponse;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * Created by TSI Admin on 9/10/2014.
 */
public class MessageFormatter {

    private MessageSource messageSource;
    private BindingResult bindingResult;
    private CreateResponse response;

    public MessageFormatter(CreateResponse response) {
        this.response = response;
    }
    public MessageFormatter(BindingResult bindingResult, MessageSource messageSource, CreateResponse response) {
        this.bindingResult = bindingResult;
        this.messageSource = messageSource;
        this.response = response;
    }

    public void buildErrorMessages() {
        // create service for this later
        for (Object object : bindingResult.getAllErrors()) {
            if (object instanceof FieldError) {
                FieldError fieldError = (FieldError) object;

                /**
                 * Use null as second parameter if you do not use i18n
                 * (internationalization)
                 */
                String message = messageSource.getMessage(fieldError, null);
                response.getFields().add(fieldError.getField());
                response.getMessages().add(message);
            }
        }
    }

    public CreateResponse getResponse() {
        return this.response;
    }
}
