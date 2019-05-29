package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController {

	@RequestMapping(value="/",method=RequestMethod.GET)
		public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		ArrayList<DataObject> data = new ArrayList<DataObject>();
		data.add(new DataObject(0,"taro","090-1234,5678"));
		data.add(new DataObject(1,"hanako","090-9876,5432"));
		data.add(new DataObject(2,"sachiko","090-2345,8765"));

		mav.addObject("data", data);
		mav.addObject("msg","お名前を書いて送信してください");
		return mav;
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str,ModelAndView mav) {
		mav.addObject("msg","こんにちは"+str+"さん");
		mav.addObject("value",str);
		mav.setViewName("index");
		return mav;
	}
	
}
