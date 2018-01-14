package com.raiden.reda.hilmi.web;


import com.raiden.reda.hilmi.model.Action;
import com.raiden.reda.hilmi.service.RedaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Actions on a customer case controller
 */
@RestController
@CrossOrigin(origins = "*")
public class RedaController {

    /**
     * Action controller logger
     */
    private static final Logger logger = LoggerFactory.getLogger(RedaController.class);

    /**
     * Action service
     */
    private RedaService redaService;


    public RedaController(RedaService redaService) {
        this.redaService = redaService;
    }

    @GetMapping("/actions/{id}")
    public ResponseEntity<Action> getAction(@PathVariable("id") long id) {

        if (logger.isDebugEnabled()) {
            logger.debug("ActionController => {}", id);
        }

        if(id < 0 ){

            return ResponseEntity.badRequest().build();
        }

        Optional<Action> result = Optional.of(new Action().setComment("test"));

        if( result.isPresent()){

            return ResponseEntity.ok().body(result.get());
        }
        return ResponseEntity.notFound().build();
    }


}
