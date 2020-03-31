package com.example.demo;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private Product_master_repository product_master_repository;

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewProduct_master(@RequestParam String productcd, @RequestParam String syohinname,
			@RequestParam String torokusya, @RequestParam String torokupg,
			@RequestParam Timestamp torokudate, @RequestParam String kosinsya, @RequestParam Timestamp kosindate,
			@RequestParam Integer version) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Product_master n = new Product_master();
		n.setProductcd(productcd);
		n.setShohinname(syohinname);
		n.setTorokusya(torokusya);
		n.setTorokupg(torokupg);
		n.setTorokudate(torokudate);
		n.setKosinsya(kosinsya);
		n.setKosindate(kosindate);
		n.setVershion(version);

		product_master_repository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Product_master> getAllProduct_masters() {
		// This returns a JSON or XML with the producr_masters
		return product_master_repository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("message", "Mainコントローラー");
		return "home/home";
	}

}