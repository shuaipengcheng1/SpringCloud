package com.misaka.stream_provider.Service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;


public interface PayService {
  String pay(int id);
}
