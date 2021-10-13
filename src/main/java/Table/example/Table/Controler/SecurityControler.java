package Table.example.Table.Controler;

import Table.example.Table.Model.Security;
import Table.example.Table.Repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mysecure")
public class SecurityControler {
    @Autowired
    private SecurityRepository securityRepository;

    @PostMapping("/Adduser")
    public Security Adduser(@RequestBody Security  security) {
        return securityRepository.save(security);

    }

    @GetMapping("/getuser")
    public List<Security> getuser() {
        return (List<Security>) securityRepository.findAll();
    }
}
