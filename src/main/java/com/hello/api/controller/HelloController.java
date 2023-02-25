/*
 *
 *  Copyright (c) 2018-2020 Givantha Kalansuriya, This source is a part of
 *   Staxrt - sample application source code.
 *   http://staxrt.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.hello.api.controller;

import com.hello.api.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * The type User controller.
 *
 * @author Givantha Kalansuriya
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HelloController {


  private final HelloService helloService;
  
  /**
   * Get hello.
   *
   */
  @GetMapping("/hello")
  public ResponseEntity<?> getHello() {
    return new ResponseEntity<>("hello", HttpStatus.OK);
  }

  /**
   * Get hello2.
   *
   */
  @GetMapping("/hello2")
  public ResponseEntity<?> getHello2() {
    return new ResponseEntity<>(helloService.getHello2(), HttpStatus.OK);
  }


}
