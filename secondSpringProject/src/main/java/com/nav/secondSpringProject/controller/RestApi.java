package com.nav.secondSpringProject.controller;

import com.nav.secondSpringProject.entity.ForeignTour;
import com.nav.secondSpringProject.entity.LocalTour;
import com.nav.secondSpringProject.entity.Travellers;
import com.nav.secondSpringProject.service.TravellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class RestApi {

    @Autowired
    TravellerService travellerService;
    @GetMapping("/hia")
    public String get(){
        return "hi all";
    }

    @GetMapping("/hias")
    public String gets(@RequestParam(value = "id") String id){
        return "hi all"+id;
    }

    @GetMapping("/list")
    public List<Travellers> getAll(){
        return travellerService.getAll();
    }

    @GetMapping("/lists")
    public Optional<Travellers> getAll(@RequestParam(value = "id") String id){
        return travellerService.getAll(Long.parseLong(id));
    }

    @GetMapping("/nameLists")
    public List<Travellers> getAlls(@RequestParam(value = "id") String id){
        return travellerService.getAll(id);
    }

    @PutMapping("/update")
    public  Travellers update(@RequestParam(value = "id")String id,@RequestBody Travellers travellers){
        return travellerService.update(travellers,Long.parseLong(id));
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam(value = "id")String id){
        return travellerService.delete(id);
    }
    @PostMapping("/addtraveller")
    public Travellers addTraveller(@RequestBody Travellers traveller) {
        return travellerService.add(traveller);
    }
    @PostMapping("/requestlocaltour")
    public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
        return travellerService.saveLocalTourRequest(localTour);
    }
    @PostMapping("/requestforeigntour")

    public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
        System.out.println("****** From Controller Foreign ******" + foreignTour);
        return travellerService.saveForeignTourRequest(foreignTour);
    }

}
