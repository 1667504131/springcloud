package cn.itcast.consumer.web;

import cn.itcast.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: dongjw26541
 * @Date: 2019/3/14 18:32
 * @Version 1.0
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

 /*   @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("{id}")
    public User querById(@PathVariable("id") Long id){
        List<ServiceInstance> list=discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance=list.get(0);

        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;
        User user=restTemplate.getForObject(url,User.class);
        return user;

    }*/


/*    //负载均衡
    @Resource
    private RibbonLoadBalancerClient client;

    @GetMapping("{id}")
    public User querById(@PathVariable("id") Long id){

        ServiceInstance serviceInstance=client.choose("user-service");
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;
        User user=restTemplate.getForObject(url,User.class);
        return user;

    }*/


    @GetMapping("{id}")
    public User querById(@PathVariable("id") Long id){
        String url="http://USER-SERVICE/user/"+id;
        User user=restTemplate.getForObject(url,User.class);
        return user;
    }
}
