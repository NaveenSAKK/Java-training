package com.nav.secondSpringProject.service;
import com.nav.secondSpringProject.entity.*;


import java.util.*;

public interface TravellerService {
    public Travellers add(Travellers t);

    public LocalTour saveLocalTourRequest(LocalTour localTour);
    public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
    public List<Travellers> getAll();

    public List<Travellers> getAll(String name);

    public Optional<Travellers> getAll(Long id);

    public  Travellers update(Travellers travellers,Long id);

    public String delete(String id);
}
