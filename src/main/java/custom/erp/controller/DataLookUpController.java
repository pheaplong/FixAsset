package custom.erp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import custom.erp.entity.DataLookUp;
import custom.erp.service.DataLookUpService;

@RestController
@RequestMapping("/api/DataLookUps")
public class DataLookUpController {
	private DataLookUpService dataLookUpService;

	@Autowired
	public void setDataLookUpService(DataLookUpService dataLookUpService) {
		this.dataLookUpService = dataLookUpService;
	}

	@GetMapping("/")
	public List<DataLookUp> getDataLookUp(){
		return dataLookUpService.findAll();
	}

	@GetMapping("/{group}")
	public List<DataLookUp> getDataLookUpByGroupCode(@PathVariable("group") String group){
		return dataLookUpService.findbyGroup(group);
	}

	@GetMapping("/{group}/{Id}")
	public DataLookUp getDataLookUpByGroupCodeAndId(@PathVariable("group") String group, @PathVariable("Id")String Id) {
		return dataLookUpService.getById(Id);
	}

}
