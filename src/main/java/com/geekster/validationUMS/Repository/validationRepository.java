package com.geekster.validationUMS.Repository;




import com.geekster.validationUMS.Model.validationModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class validationRepository {
    static List<validationModel> list=new ArrayList<>();



    public static void addName(validationModel model) {
        list.add(model);
    }

    public static List<validationModel> getAllData() {
        return list;
    }

    public static validationModel getAllDataById(int UserId) {
        for(validationModel res:list){
            if(res.getUserId()==UserId) {
                return res;
            }
        }
        return  null;
    }

    public static validationModel upadate(int userId, validationModel model) {
        validationModel model1=getAllDataById(userId);

        model1.setUserId(model1.getUserId());
        model1.setUserId(model1.getUserId());
        model1.setUsername(model1.getUsername());
        model1.setDateOfBirth(model1.getDateOfBirth());
        model1.setEmail(model1.getEmail());
        model1.setPhoneNumber(model1.getPhoneNumber());
        model1.setDate(model1.getDate());
        model1.setTime(model1.getTime());
        return model1;
    }

    public static validationModel delete(int userId) {
        validationModel model=getAllDataById(userId);
        boolean remove=list.remove(model);
        if(remove){
            return model;
        }else {
            return null;
        }
    }
}

