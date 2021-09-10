package com.cytobank.pipelinedemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moyongfeng
 */
@RestController
@Api(tags = "欢迎信息")
@RequestMapping("/api/v1/greeting")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GreetingController {

    @ApiOperation("获取欢迎信息")
    @GetMapping("")
    public ResponseEntity<String> greeting() {
        String str = null;
        return new ResponseEntity<>("Hello codepipeline.", HttpStatus.OK);
    }

}
