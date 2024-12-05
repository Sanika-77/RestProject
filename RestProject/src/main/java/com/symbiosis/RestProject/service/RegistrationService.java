package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Registration;
@Service
public interface RegistrationService {
Registration insertrecord(Registration r);
List<Registration>getAll();
void del(int ri);
Registration updaterecord(Registration r);



}
