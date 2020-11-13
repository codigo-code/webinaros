package com.globalcampus.controlador;

import java.net.InetAddress;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaController {

	@RequestMapping(value="saludar")
	public String holaMundo(Model model) {
		try {
			model.addAttribute("objHola", "Hola mundo!");
			model.addAttribute("servidor", InetAddress.getLocalHost().getHostName());
			model.addAttribute("ip", InetAddress.getLoopbackAddress());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "saludar";
	}
}
