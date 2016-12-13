package com.hospital.controller;

import com.hospital.domain.Doctor;
import com.hospital.domain.Patient;
import com.hospital.service.DoctorService;
import com.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by extrrk on 12/11/2016.
 */

@Controller
@RequestMapping(value = {"","/hospital"})
public class HospitalController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = {"/","login"})
    public String hospital(Model model){
        //System.out.println(patientService.findAll());
        //model.addAttribute("persons", patientService.findAll());
        return "person/login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String doctorLogin(Doctor doctor,Model model){
        System.out.println(doctorService.findByName(doctor.getName()));
        Doctor doctorLogin=doctorService.findByName(doctor.getName());
        if(null != doctorLogin && doctor.getPassword().equalsIgnoreCase(doctorLogin.getPassword())){
            model.addAttribute("patient", patientService.findAll());
            return "redirect:index";
        }
        else{
            model.addAttribute("errMsg", "Wrong Credentials");
            return "person/login";
        }

    }

    @RequestMapping(value = "index")
    public String index(Model model){
        System.out.println(patientService.findAll());
        model.addAttribute("patient", patientService.findAll());
        return "person/index";
    }

    @RequestMapping(value = "create")
    public String create(){
        return "person/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Patient patient,Model model){
        patientService.save(patient);
        model.addAttribute("patient", patientService.findAll());
        return "person/index";
    }

    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        System.out.println(patientService.findById(id));
        model.addAttribute("patient", patientService.findById(id));
        return "person/edit";
    }


    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Patient patient,Model model){
        patientService.save(patient);
        return "redirect:index";
    }

    @RequestMapping(value = "savedoc",method = RequestMethod.POST)
    public String saveDoc(Doctor doctor,Model model){
        doctorService.save(doctor);
        return "redirect:index";
    }
    @RequestMapping(value = "register")
    public String registerDoc(){
        return "person/register";
    }

}
