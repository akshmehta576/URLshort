package com.example.urlshortner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class URLService {
    @Autowired
    UserDetailsRepo userDetailsRepo;
    @Autowired
    PlansRepo plansRepo;
    @Autowired
    BalanceRepo balanceRepo;
    @Autowired
    ActivityRepo activityRepo;

    //********USERDETAILS**********//

    public List<UserDetails> getdetail()
    {
        List<UserDetails> detail = new ArrayList<>();
        userDetailsRepo.findAll().forEach(detail::add);
        return detail;
    }

    public String adddetail(UserDetails userDetails)
    {
        userDetailsRepo.save(userDetails);
        return "Added";
    }

    public String updatedetail(int id, UserDetails userDetails )
    {
        userDetailsRepo.save(userDetails);
        return "Updated";
    }

    public String deletedetail(int id)
    {
        userDetailsRepo.deleteById(id);
        return "Deleted";
    }


    //********PLAN**********//

    public List<Plans> getplan()
    {
        List<Plans> plan = new ArrayList<>();
        plansRepo.findAll().forEach(plan::add);
        return plan;
    }

    public String addplan(Plans plans)
    {
        plansRepo.save(plans);
        return "Added";
    }

    public String updateplan(int id, Plans plans )
    {
        plansRepo.save(plans);
        return "Updated";
    }

    public String deleteplan(int id)
    {
        plansRepo.deleteById(id);
        return "Deleted";
    }

    //********BALANCE**********//

    public List<Balance> getbal()
    {
        List<Balance> balances = new ArrayList<>();
        balanceRepo.findAll().forEach(balances::add);
        return balances;
    }

    public String addbal(Balance balance)
    {
        balanceRepo.save(balance);
        return "Added";
    }

    public String updatebal(int id, Balance balance )
    {
        balanceRepo.save(balance);
        return "Updated";
    }

    public String deletebal(int id)
    {
        balanceRepo.deleteById(id);
        return "Deleted";
    }

    //********ACTIVITY**********//

    public List<Activity> getact()
    {
        List<Activity> act = new ArrayList<>();
        activityRepo.findAll().forEach(act::add);
        return act;
    }

    public String addact(Activity activity)
    {
        activityRepo.save(activity);
        return "Added";
    }

    public String updateact(int id, Activity activity )
    {
        activityRepo.save(activity);
        return "Updated";
    }

    public String deleteact(int id)
    {
        activityRepo.deleteById(id);
        return "Deleted";
    }

}
