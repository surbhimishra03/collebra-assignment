package com.collebra.services.app.services;

import com.collebra.services.app.models.DependentEnrollee;
import com.collebra.services.app.models.Enrollee;

import java.util.List;

public interface DependentService {

    public boolean modifyDependentEnrollee(DependentEnrollee dependentEnrollee);
    public List<DependentEnrollee> getDependents();
}
