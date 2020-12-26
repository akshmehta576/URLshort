package com.example.urlshortner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class URLController {
    @Autowired
    URLService urlService;

    //********USERDETAILS**********//

    @GetMapping("/details")
    public List<UserDetails> getdata()
    {
        return urlService.getdetail();
    }

    @RequestMapping(method= RequestMethod.POST , value = "/details")
    public String adddata(@RequestBody UserDetails userDetails)
    {
        return urlService.adddetail(userDetails);
    }

    @PutMapping("/details/{user_id}")
    public String updatedata(@RequestBody UserDetails userDetails, @PathVariable int user_id)
    {
        return urlService.updatedetail(user_id, userDetails);
    }

    @DeleteMapping("/details/{user_id}")
    public String deletedata(@PathVariable int user_id)
    {
        return urlService.deletedetail(user_id);

    }
    //********PLAN**********//

    @GetMapping("/plan")
    public List<Plans> getdatas()
    {
        return urlService.getplan();
    }

    @RequestMapping(method= RequestMethod.POST , value = "/plan")
    public String adddatas(@RequestBody Plans plans)
    {
        return urlService.addplan(plans);
    }

    @PutMapping("/plan/{plan_id}")
    public String updatedatas(@RequestBody Plans plans, @PathVariable int plan_id)
    {
        return urlService.updateplan(plan_id, plans);
    }

    @DeleteMapping("/plan/{plan_id}")
    public String deletedatas(@PathVariable int plan_id)
    {
        return urlService.deleteplan(plan_id);

    }

    //********BALANCE**********//


    @GetMapping("/balance")
    public List<Balance> getdatass()
    {
        return urlService.getbal();
    }

    @RequestMapping(method= RequestMethod.POST , value = "/balance")
    public String adddatass(@RequestBody Balance balance)
    {
        return urlService.addbal(balance);
    }

    @PutMapping("/balance/{balance_id}")
    public String updatedatass(@RequestBody Balance balance, @PathVariable int balance_id)
    {
        return urlService.updatebal(balance_id, balance);
    }

    @DeleteMapping("/balance/{balance_id}")
    public String deletedatass(@PathVariable int balance_id)
    {
        return urlService.deletebal(balance_id);

    }


    //********ACTIVITY**********//

    @GetMapping("/activity")
    public List<Activity> getdatasss()
    {
        return urlService.getact();
    }

    @RequestMapping(method= RequestMethod.POST , value = "/activity")
    public String adddatasss(@RequestBody Activity activity)
    {
        return urlService.addact(activity);
    }

    @PutMapping("/activity/{act_id}")
    public String updatedatasss(@RequestBody Activity activity, @PathVariable int act_id)
    {
        return urlService.updateact(act_id, activity);
    }

    @DeleteMapping("/activity/{act_id}")
    public String deletedatasss(@PathVariable int act_id)
    {
        return urlService.deleteact(act_id);

    }






}
