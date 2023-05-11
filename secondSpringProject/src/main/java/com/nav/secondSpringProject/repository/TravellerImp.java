package com.nav.secondSpringProject.repository;

import com.nav.secondSpringProject.service.TravellerService;
import com.nav.secondSpringProject.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TravellerImp implements TravellerService {
    @Autowired
    private TravellerRepositoru travellerRepositoru;
    @Autowired
    private ForeignRep foreignRep;
    @Autowired
    private LocalRep localRep;
    @Override
    public Travellers add(Travellers t) {
        return travellerRepositoru.save(t);
    }

    @Override
    public LocalTour saveLocalTourRequest(LocalTour localTour) {
        return localRep.save(localTour);
    }

    @Override
    public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
        return foreignRep.save(foreignTour);
    }

    @Override
    public List<Travellers>  getAll() {
        return (List<Travellers>) travellerRepositoru.findAll();
    }

    @Override
    public Optional<Travellers> getAll(Long id) {
        return travellerRepositoru.findById(id);
    }

    @Override
    public Travellers update(Travellers travellers,Long id) {
        Travellers newTravellers=travellerRepositoru.findById(id).get();
        newTravellers.setTravellerName(travellers.getTravellerName());
        newTravellers.setTravellerPwd(travellers.getTravellerPwd());
        newTravellers.setRoles(travellers.getRoles());

        return travellerRepositoru.save(newTravellers);
    }

    @Override
    public String delete(String id) {
//        foreignRep.removeByTravellercode(Long.parseLong(id));
//     localRep.removeByTravellercode(Long.parseLong(id));
       travellerRepositoru.deleteById(Long.parseLong(id));
        return "deleted successfully "+id;
    }

    @Override
    public List<Travellers> getAll(String id) {
        return travellerRepositoru.findByTravellerNameIgnoreCaseContaining(id);
    }


}
