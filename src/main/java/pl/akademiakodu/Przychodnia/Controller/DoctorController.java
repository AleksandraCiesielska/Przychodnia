package pl.akademiakodu.Przychodnia.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.Przychodnia.Dao.DoctorDao;
import pl.akademiakodu.Przychodnia.Dao.PatientDao;
import pl.akademiakodu.Przychodnia.Dao.VisitDao;
import pl.akademiakodu.Przychodnia.Model.Doctor;
import pl.akademiakodu.Przychodnia.Model.Patient;

@Controller
public class DoctorController
{
    @Autowired
    private DoctorDao doctorDao;
    @Autowired
    private PatientDao patientDao;
    @Autowired
    private VisitDao visitDao;



    @GetMapping("/")
    public String add(ModelMap modelMap)
    {
        modelMap.addAttribute("patient", new Patient());
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Patient patient)
    {
        patientDao.save(patient);
        return "redirect:/all";
    }

    @GetMapping("/all")
    public String allPatients(ModelMap modelMap){
        modelMap.put("patients",patientDao.findAll());
        return "all";
    }


    //----------------------------------------------------///

    @GetMapping("/addDoc")
    public String addDoc(ModelMap modelMap)
    {
        modelMap.addAttribute("doctor", new Doctor());
        return "addDoc";
    }

    @PostMapping("/addDoc")
    public String addDoc(@ModelAttribute Doctor doctor)
    {
        doctorDao.save(doctor);
        return "redirect:/allDoc";
    }

    @GetMapping("/allDoc")
    public String getAll(ModelMap modelMap){
        modelMap.put("doctors",doctorDao.findAll());
        return "allDoc";
    }

}
