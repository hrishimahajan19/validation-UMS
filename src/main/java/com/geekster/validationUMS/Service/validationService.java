package com.geekster.validationUMS.Service;

import com.geekster.validationUMS.Model.validationModel;
import com.geekster.validationUMS.Repository.validationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


import java.util.List;

    @Service
    public class validationService
    {
        @Autowired
        validationRepository dao;

        public  List<validationModel> getAllData() {
            return validationRepository.getAllData();
        }

        public  validationModel getDataById(int UserId) {
            return validationRepository.getAllDataById(UserId);
        }

        public  validationModel delete(int UserId) {
            return validationRepository.delete(UserId);
        }

        public void addName(validationModel model) {
            validationRepository.addName(model);

        }

        public static validationModel update(int UserId, validationModel model) {
            return validationRepository.upadate(UserId,model);
        }
    }


